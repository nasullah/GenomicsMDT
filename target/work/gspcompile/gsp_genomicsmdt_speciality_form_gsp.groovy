import genomicsmdt.Speciality
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_speciality_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/speciality/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: specialityInstance, field: 'person', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("speciality.person.label"),'default':("Person")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['class':("form-control"),'id':("person"),'name':("person.id"),'from':(genomicsmdt.Person.list()),'optionKey':("id"),'required':(""),'value':(specialityInstance?.person?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: specialityInstance, field: 'person', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: specialityInstance, field: 'speciality', 'error'))
printHtmlPart(5)
invokeTag('message','g',20,['code':("speciality.speciality.label"),'default':("Speciality")],-1)
printHtmlPart(2)
invokeTag('select','g',22,['class':("form-control"),'id':("speciality"),'name':("speciality.id"),'from':(genomicsmdt.OMIM_Term.list()),'optionKey':("id"),'required':(""),'value':(specialityInstance?.speciality?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: specialityInstance, field: 'speciality', 'error'))
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435917916392L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
