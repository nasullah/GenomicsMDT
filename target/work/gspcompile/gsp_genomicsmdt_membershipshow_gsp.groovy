import genomicsmdt.Membership
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_membershipshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/membership/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("kickstart")],-1)
printHtmlPart(2)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'membership.label', default: 'Membership'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',20,['code':("membership.mdt.label"),'default':("MDT")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(membershipInstance?.mdt?.encodeAsHTML())
})
invokeTag('link','g',22,['controller':("MDT"),'action':("show"),'id':(membershipInstance?.mdt?.id)],2)
printHtmlPart(6)
invokeTag('message','g',27,['code':("membership.person.label"),'default':("Person")],-1)
printHtmlPart(5)
createTagBody(2, {->
expressionOut.print(membershipInstance?.person?.encodeAsHTML())
})
invokeTag('link','g',29,['controller':("person"),'action':("show"),'id':(membershipInstance?.person?.id)],2)
printHtmlPart(6)
invokeTag('message','g',34,['code':("membership.role.label"),'default':("Role")],-1)
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(membershipInstance?.role?.encodeAsHTML())
})
invokeTag('link','g',36,['controller':("roleType"),'action':("show"),'id':(membershipInstance?.role?.id)],2)
printHtmlPart(6)
invokeTag('message','g',41,['code':("membership.status.label"),'default':("Status")],-1)
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(membershipInstance?.status?.encodeAsHTML())
})
invokeTag('link','g',43,['controller':("membershipStatus"),'action':("show"),'id':(membershipInstance?.status?.id)],2)
printHtmlPart(8)
})
invokeTag('captureBody','sitemesh',51,[:],1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435833937640L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
