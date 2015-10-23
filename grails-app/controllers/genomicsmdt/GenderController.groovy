package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * GenderController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class GenderController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Gender.list(params), model: [genderInstanceCount: Gender.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Gender.list(params), model: [genderInstanceCount: Gender.count()]
    }

    def show(Gender genderInstance) {
        respond genderInstance
    }

    def create() {
        respond new Gender(params)
    }

    @Transactional
    def save(Gender genderInstance) {
        if (genderInstance == null) {
            notFound()
            return
        }

        if (genderInstance.hasErrors()) {
            respond genderInstance.errors, view: 'create'
            return
        }

        genderInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'genderInstance.label', default: 'Gender'), genderInstance.id])
                redirect genderInstance
            }
            '*' { respond genderInstance, [status: CREATED] }
        }
    }

    def edit(Gender genderInstance) {
        respond genderInstance
    }

    @Transactional
    def update(Gender genderInstance) {
        if (genderInstance == null) {
            notFound()
            return
        }

        if (genderInstance.hasErrors()) {
            respond genderInstance.errors, view: 'edit'
            return
        }

        genderInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Gender.label', default: 'Gender'), genderInstance.id])
                redirect genderInstance
            }
            '*' { respond genderInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Gender genderInstance) {

        if (genderInstance == null) {
            notFound()
            return
        }

        genderInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Gender.label', default: 'Gender'), genderInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'genderInstance.label', default: 'Gender'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
