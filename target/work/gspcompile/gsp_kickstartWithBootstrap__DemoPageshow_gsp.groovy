import kickstart._DemoPage
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='kickstart-with-bootstrap', version='1.1.0')
class gsp_kickstartWithBootstrap__DemoPageshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/kickstart-with-bootstrap-1.1.0/grails-app/views/_DemoPage/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(2)
invokeTag('set','g',9,['var':("entityName"),'value':(message(code: '_DemoPage.label', default: '_DemoPage'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',10,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',21,['code':("_DemoPage.name.label"),'default':("Name")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "name"))
printHtmlPart(6)
invokeTag('message','g',28,['code':("_DemoPage.myDate.label"),'default':("My Date")],-1)
printHtmlPart(5)
invokeTag('formatDate','g',30,['date':(_DemoPageInstance?.myDate)],-1)
printHtmlPart(6)
invokeTag('message','g',35,['code':("_DemoPage.myDate2.label"),'default':("My Date 2")],-1)
printHtmlPart(5)
invokeTag('formatDate','g',37,['date':(_DemoPageInstance?.myDate2)],-1)
printHtmlPart(6)
invokeTag('message','g',42,['code':("_DemoPage.myBoolean.label"),'default':("My Boolean")],-1)
printHtmlPart(5)
invokeTag('formatBoolean','g',44,['boolean':(_DemoPageInstance?.myBoolean)],-1)
printHtmlPart(6)
invokeTag('message','g',49,['code':("_DemoPage.myInt.label"),'default':("My Int")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myInt"))
printHtmlPart(6)
invokeTag('message','g',56,['code':("_DemoPage.myShort.label"),'default':("My Short")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myShort"))
printHtmlPart(6)
invokeTag('message','g',63,['code':("_DemoPage.myLong.label"),'default':("My Long")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myLong"))
printHtmlPart(6)
invokeTag('message','g',70,['code':("_DemoPage.myFloat.label"),'default':("My Float")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myFloat"))
printHtmlPart(6)
invokeTag('message','g',77,['code':("_DemoPage.myDouble.label"),'default':("My Double")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myDouble"))
printHtmlPart(6)
invokeTag('message','g',84,['code':("_DemoPage.myByte.label"),'default':("My Byte")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myByte"))
printHtmlPart(6)
invokeTag('message','g',91,['code':("_DemoPage.myChar.label"),'default':("My Char")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myChar"))
printHtmlPart(6)
invokeTag('message','g',98,['code':("_DemoPage.myByteArray.label"),'default':("My Byte Array")],-1)
printHtmlPart(6)
invokeTag('message','g',103,['code':("_DemoPage.myInteger.label"),'default':("My Integer")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myInteger"))
printHtmlPart(6)
invokeTag('message','g',110,['code':("_DemoPage.myTimeZone.label"),'default':("My Time Zone")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myTimeZone"))
printHtmlPart(6)
invokeTag('message','g',117,['code':("_DemoPage.myLocale.label"),'default':("My Locale")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myLocale"))
printHtmlPart(6)
invokeTag('message','g',124,['code':("_DemoPage.myCurrency.label"),'default':("My Currency")],-1)
printHtmlPart(5)
expressionOut.print(fieldValue(bean: _DemoPageInstance, field: "myCurrency"))
printHtmlPart(6)
invokeTag('message','g',131,['code':("_DemoPage.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(5)
invokeTag('formatDate','g',133,['date':(_DemoPageInstance?.dateCreated)],-1)
printHtmlPart(6)
invokeTag('message','g',138,['code':("_DemoPage.lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(5)
invokeTag('formatDate','g',140,['date':(_DemoPageInstance?.lastUpdated)],-1)
printHtmlPart(6)
invokeTag('message','g',145,['code':("_DemoPage.myEnum.label"),'default':("My Enum")],-1)
printHtmlPart(5)
expressionOut.print(_DemoPageInstance?.myEnum?.encodeAsHTML())
printHtmlPart(7)
})
invokeTag('captureBody','sitemesh',155,[:],1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1383564118000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
