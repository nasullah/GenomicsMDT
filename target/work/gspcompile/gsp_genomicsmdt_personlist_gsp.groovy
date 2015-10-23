import genomicsmdt.Person
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_genomicsmdt_personlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/person/list.gsp" }
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
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(2)
invokeTag('require','r',10,['module':("filterpane")],-1)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('filterButton','filterpane',22,['text':("Filter This List")],-1)
printHtmlPart(5)
invokeTag('filterPane','filterpane',23,['domain':("genomicsmdt.Person")],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',35,['property':("name"),'title':(message(code: 'person.name.label', default: 'Name'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',37,['property':("email"),'title':(message(code: 'person.email.label', default: 'Email'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',39,['property':("telephone"),'title':(message(code: 'person.telephone.label', default: 'Telephone'))],-1)
printHtmlPart(7)
invokeTag('sortableColumn','g',41,['property':("nhsContract"),'title':(message(code: 'person.nhsContract.label', default: 'NHS Contract'))],-1)
printHtmlPart(8)
loop:{
int i = 0
for( personInstance in (personInstanceList) ) {
printHtmlPart(9)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(10)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: personInstance, field: "name"))
})
invokeTag('link','g',49,['action':("show"),'id':(personInstance.id)],3)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: personInstance, field: "email"))
printHtmlPart(11)
expressionOut.print(fieldValue(bean: personInstance, field: "telephone"))
printHtmlPart(11)
invokeTag('formatBoolean','g',55,['boolean':(personInstance.nhsContract),'false':("No"),'true':("Yes")],-1)
printHtmlPart(12)
i++
}
}
printHtmlPart(13)
invokeTag('paginate','bs',62,['total':(personInstanceTotal)],-1)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',66,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435227434818L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
