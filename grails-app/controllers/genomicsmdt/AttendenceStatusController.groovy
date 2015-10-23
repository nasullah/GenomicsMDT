package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * AttendenceStatusController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class AttendenceStatusController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AttendenceStatus.list(params), model: [attendenceStatusInstanceCount: AttendenceStatus.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AttendenceStatus.list(params), model: [attendenceStatusInstanceCount: AttendenceStatus.count()]
    }

    def show(AttendenceStatus attendenceStatusInstance) {
        respond attendenceStatusInstance
    }

    def create() {
        respond new AttendenceStatus(params)
    }

    @Transactional
    def save(AttendenceStatus attendenceStatusInstance) {
        if (attendenceStatusInstance == null) {
            notFound()
            return
        }

        if (attendenceStatusInstance.hasErrors()) {
            respond attendenceStatusInstance.errors, view: 'create'
            return
        }

        attendenceStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'attendenceStatusInstance.label', default: 'AttendenceStatus'), attendenceStatusInstance.id])
                redirect attendenceStatusInstance
            }
            '*' { respond attendenceStatusInstance, [status: CREATED] }
        }
    }

    def edit(AttendenceStatus attendenceStatusInstance) {
        respond attendenceStatusInstance
    }

    @Transactional
    def update(AttendenceStatus attendenceStatusInstance) {
        if (attendenceStatusInstance == null) {
            notFound()
            return
        }

        if (attendenceStatusInstance.hasErrors()) {
            respond attendenceStatusInstance.errors, view: 'edit'
            return
        }

        attendenceStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'AttendenceStatus.label', default: 'AttendenceStatus'), attendenceStatusInstance.id])
                redirect attendenceStatusInstance
            }
            '*' { respond attendenceStatusInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(AttendenceStatus attendenceStatusInstance) {

        if (attendenceStatusInstance == null) {
            notFound()
            return
        }

        attendenceStatusInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'AttendenceStatus.label', default: 'AttendenceStatus'), attendenceStatusInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'attendenceStatusInstance.label', default: 'AttendenceStatus'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
