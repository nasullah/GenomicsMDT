import genomicsmdt.Person
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_person_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/person/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: personInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("person.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['class':("form-control"),'name':("name"),'value':(personInstance?.name),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personInstance, field: 'name', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: personInstance, field: 'email', 'error'))
printHtmlPart(5)
invokeTag('message','g',18,['code':("person.email.label"),'default':("Email")],-1)
printHtmlPart(6)
invokeTag('field','g',20,['type':("email"),'class':("form-control"),'name':("email"),'value':(personInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personInstance, field: 'email', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: personInstance, field: 'notes', 'error'))
printHtmlPart(7)
invokeTag('message','g',28,['code':("person.notes.label"),'default':("Notes")],-1)
printHtmlPart(6)
invokeTag('textArea','g',30,['class':("form-control"),'name':("notes"),'cols':("40"),'rows':("4"),'value':(personInstance?.notes)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personInstance, field: 'notes', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: personInstance, field: 'telephone', 'error'))
printHtmlPart(8)
invokeTag('message','g',38,['code':("person.telephone.label"),'default':("Telephone")],-1)
printHtmlPart(6)
invokeTag('field','g',40,['type':("number"),'class':("form-control"),'name':("telephone"),'value':(personInstance?.telephone)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personInstance, field: 'telephone', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: personInstance, field: 'nhsContract', 'error'))
printHtmlPart(9)
invokeTag('message','g',48,['code':("person.nhsContract.label"),'default':("NHS Contract")],-1)
printHtmlPart(6)
invokeTag('checkBox','bs',50,['name':("nhsContract"),'value':(personInstance?.nhsContract),'offLabel':("No"),'onLabel':("Yes")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: personInstance, field: 'nhsContract', 'error'))
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435153875397L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
