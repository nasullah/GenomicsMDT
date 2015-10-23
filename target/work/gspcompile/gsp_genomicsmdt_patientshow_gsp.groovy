import genomicsmdt.Patient
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_patientshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patient/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'patient.label', default: 'Patient'))],-1)
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
invokeTag('message','g',20,['code':("patient.givenName.label"),'default':("Given Name")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: patientInstance, field: "givenName"))
printHtmlPart(6)
invokeTag('message','g',27,['code':("patient.familyName.label"),'default':("Family Name")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: patientInstance, field: "familyName"))
printHtmlPart(6)
invokeTag('message','g',34,['code':("patient.nhsNumber.label"),'default':("NHS Number")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: patientInstance, field: "nhsNumber"))
printHtmlPart(7)
invokeTag('message','g',42,['code':("patient.dateOfBirth.label"),'default':("Date Of Birth")],-1)
printHtmlPart(8)
invokeTag('formatDate','g',44,['format':("yyyy-MM-dd"),'date':(patientInstance?.dateOfBirth)],-1)
printHtmlPart(9)
invokeTag('message','g',49,['code':("patient.mrn.label"),'default':("MRN")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: patientInstance, field: "mrn"))
printHtmlPart(6)
invokeTag('message','g',56,['code':("patient.familyNumber.label"),'default':("Family Number")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: patientInstance, field: "familyNumber"))
printHtmlPart(6)
invokeTag('message','g',63,['code':("patient.otherIdentifier.label"),'default':("Other Identifier")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: patientInstance, field: "otherIdentifier"))
printHtmlPart(6)
invokeTag('message','g',70,['code':("patient.gender.label"),'default':("Gender")],-1)
printHtmlPart(8)
createTagBody(2, {->
expressionOut.print(attendenceRecordInstance?.gender?.encodeAsHTML())
})
invokeTag('link','g',72,['controller':("gender"),'action':("show"),'id':(attendenceRecordInstance?.gender?.id)],2)
printHtmlPart(6)
invokeTag('message','g',77,['code':("patient.ethnicity.label"),'default':("Ethnicity")],-1)
printHtmlPart(8)
createTagBody(2, {->
expressionOut.print(attendenceRecordInstance?.ethnicity?.encodeAsHTML())
})
invokeTag('link','g',79,['controller':("ethnicity"),'action':("show"),'id':(attendenceRecordInstance?.ethnicity?.id)],2)
printHtmlPart(6)
invokeTag('message','g',84,['code':("patient.otherEthnicity.label"),'default':("Other Ethnicity")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: patientInstance, field: "otherEthnicity"))
printHtmlPart(10)
if(true && (patientInstance.referralRecords)) {
printHtmlPart(11)
invokeTag('message','g',92,['code':("patient.referralRecords.label"),'default':("Referral Records")],-1)
printHtmlPart(12)
for( r in (patientInstance.referralRecords) ) {
printHtmlPart(13)
createTagBody(4, {->
expressionOut.print(r?.encodeAsHTML())
})
invokeTag('link','g',97,['controller':("referralRecord"),'action':("show"),'id':(r.id)],4)
printHtmlPart(14)
}
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (patientInstance.outcomeRecord)) {
printHtmlPart(11)
invokeTag('message','g',107,['code':("patient.outcomeRecord.label"),'default':("Outcome Record")],-1)
printHtmlPart(17)
createTagBody(3, {->
expressionOut.print(patientInstance?.outcomeRecord?.encodeAsHTML())
})
invokeTag('link','g',109,['controller':("outcomeRecord"),'action':("show"),'id':(patientInstance?.outcomeRecord?.id)],3)
printHtmlPart(18)
}
printHtmlPart(19)
createClosureForHtmlPart(20, 2)
invokeTag('link','g',121,['controller':("referralRecord"),'action':("create"),'params':(['patient.id': patientInstance?.id])],2)
printHtmlPart(3)
if(true && (!patientInstance?.outcomeRecord)) {
printHtmlPart(21)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',124,['controller':("outcomeRecord"),'action':("create"),'params':(['patient.id': patientInstance?.id])],3)
printHtmlPart(0)
}
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',129,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445506055201L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
