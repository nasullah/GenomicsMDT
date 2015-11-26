import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap__errors_500_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/_errors/500.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("layout_nomainmenu"),'value':(true),'scope':("request")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("layout_nosecondarymenu"),'value':(true),'scope':("request")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(request.'javax.servlet.error.message'.indexOf(':') != -1 ? request.'javax.servlet.error.message'?.substring(0, request.'javax.servlet.error.message'?.indexOf(':')).encodeAsHTML() : request.'javax.servlet.error.message'?.encodeAsHTML())
printHtmlPart(6)
if(true && (request.'javax.servlet.error.message' == null)) {
printHtmlPart(6)
}
else if(true && (request.'javax.servlet.error.message'.indexOf(':') != -1)) {
printHtmlPart(7)
expressionOut.print(request.'javax.servlet.error.message'?.substring(0, request.'javax.servlet.error.message'?.indexOf(':')).encodeAsHTML())
printHtmlPart(6)
}
else {
printHtmlPart(7)
expressionOut.print(request.'javax.servlet.error.message'?.encodeAsHTML())
printHtmlPart(6)
}
printHtmlPart(6)
if(true && (exception)) {
printHtmlPart(7)
expressionOut.print(exception.className)
printHtmlPart(8)
expressionOut.print(exception.lineNumber)
printHtmlPart(6)
}
printHtmlPart(9)
expressionOut.print(request.'javax.servlet.error.status_code')
printHtmlPart(10)
expressionOut.print(request.'javax.servlet.error.message'.encodeAsHTML())
printHtmlPart(11)
expressionOut.print(request.'javax.servlet.error.servlet_name')
printHtmlPart(12)
expressionOut.print(request.'javax.servlet.error.request_uri')
printHtmlPart(13)
if(true && (exception)) {
printHtmlPart(14)
expressionOut.print(exception.message?.encodeAsHTML())
printHtmlPart(15)
expressionOut.print(exception.cause?.message?.encodeAsHTML())
printHtmlPart(16)
expressionOut.print(exception.className)
printHtmlPart(17)
expressionOut.print(exception.lineNumber)
printHtmlPart(18)
for( cs in (exception.codeSnippet) ) {
printHtmlPart(19)
expressionOut.print(cs?.encodeAsHTML())
printHtmlPart(20)
}
printHtmlPart(21)
}
printHtmlPart(22)
if(true && (exception)) {
printHtmlPart(23)
for( _it148815812 in (exception.stackTraceLines) ) {
changeItVariable(_it148815812)
expressionOut.print(it.encodeAsHTML())
printHtmlPart(24)
}
printHtmlPart(25)
}
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',101,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1390645784000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
