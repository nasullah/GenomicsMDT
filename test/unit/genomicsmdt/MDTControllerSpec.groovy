package genomicsmdt


import grails.test.mixin.*
import spock.lang.*

@TestFor(MDTController)
@Mock(MDT)
class MDTControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when: "The index action is executed"
        controller.index()

        then: "The model is correct"
        !model.MDTInstanceList
        model.MDTInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when: "The create action is executed"
        controller.create()

        then: "The model is correctly created"
        model.MDTInstance != null
    }

    void "Test the save action correctly persists an instance"() {

        when: "The save action is executed with an invalid instance"
        def MDT = new MDT()
        MDT.validate()
        controller.save(MDT)

        then: "The create view is rendered again with the correct model"
        model.MDTInstance != null
        view == 'create'

        when: "The save action is executed with a valid instance"
        response.reset()
        populateValidParams(params)
        MDT = new MDT(params)

        controller.save(MDT)

        then: "A redirect is issued to the show action"
        response.redirectedUrl == '/MDT/show/1'
        controller.flash.message != null
        MDT.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when: "The show action is executed with a null domain"
        controller.show(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the show action"
        populateValidParams(params)
        def MDT = new MDT(params)
        controller.show(MDT)

        then: "A model is populated containing the domain instance"
        model.MDTInstance == MDT
    }

    void "Test that the edit action returns the correct model"() {
        when: "The edit action is executed with a null domain"
        controller.edit(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the edit action"
        populateValidParams(params)
        def MDT = new MDT(params)
        controller.edit(MDT)

        then: "A model is populated containing the domain instance"
        model.MDTInstance == MDT
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when: "Update is called for a domain instance that doesn't exist"
        controller.update(null)

        then: "A 404 error is returned"
        response.redirectedUrl == '/MDT/index'
        flash.message != null


        when: "An invalid domain instance is passed to the update action"
        response.reset()
        def MDT = new MDT()
        MDT.validate()
        controller.update(MDT)

        then: "The edit view is rendered again with the invalid instance"
        view == 'edit'
        model.MDTInstance == MDT

        when: "A valid domain instance is passed to the update action"
        response.reset()
        populateValidParams(params)
        MDT = new MDT(params).save(flush: true)
        controller.update(MDT)

        then: "A redirect is issues to the show action"
        response.redirectedUrl == "/MDT/show/$MDT.id"
        flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when: "The delete action is called for a null instance"
        controller.delete(null)

        then: "A 404 is returned"
        response.redirectedUrl == '/MDT/index'
        flash.message != null

        when: "A domain instance is created"
        response.reset()
        populateValidParams(params)
        def MDT = new MDT(params).save(flush: true)

        then: "It exists"
        MDT.count() == 1

        when: "The domain instance is passed to the delete action"
        controller.delete(MDT)

        then: "The instance is deleted"
        MDT.count() == 0
        response.redirectedUrl == '/MDT/index'
        flash.message != null
    }
}
