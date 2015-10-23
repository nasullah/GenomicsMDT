package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * ApplicationStatusController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class ApplicationStatusController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ApplicationStatus.list(params), model: [applicationStatusInstanceCount: ApplicationStatus.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond ApplicationStatus.list(params), model: [applicationStatusInstanceCount: ApplicationStatus.count()]
    }

    def show(ApplicationStatus applicationStatusInstance) {
        respond applicationStatusInstance
    }

    def create() {
        respond new ApplicationStatus(params)
    }

    @Transactional
    def save(ApplicationStatus applicationStatusInstance) {
        if (applicationStatusInstance == null) {
            notFound()
            return
        }

        if (applicationStatusInstance.hasErrors()) {
            respond applicationStatusInstance.errors, view: 'create'
            return
        }

        applicationStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'applicationStatusInstance.label', default: 'ApplicationStatus'), applicationStatusInstance.id])
                redirect applicationStatusInstance
            }
            '*' { respond applicationStatusInstance, [status: CREATED] }
        }
    }

    def edit(ApplicationStatus applicationStatusInstance) {
        respond applicationStatusInstance
    }

    @Transactional
    def update(ApplicationStatus applicationStatusInstance) {
        if (applicationStatusInstance == null) {
            notFound()
            return
        }

        if (applicationStatusInstance.hasErrors()) {
            respond applicationStatusInstance.errors, view: 'edit'
            return
        }

        applicationStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'ApplicationStatus.label', default: 'ApplicationStatus'), applicationStatusInstance.id])
                redirect applicationStatusInstance
            }
            '*' { respond applicationStatusInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(ApplicationStatus applicationStatusInstance) {

        if (applicationStatusInstance == null) {
            notFound()
            return
        }

        applicationStatusInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'ApplicationStatus.label', default: 'ApplicationStatus'), applicationStatusInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'applicationStatusInstance.label', default: 'ApplicationStatus'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
