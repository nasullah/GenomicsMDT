import genomicsmdt.Meeting
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_meetinglist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/meeting/list.gsp" }
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
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(2)
invokeTag('require','r',10,['module':("filterpane")],-1)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('filterButton','filterpane',22,['text':("Filter This List")],-1)
printHtmlPart(5)
invokeTag('filterPane','filterpane',24,['domain':("genomicsmdt.Meeting"),'excludeProperties':("date")],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',36,['property':("date"),'title':(message(code: 'meeting.date.label', default: 'Date'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',38,['property':("time"),'title':(message(code: 'meeting.time.label', default: 'Time'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',40,['property':("duration"),'title':(message(code: 'meeting.duration.label', default: 'Duration'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',42,['property':("location"),'title':(message(code: 'meeting.location.label', default: 'Location'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',44,['property':("status"),'title':(message(code: 'meeting.status.label', default: 'Status'))],-1)
printHtmlPart(8)
loop:{
int i = 0
for( meetingInstance in (meetingInstanceList) ) {
printHtmlPart(9)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(10)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: meetingInstance, field: "date"))
})
invokeTag('link','g',52,['action':("show"),'id':(meetingInstance.id)],3)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: meetingInstance, field: "time"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: meetingInstance, field: "duration"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: meetingInstance, field: "location"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: meetingInstance, field: "status"))
printHtmlPart(12)
i++
}
}
printHtmlPart(13)
invokeTag('paginate','bs',67,['total':(meetingInstanceTotal)],-1)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',71,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1436432736649L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
