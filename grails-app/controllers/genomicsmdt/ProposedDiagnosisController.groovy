package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * ProposedDiagnosisController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_USER', 'ROLE_ADMIN'])
@Transactional(readOnly = true)
class ProposedDiagnosisController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ProposedDiagnosis.list(params), model: [proposedDiagnosisInstanceCount: ProposedDiagnosis.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ProposedDiagnosis.list(params), model: [proposedDiagnosisInstanceCount: ProposedDiagnosis.count()]
    }

    def show(ProposedDiagnosis proposedDiagnosisInstance) {
        respond proposedDiagnosisInstance
    }

    def create() {
        respond new ProposedDiagnosis(params)
    }

    @Transactional
    def save(ProposedDiagnosis proposedDiagnosisInstance) {
        if (proposedDiagnosisInstance == null) {
            notFound()
            return
        }

        if (proposedDiagnosisInstance.hasErrors()) {
            respond proposedDiagnosisInstance.errors, view: 'create'
            return
        }

        proposedDiagnosisInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'proposedDiagnosisInstance.label', default: 'ProposedDiagnosis'), proposedDiagnosisInstance.id])
//                redirect proposedDiagnosisInstance
                redirect(controller:'referralRecord',action: 'show', params: [id: proposedDiagnosisInstance.referralRecord.id])
            }
            '*' { respond proposedDiagnosisInstance, [status: CREATED] }
        }
    }

    def edit(ProposedDiagnosis proposedDiagnosisInstance) {
        respond proposedDiagnosisInstance
    }

    @Transactional
    def update(ProposedDiagnosis proposedDiagnosisInstance) {
        if (proposedDiagnosisInstance == null) {
            notFound()
            return
        }

        if (proposedDiagnosisInstance.hasErrors()) {
            respond proposedDiagnosisInstance.errors, view: 'edit'
            return
        }

        proposedDiagnosisInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ProposedDiagnosis.label', default: 'ProposedDiagnosis'), proposedDiagnosisInstance.id])
//                redirect proposedDiagnosisInstance
                redirect(controller:'referralRecord',action: 'show', params: [id: proposedDiagnosisInstance.referralRecord.id])
            }
            '*' { respond proposedDiagnosisInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ProposedDiagnosis proposedDiagnosisInstance) {

        if (proposedDiagnosisInstance == null) {
            notFound()
            return
        }

        proposedDiagnosisInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ProposedDiagnosis.label', default: 'ProposedDiagnosis'), proposedDiagnosisInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'proposedDiagnosisInstance.label', default: 'ProposedDiagnosis'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
