package genomicsmdt


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * CorrespondenceTypeController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Transactional(readOnly = true)
class CorrespondenceTypeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond CorrespondenceType.list(params), model: [correspondenceTypeInstanceCount: CorrespondenceType.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond CorrespondenceType.list(params), model: [correspondenceTypeInstanceCount: CorrespondenceType.count()]
    }

    def show(CorrespondenceType correspondenceTypeInstance) {
        respond correspondenceTypeInstance
    }

    def create() {
        respond new CorrespondenceType(params)
    }

    @Transactional
    def save(CorrespondenceType correspondenceTypeInstance) {
        if (correspondenceTypeInstance == null) {
            notFound()
            return
        }

        if (correspondenceTypeInstance.hasErrors()) {
            respond correspondenceTypeInstance.errors, view: 'create'
            return
        }

        correspondenceTypeInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'correspondenceTypeInstance.label', default: 'CorrespondenceType'), correspondenceTypeInstance.id])
                redirect correspondenceTypeInstance
            }
            '*' { respond correspondenceTypeInstance, [status: CREATED] }
        }
    }

    def edit(CorrespondenceType correspondenceTypeInstance) {
        respond correspondenceTypeInstance
    }

    @Transactional
    def update(CorrespondenceType correspondenceTypeInstance) {
        if (correspondenceTypeInstance == null) {
            notFound()
            return
        }

        if (correspondenceTypeInstance.hasErrors()) {
            respond correspondenceTypeInstance.errors, view: 'edit'
            return
        }

        correspondenceTypeInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'CorrespondenceType.label', default: 'CorrespondenceType'), correspondenceTypeInstance.id])
                redirect correspondenceTypeInstance
            }
            '*' { respond correspondenceTypeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(CorrespondenceType correspondenceTypeInstance) {

        if (correspondenceTypeInstance == null) {
            notFound()
            return
        }

        correspondenceTypeInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'CorrespondenceType.label', default: 'CorrespondenceType'), correspondenceTypeInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'correspondenceTypeInstance.label', default: 'CorrespondenceType'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
