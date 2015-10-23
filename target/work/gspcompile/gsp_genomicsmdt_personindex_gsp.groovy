import genomicsmdt.Person
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_personindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/person/index.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'person.label', default: 'Person'))],-1)
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
invokeTag('sortableColumn','g',20,['property':("name"),'title':(message(code: 'person.name.label', default: 'Name'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',22,['property':("email"),'title':(message(code: 'person.email.label', default: 'Email'))],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',24,['property':("telephone"),'title':(message(code: 'person.telephone.label', default: 'Telephone'))],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',26,['property':("nhsContract"),'title':(message(code: 'person.nhsContract.label', default: 'NHS Contract'))],-1)
printHtmlPart(7)
loop:{
int i = 0
for( personInstance in (personInstanceList) ) {
printHtmlPart(8)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(9)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: personInstance, field: "name"))
})
invokeTag('link','g',34,['action':("show"),'id':(personInstance.id)],3)
printHtmlPart(10)
expressionOut.print(fieldValue(bean: personInstance, field: "email"))
printHtmlPart(10)
expressionOut.print(fieldValue(bean: personInstance, field: "telephone"))
printHtmlPart(11)
invokeTag('formatBoolean','g',40,['boolean':(personInstance.nhsContract),'false':("No"),'true':("Yes")],-1)
printHtmlPart(12)
i++
}
}
printHtmlPart(13)
invokeTag('paginate','bs',47,['total':(personInstanceCount)],-1)
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
public static final long LAST_MODIFIED = 1434977794796L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
