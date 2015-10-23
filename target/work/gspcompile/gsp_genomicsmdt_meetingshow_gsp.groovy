import genomicsmdt.Meeting
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_meetingshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/meeting/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'meeting.label', default: 'Meeting'))],-1)
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
invokeTag('message','g',20,['code':("meeting.mdt.label"),'default':("MDT")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(meetingInstance?.mdt?.encodeAsHTML())
})
invokeTag('link','g',22,['controller':("MDT"),'action':("show"),'id':(meetingInstance?.mdt?.id)],2)
printHtmlPart(6)
invokeTag('message','g',27,['code':("meeting.date.label"),'default':("Date")],-1)
printHtmlPart(7)
invokeTag('formatDate','g',29,['format':("yyyy-MM-dd"),'date':(meetingInstance?.date)],-1)
printHtmlPart(8)
invokeTag('message','g',34,['code':("meeting.time.label"),'default':("Time")],-1)
printHtmlPart(7)
expressionOut.print(fieldValue(bean: meetingInstance, field: "time"))
printHtmlPart(8)
invokeTag('message','g',41,['code':("meeting.duration.label"),'default':("Duration")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(meetingInstance?.duration?.encodeAsHTML())
})
invokeTag('link','g',43,['controller':("timeInterval"),'action':("show"),'id':(meetingInstance?.duration?.id)],2)
printHtmlPart(8)
invokeTag('message','g',48,['code':("meeting.location.label"),'default':("Location")],-1)
printHtmlPart(7)
expressionOut.print(fieldValue(bean: meetingInstance, field: "location"))
printHtmlPart(8)
invokeTag('message','g',55,['code':("meeting.status.label"),'default':("Status")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(meetingInstance?.status?.encodeAsHTML())
})
invokeTag('link','g',57,['controller':("meetingStatus"),'action':("show"),'id':(meetingInstance?.status?.id)],2)
printHtmlPart(8)
invokeTag('message','g',62,['code':("meeting.minutes.label"),'default':("Minutes")],-1)
printHtmlPart(7)
expressionOut.print(fieldValue(bean: meetingInstance, field: "minutes"))
printHtmlPart(9)
invokeTag('message','g',69,['code':("meeting.additionalPapers.label"),'default':("Additional Papers")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: meetingInstance, field: "additionalPapers"))
printHtmlPart(10)
if(true && (meetingInstance?.attendenceRecords)) {
printHtmlPart(11)
invokeTag('message','g',77,['code':("meeting.attendenceRecords.label"),'default':("Invited People")],-1)
printHtmlPart(12)
for( a in (meetingInstance.attendenceRecords) ) {
printHtmlPart(13)
createTagBody(4, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',82,['controller':("attendenceRecord"),'action':("show"),'id':(a.id)],4)
printHtmlPart(14)
}
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (meetingInstance?.discussionRecords)) {
printHtmlPart(11)
invokeTag('message','g',92,['code':("meeting.discussionRecords.label"),'default':("Agenda Items")],-1)
printHtmlPart(12)
for( d in (meetingInstance.discussionRecords) ) {
printHtmlPart(13)
createTagBody(4, {->
expressionOut.print(d?.encodeAsHTML())
})
invokeTag('link','g',97,['controller':("discussionRecord"),'action':("show"),'id':(d.id)],4)
printHtmlPart(14)
}
printHtmlPart(15)
}
printHtmlPart(17)
if(true && (meetingInstance.status.toString() != 'Occurred')) {
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',113,['controller':("attendenceRecord"),'action':("createMultiple"),'params':(['meeting': meetingInstance?.id])],3)
printHtmlPart(18)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',114,['controller':("discussionRecord"),'action':("createMultiple"),'params':(['meeting': meetingInstance?.id])],3)
printHtmlPart(0)
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',118,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445507473029L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
