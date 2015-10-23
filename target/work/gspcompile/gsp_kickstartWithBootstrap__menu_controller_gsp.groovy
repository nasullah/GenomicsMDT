import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap__menu_controller_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/_menu/_controller.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
for( c in (grailsApplication.controllerClasses.sort { it.fullName }) ) {
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(2)
if(true && (c.fullName.contains('HomeController'))) {
printHtmlPart(3)
}
else if(true && (c.fullName.contains('DemoPageController'))) {
printHtmlPart(4)
}
else if(true && (c.fullName.contains('DbdocController'))) {
printHtmlPart(5)
}
printHtmlPart(2)
expressionOut.print(c.fullName.substring(c.fullName.lastIndexOf('.')+1))
printHtmlPart(6)
})
invokeTag('link','g',17,['controller':(c.logicalPropertyName)],2)
printHtmlPart(7)
}
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1390681044000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
