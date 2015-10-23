import genomicsmdt.Correspondence
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_correspondence_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/correspondence/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: correspondenceInstance, field: 'applicationForSequencing', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("correspondence.applicationForSequencing.label"),'default':("Application For Sequencing")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['class':("form-control"),'id':("applicationForSequencing"),'name':("applicationForSequencing.id"),'from':(genomicsmdt.ApplicationForSequencing.list()),'optionKey':("id"),'required':(""),'value':(correspondenceInstance?.applicationForSequencing?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: correspondenceInstance, field: 'applicationForSequencing', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: correspondenceInstance, field: 'date', 'error'))
printHtmlPart(5)
invokeTag('message','g',20,['code':("correspondence.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','bs',22,['name':("date"),'precision':("day"),'value':(correspondenceInstance?.date)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: correspondenceInstance, field: 'date', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: correspondenceInstance, field: 'type', 'error'))
printHtmlPart(7)
invokeTag('message','g',30,['code':("correspondence.type.label"),'default':("Type")],-1)
printHtmlPart(2)
invokeTag('select','g',32,['class':("form-control"),'id':("type"),'name':("type.id"),'from':(genomicsmdt.CorrespondenceType.list()),'optionKey':("id"),'required':(""),'value':(correspondenceInstance?.type?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: correspondenceInstance, field: 'type', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: correspondenceInstance, field: 'document', 'error'))
printHtmlPart(8)
invokeTag('message','g',40,['code':("correspondence.document.label"),'default':("Document")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: correspondenceInstance, field: 'document', 'error'))
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445509166237L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
