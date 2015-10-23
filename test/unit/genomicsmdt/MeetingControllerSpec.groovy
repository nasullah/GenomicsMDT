package genomicsmdt


import grails.test.mixin.*
import spock.lang.*

@TestFor(MeetingController)
@Mock(Meeting)
class MeetingControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when: "The index action is executed"
        controller.index()

        then: "The model is correct"
        !model.meetingInstanceList
        model.meetingInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when: "The create action is executed"
        controller.create()

        then: "The model is correctly created"
        model.meetingInstance != null
    }

    void "Test the save action correctly persists an instance"() {

        when: "The save action is executed with an invalid instance"
        def meeting = new Meeting()
        meeting.validate()
        controller.save(meeting)

        then: "The create view is rendered again with the correct model"
        model.meetingInstance != null
        view == 'create'

        when: "The save action is executed with a valid instance"
        response.reset()
        populateValidParams(params)
        meeting = new Meeting(params)

        controller.save(meeting)

        then: "A redirect is issued to the show action"
        response.redirectedUrl == '/meeting/show/1'
        controller.flash.message != null
        Meeting.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when: "The show action is executed with a null domain"
        controller.show(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the show action"
        populateValidParams(params)
        def meeting = new Meeting(params)
        controller.show(meeting)

        then: "A model is populated containing the domain instance"
        model.meetingInstance == meeting
    }

    void "Test that the edit action returns the correct model"() {
        when: "The edit action is executed with a null domain"
        controller.edit(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the edit action"
        populateValidParams(params)
        def meeting = new Meeting(params)
        controller.edit(meeting)

        then: "A model is populated containing the domain instance"
        model.meetingInstance == meeting
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when: "Update is called for a domain instance that doesn't exist"
        controller.update(null)

        then: "A 404 error is returned"
        response.redirectedUrl == '/meeting/index'
        flash.message != null


        when: "An invalid domain instance is passed to the update action"
        response.reset()
        def meeting = new Meeting()
        meeting.validate()
        controller.update(meeting)

        then: "The edit view is rendered again with the invalid instance"
        view == 'edit'
        model.meetingInstance == meeting

        when: "A valid domain instance is passed to the update action"
        response.reset()
        populateValidParams(params)
        meeting = new Meeting(params).save(flush: true)
        controller.update(meeting)

        then: "A redirect is issues to the show action"
        response.redirectedUrl == "/meeting/show/$meeting.id"
        flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when: "The delete action is called for a null instance"
        controller.delete(null)

        then: "A 404 is returned"
        response.redirectedUrl == '/meeting/index'
        flash.message != null

        when: "A domain instance is created"
        response.reset()
        populateValidParams(params)
        def meeting = new Meeting(params).save(flush: true)

        then: "It exists"
        Meeting.count() == 1

        when: "The domain instance is passed to the delete action"
        controller.delete(meeting)

        then: "The instance is deleted"
        Meeting.count() == 0
        response.redirectedUrl == '/meeting/index'
        flash.message != null
    }
}
