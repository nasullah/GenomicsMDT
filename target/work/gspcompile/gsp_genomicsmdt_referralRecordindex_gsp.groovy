import genomicsmdt.ReferralRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_referralRecordindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/referralRecord/index.gsp" }
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
invokeTag('message','g',9,['code':("default.index.label"),'args':([entityName])],-1)
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
invokeTag('message','g',22,['code':("referralRecord.person.label"),'default':("Person")],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',24,['property':("referralDate"),'title':(message(code: 'referralRecord.referralDate.label', default: 'Referral Date'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',26,['property':("caseStatus"),'title':(message(code: 'referralRecord.caseStatus.label', default: 'Case Status'))],-1)
printHtmlPart(8)
loop:{
int i = 0
for( referralRecordInstance in (referralRecordInstanceList) ) {
printHtmlPart(9)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(10)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: referralRecordInstance?.patient, field: "familyName"))
})
invokeTag('link','g',34,['action':("show"),'id':(referralRecordInstance.id)],3)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: referralRecordInstance?.person, field: "name"))
printHtmlPart(11)
invokeTag('formatDate','g',38,['format':("yyyy-MM-dd"),'date':(referralRecordInstance.referralDate)],-1)
printHtmlPart(12)
expressionOut.print(fieldValue(bean: referralRecordInstance, field: "caseStatus"))
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
invokeTag('paginate','bs',47,['total':(referralRecordInstanceCount)],-1)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',51,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435154492098L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
