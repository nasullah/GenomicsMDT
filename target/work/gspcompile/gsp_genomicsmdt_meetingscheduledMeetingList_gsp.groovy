import genomicsmdt.MeetingStatus
import  genomicsmdt.Meeting
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_meetingscheduledMeetingList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/meeting/scheduledMeetingList.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('select','g',25,['class':("form-control"),'id':("meeting"),'name':("meeting.id"),'from':(Meeting.findAllByStatus(MeetingStatus.findByMeetingStatusName('Scheduled'))),'optionKey':("id"),'required':(""),'value':(""),'noSelection':(['':'- Choose a scheduled meeting -']),'onchange':("findAgendaItemsAndInvitedPeople()")],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'status', 'error'))
printHtmlPart(8)
invokeTag('message','g',42,['code':("meeting.status.label"),'default':("Status")],-1)
printHtmlPart(9)
invokeTag('select','g',44,['class':("form-control"),'id':("status"),'name':("status.id"),'from':(genomicsmdt.MeetingStatus.list()),'optionKey':("id"),'required':("")],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'status', 'error'))
printHtmlPart(11)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'minutes', 'error'))
printHtmlPart(12)
invokeTag('message','g',52,['code':("meeting.minutes.label"),'default':("Minutes")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'minutes', 'error'))
printHtmlPart(14)
invokeTag('submitButton','g',64,['name':("create"),'class':("btn btn-primary"),'value':("Save")],-1)
printHtmlPart(15)
invokeTag('message','g',66,['code':("default.button.reset.label"),'default':("Reset")],-1)
printHtmlPart(16)
})
invokeTag('form','g',66,['action':("saveAllDiscussedPatientAndAttendees"),'class':("form-horizontal"),'role':("form")],2)
printHtmlPart(17)
expressionOut.print(remoteFunction (controller: 'meeting',
                        action: 'findAgendaItems',
                        params: '"meeting=" + $("#meeting").val()',
                        update: 'agendaItems',
                        onFailure:'errorAgendaItems()'
                ))
printHtmlPart(18)
expressionOut.print(remoteFunction (controller: 'meeting',
                        action: 'findAttendenceRecords',
                        params: '"meeting=" + $("#meeting").val()',
                        update: 'invitedPeople',
                        onFailure:'errorAttendenceRecords()'
                ))
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',112,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1436437477300L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
