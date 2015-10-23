import genomicsmdt.Patient
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_patient_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patient/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: patientInstance, field: 'givenName', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("patient.givenName.label"),'default':("Given Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['class':("form-control"),'name':("givenName"),'value':(patientInstance?.givenName),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: patientInstance, field: 'givenName', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: patientInstance, field: 'familyName', 'error'))
printHtmlPart(5)
invokeTag('message','g',18,['code':("patient.familyName.label"),'default':("Family Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',20,['class':("form-control"),'name':("familyName"),'value':(patientInstance?.familyName),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: patientInstance, field: 'familyName', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: patientInstance, field: 'nhsNumber', 'error'))
printHtmlPart(6)
invokeTag('message','g',28,['code':("patient.nhsNumber.label"),'default':("NHS Number")],-1)
printHtmlPart(2)
invokeTag('textField','g',30,['class':("form-control"),'name':("nhsNumber"),'value':(patientInstance?.nhsNumber),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: patientInstance, field: 'nhsNumber', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: patientInstance, field: 'mrn', 'error'))
printHtmlPart(7)
invokeTag('message','g',38,['code':("patient.mrn.label"),'default':("MRN")],-1)
printHtmlPart(2)
invokeTag('textField','g',40,['class':("form-control"),'name':("mrn"),'value':(patientInstance?.mrn),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: patientInstance, field: 'mrn', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: patientInstance, field: 'familyNumber', 'error'))
printHtmlPart(8)
invokeTag('message','g',48,['code':("patient.familyNumber.label"),'default':("Family Number")],-1)
printHtmlPart(9)
invokeTag('textField','g',50,['class':("form-control"),'name':("familyNumber"),'value':(patientInstance?.familyNumber)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: patientInstance, field: 'familyNumber', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: patientInstance, field: 'otherIdentifier', 'error'))
printHtmlPart(10)
invokeTag('message','g',58,['code':("patient.otherIdentifier.label"),'default':("Other Identifier")],-1)
printHtmlPart(9)
invokeTag('textField','g',60,['class':("form-control"),'name':("otherIdentifier"),'value':(patientInstance?.otherIdentifier)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: patientInstance, field: 'otherIdentifier', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: patientInstance, field: 'dateOfBirth', 'error'))
printHtmlPart(11)
invokeTag('message','g',68,['code':("patient.dateOfBirth.label"),'default':("Date Of Birth")],-1)
printHtmlPart(9)
invokeTag('datePicker','bs',70,['name':("dateOfBirth"),'precision':("day"),'value':(patientInstance?.dateOfBirth),'default':("none"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: patientInstance, field: 'dateOfBirth', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: patientInstance, field: 'gender', 'error'))
printHtmlPart(12)
invokeTag('message','g',78,['code':("patient.gender.label"),'default':("Gender")],-1)
printHtmlPart(9)
invokeTag('select','g',80,['class':("form-control"),'id':("gender"),'name':("gender.id"),'from':(genomicsmdt.Gender.list()),'optionKey':("id"),'value':(attendenceRecordInstance?.gender?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: patientInstance, field: 'gender', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: patientInstance, field: 'ethnicity', 'error'))
printHtmlPart(13)
invokeTag('message','g',88,['code':("patient.ethnicity.label"),'default':("Ethnicity")],-1)
printHtmlPart(9)
invokeTag('select','g',90,['class':("form-control"),'id':("ethnicity"),'name':("ethnicity.id"),'from':(genomicsmdt.Ethnicity.list()),'optionKey':("id"),'value':(attendenceRecordInstance?.ethnicity?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: patientInstance, field: 'ethnicity', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: patientInstance, field: 'otherEthnicity', 'error'))
printHtmlPart(14)
invokeTag('message','g',98,['code':("patient.otherEthnicity.label"),'default':("Other Ethnicity")],-1)
printHtmlPart(9)
invokeTag('textField','g',100,['class':("form-control"),'name':("otherEthnicity"),'value':(patientInstance?.otherEthnicity)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: patientInstance, field: 'otherEthnicity', 'error'))
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435911479617L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
