import genomicsmdt.MDT
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_MDTshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/MDT/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'MDT.label', default: 'MDT'))],-1)
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
invokeTag('message','g',20,['code':("MDT.name.label"),'default':("Name")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: MDTInstance, field: "name"))
printHtmlPart(6)
invokeTag('message','g',27,['code':("MDT.email.label"),'default':("Email")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: MDTInstance, field: "email"))
printHtmlPart(6)
invokeTag('message','g',34,['code':("MDT.telephone.label"),'default':("Telephone")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: MDTInstance, field: "telephone"))
printHtmlPart(6)
invokeTag('message','g',41,['code':("MDT.notes.label"),'default':("Notes")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: MDTInstance, field: "notes"))
printHtmlPart(7)
invokeTag('message','g',49,['code':("MDT.quorum.label"),'default':("Quorum")],-1)
printHtmlPart(8)
expressionOut.print(fieldValue(bean: MDTInstance, field: "quorum"))
printHtmlPart(9)
if(true && (MDTInstance?.members)) {
printHtmlPart(10)
invokeTag('message','g',57,['code':("meeting.discussionRecords.label"),'default':("Members")],-1)
printHtmlPart(11)
for( m in (MDTInstance?.members) ) {
printHtmlPart(12)
createTagBody(4, {->
expressionOut.print(m?.encodeAsHTML())
})
invokeTag('link','g',62,['controller':("membership"),'action':("show"),'id':(m.id)],4)
printHtmlPart(13)
}
printHtmlPart(14)
}
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('link','g',78,['controller':("membership"),'action':("create"),'params':(['mdt.id': MDTInstance?.id])],2)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',82,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1436272952064L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
