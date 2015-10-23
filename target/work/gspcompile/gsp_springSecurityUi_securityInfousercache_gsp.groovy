import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='spring-security-ui', version='0.2')
class gsp_springSecurityUi_securityInfousercache_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/spring-security-ui-0.2/grails-app/views/securityInfo/usercache.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("springSecurityUI")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(4)
if(true && (cache)) {
printHtmlPart(5)
expressionOut.print(cache.getClass().name)
printHtmlPart(6)
expressionOut.print(cache.size)
printHtmlPart(7)
expressionOut.print(cache.status)
printHtmlPart(8)
expressionOut.print(cache.name)
printHtmlPart(9)
expressionOut.print(cache.guid)
printHtmlPart(10)
expressionOut.print(cache.statistics.cacheHits)
printHtmlPart(11)
expressionOut.print(cache.statistics.inMemoryHits)
printHtmlPart(12)
expressionOut.print(cache.statistics.onDiskHits)
printHtmlPart(13)
expressionOut.print(cache.statistics.cacheMisses)
printHtmlPart(14)
expressionOut.print(cache.statistics.objectCount)
printHtmlPart(15)
expressionOut.print(cache.statistics.memoryStoreObjectCount)
printHtmlPart(16)
expressionOut.print(cache.statistics.diskStoreObjectCount)
printHtmlPart(17)
expressionOut.print(cache.statistics.statisticsAccuracyDescription)
printHtmlPart(18)
expressionOut.print(cache.statistics.averageGetTime)
printHtmlPart(19)
expressionOut.print(cache.statistics.evictionCount)
printHtmlPart(20)
expressionOut.print(cache.size)
printHtmlPart(21)
expressionOut.print(cache.size == 1 ? '' : 's')
printHtmlPart(22)
for( k in (cache.keys) ) {
printHtmlPart(23)
expressionOut.print(k)
printHtmlPart(24)
expressionOut.print(cache.get(k)?.value)
printHtmlPart(25)
}
printHtmlPart(26)
}
else {
printHtmlPart(27)
}
printHtmlPart(4)
})
invokeTag('captureBody','sitemesh',95,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1329087628000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
