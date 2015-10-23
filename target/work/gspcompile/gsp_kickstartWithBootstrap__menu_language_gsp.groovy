import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap__menu_language_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/_menu/_language.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
invokeTag('set','g',1,['var':("lang"),'value':(session.'org.springframework.web.servlet.i18n.SessionLocaleResolver.LOCALE' ?: org.springframework.web.servlet.support.RequestContextUtils.getLocale(request).toString().substring(0,2))],-1)
printHtmlPart(0)
invokeTag('set','g',2,['var':("currentURL"),'value':(request.forwardURI)],-1)
printHtmlPart(1)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/flags',file: lang.toString()+'.png'))
printHtmlPart(2)
expressionOut.print(currentURL+'?lang=en')
printHtmlPart(3)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/flags',file: 'en.png'))
printHtmlPart(4)
invokeTag('message','g',13,['code':("language.en"),'default':("en")],-1)
printHtmlPart(5)
expressionOut.print(currentlURL)
printHtmlPart(6)
invokeTag('set','g',20,['var':("allLocales"),'value':(grailsApplication.config.grails.i18n.locales)],-1)
printHtmlPart(7)
loop:{
int i = 0
for( locale in (allLocales) ) {
printHtmlPart(8)
expressionOut.print(message(code: 'language.'+locale, default: locale))
printHtmlPart(9)
expressionOut.print(locale)
printHtmlPart(10)
expressionOut.print(currentURL+'?lang='+locale)
printHtmlPart(11)
expressionOut.print(resource(plugin: 'kickstart', dir: 'images/flags',file: locale+'.png'))
printHtmlPart(12)
invokeTag('message','g',23,['code':("language.${locale}"),'default':(locale)],-1)
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1390643626000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
