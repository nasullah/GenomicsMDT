import genomicsmdt.AttendenceCapacity
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_attendenceCapacitylist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendenceCapacity/list.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'attendenceCapacity.label', default: 'Attendence Capacity'))],-1)
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
invokeTag('message','g',20,['code':("attendenceCapacity.attendenceCapacity.label"),'default':("Attendence Capacity")],-1)
printHtmlPart(5)
invokeTag('message','g',22,['code':("attendenceCapacity.attendenceRecord.label"),'default':("Attendence Record")],-1)
printHtmlPart(6)
loop:{
int i = 0
for( attendenceCapacityInstance in (attendenceCapacityInstanceList) ) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(8)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: attendenceCapacityInstance, field: "attendenceCapacity"))
})
invokeTag('link','g',30,['action':("show"),'id':(attendenceCapacityInstance.id)],3)
printHtmlPart(9)
expressionOut.print(fieldValue(bean: attendenceCapacityInstance, field: "attendenceRecord"))
printHtmlPart(10)
i++
}
}
printHtmlPart(11)
invokeTag('paginate','bs',39,['total':(attendenceCapacityInstanceCount)],-1)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',43,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435913885711L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
