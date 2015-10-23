package genomicsmdt


import grails.test.mixin.*
import spock.lang.*

@TestFor(AttendenceCapacityController)
@Mock(AttendenceCapacity)
class AttendenceCapacityControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when: "The index action is executed"
        controller.index()

        then: "The model is correct"
        !model.attendenceCapacityInstanceList
        model.attendenceCapacityInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when: "The create action is executed"
        controller.create()

        then: "The model is correctly created"
        model.attendenceCapacityInstance != null
    }

    void "Test the save action correctly persists an instance"() {

        when: "The save action is executed with an invalid instance"
        def attendenceCapacity = new AttendenceCapacity()
        attendenceCapacity.validate()
        controller.save(attendenceCapacity)

        then: "The create view is rendered again with the correct model"
        model.attendenceCapacityInstance != null
        view == 'create'

        when: "The save action is executed with a valid instance"
        response.reset()
        populateValidParams(params)
        attendenceCapacity = new AttendenceCapacity(params)

        controller.save(attendenceCapacity)

        then: "A redirect is issued to the show action"
        response.redirectedUrl == '/attendenceCapacity/show/1'
        controller.flash.message != null
        AttendenceCapacity.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when: "The show action is executed with a null domain"
        controller.show(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the show action"
        populateValidParams(params)
        def attendenceCapacity = new AttendenceCapacity(params)
        controller.show(attendenceCapacity)

        then: "A model is populated containing the domain instance"
        model.attendenceCapacityInstance == attendenceCapacity
    }

    void "Test that the edit action returns the correct model"() {
        when: "The edit action is executed with a null domain"
        controller.edit(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the edit action"
        populateValidParams(params)
        def attendenceCapacity = new AttendenceCapacity(params)
        controller.edit(attendenceCapacity)

        then: "A model is populated containing the domain instance"
        model.attendenceCapacityInstance == attendenceCapacity
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when: "Update is called for a domain instance that doesn't exist"
        controller.update(null)

        then: "A 404 error is returned"
        response.redirectedUrl == '/attendenceCapacity/index'
        flash.message != null


        when: "An invalid domain instance is passed to the update action"
        response.reset()
        def attendenceCapacity = new AttendenceCapacity()
        attendenceCapacity.validate()
        controller.update(attendenceCapacity)

        then: "The edit view is rendered again with the invalid instance"
        view == 'edit'
        model.attendenceCapacityInstance == attendenceCapacity

        when: "A valid domain instance is passed to the update action"
        response.reset()
        populateValidParams(params)
        attendenceCapacity = new AttendenceCapacity(params).save(flush: true)
        controller.update(attendenceCapacity)

        then: "A redirect is issues to the show action"
        response.redirectedUrl == "/attendenceCapacity/show/$attendenceCapacity.id"
        flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when: "The delete action is called for a null instance"
        controller.delete(null)

        then: "A 404 is returned"
        response.redirectedUrl == '/attendenceCapacity/index'
        flash.message != null

        when: "A domain instance is created"
        response.reset()
        populateValidParams(params)
        def attendenceCapacity = new AttendenceCapacity(params).save(flush: true)

        then: "It exists"
        AttendenceCapacity.count() == 1

        when: "The domain instance is passed to the delete action"
        controller.delete(attendenceCapacity)

        then: "The instance is deleted"
        AttendenceCapacity.count() == 0
        response.redirectedUrl == '/attendenceCapacity/index'
        flash.message != null
    }
}
