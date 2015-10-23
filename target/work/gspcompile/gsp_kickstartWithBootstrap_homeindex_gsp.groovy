import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap_homeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/home/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',4,['code':("default.welcome.title"),'args':([meta(name:'app.name')])],-1)
printHtmlPart(2)
})
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('link','g',29,['class':("btn btn-large btn-primary"),'controller':("nextSteps")],2)
printHtmlPart(7)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'bs-docs-twitter-github.png'))
printHtmlPart(8)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'browser_logos.png'))
printHtmlPart(9)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'html5css3js8.png'))
printHtmlPart(10)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'Datepicker.png'))
printHtmlPart(11)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'flags_preview_large.png'))
printHtmlPart(12)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/frontpage',file: 'empty.png'))
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',91,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1390682638000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
