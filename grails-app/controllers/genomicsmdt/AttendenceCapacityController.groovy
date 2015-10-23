package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * AttendenceCapacityController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_USER', 'ROLE_ADMIN'])
@Transactional(readOnly = true)
class AttendenceCapacityController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AttendenceCapacity.list(params), model: [attendenceCapacityInstanceCount: AttendenceCapacity.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AttendenceCapacity.list(params), model: [attendenceCapacityInstanceCount: AttendenceCapacity.count()]
    }

    def show(AttendenceCapacity attendenceCapacityInstance) {
        respond attendenceCapacityInstance
    }

    def create() {
        respond new AttendenceCapacity(params)
    }

    @Transactional
    def save(AttendenceCapacity attendenceCapacityInstance) {
        if (attendenceCapacityInstance == null) {
            notFound()
            return
        }

        if (attendenceCapacityInstance.hasErrors()) {
            respond attendenceCapacityInstance.errors, view: 'create'
            return
        }

        attendenceCapacityInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'attendenceCapacityInstance.label', default: 'AttendenceCapacity'), attendenceCapacityInstance.id])
//                redirect attendenceCapacityInstance
                redirect(controller:'attendenceRecord',action: 'show', params: [id: attendenceCapacityInstance.attendenceRecord.id])
            }
            '*' { respond attendenceCapacityInstance, [status: CREATED] }
        }
    }

    def edit(AttendenceCapacity attendenceCapacityInstance) {
        respond attendenceCapacityInstance
    }

    @Transactional
    def update(AttendenceCapacity attendenceCapacityInstance) {
        if (attendenceCapacityInstance == null) {
            notFound()
            return
        }

        if (attendenceCapacityInstance.hasErrors()) {
            respond attendenceCapacityInstance.errors, view: 'edit'
            return
        }

        attendenceCapacityInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'AttendenceCapacity.label', default: 'AttendenceCapacity'), attendenceCapacityInstance.id])
//                redirect attendenceCapacityInstance
                redirect(controller:'attendenceRecord',action: 'show', params: [id: attendenceCapacityInstance.attendenceRecord.id])
            }
            '*' { respond attendenceCapacityInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(AttendenceCapacity attendenceCapacityInstance) {

        if (attendenceCapacityInstance == null) {
            notFound()
            return
        }

        attendenceCapacityInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'AttendenceCapacity.label', default: 'AttendenceCapacity'), attendenceCapacityInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'attendenceCapacityInstance.label', default: 'AttendenceCapacity'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
