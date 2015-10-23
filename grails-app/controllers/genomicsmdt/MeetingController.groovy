package genomicsmdt

import grails.plugins.springsecurity.Secured
import org.grails.plugin.filterpane.FilterPaneUtils

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * MeetingController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_USER', 'ROLE_ADMIN'])
@Transactional(readOnly = true)
class MeetingController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def filterPaneService

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Meeting.list(params), model: [meetingInstanceCount: Meeting.count()]
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [meetingInstanceList: Meeting.list(params), meetingInstanceTotal: Meeting.count()]
    }

    def filter = {
        if(!params.max) params.max = 10
        render( view:'list', model:[ meetingInstanceList: filterPaneService.filter( params, Meeting ),
                                     meetingInstanceTotal: filterPaneService.count( params, Meeting ),
                                     filterParams: FilterPaneUtils.extractFilterParams(params), params:params ] )
    }

    def show(Meeting meetingInstance) {
        respond meetingInstance
    }

    def create() {
        respond new Meeting(params)
    }

    def scheduledMeetingList(){

        render(view: "scheduledMeetingList")
    }
    def findAgendaItems(){
        def meetingInstance = Meeting.findById(params.long('meeting'))
        def agendaItems = meetingInstance?.discussionRecords
        render(template: "agendaItems", model: [agendaItems: agendaItems])
    }

    def findAttendenceRecords(){
        def meetingInstance = Meeting.findById(params.long('meeting'))
        def invitedPeople = meetingInstance?.attendenceRecords
        render(template: "invitedPeople", model: [invitedPeople: invitedPeople])
    }

    @Transactional
    def saveAllDiscussedPatientAndAttendees(){

        def listPersonParams = params.findAll{it.key.startsWith("checkbox_person_")}.values()
        def listPersonIds = new ArrayList(listPersonParams);
        def listReferralRecordParams = params.findAll{it.key.startsWith("checkbox_referralRecord_")}.values()
        def listReferralRecordIds = new ArrayList(listReferralRecordParams);
        def meetingInstance = Meeting.findById(params.long('meeting.id'))

        if (!listReferralRecordIds.empty || !listPersonIds.empty){
            if (!listReferralRecordIds.empty) {
                for (int i = 0; i < listReferralRecordIds.size(); i++) {
                    def discussionRecordInstance = DiscussionRecord.findById(listReferralRecordIds.get(i).toString().toInteger())
                    if (discussionRecordInstance){
                        discussionRecordInstance.status = DiscussionStatus.findByDiscussionStatusName('Discussed')
                        discussionRecordInstance.save(flush: true)
                    }
                }
                def discussionRecordInstanceList = meetingInstance.discussionRecords
                for (int i = 0; i < discussionRecordInstanceList.size(); i++) {
                    def discussionRecordInstance = discussionRecordInstanceList.getAt(i)
                    if (discussionRecordInstance.status == DiscussionStatus.findByDiscussionStatusName('Scheduled')){
                        discussionRecordInstance.status = DiscussionStatus.findByDiscussionStatusName('Deferred')
                        discussionRecordInstance.save(flush: true)
                    }
                }
            }
            if (!listPersonIds.empty) {
                for (int i = 0; i < listPersonIds.size(); i++) {
                    def attendenceRecordInstance = AttendenceRecord.findById(listPersonIds.get(i).toString().toInteger())
                    if (attendenceRecordInstance){
                        attendenceRecordInstance?.status = AttendenceStatus.findByAttendenceStatusName('Attended')
                        attendenceRecordInstance.save(flush: true)
                    }
                }
            }
            def attendenceRecordInstanceList = meetingInstance.attendenceRecords
            for (int i = 0; i < attendenceRecordInstanceList.size(); i++) {
                def attendenceRecordInstance = attendenceRecordInstanceList.getAt(i)
                if (attendenceRecordInstance.status == AttendenceStatus.findByAttendenceStatusName('Invited')){
                    attendenceRecordInstance.status = AttendenceStatus.findByAttendenceStatusName('Absent')
                    attendenceRecordInstance.save(flush: true)
                }
            }

            if (params.status){
                meetingInstance.status = MeetingStatus.findById(params.long('status.id'))
                meetingInstance.save(flush: true)
            }
            redirect(controller: 'meeting', action: "show", id: meetingInstance.id)
        }
        else {
            flash.message = "Select people to be invited!"
//            render(view: "create", model: [meetingInstance: meetingInstance, mdtMembers: mdtMembers])
        }

    }

    @Transactional
    def save(Meeting meetingInstance) {
        if (meetingInstance == null) {
            notFound()
            return
        }

        if (meetingInstance.hasErrors()) {
            respond meetingInstance.errors, view: 'create'
            return
        }

        meetingInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'meetingInstance.label', default: 'Meeting'), meetingInstance.id])
                redirect meetingInstance
            }
            '*' { respond meetingInstance, [status: CREATED] }
        }
    }

    def edit(Meeting meetingInstance) {
        respond meetingInstance
    }

    @Transactional
    def update(Meeting meetingInstance) {
        if (meetingInstance == null) {
            notFound()
            return
        }

        if (meetingInstance.hasErrors()) {
            respond meetingInstance.errors, view: 'edit'
            return
        }

        meetingInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Meeting.label', default: 'Meeting'), meetingInstance.id])
                redirect meetingInstance
            }
            '*' { respond meetingInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Meeting meetingInstance) {

        if (meetingInstance == null) {
            notFound()
            return
        }

        meetingInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Meeting.label', default: 'Meeting'), meetingInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'meetingInstance.label', default: 'Meeting'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
