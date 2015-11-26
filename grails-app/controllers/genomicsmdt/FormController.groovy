package genomicsmdt


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * FormController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Transactional(readOnly = true)
class FormController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Form.list(params), model: [formInstanceCount: Form.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Form.list(params), model: [formInstanceCount: Form.count()]
    }

    def show(Form formInstance) {
        respond formInstance
    }

    def create() {
        respond new Form(params)
    }

    def familyHistory(){
        def componentName = "f-family-history-form"
        def referralRecord = params.referralRecord
        [componentName:componentName, referralRecord:referralRecord]
    }

    @Transactional
    def save(Form formInstance) {
        if (formInstance == null) {
            notFound()
            return
        }

        if (formInstance.hasErrors()) {
            respond formInstance.errors, view: 'create'
            return
        }

        formInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'formInstance.label', default: 'Form'), formInstance.id])
                redirect formInstance
            }
            '*' { respond formInstance, [status: CREATED] }
        }
    }

    def edit(Form formInstance) {
        respond formInstance
    }

    @Transactional
    def update(Form formInstance) {
        if (formInstance == null) {
            notFound()
            return
        }

        if (formInstance.hasErrors()) {
            respond formInstance.errors, view: 'edit'
            return
        }

        formInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Form.label', default: 'Form'), formInstance.id])
                redirect formInstance
            }
            '*' { respond formInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Form formInstance) {

        if (formInstance == null) {
            notFound()
            return
        }

        formInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Form.label', default: 'Form'), formInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'formInstance.label', default: 'Form'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
