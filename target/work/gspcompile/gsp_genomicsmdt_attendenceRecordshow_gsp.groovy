import genomicsmdt.AttendenceRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_attendenceRecordshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendenceRecord/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'attendenceRecord.label', default: 'Attendence Record'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',20,['code':("attendenceRecord.meeting.label"),'default':("Meeting")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(attendenceRecordInstance?.meeting?.encodeAsHTML())
})
invokeTag('link','g',22,['controller':("meeting"),'action':("show"),'id':(attendenceRecordInstance?.meeting?.id)],2)
printHtmlPart(6)
invokeTag('message','g',27,['code':("attendenceRecord.invitedOn.label"),'default':("Invited On")],-1)
printHtmlPart(7)
invokeTag('formatDate','g',29,['format':("yyyy-MM-dd"),'date':(attendenceRecordInstance?.invitedOn)],-1)
printHtmlPart(8)
invokeTag('message','g',34,['code':("attendenceRecord.repliedOn.label"),'default':("Replied On")],-1)
printHtmlPart(7)
invokeTag('formatDate','g',36,['format':("yyyy-MM-dd"),'date':(attendenceRecordInstance?.repliedOn)],-1)
printHtmlPart(8)
invokeTag('message','g',41,['code':("attendenceRecord.status.label"),'default':("Status")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(attendenceRecordInstance?.status?.encodeAsHTML())
})
invokeTag('link','g',43,['controller':("attendenceStatus"),'action':("show"),'id':(attendenceRecordInstance?.status?.id)],2)
printHtmlPart(8)
invokeTag('message','g',48,['code':("attendenceRecord.person.label"),'default':("Person")],-1)
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(attendenceRecordInstance?.person?.encodeAsHTML())
})
invokeTag('link','g',50,['controller':("person"),'action':("show"),'id':(attendenceRecordInstance?.person?.id)],2)
printHtmlPart(9)
invokeTag('message','g',55,['code':("attendenceRecord.attendenceCapacity.label"),'default':("Attendence Capacity")],-1)
printHtmlPart(10)
for( a in (attendenceRecordInstance.attendenceCapacity) ) {
printHtmlPart(11)
createTagBody(3, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',60,['controller':("attendenceCapacity"),'action':("show"),'id':(a.id)],3)
printHtmlPart(12)
}
printHtmlPart(13)
createClosureForHtmlPart(14, 2)
invokeTag('link','g',75,['controller':("attendenceCapacity"),'action':("create"),'params':(['attendenceRecord.id': attendenceRecordInstance?.id])],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',79,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435921692515L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
