package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * OutcomeStatusController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class OutcomeStatusController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OutcomeStatus.list(params), model: [outcomeStatusInstanceCount: OutcomeStatus.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OutcomeStatus.list(params), model: [outcomeStatusInstanceCount: OutcomeStatus.count()]
    }

    def show(OutcomeStatus outcomeStatusInstance) {
        respond outcomeStatusInstance
    }

    def create() {
        respond new OutcomeStatus(params)
    }

    @Transactional
    def save(OutcomeStatus outcomeStatusInstance) {
        if (outcomeStatusInstance == null) {
            notFound()
            return
        }

        if (outcomeStatusInstance.hasErrors()) {
            respond outcomeStatusInstance.errors, view: 'create'
            return
        }

        outcomeStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'outcomeStatusInstance.label', default: 'OutcomeStatus'), outcomeStatusInstance.id])
                redirect outcomeStatusInstance
            }
            '*' { respond outcomeStatusInstance, [status: CREATED] }
        }
    }

    def edit(OutcomeStatus outcomeStatusInstance) {
        respond outcomeStatusInstance
    }

    @Transactional
    def update(OutcomeStatus outcomeStatusInstance) {
        if (outcomeStatusInstance == null) {
            notFound()
            return
        }

        if (outcomeStatusInstance.hasErrors()) {
            respond outcomeStatusInstance.errors, view: 'edit'
            return
        }

        outcomeStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'OutcomeStatus.label', default: 'OutcomeStatus'), outcomeStatusInstance.id])
                redirect outcomeStatusInstance
            }
            '*' { respond outcomeStatusInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(OutcomeStatus outcomeStatusInstance) {

        if (outcomeStatusInstance == null) {
            notFound()
            return
        }

        outcomeStatusInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'OutcomeStatus.label', default: 'OutcomeStatus'), outcomeStatusInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'outcomeStatusInstance.label', default: 'OutcomeStatus'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
