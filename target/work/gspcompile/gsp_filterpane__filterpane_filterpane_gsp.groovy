import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='filterpane', version='2.4.2')
class gsp_filterpane__filterpane_filterpane_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/filterpane-2.4.2/grails-app/views/_filterpane/_filterpane.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(fp.containerId)
printHtmlPart(1)
expressionOut.print(fp.containerIsDialog)
printHtmlPart(2)
expressionOut.print(fp.containerClass)
printHtmlPart(3)
expressionOut.print(fp.containerVisibleStyle)
expressionOut.print(fp.containerStyle)
printHtmlPart(4)
if(true && (fp.showTitle)) {
printHtmlPart(5)
expressionOut.print(fp.title)
printHtmlPart(6)
}
printHtmlPart(7)
invokeTag('set','g',7,['var':("renderForm"),'value':(fp.customForm == false)],-1)
printHtmlPart(7)
if(true && (renderForm)) {
printHtmlPart(8)
expressionOut.print(fp.formName)
printHtmlPart(9)
expressionOut.print(fp.formName)
printHtmlPart(10)
expressionOut.print(fp.formMethod)
printHtmlPart(11)
expressionOut.print(createLink(action: fp.formAction))
printHtmlPart(4)
}
printHtmlPart(12)
expressionOut.print(fp.filterProperties)
printHtmlPart(13)
expressionOut.print(fp.listDistinct)
printHtmlPart(14)
expressionOut.print(fp.uniqueCountColumn)
printHtmlPart(15)
for( propMap in (fp.properties) ) {
printHtmlPart(16)
invokeTag('render','g',19,['template':("/_filterpane/filterpaneProperty"),'model':(propMap)],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (fp.showSortPanel == true)) {
printHtmlPart(19)
invokeTag('render','g',25,['template':("/_filterpane/filterpaneSort"),'model':(fp.sortModel)],-1)
printHtmlPart(20)
}
else {
printHtmlPart(21)
expressionOut.print(params.sort)
printHtmlPart(22)
expressionOut.print(params.order)
printHtmlPart(23)
}
printHtmlPart(20)
if(true && (fp.showButtons == true)) {
printHtmlPart(17)
invokeTag('render','g',34,['template':("/_filterpane/filterpaneButtons"),'model':(fp.buttonModel)],-1)
printHtmlPart(7)
}
printHtmlPart(20)
if(true && (renderForm)) {
printHtmlPart(24)
}
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1399387318000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
