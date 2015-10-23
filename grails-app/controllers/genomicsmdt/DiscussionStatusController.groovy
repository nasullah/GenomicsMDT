package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * DiscussionStatusController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class DiscussionStatusController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond DiscussionStatus.list(params), model: [discussionStatusInstanceCount: DiscussionStatus.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond DiscussionStatus.list(params), model: [discussionStatusInstanceCount: DiscussionStatus.count()]
    }

    def show(DiscussionStatus discussionStatusInstance) {
        respond discussionStatusInstance
    }

    def create() {
        respond new DiscussionStatus(params)
    }

    @Transactional
    def save(DiscussionStatus discussionStatusInstance) {
        if (discussionStatusInstance == null) {
            notFound()
            return
        }

        if (discussionStatusInstance.hasErrors()) {
            respond discussionStatusInstance.errors, view: 'create'
            return
        }

        discussionStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'discussionStatusInstance.label', default: 'DiscussionStatus'), discussionStatusInstance.id])
                redirect discussionStatusInstance
            }
            '*' { respond discussionStatusInstance, [status: CREATED] }
        }
    }

    def edit(DiscussionStatus discussionStatusInstance) {
        respond discussionStatusInstance
    }

    @Transactional
    def update(DiscussionStatus discussionStatusInstance) {
        if (discussionStatusInstance == null) {
            notFound()
            return
        }

        if (discussionStatusInstance.hasErrors()) {
            respond discussionStatusInstance.errors, view: 'edit'
            return
        }

        discussionStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'DiscussionStatus.label', default: 'DiscussionStatus'), discussionStatusInstance.id])
                redirect discussionStatusInstance
            }
            '*' { respond discussionStatusInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(DiscussionStatus discussionStatusInstance) {

        if (discussionStatusInstance == null) {
            notFound()
            return
        }

        discussionStatusInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'DiscussionStatus.label', default: 'DiscussionStatus'), discussionStatusInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'discussionStatusInstance.label', default: 'DiscussionStatus'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
