import genomicsmdt.Patient
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_patientlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patient/list.gsp" }
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
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(2)
invokeTag('require','r',10,['module':("filterpane")],-1)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('filterButton','filterpane',22,['text':("Filter This List")],-1)
printHtmlPart(5)
invokeTag('filterPane','filterpane',24,['domain':("genomicsmdt.Patient"),'excludeProperties':("dateOfBirth")],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',38,['property':("givenName"),'title':(message(code: 'patient.givenName.label', default: 'Given Name'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',40,['property':("familyName"),'title':(message(code: 'patient.familyName.label', default: 'Family Name'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',42,['property':("nhsNumber"),'title':(message(code: 'patient.nhsNumber.label', default: 'NHS Number'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',44,['property':("mrn"),'title':(message(code: 'patient.mrn.label', default: 'MRN'))],-1)
printHtmlPart(8)
invokeTag('message','g',46,['code':("label"),'default':("Action")],-1)
printHtmlPart(9)
loop:{
int i = 0
for( patientInstance in (patientInstanceList) ) {
printHtmlPart(10)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(11)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: patientInstance, field: "givenName"))
})
invokeTag('link','g',54,['action':("show"),'id':(patientInstance.id)],3)
printHtmlPart(12)
expressionOut.print(fieldValue(bean: patientInstance, field: "familyName"))
printHtmlPart(12)
expressionOut.print(fieldValue(bean: patientInstance, field: "nhsNumber"))
printHtmlPart(12)
expressionOut.print(fieldValue(bean: patientInstance, field: "mrn"))
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',63,['controller':("referralRecord"),'action':("create"),'params':(['patient.id': patientInstance?.id])],3)
printHtmlPart(15)
i++
}
}
printHtmlPart(16)
invokeTag('paginate','bs',71,['total':(patientInstanceTotal)],-1)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',75,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435227215859L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
