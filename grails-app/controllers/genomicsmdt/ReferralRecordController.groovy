package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional
import ch.silviowangler.groovy.util.builder.ICalendarBuilder
/**
 * ReferralRecordController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_USER', 'ROLE_ADMIN'])
@Transactional(readOnly = true)
class ReferralRecordController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def mailService

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ReferralRecord.list(params), model: [referralRecordInstanceCount: ReferralRecord.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ReferralRecord.list(params), model: [referralRecordInstanceCount: ReferralRecord.count()]
    }

    def show(ReferralRecord referralRecordInstance) {
        respond referralRecordInstance
    }

    def create() {
        respond new ReferralRecord(params)
    }

    def findPerson() {
        def listPerson = Person.createCriteria().listDistinct {
            ilike("name", "%${params.query}%")
        }
        //Create XML response
        render(contentType: "text/xml") {
            results() {
                listPerson.each { person ->
                    result(){
                        name(person)
                        //Optional id which will be available in onItemSelect
                        id(person.id)
                    }
                }
            }
        }
    }

    def findPatient() {
        def listPatient = Patient.createCriteria().listDistinct{
            or{
                ilike("givenName", "%${params.query}%")
                ilike("familyName", "%${params.query}%")
                ilike("nhsNumber", "%${params.query}%")
                ilike("mrn", "%${params.query}%")
            }
        }
        render(contentType: "text/xml") {
            results() {
                listPatient.each { patient ->
                    result(){
                        name(patient)
                        //Optional id which will be available in onItemSelect
                        id(patient.id)
                    }
                }
            }
        }
    }

    @Transactional
    def save(ReferralRecord referralRecordInstance) {
        if (referralRecordInstance == null) {
            notFound()
            return
        }

        if (referralRecordInstance.hasErrors()) {
            respond referralRecordInstance.errors, view: 'create'
            return
        }

        referralRecordInstance.save flush: true

        mailService.sendMail {
            to "${referralRecordInstance.person.email}"
            subject "MDT meeting confirmation"
            body "This is a confirmation that your patient ${referralRecordInstance.patient.givenName} ${referralRecordInstance.patient.familyName} is due to be discussed at a MDT meeting."
        }

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'referralRecordInstance.label', default: 'ReferralRecord'), referralRecordInstance.id])
                redirect referralRecordInstance
            }
            '*' { respond referralRecordInstance, [status: CREATED] }
        }
    }

    def edit(ReferralRecord referralRecordInstance) {
        respond referralRecordInstance
    }

    @Transactional
    def update(ReferralRecord referralRecordInstance) {
        if (referralRecordInstance == null) {
            notFound()
            return
        }

        if (referralRecordInstance.hasErrors()) {
            respond referralRecordInstance.errors, view: 'edit'
            return
        }

        referralRecordInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ReferralRecord.label', default: 'Referral Record'), referralRecordInstance.id])
                redirect referralRecordInstance
            }
            '*' { respond referralRecordInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ReferralRecord referralRecordInstance) {

        if (referralRecordInstance == null) {
            notFound()
            return
        }

        referralRecordInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ReferralRecord.label', default: 'ReferralRecord'), referralRecordInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'referralRecordInstance.label', default: 'ReferralRecord'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
