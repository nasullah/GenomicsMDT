import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap_siteinfosysteminfo_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/siteinfo/systeminfo.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',4,['code':("default.contact.title")],-1)
})
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
expressionOut.print(meta(name:'app.name'))
printHtmlPart(6)
})
invokeTag('captureContent','sitemesh',16,['tag':("header")],2)
printHtmlPart(7)
invokeTag('message','g',19,['code':("default.systeminfo.resources")],-1)
printHtmlPart(8)
invokeTag('message','g',32,['code':("default.systeminfo.status")],-1)
printHtmlPart(9)
invokeTag('meta','g',34,['name':("app.version")],-1)
printHtmlPart(10)
invokeTag('meta','g',35,['name':("app.grails.version")],-1)
printHtmlPart(11)
expressionOut.print(groovy.lang.GroovySystem.getVersion())
printHtmlPart(12)
expressionOut.print(System.getProperty('java.version'))
printHtmlPart(13)
expressionOut.print(grails.util.Environment.reloadingAgentEnabled)
printHtmlPart(14)
expressionOut.print(grailsApplication.controllerClasses.size())
printHtmlPart(15)
expressionOut.print(grailsApplication.domainClasses.size())
printHtmlPart(16)
expressionOut.print(grailsApplication.serviceClasses.size())
printHtmlPart(17)
expressionOut.print(grailsApplication.tagLibClasses.size())
printHtmlPart(18)
invokeTag('message','g',47,['code':("default.systeminfo.plugins")],-1)
printHtmlPart(19)
invokeTag('set','g',50,['var':("pluginManager"),'value':(applicationContext.getBean('pluginManager'))],-1)
printHtmlPart(20)
for( plugin in (pluginManager.allPlugins.sort { it.name }) ) {
printHtmlPart(21)
expressionOut.print(plugin.name)
printHtmlPart(22)
expressionOut.print(plugin.version)
printHtmlPart(23)
}
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',58,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1390683564000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
