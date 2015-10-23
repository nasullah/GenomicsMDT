import genomicsmdt.DiscussionRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_discussionRecord_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/discussionRecord/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'meeting', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("discussionRecord.meeting.label"),'default':("Meeting")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['class':("form-control"),'id':("meeting"),'name':("meeting.id"),'from':(genomicsmdt.Meeting.list()),'optionKey':("id"),'required':(""),'value':(discussionRecordInstance?.meeting?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'meeting', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'referralRecord', 'error'))
printHtmlPart(5)
invokeTag('message','g',18,['code':("discussionRecord.referralRecord.label"),'default':("Referral Record")],-1)
printHtmlPart(2)
invokeTag('select','g',20,['class':("form-control"),'id':("referralRecord"),'name':("referralRecord.id"),'from':(genomicsmdt.ReferralRecord.list()),'optionKey':("id"),'required':(""),'value':(discussionRecordInstance?.referralRecord?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'referralRecord', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'status', 'error'))
printHtmlPart(6)
invokeTag('message','g',28,['code':("discussionRecord.status.label"),'default':("Status")],-1)
printHtmlPart(2)
invokeTag('select','g',30,['class':("form-control"),'id':("status"),'name':("status.id"),'from':(genomicsmdt.DiscussionStatus.list()),'optionKey':("id"),'required':(""),'value':(discussionRecordInstance?.status?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'status', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'discussionSummary', 'error'))
printHtmlPart(7)
invokeTag('message','g',38,['code':("discussionRecord.discussionSummary.label"),'default':("Discussion Summary")],-1)
printHtmlPart(8)
invokeTag('textArea','g',40,['class':("form-control"),'name':("discussionSummary"),'cols':("40"),'rows':("4"),'value':(discussionRecordInstance?.discussionSummary)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'discussionSummary', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'approvalToInform', 'error'))
printHtmlPart(9)
invokeTag('message','g',48,['code':("discussionRecord.approvalToInform.label"),'default':("Approval To Inform")],-1)
printHtmlPart(8)
invokeTag('checkBox','bs',50,['name':("approvalToInform"),'value':(discussionRecordInstance?.approvalToInform),'offLabel':("No"),'onLabel':("Yes")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'approvalToInform', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'correspondence', 'error'))
printHtmlPart(10)
invokeTag('message','g',58,['code':("discussionRecord.correspondence.label"),'default':("Correspondence")],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: discussionRecordInstance, field: 'correspondence', 'error'))
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445507873602L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
