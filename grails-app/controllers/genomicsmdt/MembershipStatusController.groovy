package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * MembershipStatusController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class MembershipStatusController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond MembershipStatus.list(params), model: [membershipStatusInstanceCount: MembershipStatus.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond MembershipStatus.list(params), model: [membershipStatusInstanceCount: MembershipStatus.count()]
    }

    def show(MembershipStatus membershipStatusInstance) {
        respond membershipStatusInstance
    }

    def create() {
        respond new MembershipStatus(params)
    }

    @Transactional
    def save(MembershipStatus membershipStatusInstance) {
        if (membershipStatusInstance == null) {
            notFound()
            return
        }

        if (membershipStatusInstance.hasErrors()) {
            respond membershipStatusInstance.errors, view: 'create'
            return
        }

        membershipStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'membershipStatusInstance.label', default: 'MembershipStatus'), membershipStatusInstance.id])
                redirect membershipStatusInstance
            }
            '*' { respond membershipStatusInstance, [status: CREATED] }
        }
    }

    def edit(MembershipStatus membershipStatusInstance) {
        respond membershipStatusInstance
    }

    @Transactional
    def update(MembershipStatus membershipStatusInstance) {
        if (membershipStatusInstance == null) {
            notFound()
            return
        }

        if (membershipStatusInstance.hasErrors()) {
            respond membershipStatusInstance.errors, view: 'edit'
            return
        }

        membershipStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'MembershipStatus.label', default: 'MembershipStatus'), membershipStatusInstance.id])
                redirect membershipStatusInstance
            }
            '*' { respond membershipStatusInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(MembershipStatus membershipStatusInstance) {

        if (membershipStatusInstance == null) {
            notFound()
            return
        }

        membershipStatusInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'MembershipStatus.label', default: 'MembershipStatus'), membershipStatusInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'membershipStatusInstance.label', default: 'MembershipStatus'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
