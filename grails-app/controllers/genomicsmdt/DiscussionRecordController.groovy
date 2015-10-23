package genomicsmdt

import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * DiscussionRecordController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_USER', 'ROLE_ADMIN'])
@Transactional(readOnly = true)
class DiscussionRecordController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond DiscussionRecord.list(params), model: [discussionRecordInstanceCount: DiscussionRecord.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond DiscussionRecord.list(params), model: [discussionRecordInstanceCount: DiscussionRecord.count()]
    }

    def show(DiscussionRecord discussionRecordInstance) {
        respond discussionRecordInstance
    }

    def create() {
        respond new DiscussionRecord(params)
    }

    def createMultiple() {
        def meetingInstance = Meeting.findById(params.long('meeting'))
        List existingItems = meetingInstance.discussionRecords.referralRecord.id
        def referralRecords
        if (!existingItems.empty){
            referralRecords = ReferralRecord.findAllByIdNotInListAndMdt(existingItems, meetingInstance.mdt)
        }else{
            referralRecords = ReferralRecord.findAllByMdt(meetingInstance.mdt)
        }
        render(view: "create", model: [meetingInstance: meetingInstance, referralRecords: referralRecords])
    }

    @Transactional
    def saveAll(){
        def listParams = params.findAll{it.key.startsWith("checkbox_")}.values()
        def listReferralId = new ArrayList(listParams);
        def meetingInstance = Meeting.findById(params.long('meeting.id'))
        List existingItems = meetingInstance.discussionRecords.referralRecord.id
        def referralRecords
        if (!existingItems.empty){
            referralRecords = ReferralRecord.findAllByIdNotInListAndMdt(existingItems, meetingInstance.mdt)
        }else{
            referralRecords = ReferralRecord.findAllByMdt(meetingInstance.mdt)
        }
        if (!listReferralId.empty){
            for (int i = 0; i < listReferralId.size(); i++) {
                new DiscussionRecord(meeting:meetingInstance, approvalToInform: true, referralRecord: listReferralId.get(i), status: DiscussionStatus.findByDiscussionStatusName('Scheduled')).save failOnError:true
            }
            redirect(controller: 'meeting', action: "show", id: meetingInstance.id)

        }else {
            flash.message = "Select agenda items!"
            render(view: "create", model: [meetingInstance: meetingInstance, referralRecords: referralRecords])
        }

    }

    @Transactional
    def save(DiscussionRecord discussionRecordInstance) {
        if (discussionRecordInstance == null) {
            notFound()
            return
        }

        if (discussionRecordInstance.hasErrors()) {
            respond discussionRecordInstance.errors, view: 'create'
            return
        }

        discussionRecordInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'discussionRecordInstance.label', default: 'DiscussionRecord'), discussionRecordInstance.id])
                redirect discussionRecordInstance
            }
            '*' { respond discussionRecordInstance, [status: CREATED] }
        }
    }

    def edit(DiscussionRecord discussionRecordInstance) {
        respond discussionRecordInstance
    }

    @Transactional
    def update(DiscussionRecord discussionRecordInstance) {
        if (discussionRecordInstance == null) {
            notFound()
            return
        }

        if (discussionRecordInstance.hasErrors()) {
            respond discussionRecordInstance.errors, view: 'edit'
            return
        }

        discussionRecordInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'DiscussionRecord.label', default: 'DiscussionRecord'), discussionRecordInstance.id])
                redirect discussionRecordInstance
            }
            '*' { respond discussionRecordInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(DiscussionRecord discussionRecordInstance) {

        if (discussionRecordInstance == null) {
            notFound()
            return
        }

        discussionRecordInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'DiscussionRecord.label', default: 'DiscussionRecord'), discussionRecordInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'discussionRecordInstance.label', default: 'DiscussionRecord'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
