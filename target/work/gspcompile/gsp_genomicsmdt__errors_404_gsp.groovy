import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt__errors_404_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_errors/404.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',3,['code':("error.404.title")],-1)
})
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("layout_nomainmenu"),'value':(true),'scope':("request")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("layout_nosecondarymenu"),'value':(true),'scope':("request")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(2)
createClosureForHtmlPart(4, 2)
invokeTag('captureContent','sitemesh',12,['tag':("header")],2)
printHtmlPart(5)
invokeTag('message','g',18,['code':("error.404.callout")],-1)
printHtmlPart(6)
invokeTag('message','g',21,['code':("error.404.title")],-1)
printHtmlPart(7)
invokeTag('message','g',24,['code':("error.404.message")],-1)
printHtmlPart(8)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(9)
invokeTag('message','g',30,['code':("error.button.backToHome")],-1)
printHtmlPart(10)
expressionOut.print(createLink(uri: '/contact'))
printHtmlPart(11)
invokeTag('message','g',34,['code':("error.button.contactSupport")],-1)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',42,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434547123433L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
