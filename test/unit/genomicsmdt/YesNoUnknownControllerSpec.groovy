package genomicsmdt


import grails.test.mixin.*
import spock.lang.*

@TestFor(YesNoUnknownController)
@Mock(YesNoUnknown)
class YesNoUnknownControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when: "The index action is executed"
        controller.index()

        then: "The model is correct"
        !model.yesNoUnknownInstanceList
        model.yesNoUnknownInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when: "The create action is executed"
        controller.create()

        then: "The model is correctly created"
        model.yesNoUnknownInstance != null
    }

    void "Test the save action correctly persists an instance"() {

        when: "The save action is executed with an invalid instance"
        def yesNoUnknown = new YesNoUnknown()
        yesNoUnknown.validate()
        controller.save(yesNoUnknown)

        then: "The create view is rendered again with the correct model"
        model.yesNoUnknownInstance != null
        view == 'create'

        when: "The save action is executed with a valid instance"
        response.reset()
        populateValidParams(params)
        yesNoUnknown = new YesNoUnknown(params)

        controller.save(yesNoUnknown)

        then: "A redirect is issued to the show action"
        response.redirectedUrl == '/yesNoUnknown/show/1'
        controller.flash.message != null
        YesNoUnknown.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when: "The show action is executed with a null domain"
        controller.show(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the show action"
        populateValidParams(params)
        def yesNoUnknown = new YesNoUnknown(params)
        controller.show(yesNoUnknown)

        then: "A model is populated containing the domain instance"
        model.yesNoUnknownInstance == yesNoUnknown
    }

    void "Test that the edit action returns the correct model"() {
        when: "The edit action is executed with a null domain"
        controller.edit(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the edit action"
        populateValidParams(params)
        def yesNoUnknown = new YesNoUnknown(params)
        controller.edit(yesNoUnknown)

        then: "A model is populated containing the domain instance"
        model.yesNoUnknownInstance == yesNoUnknown
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when: "Update is called for a domain instance that doesn't exist"
        controller.update(null)

        then: "A 404 error is returned"
        response.redirectedUrl == '/yesNoUnknown/index'
        flash.message != null


        when: "An invalid domain instance is passed to the update action"
        response.reset()
        def yesNoUnknown = new YesNoUnknown()
        yesNoUnknown.validate()
        controller.update(yesNoUnknown)

        then: "The edit view is rendered again with the invalid instance"
        view == 'edit'
        model.yesNoUnknownInstance == yesNoUnknown

        when: "A valid domain instance is passed to the update action"
        response.reset()
        populateValidParams(params)
        yesNoUnknown = new YesNoUnknown(params).save(flush: true)
        controller.update(yesNoUnknown)

        then: "A redirect is issues to the show action"
        response.redirectedUrl == "/yesNoUnknown/show/$yesNoUnknown.id"
        flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when: "The delete action is called for a null instance"
        controller.delete(null)

        then: "A 404 is returned"
        response.redirectedUrl == '/yesNoUnknown/index'
        flash.message != null

        when: "A domain instance is created"
        response.reset()
        populateValidParams(params)
        def yesNoUnknown = new YesNoUnknown(params).save(flush: true)

        then: "It exists"
        YesNoUnknown.count() == 1

        when: "The domain instance is passed to the delete action"
        controller.delete(yesNoUnknown)

        then: "The instance is deleted"
        YesNoUnknown.count() == 0
        response.redirectedUrl == '/yesNoUnknown/index'
        flash.message != null
    }
}
