import genomicsmdt.Person
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_personshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/person/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'person.label', default: 'Person'))],-1)
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
invokeTag('message','g',20,['code':("person.name.label"),'default':("Name")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: personInstance, field: "name"))
printHtmlPart(6)
invokeTag('message','g',27,['code':("person.email.label"),'default':("Email")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: personInstance, field: "email"))
printHtmlPart(6)
invokeTag('message','g',34,['code':("person.telephone.label"),'default':("Telephone")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: personInstance, field: "telephone"))
printHtmlPart(6)
invokeTag('message','g',41,['code':("person.notes.label"),'default':("Notes")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: personInstance, field: "notes"))
printHtmlPart(6)
invokeTag('message','g',48,['code':("person.nhsContract.label"),'default':("NHS Contract")],-1)
printHtmlPart(5)
invokeTag('formatBoolean','g',50,['boolean':(personInstance?.nhsContract),'false':("No"),'true':("Yes")],-1)
printHtmlPart(6)
invokeTag('message','g',55,['code':("person.specialities.label"),'default':("Specialities")],-1)
printHtmlPart(7)
for( s in (personInstance.specialities) ) {
printHtmlPart(8)
createTagBody(3, {->
expressionOut.print(s?.encodeAsHTML())
})
invokeTag('link','g',60,['controller':("speciality"),'action':("show"),'id':(s.id)],3)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (personInstance.referralRecord)) {
printHtmlPart(11)
invokeTag('message','g',69,['code':("patient.referralRecords.label"),'default':("Referral Records")],-1)
printHtmlPart(12)
for( r in (personInstance.referralRecord) ) {
printHtmlPart(13)
createTagBody(4, {->
expressionOut.print(r?.encodeAsHTML())
})
invokeTag('link','g',74,['controller':("referralRecord"),'action':("show"),'id':(r.id)],4)
printHtmlPart(14)
}
printHtmlPart(15)
}
printHtmlPart(16)
createClosureForHtmlPart(17, 2)
invokeTag('link','g',90,['controller':("speciality"),'action':("create"),'params':(['person.id': personInstance?.id])],2)
printHtmlPart(18)
createClosureForHtmlPart(19, 2)
invokeTag('link','g',92,['controller':("referralRecord"),'action':("create"),'params':(['person.id': personInstance?.id])],2)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',96,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435917570223L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
