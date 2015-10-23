import genomicsmdt.Patient
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_patientindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/patient/index.gsp" }
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
invokeTag('sortableColumn','g',20,['property':("givenName"),'title':(message(code: 'patient.givenName.label', default: 'Given Name'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',22,['property':("familyName"),'title':(message(code: 'patient.familyName.label', default: 'Family Name'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',24,['property':("nhsNumber"),'title':(message(code: 'patient.nhsNumber.label', default: 'NHS Number'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',26,['property':("mrn"),'title':(message(code: 'patient.mrn.label', default: 'MRN'))],-1)
printHtmlPart(6)
invokeTag('message','g',28,['code':("label"),'default':("Action")],-1)
printHtmlPart(7)
loop:{
int i = 0
for( patientInstance in (patientInstanceList) ) {
printHtmlPart(8)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(9)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: patientInstance, field: "givenName"))
})
invokeTag('link','g',36,['action':("show"),'id':(patientInstance.id)],3)
printHtmlPart(10)
expressionOut.print(fieldValue(bean: patientInstance, field: "familyName"))
printHtmlPart(10)
expressionOut.print(fieldValue(bean: patientInstance, field: "nhsNumber"))
printHtmlPart(10)
expressionOut.print(fieldValue(bean: patientInstance, field: "mrn"))
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',45,['controller':("referralRecord"),'action':("create"),'params':(['patient.id': patientInstance?.id])],3)
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
invokeTag('paginate','bs',53,['total':(patientInstanceCount)],-1)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435154214019L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
