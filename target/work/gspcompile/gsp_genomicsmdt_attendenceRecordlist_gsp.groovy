import genomicsmdt.AttendenceRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_attendenceRecordlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendenceRecord/list.gsp" }
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
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('sortableColumn','g',20,['property':("attendenceCapacity"),'title':(message(code: 'attendenceRecord.attendenceCapacity.label', default: 'Attendence Capacity'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',22,['property':("invitedOn"),'title':(message(code: 'attendenceRecord.invitedOn.label', default: 'Invited On'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',24,['property':("repliedOn"),'title':(message(code: 'attendenceRecord.repliedOn.label', default: 'Replied On'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',26,['property':("status"),'title':(message(code: 'attendenceRecord.status.label', default: 'Status'))],-1)
printHtmlPart(6)
invokeTag('message','g',28,['code':("attendenceRecord.meeting.label"),'default':("Meeting")],-1)
printHtmlPart(7)
invokeTag('message','g',30,['code':("attendenceRecord.person.label"),'default':("Person")],-1)
printHtmlPart(8)
loop:{
int i = 0
for( attendenceRecordInstance in (attendenceRecordInstanceList) ) {
printHtmlPart(9)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(10)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: attendenceRecordInstance, field: "attendenceCapacity"))
})
invokeTag('link','g',38,['action':("show"),'id':(attendenceRecordInstance.id)],3)
printHtmlPart(11)
invokeTag('formatDate','g',40,['format':("yyyy-MM-dd"),'date':(attendenceRecordInstance.invitedOn)],-1)
printHtmlPart(11)
invokeTag('formatDate','g',42,['format':("yyyy-MM-dd"),'date':(attendenceRecordInstance.repliedOn)],-1)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: attendenceRecordInstance, field: "status"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: attendenceRecordInstance, field: "meeting"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: attendenceRecordInstance, field: "person"))
printHtmlPart(12)
i++
}
}
printHtmlPart(13)
invokeTag('paginate','bs',55,['total':(attendenceRecordInstanceCount)],-1)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1436270768037L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
