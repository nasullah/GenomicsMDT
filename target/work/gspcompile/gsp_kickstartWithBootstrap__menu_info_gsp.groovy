import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap__menu_info_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/_menu/_info.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',4,['code':("default.info.label")],-1)
printHtmlPart(1)
expressionOut.print(createLink(uri: '/about'))
printHtmlPart(2)
invokeTag('message','g',11,['code':("default.about.label")],-1)
printHtmlPart(3)
invokeTag('message','g',17,['code':("default.blog.label")],-1)
printHtmlPart(4)
expressionOut.print(createLink(uri: '/terms'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("default.terms.label")],-1)
printHtmlPart(6)
expressionOut.print(createLink(uri: '/contact'))
printHtmlPart(7)
invokeTag('message','g',29,['code':("default.contact.label")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1390683816000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
