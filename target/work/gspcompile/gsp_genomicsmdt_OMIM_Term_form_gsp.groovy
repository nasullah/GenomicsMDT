import genomicsmdt.OMIM_Term
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_OMIM_Term_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/OMIM_Term/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: OMIM_TermInstance, field: 'omimTermName', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("OMIM_Term.omimTermName.label"),'default':("OMIM Term Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',11,['class':("form-control"),'name':("omimTermName"),'value':(OMIM_TermInstance?.omimTermName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: OMIM_TermInstance, field: 'omimTermName', 'error'))
printHtmlPart(4)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435916598784L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
