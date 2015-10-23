package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * CaseStatusController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_ADMIN'])
@Transactional(readOnly = true)
class CaseStatusController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond CaseStatus.list(params), model: [caseStatusInstanceCount: CaseStatus.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond CaseStatus.list(params), model: [caseStatusInstanceCount: CaseStatus.count()]
    }

    def show(CaseStatus caseStatusInstance) {
        respond caseStatusInstance
    }

    def create() {
        respond new CaseStatus(params)
    }

    @Transactional
    def save(CaseStatus caseStatusInstance) {
        if (caseStatusInstance == null) {
            notFound()
            return
        }

        if (caseStatusInstance.hasErrors()) {
            respond caseStatusInstance.errors, view: 'create'
            return
        }

        caseStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'caseStatusInstance.label', default: 'CaseStatus'), caseStatusInstance.id])
                redirect caseStatusInstance
            }
            '*' { respond caseStatusInstance, [status: CREATED] }
        }
    }

    def edit(CaseStatus caseStatusInstance) {
        respond caseStatusInstance
    }

    @Transactional
    def update(CaseStatus caseStatusInstance) {
        if (caseStatusInstance == null) {
            notFound()
            return
        }

        if (caseStatusInstance.hasErrors()) {
            respond caseStatusInstance.errors, view: 'edit'
            return
        }

        caseStatusInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'CaseStatus.label', default: 'CaseStatus'), caseStatusInstance.id])
                redirect caseStatusInstance
            }
            '*' { respond caseStatusInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(CaseStatus caseStatusInstance) {

        if (caseStatusInstance == null) {
            notFound()
            return
        }

        caseStatusInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'CaseStatus.label', default: 'CaseStatus'), caseStatusInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'caseStatusInstance.label', default: 'CaseStatus'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
