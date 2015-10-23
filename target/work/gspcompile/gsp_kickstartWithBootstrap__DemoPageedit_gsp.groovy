import kickstart._DemoPage
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap__DemoPageedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/_DemoPage/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(1)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: '_DemoPage.label', default: '_DemoPage'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('renderErrors','g',18,['bean':(_DemoPageInstance),'as':("list")],-1)
printHtmlPart(6)
})
invokeTag('hasErrors','g',20,['bean':(_DemoPageInstance)],2)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('hiddenField','g',23,['name':("id"),'value':(_DemoPageInstance?.id)],-1)
printHtmlPart(8)
invokeTag('hiddenField','g',24,['name':("version"),'value':(_DemoPageInstance?.version)],-1)
printHtmlPart(9)
invokeTag('render','g',26,['template':("form")],-1)
printHtmlPart(10)
invokeTag('actionSubmit','g',29,['class':("btn btn-primary"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(11)
invokeTag('actionSubmit','g',30,['class':("btn btn-danger"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(12)
})
invokeTag('form','g',33,['method':("post"),'class':("form-horizontal"),'enctype':("multipart/form-data")],2)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',37,[:],1)
printHtmlPart(14)
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
