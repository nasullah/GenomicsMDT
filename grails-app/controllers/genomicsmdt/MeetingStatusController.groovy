package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * MeetingStatusController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class MeetingStatusController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond MeetingStatus.list(params), model: [meetingStatusInstanceCount: MeetingStatus.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond MeetingStatus.list(params), model: [meetingStatusInstanceCount: MeetingStatus.count()]
    }

    def show(MeetingStatus meetingStatusInstance) {
        respond meetingStatusInstance
    }

    def create() {
        respond new MeetingStatus(params)
    }

    @Transactional
    def save(MeetingStatus meetingStatusInstance) {
        if (meetingStatusInstance == null) {
            notFound()
            return
        }

        if (meetingStatusInstance.hasErrors()) {
            respond meetingStatusInstance.errors, view: 'create'
            return
        }

        meetingStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'meetingStatusInstance.label', default: 'MeetingStatus'), meetingStatusInstance.id])
                redirect meetingStatusInstance
            }
            '*' { respond meetingStatusInstance, [status: CREATED] }
        }
    }

    def edit(MeetingStatus meetingStatusInstance) {
        respond meetingStatusInstance
    }

    @Transactional
    def update(MeetingStatus meetingStatusInstance) {
        if (meetingStatusInstance == null) {
            notFound()
            return
        }

        if (meetingStatusInstance.hasErrors()) {
            respond meetingStatusInstance.errors, view: 'edit'
            return
        }

        meetingStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'MeetingStatus.label', default: 'MeetingStatus'), meetingStatusInstance.id])
                redirect meetingStatusInstance
            }
            '*' { respond meetingStatusInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(MeetingStatus meetingStatusInstance) {

        if (meetingStatusInstance == null) {
            notFound()
            return
        }

        meetingStatusInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'MeetingStatus.label', default: 'MeetingStatus'), meetingStatusInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'meetingStatusInstance.label', default: 'MeetingStatus'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
