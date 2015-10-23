import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap__common_modals_registerDialog_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/_common/modals/_registerDialog.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('message','g',7,['code':("security.register.title")],-1)
printHtmlPart(2)
expressionOut.print(message(code: 'security.firstname.label', default: 'Firstname'))
printHtmlPart(3)
expressionOut.print(message(code: 'security.firstname.label', default: 'Firstname'))
printHtmlPart(4)
expressionOut.print(message(code: 'security.lastname.label', default: 'Lastname'))
printHtmlPart(5)
expressionOut.print(message(code: 'security.lastname.label', default: 'Lastname'))
printHtmlPart(6)
expressionOut.print(message(code: 'security.email.label', default: 'Email'))
printHtmlPart(7)
expressionOut.print(message(code: 'security.email.label', default: 'Email'))
printHtmlPart(8)
expressionOut.print(message(code: 'security.password.label', default: 'Password'))
printHtmlPart(9)
expressionOut.print(message(code: 'security.password.label', default: 'Password'))
printHtmlPart(10)
expressionOut.print(message(code: 'security.password.confirm.label', default: 'Confirm'))
printHtmlPart(11)
expressionOut.print(message(code: 'security.password.confirm.label', default: 'Confirm'))
printHtmlPart(12)
expressionOut.print(message(code: 'security.agreement.label', default: 'I have read and agree with the Terms of Use.'))
printHtmlPart(13)
invokeTag('message','g',48,['code':("security.register.label")],-1)
printHtmlPart(14)
})
invokeTag('form','g',50,['controller':("login"),'action':("register"),'class':("form-horizontal"),'method':("post"),'name':("register_form")],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387110542000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
