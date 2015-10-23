import genomicsmdt.ProposedDiagnosis
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_proposedDiagnosis_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/proposedDiagnosis/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: proposedDiagnosisInstance, field: 'referralRecord', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("proposedDiagnosis.referralRecord.label"),'default':("Referral Record")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['class':("form-control"),'id':("referralRecord"),'name':("referralRecord.id"),'from':(genomicsmdt.ReferralRecord.list()),'optionKey':("id"),'required':(""),'value':(proposedDiagnosisInstance?.referralRecord?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: proposedDiagnosisInstance, field: 'referralRecord', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: proposedDiagnosisInstance, field: 'proposedDiagnosis', 'error'))
printHtmlPart(5)
invokeTag('message','g',20,['code':("proposedDiagnosis.proposedDiagnosis.label"),'default':("Proposed Diagnosis")],-1)
printHtmlPart(2)
invokeTag('select','g',22,['class':("form-control"),'id':("proposedDiagnosis"),'name':("proposedDiagnosis.id"),'from':(genomicsmdt.OMIM_Term.list()),'optionKey':("id"),'required':(""),'value':(proposedDiagnosisInstance?.proposedDiagnosis?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: proposedDiagnosisInstance, field: 'proposedDiagnosis', 'error'))
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435919323736L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
