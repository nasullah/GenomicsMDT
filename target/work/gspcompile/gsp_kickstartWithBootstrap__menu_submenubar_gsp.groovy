import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap__menu_submenubar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/_menu/_submenubar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (params.controller != null
			&&	params.controller != ''
			&&	params.controller != 'home')) {
printHtmlPart(1)
invokeTag('set','g',12,['var':("entityName"),'value':(message(code: params.controller+'.label', default: params.controller.substring(0,1).toUpperCase() + params.controller.substring(1).toLowerCase()))],-1)
printHtmlPart(2)
expressionOut.print(params.action == "list" ? 'active' : '')
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['action':("list")],2)
printHtmlPart(5)
expressionOut.print(params.action == "create" ? 'active' : '')
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('message','g',18,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',18,['action':("create")],2)
printHtmlPart(7)
if(true && (params.action == 'show' || params.action == 'edit')) {
printHtmlPart(8)
expressionOut.print(params.action == "edit" ? 'active' : '')
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
invokeTag('message','g',24,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('link','g',24,['action':("edit"),'id':(params.id)],3)
printHtmlPart(11)
invokeTag('render','g',24,['template':("/_common/modals/deleteTextLink")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
}
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1390679992000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
