import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap_loginauth_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/login/auth.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',3,['code':("springSecurity.login.title")],-1)
})
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(2)
invokeTag('set','g',6,['var':("layout_nomainmenu"),'value':(true),'scope':("request")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("layout_nosecondarymenu"),'value':(true),'scope':("request")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(postUrl)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'name', 'error'))
printHtmlPart(7)
invokeTag('message','g',18,['code':("springSecurity.login.header")],-1)
printHtmlPart(8)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'name', 'error'))
printHtmlPart(9)
invokeTag('message','g',22,['code':("springSecurity.login.username.label")],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: _DemoPageInstance, field: 'name', 'error'))
printHtmlPart(11)
invokeTag('message','g',29,['code':("springSecurity.login.password.label")],-1)
printHtmlPart(12)
invokeTag('message','g',36,['code':("springSecurity.login.remember.me.label")],-1)
printHtmlPart(13)
invokeTag('checkBox','bs',38,['class':("form-control col-md-4"),'name':(rememberMeParameter),'value':(hasCookie)],-1)
printHtmlPart(14)
expressionOut.print(message(code: "springSecurity.login.button"))
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387315772000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
