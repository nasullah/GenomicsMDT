package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * RoleTypeController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class RoleTypeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond RoleType.list(params), model: [roleTypeInstanceCount: RoleType.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond RoleType.list(params), model: [roleTypeInstanceCount: RoleType.count()]
    }

    def show(RoleType roleTypeInstance) {
        respond roleTypeInstance
    }

    def create() {
        respond new RoleType(params)
    }

    @Transactional
    def save(RoleType roleTypeInstance) {
        if (roleTypeInstance == null) {
            notFound()
            return
        }

        if (roleTypeInstance.hasErrors()) {
            respond roleTypeInstance.errors, view: 'create'
            return
        }

        roleTypeInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'roleTypeInstance.label', default: 'RoleType'), roleTypeInstance.id])
                redirect roleTypeInstance
            }
            '*' { respond roleTypeInstance, [status: CREATED] }
        }
    }

    def edit(RoleType roleTypeInstance) {
        respond roleTypeInstance
    }

    @Transactional
    def update(RoleType roleTypeInstance) {
        if (roleTypeInstance == null) {
            notFound()
            return
        }

        if (roleTypeInstance.hasErrors()) {
            respond roleTypeInstance.errors, view: 'edit'
            return
        }

        roleTypeInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'RoleType.label', default: 'RoleType'), roleTypeInstance.id])
                redirect roleTypeInstance
            }
            '*' { respond roleTypeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(RoleType roleTypeInstance) {

        if (roleTypeInstance == null) {
            notFound()
            return
        }

        roleTypeInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'RoleType.label', default: 'RoleType'), roleTypeInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'roleTypeInstance.label', default: 'RoleType'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
