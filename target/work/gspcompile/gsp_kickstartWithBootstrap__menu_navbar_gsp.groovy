import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap__menu_navbar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/_menu/_navbar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(1)
expressionOut.print(resource(plugin: 'kickstart', dir:'images', file:'brand_logo.png'))
printHtmlPart(2)
expressionOut.print(meta(name:'app.name'))
printHtmlPart(3)
expressionOut.print(meta(name:'app.name'))
printHtmlPart(4)
expressionOut.print(meta(name:'app.version'))
printHtmlPart(5)
invokeTag('render','g',22,['template':("/_menu/controller")],-1)
printHtmlPart(6)
invokeTag('render','g',26,['template':("/_menu/search")],-1)
printHtmlPart(7)
invokeTag('render','g',27,['template':("/_menu/admin")],-1)
printHtmlPart(8)
invokeTag('render','g',28,['template':("/_menu/info")],-1)
printHtmlPart(8)
invokeTag('render','g',29,['template':("/_menu/user")],-1)
printHtmlPart(9)
invokeTag('render','g',30,['template':("/_menu/language")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1390643638000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
