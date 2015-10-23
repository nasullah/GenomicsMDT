import genomicsmdt.ReferralRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_referralRecordshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/referralRecord/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'referralRecord.label', default: 'Referral Record'))],-1)
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
invokeTag('message','g',20,['code':("referralRecord.patient.label"),'default':("Patient")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(referralRecordInstance?.patient?.encodeAsHTML())
})
invokeTag('link','g',22,['controller':("patient"),'action':("show"),'id':(referralRecordInstance?.patient?.id)],2)
printHtmlPart(6)
invokeTag('message','g',27,['code':("referralRecord.person.label"),'default':("Person")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(referralRecordInstance?.person?.encodeAsHTML())
})
invokeTag('link','g',29,['controller':("person"),'action':("show"),'id':(referralRecordInstance?.person?.id)],2)
printHtmlPart(6)
invokeTag('message','g',34,['code':("referralRecord.referralDate.label"),'default':("Referral Date")],-1)
printHtmlPart(5)
invokeTag('formatDate','g',36,['format':("yyyy-MM-dd"),'date':(referralRecordInstance?.referralDate)],-1)
printHtmlPart(6)
invokeTag('message','g',41,['code':("referralRecord.descriptionOfDisorder.label"),'default':("Description Of Disorder")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: referralRecordInstance, field: "descriptionOfDisorder"))
printHtmlPart(6)
invokeTag('message','g',48,['code':("referralRecord.caseStatus.label"),'default':("Case Status")],-1)
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(referralRecordInstance?.caseStatus?.encodeAsHTML())
})
invokeTag('link','g',50,['controller':("caseStatus"),'action':("show"),'id':(referralRecordInstance?.caseStatus?.id)],2)
printHtmlPart(6)
invokeTag('message','g',55,['code':("referralRecord.potentialBenefits.label"),'default':("Potential Benefits")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: referralRecordInstance, field: "potentialBenefits"))
printHtmlPart(8)
invokeTag('message','g',62,['code':("referralRecord.numberOfSamples.label"),'default':("Number of Samples")],-1)
printHtmlPart(7)
expressionOut.print(fieldValue(bean: referralRecordInstance, field: "numberOfSamples"))
printHtmlPart(9)
invokeTag('message','g',69,['code':("referralRecord.preferredProgram.label"),'default':("Preferred Program")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(referralRecordInstance?.preferredProgram?.encodeAsHTML())
})
invokeTag('link','g',71,['controller':("program"),'action':("show"),'id':(referralRecordInstance?.preferredProgram?.id)],2)
printHtmlPart(8)
invokeTag('message','g',76,['code':("referralRecord.mdt.label"),'default':("MDT")],-1)
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(referralRecordInstance?.mdt?.encodeAsHTML())
})
invokeTag('link','g',78,['controller':("MDT"),'action':("show"),'id':(referralRecordInstance?.mdt?.id)],2)
printHtmlPart(9)
invokeTag('message','g',83,['code':("referralRecord.proposedDiagnosis.label"),'default':("Proposed Diagnosis")],-1)
printHtmlPart(10)
for( p in (referralRecordInstance.proposedDiagnosis) ) {
printHtmlPart(11)
createTagBody(3, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',88,['controller':("proposedDiagnosis"),'action':("show"),'id':(p.id)],3)
printHtmlPart(12)
}
printHtmlPart(13)
createClosureForHtmlPart(14, 2)
invokeTag('link','g',103,['controller':("proposedDiagnosis"),'action':("create"),'params':(['referralRecord.id': referralRecordInstance?.id])],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',107,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445506055189L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
