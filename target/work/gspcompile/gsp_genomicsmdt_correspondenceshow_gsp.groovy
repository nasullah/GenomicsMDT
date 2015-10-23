import genomicsmdt.Correspondence
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_correspondenceshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/correspondence/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'correspondence.label', default: 'Correspondence'))],-1)
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
invokeTag('message','g',20,['code':("correspondence.applicationForSequencing.label"),'default':("Application For Sequencing")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(correspondenceInstance?.applicationForSequencing?.encodeAsHTML())
})
invokeTag('link','g',22,['controller':("applicationForSequencing"),'action':("show"),'id':(correspondenceInstance?.applicationForSequencing?.id)],2)
printHtmlPart(6)
invokeTag('message','g',27,['code':("correspondence.document.label"),'default':("Document")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: correspondenceInstance, field: "document"))
printHtmlPart(6)
invokeTag('message','g',34,['code':("correspondence.date.label"),'default':("Date")],-1)
printHtmlPart(5)
invokeTag('formatDate','g',36,['date':(correspondenceInstance?.date)],-1)
printHtmlPart(6)
invokeTag('message','g',41,['code':("correspondence.type.label"),'default':("Type")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(correspondenceInstance?.type?.encodeAsHTML())
})
invokeTag('link','g',43,['controller':("correspondenceType"),'action':("show"),'id':(correspondenceInstance?.type?.id)],2)
printHtmlPart(7)
})
invokeTag('captureBody','sitemesh',51,[:],1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445508686539L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
