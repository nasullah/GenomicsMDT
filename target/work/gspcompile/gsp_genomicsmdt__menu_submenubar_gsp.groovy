import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt__menu_submenubar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/_menu/_submenubar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (params.controller != null
			&&	params.controller != ''
			&&	params.controller != 'home')) {
printHtmlPart(1)
invokeTag('set','g',13,['var':("entityName"),'value':(message(code: params.controller+'.label', default: params.controller.substring(0,1).toUpperCase() + params.controller.substring(1).toLowerCase()))],-1)
printHtmlPart(2)
expressionOut.print(params.action == "list" ? 'active' : '')
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('message','g',16,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['action':("list")],2)
printHtmlPart(5)
if(true && (params.controller != 'attendenceRecord'
					&&	params.controller != 'discussionRecord'
					&&  params.controller != 'referralRecord'
					&&  params.controller != 'outcomeRecord'
					&&  params.controller != 'attachedEvidence')) {
printHtmlPart(6)
expressionOut.print(params.action == "create" ? 'active' : '')
printHtmlPart(3)
createTagBody(3, {->
printHtmlPart(7)
invokeTag('message','g',24,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',24,['action':("create")],3)
printHtmlPart(5)
}
printHtmlPart(8)
if(true && (params.action == 'show' || params.action == 'edit')) {
printHtmlPart(9)
expressionOut.print(params.action == "edit" ? 'active' : '')
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(11)
invokeTag('message','g',30,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('link','g',30,['action':("edit"),'id':(params.id)],3)
printHtmlPart(12)
invokeTag('render','g',30,['template':("/_common/modals/deleteTextLink")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (params.controller != null && params.controller == 'meeting')) {
printHtmlPart(15)
expressionOut.print(params.action == "scheduledMeetingList" ? 'active' : '')
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',42,['action':("scheduledMeetingList")],3)
printHtmlPart(18)
}
printHtmlPart(19)
}
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1447409585892L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
