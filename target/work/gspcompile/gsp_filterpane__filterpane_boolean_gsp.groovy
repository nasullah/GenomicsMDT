import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='filterpane', version='2.4.2')
class gsp_filterpane__filterpane_boolean_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/filterpane-2.4.2/grails-app/views/_filterpane/_boolean.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(name)
printHtmlPart(1)
invokeTag('message','g',2,['code':("fp.tag.filterPane.property.boolean.true"),'default':("Yes")],-1)
printHtmlPart(2)
invokeTag('radio','g',9,['id':("${name}.yes"),'name':(name),'value':("true"),'checked':(value == 'true'),'onClick':("grailsFilterPane.selectDefaultOperator('${opName}')")],-1)
printHtmlPart(3)
expressionOut.print(name)
printHtmlPart(4)
invokeTag('message','g',11,['code':("fp.tag.filterPane.property.boolean.false"),'default':("No")],-1)
printHtmlPart(2)
invokeTag('radio','g',18,['id':("${name}.no"),'name':(name),'value':("false"),'checked':(value == 'false'),'onClick':("grailsFilterPane.selectDefaultOperator('${opName}')")],-1)
printHtmlPart(5)
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
