import genomicsmdt.Meeting
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_meeting_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/meeting/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'mdt', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("meeting.mdt.label"),'default':("MDT")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['class':("form-control"),'id':("mdt"),'name':("mdt.id"),'from':(genomicsmdt.MDT.list()),'optionKey':("id"),'required':(""),'value':(meetingInstance?.mdt?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'mdt', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'date', 'error'))
printHtmlPart(5)
invokeTag('message','g',20,['code':("meeting.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','bs',22,['name':("date"),'precision':("day"),'value':(meetingInstance?.date)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'date', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'time', 'error'))
printHtmlPart(7)
invokeTag('message','g',30,['code':("meeting.time.label"),'default':("Time")],-1)
printHtmlPart(2)
invokeTag('field','g',32,['class':("form-control"),'type':("time"),'name':("time"),'value':(meetingInstance?.time),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'time', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'duration', 'error'))
printHtmlPart(8)
invokeTag('message','g',40,['code':("meeting.duration.label"),'default':("Duration")],-1)
printHtmlPart(9)
invokeTag('select','g',42,['class':("form-control"),'id':("duration"),'name':("duration.id"),'from':(genomicsmdt.TimeInterval.list()),'optionKey':("id"),'value':(meetingInstance?.duration?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'duration', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'location', 'error'))
printHtmlPart(10)
invokeTag('message','g',50,['code':("meeting.location.label"),'default':("Location")],-1)
printHtmlPart(2)
invokeTag('textField','g',52,['class':("form-control"),'name':("location"),'required':(""),'value':(meetingInstance?.location)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'location', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'status', 'error'))
printHtmlPart(11)
invokeTag('message','g',60,['code':("meeting.status.label"),'default':("Status")],-1)
printHtmlPart(2)
invokeTag('select','g',62,['class':("form-control"),'id':("status"),'name':("status.id"),'from':(genomicsmdt.MeetingStatus.list()),'optionKey':("id"),'required':(""),'value':(meetingInstance?.status?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'status', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'minutes', 'error'))
printHtmlPart(12)
invokeTag('message','g',70,['code':("meeting.minutes.label"),'default':("Minutes")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'minutes', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'additionalPapers', 'error'))
printHtmlPart(14)
invokeTag('message','g',83,['code':("meeting.additionalPapers.label"),'default':("Additional Papers")],-1)
printHtmlPart(15)
expressionOut.print(hasErrors(bean: meetingInstance, field: 'additionalPapers', 'error'))
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445507420416L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
