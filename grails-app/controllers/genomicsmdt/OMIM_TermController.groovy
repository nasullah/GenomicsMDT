package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * OMIM_TermController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class OMIM_TermController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OMIM_Term.list(params), model: [OMIM_TermInstanceCount: OMIM_Term.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OMIM_Term.list(params), model: [OMIM_TermInstanceCount: OMIM_Term.count()]
    }

    def show(OMIM_Term OMIM_TermInstance) {
        respond OMIM_TermInstance
    }

    def create() {
        respond new OMIM_Term(params)
    }

    @Transactional
    def save(OMIM_Term OMIM_TermInstance) {
        if (OMIM_TermInstance == null) {
            notFound()
            return
        }

        if (OMIM_TermInstance.hasErrors()) {
            respond OMIM_TermInstance.errors, view: 'create'
            return
        }

        OMIM_TermInstance.save flush: true
        flash.message = message(code: 'default.created.message', args: [message(code: 'OMIM_TermInstance.label', default: 'OMIM_Term'), OMIM_TermInstance.id])
        redirect OMIM_TermInstance

    }

    def edit(OMIM_Term OMIM_TermInstance) {
        respond OMIM_TermInstance
    }

    @Transactional
    def update(OMIM_Term OMIM_TermInstance) {
        if (OMIM_TermInstance == null) {
            notFound()
            return
        }

        if (OMIM_TermInstance.hasErrors()) {
            respond OMIM_TermInstance.errors, view: 'edit'
            return
        }

        OMIM_TermInstance.save flush: true
        flash.message = message(code: 'default.updated.message', args: [message(code: 'OMIM_Term.label', default: 'OMIM_Term'), OMIM_TermInstance.id])
        redirect OMIM_TermInstance

    }

    @Transactional
    def delete(OMIM_Term OMIM_TermInstance) {

        if (OMIM_TermInstance == null) {
            notFound()
            return
        }

        OMIM_TermInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'OMIM_Term.label', default: 'OMIM_Term'), OMIM_TermInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'OMIM_TermInstance.label', default: 'OMIM_Term'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
