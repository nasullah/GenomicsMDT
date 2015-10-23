package genomicsmdt


import grails.test.mixin.*
import spock.lang.*

@TestFor(ReferralRecordController)
@Mock(ReferralRecord)
class ReferralRecordControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when: "The index action is executed"
        controller.index()

        then: "The model is correct"
        !model.referralRecordInstanceList
        model.referralRecordInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when: "The create action is executed"
        controller.create()

        then: "The model is correctly created"
        model.referralRecordInstance != null
    }

    void "Test the save action correctly persists an instance"() {

        when: "The save action is executed with an invalid instance"
        def referralRecord = new ReferralRecord()
        referralRecord.validate()
        controller.save(referralRecord)

        then: "The create view is rendered again with the correct model"
        model.referralRecordInstance != null
        view == 'create'

        when: "The save action is executed with a valid instance"
        response.reset()
        populateValidParams(params)
        referralRecord = new ReferralRecord(params)

        controller.save(referralRecord)

        then: "A redirect is issued to the show action"
        response.redirectedUrl == '/referralRecord/show/1'
        controller.flash.message != null
        ReferralRecord.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when: "The show action is executed with a null domain"
        controller.show(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the show action"
        populateValidParams(params)
        def referralRecord = new ReferralRecord(params)
        controller.show(referralRecord)

        then: "A model is populated containing the domain instance"
        model.referralRecordInstance == referralRecord
    }

    void "Test that the edit action returns the correct model"() {
        when: "The edit action is executed with a null domain"
        controller.edit(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the edit action"
        populateValidParams(params)
        def referralRecord = new ReferralRecord(params)
        controller.edit(referralRecord)

        then: "A model is populated containing the domain instance"
        model.referralRecordInstance == referralRecord
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when: "Update is called for a domain instance that doesn't exist"
        controller.update(null)

        then: "A 404 error is returned"
        response.redirectedUrl == '/referralRecord/index'
        flash.message != null


        when: "An invalid domain instance is passed to the update action"
        response.reset()
        def referralRecord = new ReferralRecord()
        referralRecord.validate()
        controller.update(referralRecord)

        then: "The edit view is rendered again with the invalid instance"
        view == 'edit'
        model.referralRecordInstance == referralRecord

        when: "A valid domain instance is passed to the update action"
        response.reset()
        populateValidParams(params)
        referralRecord = new ReferralRecord(params).save(flush: true)
        controller.update(referralRecord)

        then: "A redirect is issues to the show action"
        response.redirectedUrl == "/referralRecord/show/$referralRecord.id"
        flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when: "The delete action is called for a null instance"
        controller.delete(null)

        then: "A 404 is returned"
        response.redirectedUrl == '/referralRecord/index'
        flash.message != null

        when: "A domain instance is created"
        response.reset()
        populateValidParams(params)
        def referralRecord = new ReferralRecord(params).save(flush: true)

        then: "It exists"
        ReferralRecord.count() == 1

        when: "The domain instance is passed to the delete action"
        controller.delete(referralRecord)

        then: "The instance is deleted"
        ReferralRecord.count() == 0
        response.redirectedUrl == '/referralRecord/index'
        flash.message != null
    }
}
