import genomicsmdt.AttendenceCapacity
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_attendenceCapacity_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendenceCapacity/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: attendenceCapacityInstance, field: 'attendenceRecord', 'error'))
printHtmlPart(1)
invokeTag('message','g',9,['code':("attendenceCapacity.attendenceRecord.label"),'default':("Attendence Record")],-1)
printHtmlPart(2)
invokeTag('select','g',11,['class':("form-control"),'id':("attendenceRecord"),'name':("attendenceRecord.id"),'from':(genomicsmdt.AttendenceRecord.list()),'optionKey':("id"),'required':(""),'value':(attendenceCapacityInstance?.attendenceRecord?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: attendenceCapacityInstance, field: 'attendenceRecord', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: attendenceCapacityInstance, field: 'attendenceCapacity', 'error'))
printHtmlPart(5)
invokeTag('message','g',21,['code':("attendenceCapacity.attendenceCapacity.label"),'default':("Attendence Capacity")],-1)
printHtmlPart(2)
invokeTag('select','g',23,['class':("form-control"),'id':("attendenceCapacity"),'name':("attendenceCapacity.id"),'from':(genomicsmdt.RoleType.list()),'optionKey':("id"),'required':(""),'value':(attendenceCapacityInstance?.attendenceCapacity?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: attendenceCapacityInstance, field: 'attendenceCapacity', 'error'))
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435921792973L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
