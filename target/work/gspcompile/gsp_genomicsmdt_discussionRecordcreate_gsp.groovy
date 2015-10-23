import genomicsmdt.DiscussionRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_discussionRecordcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/discussionRecord/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'discussionRecord.label', default: 'Discussion Record'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('message','g',21,['code':("discussionRecord.meeting.label"),'default':("Meeting")],-1)
printHtmlPart(6)
invokeTag('select','g',26,['class':("form-control"),'id':("meeting"),'name':("meeting.id"),'from':(genomicsmdt.Meeting.list()),'optionKey':("id"),'required':(""),'value':(meetingInstance?.id)],-1)
printHtmlPart(7)
invokeTag('message','g',29,['code':("discussionRecord.meeting.label"),'default':("Select agenda items")],-1)
printHtmlPart(8)
loop:{
int i = 0
for( referralRecord in (referralRecords) ) {
printHtmlPart(9)
expressionOut.print(i)
printHtmlPart(10)
expressionOut.print(referralRecord?.id)
printHtmlPart(11)
expressionOut.print(referralRecord)
printHtmlPart(12)
i++
}
}
printHtmlPart(13)
invokeTag('submitButton','g',45,['name':("create"),'class':("btn btn-primary"),'value':("Save")],-1)
printHtmlPart(14)
invokeTag('message','g',52,['code':("default.button.reset.label"),'default':("Reset")],-1)
printHtmlPart(15)
})
invokeTag('form','g',53,['action':("saveAll"),'class':("form-horizontal"),'role':("form")],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',54,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1436437582341L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
