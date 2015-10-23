package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * OutcomeRecordController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_USER', 'ROLE_ADMIN'])
@Transactional(readOnly = true)
class OutcomeRecordController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OutcomeRecord.list(params), model: [outcomeRecordInstanceCount: OutcomeRecord.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OutcomeRecord.list(params), model: [outcomeRecordInstanceCount: OutcomeRecord.count()]
    }

    def show(OutcomeRecord outcomeRecordInstance) {
        respond outcomeRecordInstance
    }

    def create() {
        respond new OutcomeRecord(params)
    }

    @Transactional
    def save(OutcomeRecord outcomeRecordInstance) {
        if (outcomeRecordInstance == null) {
            notFound()
            return
        }

        if (outcomeRecordInstance.hasErrors()) {
            respond outcomeRecordInstance.errors, view: 'create'
            return
        }

        outcomeRecordInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'outcomeRecordInstance.label', default: 'OutcomeRecord'), outcomeRecordInstance.id])
//                redirect outcomeRecordInstance
                redirect(controller:'patient',action: 'show', params: [id: outcomeRecordInstance.patient.id])
            }
            '*' { respond outcomeRecordInstance, [status: CREATED] }
        }
    }

    def edit(OutcomeRecord outcomeRecordInstance) {
        respond outcomeRecordInstance
    }

    @Transactional
    def update(OutcomeRecord outcomeRecordInstance) {
        if (outcomeRecordInstance == null) {
            notFound()
            return
        }

        if (outcomeRecordInstance.hasErrors()) {
            respond outcomeRecordInstance.errors, view: 'edit'
            return
        }

        outcomeRecordInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'OutcomeRecord.label', default: 'OutcomeRecord'), outcomeRecordInstance.id])
//                redirect outcomeRecordInstance
                redirect(controller:'patient',action: 'show', params: [id: outcomeRecordInstance.patient.id])
            }
            '*' { respond outcomeRecordInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(OutcomeRecord outcomeRecordInstance) {

        if (outcomeRecordInstance == null) {
            notFound()
            return
        }

        outcomeRecordInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'OutcomeRecord.label', default: 'OutcomeRecord'), outcomeRecordInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'outcomeRecordInstance.label', default: 'OutcomeRecord'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
