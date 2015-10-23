package genomicsmdt


import grails.test.mixin.*
import spock.lang.*

@TestFor(OMIM_TermController)
@Mock(OMIM_Term)
class OMIM_TermControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when: "The index action is executed"
        controller.index()

        then: "The model is correct"
        !model.OMIM_TermInstanceList
        model.OMIM_TermInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when: "The create action is executed"
        controller.create()

        then: "The model is correctly created"
        model.OMIM_TermInstance != null
    }

    void "Test the save action correctly persists an instance"() {

        when: "The save action is executed with an invalid instance"
        def OMIM_Term = new OMIM_Term()
        OMIM_Term.validate()
        controller.save(OMIM_Term)

        then: "The create view is rendered again with the correct model"
        model.OMIM_TermInstance != null
        view == 'create'

        when: "The save action is executed with a valid instance"
        response.reset()
        populateValidParams(params)
        OMIM_Term = new OMIM_Term(params)

        controller.save(OMIM_Term)

        then: "A redirect is issued to the show action"
        response.redirectedUrl == '/OMIM_Term/show/1'
        controller.flash.message != null
        OMIM_Term.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when: "The show action is executed with a null domain"
        controller.show(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the show action"
        populateValidParams(params)
        def OMIM_Term = new OMIM_Term(params)
        controller.show(OMIM_Term)

        then: "A model is populated containing the domain instance"
        model.OMIM_TermInstance == OMIM_Term
    }

    void "Test that the edit action returns the correct model"() {
        when: "The edit action is executed with a null domain"
        controller.edit(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the edit action"
        populateValidParams(params)
        def OMIM_Term = new OMIM_Term(params)
        controller.edit(OMIM_Term)

        then: "A model is populated containing the domain instance"
        model.OMIM_TermInstance == OMIM_Term
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when: "Update is called for a domain instance that doesn't exist"
        controller.update(null)

        then: "A 404 error is returned"
        response.redirectedUrl == '/OMIM_Term/index'
        flash.message != null


        when: "An invalid domain instance is passed to the update action"
        response.reset()
        def OMIM_Term = new OMIM_Term()
        OMIM_Term.validate()
        controller.update(OMIM_Term)

        then: "The edit view is rendered again with the invalid instance"
        view == 'edit'
        model.OMIM_TermInstance == OMIM_Term

        when: "A valid domain instance is passed to the update action"
        response.reset()
        populateValidParams(params)
        OMIM_Term = new OMIM_Term(params).save(flush: true)
        controller.update(OMIM_Term)

        then: "A redirect is issues to the show action"
        response.redirectedUrl == "/OMIM_Term/show/$OMIM_Term.id"
        flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when: "The delete action is called for a null instance"
        controller.delete(null)

        then: "A 404 is returned"
        response.redirectedUrl == '/OMIM_Term/index'
        flash.message != null

        when: "A domain instance is created"
        response.reset()
        populateValidParams(params)
        def OMIM_Term = new OMIM_Term(params).save(flush: true)

        then: "It exists"
        OMIM_Term.count() == 1

        when: "The domain instance is passed to the delete action"
        controller.delete(OMIM_Term)

        then: "The instance is deleted"
        OMIM_Term.count() == 0
        response.redirectedUrl == '/OMIM_Term/index'
        flash.message != null
    }
}
