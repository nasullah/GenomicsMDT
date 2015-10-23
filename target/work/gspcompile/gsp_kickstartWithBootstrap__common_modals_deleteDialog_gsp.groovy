import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap__common_modals_deleteDialog_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/_common/modals/_deleteDialog.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',11,['code':("default.button.delete.confirm.title"),'default':("Delete Item")],-1)
printHtmlPart(1)
invokeTag('message','g',14,['code':("default.button.delete.confirm.message"),'args':([entityName]),'default':("Do you really want to delete this item?")],-1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',18,['code':("default.button.cancel.label"),'default':("Cancel")],-1)
printHtmlPart(4)
invokeTag('hiddenField','g',19,['name':("id"),'value':(item ? item.id : params.id)],-1)
printHtmlPart(5)
invokeTag('hiddenField','g',20,['name':("_method"),'value':("DELETE")],-1)
printHtmlPart(6)
invokeTag('actionSubmit','g',21,['class':("btn btn-danger"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete'))],-1)
printHtmlPart(7)
})
invokeTag('form','g',22,[:],1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1390638978000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
