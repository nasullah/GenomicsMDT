import genomicsmdt.DiscussionRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_discussionRecordshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/discussionRecord/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'discussionRecord.label', default: 'Discussion Record'))],-1)
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
invokeTag('message','g',20,['code':("discussionRecord.meeting.label"),'default':("Meeting")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(discussionRecordInstance?.meeting?.encodeAsHTML())
})
invokeTag('link','g',22,['controller':("meeting"),'action':("show"),'id':(discussionRecordInstance?.meeting?.id)],2)
printHtmlPart(6)
invokeTag('message','g',27,['code':("discussionRecord.referralRecord.label"),'default':("Referral Record")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(discussionRecordInstance?.referralRecord?.encodeAsHTML())
})
invokeTag('link','g',29,['controller':("referralRecord"),'action':("show"),'id':(discussionRecordInstance?.referralRecord?.id)],2)
printHtmlPart(6)
invokeTag('message','g',34,['code':("discussionRecord.status.label"),'default':("Status")],-1)
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(discussionRecordInstance?.status?.encodeAsHTML())
})
invokeTag('link','g',36,['controller':("discussionStatus"),'action':("show"),'id':(discussionRecordInstance?.status?.id)],2)
printHtmlPart(6)
invokeTag('message','g',41,['code':("discussionRecord.discussionSummary.label"),'default':("Discussion Summary")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: discussionRecordInstance, field: "discussionSummary"))
printHtmlPart(8)
invokeTag('message','g',48,['code':("discussionRecord.approvalToInform.label"),'default':("Approval To Inform")],-1)
printHtmlPart(7)
invokeTag('formatBoolean','g',50,['boolean':(discussionRecordInstance?.approvalToInform),'false':("No"),'true':("Yes")],-1)
printHtmlPart(9)
invokeTag('message','g',55,['code':("discussionRecord.correspondence.label"),'default':("Correspondence")],-1)
printHtmlPart(7)
expressionOut.print(fieldValue(bean: discussionRecordInstance, field: "correspondence"))
printHtmlPart(10)
if(true && (discussionRecord?.applicationForSequencing)) {
printHtmlPart(11)
invokeTag('message','g',63,['code':("discussionRecord.applicationForSequencing.label"),'default':("Application For Sequencing")],-1)
printHtmlPart(12)
for( a in (discussionRecord?.applicationForSequencing) ) {
printHtmlPart(13)
createTagBody(4, {->
expressionOut.print(a?.encodeAsHTML())
})
invokeTag('link','g',68,['controller':("applicationForSequencing"),'action':("show"),'id':(a.id)],4)
printHtmlPart(14)
}
printHtmlPart(15)
}
printHtmlPart(16)
createClosureForHtmlPart(17, 2)
invokeTag('link','g',84,['controller':("applicationForSequencing"),'action':("create"),'params':(['discussionRecord.id': discussionRecordInstance?.id])],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',88,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445507873624L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
