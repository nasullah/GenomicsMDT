package genomicsmdt

import ch.silviowangler.groovy.util.builder.ICalendarBuilder
import grails.plugins.springsecurity.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

/**
 * AttendenceRecordController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
@Secured(['ROLE_USER', 'ROLE_ADMIN'])
@Transactional(readOnly = true)
class AttendenceRecordController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def mailService

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AttendenceRecord.list(params), model: [attendenceRecordInstanceCount: AttendenceRecord.count()]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond AttendenceRecord.list(params), model: [attendenceRecordInstanceCount: AttendenceRecord.count()]
    }

    def show(AttendenceRecord attendenceRecordInstance) {
        respond attendenceRecordInstance
    }

    def create() {
        respond new AttendenceRecord(params)
    }

    def createMultiple() {
        def meetingInstance = Meeting.findById(params.long('meeting'))
        List existingAttendees = meetingInstance.attendenceRecords.person
        def mdtMembers
        if (!existingAttendees.empty){
            mdtMembers = Membership.findAllByPersonNotInListAndMdt(existingAttendees,meetingInstance.mdt)
        }else{
            mdtMembers = meetingInstance.mdt.members
        }

        render(view: "create", model: [meetingInstance: meetingInstance, mdtMembers: mdtMembers])
    }

    @Transactional
    def saveAll(){
        def listParams = params.findAll{it.key.startsWith("checkbox_")}.values()
        def listPersonsId = new ArrayList(listParams);
        def meetingInstance = Meeting.findById(params.long('meeting.id'))
        List existingAttendees = meetingInstance.attendenceRecords.person
        def mdtMembers
        if (!existingAttendees.empty){
            mdtMembers = Membership.findAllByPersonNotInListAndMdt(existingAttendees,meetingInstance.mdt)
        }else{
            mdtMembers = meetingInstance.mdt.members
        }
        if (!listPersonsId.empty){
            for (int i = 0; i < listPersonsId.size(); i++) {
                def accessGUID = UUID.randomUUID().toString()
                def bindingMap = [person: listPersonsId.get(i), invitedOn: new Date(), status: AttendenceStatus.findByAttendenceStatusName('Invited'), accessGUID: accessGUID]
                def attendenceRecordInstance = new AttendenceRecord(bindingMap)
                meetingInstance.addToAttendenceRecords(attendenceRecordInstance)
                meetingInstance.save failOnError:true
                attendenceRecordInstance.addToAttendenceCapacity(new AttendenceCapacity(attendenceCapacity: Membership.findByPersonAndMdt(Person.findById(listPersonsId.get(i).toString().toLong()), meetingInstance.mdt).role)).save failOnError:true

            }

            def builder = new ICalendarBuilder()
            builder.calendar {
                events {
                    event(start: new Date(), end: (new Date()).next(), summary: 'MDT meeting') {
                        organizer(name:"${meetingInstance?.mdt?.name}", email:"${meetingInstance?.mdt?.email}")
                        reminder(minutesBefore: 15, description: 'MDT meeting')
                    }
                }
            }

            for (int i = 0; i < listPersonsId.size(); i++) {
                mailService.sendMail {
                    multipart true
                    to "${Person.findById(listPersonsId.get(i).toString().toLong())?.email}"
                    subject "MDT meeting at ${meetingInstance?.time} on ${meetingInstance?.date?.format('yyyy-MM-dd')} at loction ${meetingInstance?.location}"
                    body "This is an invitation for MDT meeting at ${meetingInstance?.time} on ${meetingInstance?.date?.format('yyyy-MM-dd')} at loction ${meetingInstance?.location}, please accept the invitation by clicking this link, ${g.createLink(absolute : 'true', controller:"receiveReply", action:"reply", params:[accessGUID: AttendenceRecord?.findByPerson(Person?.findById(listPersonsId?.get(i)?.toString()?.toLong()))?.accessGUID])}"
                    attachBytes "appointment.ics", "text/calendar", builder.cal.toString().getBytes('UTF-8')
                }
            }

            redirect(controller: 'meeting', action: "show", id: meetingInstance.id)

        }else {
            flash.message = "Select people to be invited!"
            render(view: "create", model: [meetingInstance: meetingInstance, mdtMembers: mdtMembers])
        }

    }

    @Transactional
    def save(AttendenceRecord attendenceRecordInstance) {
        if (attendenceRecordInstance == null) {
            notFound()
            return
        }

        if (attendenceRecordInstance.hasErrors()) {
            respond attendenceRecordInstance.errors, view: 'create'
            return
        }

        attendenceRecordInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'attendenceRecordInstance.label', default: 'AttendenceRecord'), attendenceRecordInstance.id])
                redirect attendenceRecordInstance
            }
            '*' { respond attendenceRecordInstance, [status: CREATED] }
        }
    }

    def edit(AttendenceRecord attendenceRecordInstance) {
        respond attendenceRecordInstance
    }

    @Transactional
    def update(AttendenceRecord attendenceRecordInstance) {
        if (attendenceRecordInstance == null) {
            notFound()
            return
        }

        if (attendenceRecordInstance.hasErrors()) {
            respond attendenceRecordInstance.errors, view: 'edit'
            return
        }

        attendenceRecordInstance.save flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'AttendenceRecord.label', default: 'AttendenceRecord'), attendenceRecordInstance.id])
                redirect attendenceRecordInstance
            }
            '*' { respond attendenceRecordInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(AttendenceRecord attendenceRecordInstance) {

        if (attendenceRecordInstance == null) {
            notFound()
            return
        }

        attendenceRecordInstance.delete flush: true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'AttendenceRecord.label', default: 'AttendenceRecord'), attendenceRecordInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'attendenceRecordInstance.label', default: 'AttendenceRecord'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
