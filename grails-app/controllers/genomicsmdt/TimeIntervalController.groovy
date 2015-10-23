package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * TimeIntervalController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class TimeIntervalController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond TimeInterval.list(params), model: [timeIntervalInstanceCount: TimeInterval.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond TimeInterval.list(params), model: [timeIntervalInstanceCount: TimeInterval.count()]
    }

    def show(TimeInterval timeIntervalInstance) {
        respond timeIntervalInstance
    }

    def create() {
        respond new TimeInterval(params)
    }

    @Transactional
    def save(TimeInterval timeIntervalInstance) {
        if (timeIntervalInstance == null) {
            notFound()
            return
        }

        if (timeIntervalInstance.hasErrors()) {
            respond timeIntervalInstance.errors, view: 'create'
            return
        }

        timeIntervalInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'timeIntervalInstance.label', default: 'TimeInterval'), timeIntervalInstance.id])
                redirect timeIntervalInstance
            }
            '*' { respond timeIntervalInstance, [status: CREATED] }
        }
    }

    def edit(TimeInterval timeIntervalInstance) {
        respond timeIntervalInstance
    }

    @Transactional
    def update(TimeInterval timeIntervalInstance) {
        if (timeIntervalInstance == null) {
            notFound()
            return
        }

        if (timeIntervalInstance.hasErrors()) {
            respond timeIntervalInstance.errors, view: 'edit'
            return
        }

        timeIntervalInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'TimeInterval.label', default: 'TimeInterval'), timeIntervalInstance.id])
                redirect timeIntervalInstance
            }
            '*' { respond timeIntervalInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(TimeInterval timeIntervalInstance) {

        if (timeIntervalInstance == null) {
            notFound()
            return
        }

        timeIntervalInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'TimeInterval.label', default: 'TimeInterval'), timeIntervalInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'timeIntervalInstance.label', default: 'TimeInterval'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
