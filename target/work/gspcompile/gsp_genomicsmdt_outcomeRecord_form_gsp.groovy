import genomicsmdt.OutcomeRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_outcomeRecord_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/outcomeRecord/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'patient', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("outcomeRecord.patient.label"),'default':("Patient")],-1)
printHtmlPart(2)
invokeTag('select','g',11,['class':("form-control"),'id':("patient"),'name':("patient.id"),'from':(genomicsmdt.Patient.list()),'optionKey':("id"),'required':(""),'value':(outcomeRecordInstance?.patient?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'patient', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'outcomeDate', 'error'))
printHtmlPart(5)
invokeTag('message','g',21,['code':("outcomeRecord.outcomeDate.label"),'default':("Outcome Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','bs',23,['name':("outcomeDate"),'precision':("day"),'value':(outcomeRecordInstance?.outcomeDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'outcomeDate', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'outcome', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("outcomeRecord.outcome.label"),'default':("Outcome")],-1)
printHtmlPart(2)
invokeTag('select','g',33,['class':("form-control"),'id':("outcome"),'name':("outcome.id"),'from':(genomicsmdt.OutcomeStatus.list()),'optionKey':("id"),'required':(""),'value':(outcomeRecordInstance?.outcome?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'outcome', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'outcomeNotes', 'error'))
printHtmlPart(8)
invokeTag('message','g',41,['code':("outcomeRecord.outcomeNotes.label"),'default':("Outcome Notes")],-1)
printHtmlPart(9)
invokeTag('textArea','g',43,['class':("form-control"),'name':("outcomeNotes"),'cols':("40"),'rows':("4"),'value':(outcomeRecordInstance?.outcomeNotes)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'outcomeNotes', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'finalDiagnosis', 'error'))
printHtmlPart(10)
invokeTag('message','g',51,['code':("outcomeRecord.finalDiagnosis.label"),'default':("Final Diagnosis")],-1)
printHtmlPart(9)
invokeTag('select','g',53,['class':("form-control"),'id':("finalDiagnosis"),'name':("finalDiagnosis.id"),'from':(genomicsmdt.OMIM_Term.list()),'optionKey':("id"),'value':(outcomeRecordInstance?.finalDiagnosis?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'finalDiagnosis', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'sequenceReceivedOn', 'error'))
printHtmlPart(11)
invokeTag('message','g',61,['code':("outcomeRecord.sequenceReceivedOn.label"),'default':("Sequence Received On")],-1)
printHtmlPart(9)
invokeTag('datePicker','bs',63,['name':("sequenceReceivedOn"),'precision':("day"),'value':(outcomeRecordInstance?.sequenceReceivedOn),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: outcomeRecordInstance, field: 'sequenceReceivedOn', 'error'))
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445506560443L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
