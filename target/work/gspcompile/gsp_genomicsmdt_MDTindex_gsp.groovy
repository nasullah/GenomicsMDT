import genomicsmdt.MDT
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_MDTindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/MDT/index.gsp" }
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
invokeTag('sortableColumn','g',20,['property':("name"),'title':(message(code: 'MDT.name.label', default: 'Name'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',22,['property':("email"),'title':(message(code: 'MDT.email.label', default: 'Email'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',24,['property':("telephone"),'title':(message(code: 'MDT.telephone.label', default: 'Telephone'))],-1)
printHtmlPart(6)
loop:{
int i = 0
for( MDTInstance in (MDTInstanceList) ) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(8)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: MDTInstance, field: "name"))
})
invokeTag('link','g',32,['action':("show"),'id':(MDTInstance.id)],3)
printHtmlPart(9)
expressionOut.print(fieldValue(bean: MDTInstance, field: "email"))
printHtmlPart(9)
expressionOut.print(fieldValue(bean: MDTInstance, field: "telephone"))
printHtmlPart(10)
i++
}
}
printHtmlPart(11)
invokeTag('paginate','bs',43,['total':(MDTInstanceCount)],-1)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',47,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435154214027L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
