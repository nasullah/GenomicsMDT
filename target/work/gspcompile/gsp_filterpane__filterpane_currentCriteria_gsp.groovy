import org.grails.plugin.filterpane.FilterPaneOperationType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='filterpane', version='2.4.2')
class gsp_filterpane__filterpane_currentCriteria_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/filterpane-2.4.2/grails-app/views/_filterpane/_currentCriteria.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (isFiltered == true)) {
printHtmlPart(1)
expressionOut.print(id)
printHtmlPart(2)
expressionOut.print(styleClass)
printHtmlPart(3)
expressionOut.print(style)
printHtmlPart(4)
expressionOut.print(title)
printHtmlPart(5)
for( c in (criteria) ) {
printHtmlPart(6)
expressionOut.print(c.fieldName)
printHtmlPart(7)
invokeTag('message','g',7,['code':("fp.op.${c.filterOp}"),'default':(c.filterOp)],-1)
printHtmlPart(7)
if(true && (![FilterPaneOperationType.IsNull.operation, FilterPaneOperationType.IsNotNull.operation].contains(c.filterOp))) {
printHtmlPart(8)
if(true && (quoteValues == true)) {
printHtmlPart(9)
expressionOut.print(c.filterValue)
printHtmlPart(10)
}
else {
printHtmlPart(11)
expressionOut.print(c.filterValue)
printHtmlPart(8)
}
printHtmlPart(7)
}
printHtmlPart(7)
if(true && ('between'.equalsIgnoreCase(c.filterOp))) {
printHtmlPart(8)
invokeTag('message','g',17,['code':("fp.tag.filterPane.property.betweenValueSeparatorText"),'default':("and")],-1)
printHtmlPart(8)
if(true && (quoteValues == true)) {
printHtmlPart(9)
expressionOut.print(c.filterValueTo)
printHtmlPart(10)
}
else {
printHtmlPart(11)
expressionOut.print(c.filterValueTo)
printHtmlPart(8)
}
printHtmlPart(7)
}
printHtmlPart(12)
expressionOut.print(g.createLink(action: action, params: c.params))
printHtmlPart(13)
if(true && (removeImgFile != null)) {
printHtmlPart(14)
expressionOut.print(g.resource(dir: removeImgDir, file: removeImgFile))
printHtmlPart(15)
expressionOut.print(g.message(code: 'fp.currentCriteria.removeTitle', default: 'Remove'))
printHtmlPart(16)
}
else {
printHtmlPart(17)
}
printHtmlPart(18)
}
printHtmlPart(19)
}
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
