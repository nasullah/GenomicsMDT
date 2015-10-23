import genomicsmdt.AttendenceRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_attendenceRecord_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendenceRecord/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: attendenceRecordInstance, field: 'meeting', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("attendenceRecord.meeting.label"),'default':("Meeting")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['class':("form-control"),'id':("meeting"),'name':("meeting.id"),'from':(genomicsmdt.Meeting.list()),'optionKey':("id"),'required':(""),'value':(attendenceRecordInstance?.meeting?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: attendenceRecordInstance, field: 'meeting', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: attendenceRecordInstance, field: 'person', 'error'))
printHtmlPart(5)
invokeTag('message','g',18,['code':("attendenceRecord.person.label"),'default':("Person")],-1)
printHtmlPart(2)
invokeTag('select','g',20,['class':("form-control"),'id':("person"),'name':("person.id"),'from':(genomicsmdt.Person.list()),'optionKey':("id"),'required':(""),'value':(attendenceRecordInstance?.person?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: attendenceRecordInstance, field: 'person', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: attendenceRecordInstance, field: 'invitedOn', 'error'))
printHtmlPart(6)
invokeTag('message','g',28,['code':("attendenceRecord.invitedOn.label"),'default':("Invited On")],-1)
printHtmlPart(2)
invokeTag('datePicker','bs',30,['name':("invitedOn"),'precision':("day"),'value':(attendenceRecordInstance?.invitedOn)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: attendenceRecordInstance, field: 'invitedOn', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: attendenceRecordInstance, field: 'repliedOn', 'error'))
printHtmlPart(7)
invokeTag('message','g',38,['code':("attendenceRecord.repliedOn.label"),'default':("Replied On")],-1)
printHtmlPart(2)
invokeTag('datePicker','bs',40,['name':("repliedOn"),'precision':("day"),'value':(attendenceRecordInstance?.repliedOn)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: attendenceRecordInstance, field: 'repliedOn', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: attendenceRecordInstance, field: 'status', 'error'))
printHtmlPart(8)
invokeTag('message','g',48,['code':("attendenceRecord.status.label"),'default':("Status")],-1)
printHtmlPart(2)
invokeTag('select','g',50,['class':("form-control"),'id':("status"),'name':("status.id"),'from':(genomicsmdt.AttendenceStatus.list()),'optionKey':("id"),'required':(""),'value':(attendenceRecordInstance?.status?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: attendenceRecordInstance, field: 'status', 'error'))
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435913955381L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
