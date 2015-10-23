import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt__menu_menubar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_menu/_menubar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
createTagBody(1, {->
printHtmlPart(0)
createClosureForHtmlPart(1, 2)
invokeTag('link','g',5,['controller':("person"),'action':("index")],2)
printHtmlPart(2)
createClosureForHtmlPart(3, 2)
invokeTag('link','g',9,['controller':("MDT"),'action':("index")],2)
printHtmlPart(2)
createClosureForHtmlPart(4, 2)
invokeTag('link','g',13,['controller':("patient"),'action':("index")],2)
printHtmlPart(2)
createClosureForHtmlPart(5, 2)
invokeTag('link','g',17,['controller':("meeting"),'action':("index")],2)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',1,['roles':("ROLE_ADMIN, ROLE_USER")],1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435924164923L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
