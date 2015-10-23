import genomicsmdt.Membership
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_membershipindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/membership/index.gsp" }
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
invokeTag('message','g',9,['code':("default.index.label"),'args':([entityName])],-1)
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
invokeTag('message','g',20,['code':("membership.mdt.label"),'default':("Mdt")],-1)
printHtmlPart(5)
invokeTag('message','g',22,['code':("membership.person.label"),'default':("Person")],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',24,['property':("role"),'title':(message(code: 'membership.role.label', default: 'Role'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',26,['property':("status"),'title':(message(code: 'membership.status.label', default: 'Status'))],-1)
printHtmlPart(8)
loop:{
int i = 0
for( membershipInstance in (membershipInstanceList) ) {
printHtmlPart(9)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(10)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: membershipInstance, field: "mdt"))
})
invokeTag('link','g',34,['action':("show"),'id':(membershipInstance.id)],3)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: membershipInstance, field: "person"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: membershipInstance, field: "role"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: membershipInstance, field: "status"))
printHtmlPart(12)
i++
}
}
printHtmlPart(13)
invokeTag('paginate','bs',47,['total':(membershipInstanceCount)],-1)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',51,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1434705530070L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
