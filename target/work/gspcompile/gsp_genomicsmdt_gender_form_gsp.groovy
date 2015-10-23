import genomicsmdt.Gender
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_gender_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gender/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: genderInstance, field: 'genderName', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("gender.genderName.label"),'default':("Gender Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['class':("form-control"),'name':("genderName"),'value':(genderInstance?.genderName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: genderInstance, field: 'genderName', 'error'))
printHtmlPart(4)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435828793949L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
