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
if(true && (!referralRecordInstance?.person?.id)) {
printHtmlPart(1)
invokeTag('message','g',10,['code':("referralRecord.person.label"),'default':("Find Person")],-1)
printHtmlPart(2)
invokeTag('textField','g',12,['type':("text"),'id':("searchPerson"),'name':("searchPerson"),'class':("form-control"),'placeholder':("Enter person's name"),'required':("")],-1)
printHtmlPart(3)
}
printHtmlPart(4)
if(true && (referralRecordInstance?.person?.id)) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'person', 'error'))
printHtmlPart(6)
invokeTag('message','g',29,['code':("referralRecord.person.label"),'default':("Person")],-1)
printHtmlPart(7)
invokeTag('select','g',31,['class':("form-control"),'id':("person"),'name':("person.id"),'from':(genomicsmdt.Person.list()),'optionKey':("id"),'required':(""),'value':(referralRecordInstance?.person?.id)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'person', 'error'))
printHtmlPart(9)
}
printHtmlPart(4)
if(true && (!referralRecordInstance?.patient?.id)) {
printHtmlPart(10)
invokeTag('message','g',42,['code':("referralRecord.patient.label"),'default':("Find Patient")],-1)
printHtmlPart(2)
invokeTag('textField','g',44,['type':("text"),'id':("searchPatient"),'name':("searchPatient"),'class':("form-control"),'placeholder':("Enter patient's given name, family name, NHS or MRN"),'required':("")],-1)
printHtmlPart(11)
}
printHtmlPart(4)
if(true && (referralRecordInstance?.patient?.id)) {
printHtmlPart(5)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'patient', 'error'))
printHtmlPart(12)
invokeTag('message','g',61,['code':("referralRecord.patient.label"),'default':("Patient")],-1)
printHtmlPart(7)
invokeTag('select','g',63,['class':("form-control"),'id':("patient"),'name':("patient.id"),'from':(genomicsmdt.Patient.list()),'optionKey':("id"),'required':(""),'value':(referralRecordInstance?.patient?.id)],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'patient', 'error'))
printHtmlPart(9)
}
printHtmlPart(13)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'referralDate', 'error'))
printHtmlPart(14)
invokeTag('message','g',74,['code':("referralRecord.referralDate.label"),'default':("Referral Date")],-1)
printHtmlPart(15)
invokeTag('datePicker','bs',76,['name':("referralDate"),'precision':("day"),'value':(referralRecordInstance?.referralDate)],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'referralDate', 'error'))
printHtmlPart(17)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'potentialBenefits', 'error'))
printHtmlPart(18)
invokeTag('message','g',84,['code':("referralRecord.potentialBenefits.label"),'default':("Potential Benefits")],-1)
printHtmlPart(19)
invokeTag('textField','g',86,['class':("form-control"),'name':("potentialBenefits"),'value':(referralRecordInstance?.potentialBenefits)],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'potentialBenefits', 'error'))
printHtmlPart(17)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'descriptionOfDisorder', 'error'))
printHtmlPart(20)
invokeTag('message','g',94,['code':("referralRecord.descriptionOfDisorder.label"),'default':("Description Of Disorder")],-1)
printHtmlPart(19)
invokeTag('textArea','g',96,['class':("form-control"),'name':("descriptionOfDisorder"),'cols':("40"),'rows':("4"),'value':(referralRecordInstance?.descriptionOfDisorder)],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'descriptionOfDisorder', 'error'))
printHtmlPart(17)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'caseStatus', 'error'))
printHtmlPart(21)
invokeTag('message','g',104,['code':("referralRecord.caseStatus.label"),'default':("Case Status")],-1)
printHtmlPart(15)
invokeTag('select','g',106,['class':("form-control"),'id':("caseStatus"),'name':("caseStatus.id"),'from':(genomicsmdt.CaseStatus.list()),'optionKey':("id"),'required':(""),'value':(referralRecordInstance?.caseStatus?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'caseStatus', 'error'))
printHtmlPart(17)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'numberOfSamples', 'error'))
printHtmlPart(22)
invokeTag('message','g',114,['code':("referralRecord.numberOfSamples.label"),'default':("Number of Samples")],-1)
printHtmlPart(19)
invokeTag('field','g',116,['type':("number"),'class':("form-control"),'name':("numberOfSamples"),'value':(referralRecordInstance?.numberOfSamples)],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'preferredProgram', 'error'))
printHtmlPart(23)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'preferredProgram', 'error'))
printHtmlPart(24)
invokeTag('message','g',126,['code':("referralRecord.preferredProgram.label"),'default':("Preferred Program")],-1)
printHtmlPart(19)
invokeTag('select','g',128,['class':("form-control"),'id':("preferredProgram"),'name':("preferredProgram.id"),'from':(genomicsmdt.Program.list()),'optionKey':("id"),'value':(referralRecordInstance?.preferredProgram?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'preferredProgram', 'error'))
printHtmlPart(17)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'mdt', 'error'))
printHtmlPart(25)
invokeTag('message','g',136,['code':("referralRecord.mdt.label"),'default':("MDT")],-1)
printHtmlPart(15)
invokeTag('select','g',138,['class':("form-control"),'id':("mdt"),'name':("mdt.id"),'from':(genomicsmdt.MDT.list()),'optionKey':("id"),'required':(""),'value':(referralRecordInstance?.mdt?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(16)
expressionOut.print(hasErrors(bean: referralRecordInstance, field: 'mdt', 'error'))
printHtmlPart(26)
createTagBody(1, {->
printHtmlPart(27)
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'person.label', default: 'Person')]))
})
invokeTag('link','g',156,['controller':("person"),'action':("create")],1)
printHtmlPart(28)
createTagBody(1, {->
printHtmlPart(27)
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'patient.label', default: 'Patient')]))
})
invokeTag('link','g',174,['controller':("patient"),'action':("create")],1)
printHtmlPart(29)
invokeTag('javascript','g',181,['plugin':("jquery"),'library':("jquery")],-1)
printHtmlPart(30)
expressionOut.print(remoteFunction (controller: 'referralRecord',
                        action: 'findPerson',
                        params: '"searchPerson=" + $("#searchPerson").val()',
                        update: 'selectPerson',
                        onFailure:'personError()'
                ))
printHtmlPart(31)
expressionOut.print(remoteFunction (controller: 'referralRecord',
                        action: 'findPatient',
                        params: '"searchPatient=" + $("#searchPatient").val()',
                        update: 'selectPatient',
                        onFailure:'patientError()'
                ))
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445510780454L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
