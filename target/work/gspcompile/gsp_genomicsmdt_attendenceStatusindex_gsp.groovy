import genomicsmdt.AttendenceStatus
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_attendenceStatusindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendenceStatus/index.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'attendenceStatus.label', default: 'Attendence Status'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.index.label"),'args':([entityName])],-1)
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
invokeTag('sortableColumn','g',20,['property':("attendenceStatusName"),'title':(message(code: 'attendenceStatus.attendenceStatusName.label', default: 'Attendence Status Name'))],-1)
printHtmlPart(5)
loop:{
int i = 0
for( attendenceStatusInstance in (attendenceStatusInstanceList) ) {
printHtmlPart(6)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(7)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: attendenceStatusInstance, field: "attendenceStatusName"))
})
invokeTag('link','g',28,['action':("show"),'id':(attendenceStatusInstance.id)],3)
printHtmlPart(8)
i++
}
}
printHtmlPart(9)
invokeTag('paginate','bs',35,['total':(attendenceStatusInstanceCount)],-1)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',39,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435826851351L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
