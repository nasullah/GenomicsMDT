import genomicsmdt.ApplicationStatus
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_applicationStatus_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/applicationStatus/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: applicationStatusInstance, field: 'applicationStatusName', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("applicationStatus.applicationStatusName.label"),'default':("Application Status Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['class':("form-control"),'name':("applicationStatusName"),'value':(applicationStatusInstance?.applicationStatusName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: applicationStatusInstance, field: 'applicationStatusName', 'error'))
printHtmlPart(4)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435832098266L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
