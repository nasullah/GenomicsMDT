import genomicsmdt.OutcomeRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_outcomeRecordshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/outcomeRecord/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'outcomeRecord.label', default: 'Outcome Record'))],-1)
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
invokeTag('message','g',20,['code':("outcomeRecord.patient.label"),'default':("Patient")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(outcomeRecordInstance?.patient?.encodeAsHTML())
})
invokeTag('link','g',22,['controller':("patient"),'action':("show"),'id':(outcomeRecordInstance?.patient?.id)],2)
printHtmlPart(6)
invokeTag('message','g',27,['code':("outcomeRecord.outcomeDate.label"),'default':("Outcome Date")],-1)
printHtmlPart(5)
invokeTag('formatDate','g',29,['format':("yyyy-MM-dd"),'date':(outcomeRecordInstance?.outcomeDate)],-1)
printHtmlPart(6)
invokeTag('message','g',34,['code':("outcomeRecord.outcome.label"),'default':("Outcome")],-1)
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(outcomeRecordInstance?.outcome?.encodeAsHTML())
})
invokeTag('link','g',36,['controller':("outcomeStatus"),'action':("show"),'id':(outcomeRecordInstance?.outcome?.id)],2)
printHtmlPart(6)
invokeTag('message','g',41,['code':("outcomeRecord.finalDiagnosis.label"),'default':("Final Diagnosis")],-1)
printHtmlPart(5)
expressionOut.print(outcomeRecordInstance?.finalDiagnosis?.encodeAsHTML())
printHtmlPart(6)
invokeTag('message','g',48,['code':("outcomeRecord.outcomeNotes.label"),'default':("Outcome Notes")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: outcomeRecordInstance, field: "outcomeNotes"))
printHtmlPart(6)
invokeTag('message','g',55,['code':("outcomeRecord.sequenceReceivedOn.label"),'default':("Sequence Received On")],-1)
printHtmlPart(5)
invokeTag('formatDate','g',57,['format':("yyyy-MM-dd"),'date':(outcomeRecordInstance?.sequenceReceivedOn)],-1)
printHtmlPart(8)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445506620527L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
