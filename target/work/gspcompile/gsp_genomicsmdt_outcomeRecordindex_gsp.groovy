import genomicsmdt.OutcomeRecord
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_outcomeRecordindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/outcomeRecord/index.gsp" }
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
invokeTag('message','g',20,['code':("outcomeRecord.referralRecord.label"),'default':("Referral Record")],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',22,['property':("outcomeDate"),'title':(message(code: 'outcomeRecord.outcomeDate.label', default: 'Outcome Date'))],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',24,['property':("outcome"),'title':(message(code: 'outcomeRecord.outcome.label', default: 'Outcome'))],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',26,['property':("finalDiagnosis"),'title':(message(code: 'outcomeRecord.finalDiagnosis.label', default: 'Final Diagnosis'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',28,['property':("sequenceReceivedOn"),'title':(message(code: 'outcomeRecord.sequenceReceivedOn.label', default: 'Sequence Received On'))],-1)
printHtmlPart(8)
loop:{
int i = 0
for( outcomeRecordInstance in (outcomeRecordInstanceList) ) {
printHtmlPart(9)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(10)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: outcomeRecordInstance, field: "referralRecord"))
})
invokeTag('link','g',36,['action':("show"),'id':(outcomeRecordInstance.id)],3)
printHtmlPart(11)
invokeTag('formatDate','g',38,['format':("yyyy-MM-dd"),'date':(outcomeRecordInstance.outcomeDate)],-1)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: outcomeRecordInstance, field: "outcome"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: outcomeRecordInstance, field: "finalDiagnosis"))
printHtmlPart(12)
invokeTag('formatDate','g',44,['format':("yyyy-MM-dd"),'date':(outcomeRecordInstance.sequenceReceivedOn)],-1)
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
invokeTag('paginate','bs',51,['total':(outcomeRecordInstanceCount)],-1)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',55,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435139683572L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
