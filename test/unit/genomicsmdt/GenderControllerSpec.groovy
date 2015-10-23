package genomicsmdt


import grails.test.mixin.*
import spock.lang.*

@TestFor(GenderController)
@Mock(Gender)
class GenderControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when: "The index action is executed"
        controller.index()

        then: "The model is correct"
        !model.genderInstanceList
        model.genderInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when: "The create action is executed"
        controller.create()

        then: "The model is correctly created"
        model.genderInstance != null
    }

    void "Test the save action correctly persists an instance"() {

        when: "The save action is executed with an invalid instance"
        def gender = new Gender()
        gender.validate()
        controller.save(gender)

        then: "The create view is rendered again with the correct model"
        model.genderInstance != null
        view == 'create'

        when: "The save action is executed with a valid instance"
        response.reset()
        populateValidParams(params)
        gender = new Gender(params)

        controller.save(gender)

        then: "A redirect is issued to the show action"
        response.redirectedUrl == '/gender/show/1'
        controller.flash.message != null
        Gender.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when: "The show action is executed with a null domain"
        controller.show(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the show action"
        populateValidParams(params)
        def gender = new Gender(params)
        controller.show(gender)

        then: "A model is populated containing the domain instance"
        model.genderInstance == gender
    }

    void "Test that the edit action returns the correct model"() {
        when: "The edit action is executed with a null domain"
        controller.edit(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the edit action"
        populateValidParams(params)
        def gender = new Gender(params)
        controller.edit(gender)

        then: "A model is populated containing the domain instance"
        model.genderInstance == gender
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when: "Update is called for a domain instance that doesn't exist"
        controller.update(null)

        then: "A 404 error is returned"
        response.redirectedUrl == '/gender/index'
        flash.message != null


        when: "An invalid domain instance is passed to the update action"
        response.reset()
        def gender = new Gender()
        gender.validate()
        controller.update(gender)

        then: "The edit view is rendered again with the invalid instance"
        view == 'edit'
        model.genderInstance == gender

        when: "A valid domain instance is passed to the update action"
        response.reset()
        populateValidParams(params)
        gender = new Gender(params).save(flush: true)
        controller.update(gender)

        then: "A redirect is issues to the show action"
        response.redirectedUrl == "/gender/show/$gender.id"
        flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when: "The delete action is called for a null instance"
        controller.delete(null)

        then: "A 404 is returned"
        response.redirectedUrl == '/gender/index'
        flash.message != null

        when: "A domain instance is created"
        response.reset()
        populateValidParams(params)
        def gender = new Gender(params).save(flush: true)

        then: "It exists"
        Gender.count() == 1

        when: "The domain instance is passed to the delete action"
        controller.delete(gender)

        then: "The instance is deleted"
        Gender.count() == 0
        response.redirectedUrl == '/gender/index'
        flash.message != null
    }
}
