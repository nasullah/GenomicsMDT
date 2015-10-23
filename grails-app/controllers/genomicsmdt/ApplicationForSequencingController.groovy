package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * ApplicationForSequencingController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_USER', 'ROLE_ADMIN'])
@Transactional(readOnly = true)
class ApplicationForSequencingController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ApplicationForSequencing.list(params), model: [applicationForSequencingInstanceCount: ApplicationForSequencing.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ApplicationForSequencing.list(params), model: [applicationForSequencingInstanceCount: ApplicationForSequencing.count()]
    }

    def show(ApplicationForSequencing applicationForSequencingInstance) {
        respond applicationForSequencingInstance
    }

    def create() {
        respond new ApplicationForSequencing(params)
    }

    @Transactional
    def save(ApplicationForSequencing applicationForSequencingInstance) {
        if (applicationForSequencingInstance == null) {
            notFound()
            return
        }

        if (applicationForSequencingInstance.hasErrors()) {
            respond applicationForSequencingInstance.errors, view: 'create'
            return
        }

        applicationForSequencingInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'applicationForSequencingInstance.label', default: 'ApplicationForSequencing'), applicationForSequencingInstance.id])
                redirect applicationForSequencingInstance
            }
            '*' { respond applicationForSequencingInstance, [status: CREATED] }
        }
    }

    def edit(ApplicationForSequencing applicationForSequencingInstance) {
        respond applicationForSequencingInstance
    }

    @Transactional
    def update(ApplicationForSequencing applicationForSequencingInstance) {
        if (applicationForSequencingInstance == null) {
            notFound()
            return
        }

        if (applicationForSequencingInstance.hasErrors()) {
            respond applicationForSequencingInstance.errors, view: 'edit'
            return
        }

        applicationForSequencingInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ApplicationForSequencing.label', default: 'ApplicationForSequencing'), applicationForSequencingInstance.id])
                redirect applicationForSequencingInstance
            }
            '*' { respond applicationForSequencingInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ApplicationForSequencing applicationForSequencingInstance) {

        if (applicationForSequencingInstance == null) {
            notFound()
            return
        }

        applicationForSequencingInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ApplicationForSequencing.label', default: 'ApplicationForSequencing'), applicationForSequencingInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'applicationForSequencingInstance.label', default: 'ApplicationForSequencing'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
