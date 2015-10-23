import genomicsmdt.AttendenceRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_attendenceRecordcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendenceRecord/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('message','g',20,['code':("attendenceRecord.meeting.label"),'default':("Meeting")],-1)
printHtmlPart(8)
invokeTag('select','g',22,['class':("form-control"),'id':("meeting"),'name':("meeting.id"),'from':(genomicsmdt.Meeting.list()),'optionKey':("id"),'required':(""),'value':(meetingInstance?.id)],-1)
printHtmlPart(9)
invokeTag('message','g',29,['code':("attendenceRecord.meeting.label"),'default':("Select Persons")],-1)
printHtmlPart(10)
loop:{
int i = 0
for( member in (mdtMembers) ) {
printHtmlPart(11)
expressionOut.print(i)
printHtmlPart(12)
expressionOut.print(member?.person?.id)
printHtmlPart(13)
expressionOut.print(member?.person)
printHtmlPart(14)
i++
}
}
printHtmlPart(15)
invokeTag('submitButton','g',48,['name':("create"),'class':("btn btn-primary"),'value':("Save")],-1)
printHtmlPart(16)
invokeTag('message','g',49,['code':("default.button.reset.label"),'default':("Reset")],-1)
printHtmlPart(17)
})
invokeTag('form','g',51,['action':("saveAll"),'class':("form-horizontal"),'role':("form")],2)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1436437582333L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
