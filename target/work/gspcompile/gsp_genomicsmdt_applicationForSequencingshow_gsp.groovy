import genomicsmdt.ApplicationForSequencing
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_applicationForSequencingshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/applicationForSequencing/show.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'applicationForSequencing.label', default: 'Application For Sequencing'))],-1)
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
invokeTag('message','g',20,['code':("applicationForSequencing.discussionRecord.label"),'default':("Discussion Record")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(applicationForSequencingInstance?.discussionRecord?.encodeAsHTML())
})
invokeTag('link','g',22,['controller':("discussionRecord"),'action':("show"),'id':(applicationForSequencingInstance?.discussionRecord?.id)],2)
printHtmlPart(6)
invokeTag('message','g',27,['code':("applicationForSequencing.applicationStatus.label"),'default':("Application Status")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(applicationForSequencingInstance?.applicationStatus?.encodeAsHTML())
})
invokeTag('link','g',29,['controller':("applicationStatus"),'action':("show"),'id':(applicationForSequencingInstance?.applicationStatus?.id)],2)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',41,['controller':("correspondence"),'action':("create"),'params':(['applicationForSequencing.id': applicationForSequencingInstance?.id])],2)
printHtmlPart(9)
})
invokeTag('captureBody','sitemesh',45,[:],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1445509496192L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
