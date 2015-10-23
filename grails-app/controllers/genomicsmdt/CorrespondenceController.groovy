package genomicsmdt


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * CorrespondenceController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Transactional(readOnly = true)
class CorrespondenceController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Correspondence.list(params), model: [correspondenceInstanceCount: Correspondence.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Correspondence.list(params), model: [correspondenceInstanceCount: Correspondence.count()]
    }

    def show(Correspondence correspondenceInstance) {
        respond correspondenceInstance
    }

    def create() {
        respond new Correspondence(params)
    }

    @Transactional
    def save(Correspondence correspondenceInstance) {
        if (correspondenceInstance == null) {
            notFound()
            return
        }

        if (correspondenceInstance.hasErrors()) {
            respond correspondenceInstance.errors, view: 'create'
            return
        }

        correspondenceInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'correspondenceInstance.label', default: 'Correspondence'), correspondenceInstance.id])
//                redirect correspondenceInstance
                redirect(controller:'applicationForSequencing',action: 'show', params: [id: correspondenceInstance.applicationForSequencing.id])
            }
            '*' { respond correspondenceInstance, [status: CREATED] }
        }
    }

    def edit(Correspondence correspondenceInstance) {
        respond correspondenceInstance
    }

    @Transactional
    def update(Correspondence correspondenceInstance) {
        if (correspondenceInstance == null) {
            notFound()
            return
        }

        if (correspondenceInstance.hasErrors()) {
            respond correspondenceInstance.errors, view: 'edit'
            return
        }

        correspondenceInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Correspondence.label', default: 'Correspondence'), correspondenceInstance.id])
//                redirect correspondenceInstance
                redirect(controller:'applicationForSequencing',action: 'show', params: [id: correspondenceInstance.applicationForSequencing.id])
            }
            '*' { respond correspondenceInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Correspondence correspondenceInstance) {

        if (correspondenceInstance == null) {
            notFound()
            return
        }

        correspondenceInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Correspondence.label', default: 'Correspondence'), correspondenceInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'correspondenceInstance.label', default: 'Correspondence'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
