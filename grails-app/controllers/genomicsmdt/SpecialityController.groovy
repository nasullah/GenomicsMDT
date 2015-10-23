package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * SpecialityController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_USER', 'ROLE_ADMIN'])
@Transactional(readOnly = true)
class SpecialityController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Speciality.list(params), model: [specialityInstanceCount: Speciality.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Speciality.list(params), model: [specialityInstanceCount: Speciality.count()]
    }

    def show(Speciality specialityInstance) {
        respond specialityInstance
    }

    def create() {
        respond new Speciality(params)
    }

    @Transactional
    def save(Speciality specialityInstance) {
        if (specialityInstance == null) {
            notFound()
            return
        }

        if (specialityInstance.hasErrors()) {
            respond specialityInstance.errors, view: 'create'
            return
        }

        specialityInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'specialityInstance.label', default: 'Speciality'), specialityInstance.id])
//                redirect specialityInstance
                redirect(controller:'person',action: 'show', params: [id: specialityInstance.person.id])
            }
            '*' { respond specialityInstance, [status: CREATED] }
        }
    }

    def edit(Speciality specialityInstance) {
        respond specialityInstance
    }

    @Transactional
    def update(Speciality specialityInstance) {
        if (specialityInstance == null) {
            notFound()
            return
        }

        if (specialityInstance.hasErrors()) {
            respond specialityInstance.errors, view: 'edit'
            return
        }

        specialityInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Speciality.label', default: 'Speciality'), specialityInstance.id])
//                redirect specialityInstance
                redirect(controller:'person',action: 'show', params: [id: specialityInstance.person.id])
            }
            '*' { respond specialityInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Speciality specialityInstance) {

        if (specialityInstance == null) {
            notFound()
            return
        }

        specialityInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Speciality.label', default: 'Speciality'), specialityInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'specialityInstance.label', default: 'Speciality'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
