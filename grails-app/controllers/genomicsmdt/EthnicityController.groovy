package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * EthnicityController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class EthnicityController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Ethnicity.list(params), model: [ethnicityInstanceCount: Ethnicity.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Ethnicity.list(params), model: [ethnicityInstanceCount: Ethnicity.count()]
    }

    def show(Ethnicity ethnicityInstance) {
        respond ethnicityInstance
    }

    def create() {
        respond new Ethnicity(params)
    }

    @Transactional
    def save(Ethnicity ethnicityInstance) {
        if (ethnicityInstance == null) {
            notFound()
            return
        }

        if (ethnicityInstance.hasErrors()) {
            respond ethnicityInstance.errors, view: 'create'
            return
        }

        ethnicityInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'ethnicityInstance.label', default: 'Ethnicity'), ethnicityInstance.id])
                redirect ethnicityInstance
            }
            '*' { respond ethnicityInstance, [status: CREATED] }
        }
    }

    def edit(Ethnicity ethnicityInstance) {
        respond ethnicityInstance
    }

    @Transactional
    def update(Ethnicity ethnicityInstance) {
        if (ethnicityInstance == null) {
            notFound()
            return
        }

        if (ethnicityInstance.hasErrors()) {
            respond ethnicityInstance.errors, view: 'edit'
            return
        }

        ethnicityInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Ethnicity.label', default: 'Ethnicity'), ethnicityInstance.id])
                redirect ethnicityInstance
            }
            '*' { respond ethnicityInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Ethnicity ethnicityInstance) {

        if (ethnicityInstance == null) {
            notFound()
            return
        }

        ethnicityInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Ethnicity.label', default: 'Ethnicity'), ethnicityInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'ethnicityInstance.label', default: 'Ethnicity'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
