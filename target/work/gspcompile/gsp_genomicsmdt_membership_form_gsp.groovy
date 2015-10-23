import genomicsmdt.Membership
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_membership_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/membership/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: membershipInstance, field: 'mdt', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("membership.mdt.label"),'default':("Mdt")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['class':("form-control"),'id':("mdt"),'name':("mdt.id"),'from':(genomicsmdt.MDT.list()),'optionKey':("id"),'required':(""),'value':(membershipInstance?.mdt?.id)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: membershipInstance, field: 'mdt', 'error'))
printHtmlPart(4)
expressionOut.print(hasErrors(bean: membershipInstance, field: 'person', 'error'))
printHtmlPart(5)
invokeTag('message','g',20,['code':("membership.person.label"),'default':("Person")],-1)
printHtmlPart(2)
invokeTag('select','g',22,['class':("form-control"),'id':("person"),'name':("person.id"),'from':(genomicsmdt.Person.list()),'optionKey':("id"),'required':(""),'value':(membershipInstance?.person?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: membershipInstance, field: 'person', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: membershipInstance, field: 'role', 'error'))
printHtmlPart(7)
invokeTag('message','g',30,['code':("membership.role.label"),'default':("Role")],-1)
printHtmlPart(2)
invokeTag('select','g',32,['class':("form-control"),'id':("role"),'name':("role.id"),'from':(genomicsmdt.RoleType.list()),'optionKey':("id"),'required':(""),'value':(membershipInstance?.role?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: membershipInstance, field: 'role', 'error'))
printHtmlPart(6)
expressionOut.print(hasErrors(bean: membershipInstance, field: 'status', 'error'))
printHtmlPart(8)
invokeTag('message','g',40,['code':("membership.status.label"),'default':("Status")],-1)
printHtmlPart(2)
invokeTag('select','g',42,['class':("form-control"),'id':("status"),'name':("status.id"),'from':(genomicsmdt.MembershipStatus.list()),'optionKey':("id"),'required':(""),'value':(membershipInstance?.status?.id),'noSelection':(['':'- Choose -'])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: membershipInstance, field: 'status', 'error'))
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435920210468L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
