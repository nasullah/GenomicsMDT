import genomicsmdt.ApplicationForSequencing
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_applicationForSequencing_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/applicationForSequencing/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: applicationForSequencingInstance, field: 'discussionRecord', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("applicationForSequencing.discussionRecord.label"),'default':("Discussion Record")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['class':("form-control"),'id':("discussionRecord"),'name':("discussionRecord.id"),'from':(genomicsmdt.DiscussionRecord.list()),'optionKey':("id"),'required':(""),'value':(applicationForSequencingInstance?.discussionRecord?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: applicationForSequencingInstance, field: 'discussionRecord', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: applicationForSequencingInstance, field: 'applicationStatus', 'error'))
printHtmlPart(5)
invokeTag('message','g',20,['code':("applicationForSequencing.applicationStatus.label"),'default':("Application Status")],-1)
printHtmlPart(2)
invokeTag('select','g',22,['class':("form-control"),'id':("applicationStatus"),'name':("applicationStatus.id"),'from':(genomicsmdt.ApplicationStatus.list()),'optionKey':("id"),'required':(""),'value':(applicationForSequencingInstance?.applicationStatus?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: applicationForSequencingInstance, field: 'applicationStatus', 'error'))
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435832789637L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
