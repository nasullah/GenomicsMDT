package genomicsmdt

import grails.plugins.springsecurity.Secured
import org.grails.plugin.filterpane.FilterPaneUtils

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * MDTController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_USER', 'ROLE_ADMIN'])
@Transactional(readOnly = true)
class MDTController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def filterPaneService

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond MDT.list(params), model: [MDTInstanceCount: MDT.count()]
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [MDTInstanceList: MDT.list(params), MDTInstanceTotal: MDT.count()]
    }

    def filter = {
        if(!params.max) params.max = 10
        render( view:'list', model:[ MDTInstanceList: filterPaneService.filter( params, MDT ),
                                     MDTInstanceTotal: filterPaneService.count( params, MDT ),
                                     filterParams: FilterPaneUtils.extractFilterParams(params), params:params ] )
    }

    def show(MDT MDTInstance) {
        respond MDTInstance
    }

    def create() {
        respond new MDT(params)
    }

    @Transactional
    def save(MDT MDTInstance) {
        if (MDTInstance == null) {
            notFound()
            return
        }

        if (MDTInstance.hasErrors()) {
            respond MDTInstance.errors, view: 'create'
            return
        }

        MDTInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'MDTInstance.label', default: 'MDT'), MDTInstance.id])
                redirect MDTInstance
            }
            '*' { respond MDTInstance, [status: CREATED] }
        }
    }

    def edit(MDT MDTInstance) {
        respond MDTInstance
    }

    @Transactional
    def update(MDT MDTInstance) {
        if (MDTInstance == null) {
            notFound()
            return
        }

        if (MDTInstance.hasErrors()) {
            respond MDTInstance.errors, view: 'edit'
            return
        }

        MDTInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'MDT.label', default: 'MDT'), MDTInstance.id])
                redirect MDTInstance
            }
            '*' { respond MDTInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(MDT MDTInstance) {

        if (MDTInstance == null) {
            notFound()
            return
        }

        MDTInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'MDT.label', default: 'MDT'), MDTInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'MDTInstance.label', default: 'MDT'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
