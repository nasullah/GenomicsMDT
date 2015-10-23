import genomicsmdt.MDT
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_MDTlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/MDT/list.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'MDT.label', default: 'MDT'))],-1)
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
invokeTag('filterPane','filterpane',23,['domain':("genomicsmdt.MDT")],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',35,['property':("name"),'title':(message(code: 'MDT.name.label', default: 'Name'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',37,['property':("email"),'title':(message(code: 'MDT.email.label', default: 'Email'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',39,['property':("telephone"),'title':(message(code: 'MDT.telephone.label', default: 'Telephone'))],-1)
printHtmlPart(8)
loop:{
int i = 0
for( MDTInstance in (MDTInstanceList) ) {
printHtmlPart(9)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(10)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: MDTInstance, field: "name"))
})
invokeTag('link','g',47,['action':("show"),'id':(MDTInstance.id)],3)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: MDTInstance, field: "email"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: MDTInstance, field: "telephone"))
printHtmlPart(12)
i++
}
}
printHtmlPart(13)
invokeTag('paginate','bs',58,['total':(MDTInstanceTotal)],-1)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',62,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435227919024L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
