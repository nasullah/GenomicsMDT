import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt__menu_user_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_menu/_user.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(2)
createClosureForHtmlPart(3, 3)
invokeTag('link','g',6,['controller':("login"),'action':("auth")],3)
printHtmlPart(4)
})
invokeTag('form','g',10,['controller':("login"),'class':("navbar-form navbar-left")],2)
printHtmlPart(5)
})
invokeTag('ifNotLoggedIn','sec',11,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(2)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',17,['controller':("logout"),'action':("index")],3)
printHtmlPart(8)
})
invokeTag('form','g',20,['controller':("logout"),'action':("index"),'class':("navbar-form navbar-left")],2)
printHtmlPart(5)
})
invokeTag('ifLoggedIn','sec',21,[:],1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435148062690L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
