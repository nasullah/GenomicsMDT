import genomicsmdt.ReferralRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_referralRecord_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/referralRecord/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'patient', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("referralRecord.patient.label"),'default':("Patient")],-1)
printHtmlPart(2)
invokeTag('autoComplete','richui',11,['class':("form-control"),'name':("patientName"),'action':(createLinkTo('dir': 'referralRecord/findPatient')),'value':(referralRecordInstance?.patient),'onItemSelect':("callPatient(id)")],-1)
printHtmlPart(3)
invokeTag('hiddenField','g',12,['id':("patient"),'name':("patient"),'value':(referralRecordInstance?.patient?.id)],-1)
printHtmlPart(4)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'person', 'error'))
printHtmlPart(5)
invokeTag('message','g',19,['code':("referralRecord.person.label"),'default':("Person")],-1)
printHtmlPart(2)
invokeTag('autoComplete','richui',21,['class':("form-control"),'name':("personName"),'action':(createLinkTo('dir': 'referralRecord/findPerson')),'value':(referralRecordInstance?.person),'onItemSelect':("callPerson(id)")],-1)
printHtmlPart(3)
invokeTag('hiddenField','g',22,['id':("person"),'name':("person"),'value':(referralRecordInstance?.person?.id)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'referralDate', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("referralRecord.referralDate.label"),'default':("Referral Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','bs',33,['name':("referralDate"),'precision':("day"),'value':(referralRecordInstance?.referralDate)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'referralDate', 'error'))
printHtmlPart(9)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'potentialBenefits', 'error'))
printHtmlPart(10)
invokeTag('message','g',41,['code':("referralRecord.potentialBenefits.label"),'default':("Potential Benefits")],-1)
printHtmlPart(11)
invokeTag('textField','g',43,['class':("form-control"),'name':("potentialBenefits"),'value':(referralRecordInstance?.potentialBenefits)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'potentialBenefits', 'error'))
printHtmlPart(9)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'descriptionOfDisorder', 'error'))
printHtmlPart(12)
invokeTag('message','g',51,['code':("referralRecord.descriptionOfDisorder.label"),'default':("Description Of Disorder")],-1)
printHtmlPart(11)
invokeTag('textArea','g',53,['class':("form-control"),'name':("descriptionOfDisorder"),'cols':("40"),'rows':("4"),'value':(referralRecordInstance?.descriptionOfDisorder)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'descriptionOfDisorder', 'error'))
printHtmlPart(9)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'caseStatus', 'error'))
printHtmlPart(13)
invokeTag('message','g',61,['code':("referralRecord.caseStatus.label"),'default':("Case Status")],-1)
printHtmlPart(2)
invokeTag('select','g',63,['class':("form-control"),'id':("caseStatus"),'name':("caseStatus.id"),'from':(genomicsmdt.CaseStatus.list()),'optionKey':("id"),'required':(""),'value':(referralRecordInstance?.caseStatus?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'caseStatus', 'error'))
printHtmlPart(9)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'numberOfSamples', 'error'))
printHtmlPart(14)
invokeTag('message','g',71,['code':("referralRecord.numberOfSamples.label"),'default':("Number of Samples")],-1)
printHtmlPart(11)
invokeTag('field','g',73,['type':("number"),'class':("form-control"),'name':("numberOfSamples"),'value':(referralRecordInstance?.numberOfSamples)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'preferredProgram', 'error'))
printHtmlPart(15)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'mdt', 'error'))
printHtmlPart(16)
invokeTag('message','g',83,['code':("referralRecord.mdt.label"),'default':("MDT")],-1)
printHtmlPart(2)
invokeTag('select','g',85,['class':("form-control"),'id':("mdt"),'name':("mdt.id"),'from':(genomicsmdt.MDT.list()),'optionKey':("id"),'required':(""),'value':(referralRecordInstance?.mdt?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'mdt', 'error'))
printHtmlPart(17)
invokeTag('javascript','g',92,['plugin':("jquery"),'library':("jquery")],-1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1448536912400L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
