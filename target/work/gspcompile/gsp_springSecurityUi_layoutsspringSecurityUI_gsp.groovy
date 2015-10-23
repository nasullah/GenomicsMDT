import org.codehaus.groovy.grails.plugins.PluginManagerHolder
import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils
import grails.plugins.springsecurity.SecurityConfigType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='spring-security-ui', version='0.2')
class gsp_springSecurityUi_layoutsspringSecurityUI_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/spring-security-ui-0.2/grails-app/views/layouts/springSecurityUI.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',12,['default':("Security Management Console")],-1)
})
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(3)
expressionOut.print(resource(dir:'images',file:'favicon.ico'))
printHtmlPart(4)
invokeTag('resources','s2ui',16,['module':("spring-security-ui")],-1)
printHtmlPart(5)
expressionOut.print(fam.icon(name: 'lock'))
printHtmlPart(6)
expressionOut.print(fam.icon(name: 'group'))
printHtmlPart(7)
expressionOut.print(fam.icon(name: 'user'))
printHtmlPart(8)
expressionOut.print(fam.icon(name: 'exclamation'))
printHtmlPart(9)
expressionOut.print(fam.icon(name: 'information'))
printHtmlPart(10)
invokeTag('layoutHead','g',25,[:],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',25,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(11)
invokeTag('message','g',26,['code':("spring.security.ui.menu.users")],-1)
printHtmlPart(12)
createTagBody(2, {->
invokeTag('message','g',27,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',27,['controller':("user"),'action':("search")],2)
printHtmlPart(13)
createTagBody(2, {->
invokeTag('message','g',28,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',28,['controller':("user"),'action':("create")],2)
printHtmlPart(14)
invokeTag('message','g',29,['code':("spring.security.ui.menu.roles")],-1)
printHtmlPart(12)
createTagBody(2, {->
invokeTag('message','g',30,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',30,['controller':("role"),'action':("search")],2)
printHtmlPart(13)
createTagBody(2, {->
invokeTag('message','g',31,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',31,['controller':("role"),'action':("create")],2)
printHtmlPart(15)
if(true && (SpringSecurityUtils.securityConfig.securityConfigType == SecurityConfigType.Requestmap)) {
printHtmlPart(16)
invokeTag('message','g',38,['code':("spring.security.ui.menu.requestmaps")],-1)
printHtmlPart(12)
createTagBody(3, {->
invokeTag('message','g',45,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',45,['controller':("requestmap"),'action':("search")],3)
printHtmlPart(13)
createTagBody(3, {->
invokeTag('message','g',48,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',49,['controller':("requestmap"),'action':("create")],3)
printHtmlPart(15)
}
printHtmlPart(17)
if(true && (SpringSecurityUtils.securityConfig.rememberMe.persistent)) {
printHtmlPart(16)
invokeTag('message','g',57,['code':("spring.security.ui.menu.persistentLogins")],-1)
printHtmlPart(12)
createTagBody(3, {->
invokeTag('message','g',62,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',62,['controller':("persistentLogin"),'action':("search")],3)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('message','g',76,['code':("spring.security.ui.menu.registrationCode")],-1)
printHtmlPart(12)
createTagBody(2, {->
invokeTag('message','g',79,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',79,['controller':("registrationCode"),'action':("search")],2)
printHtmlPart(15)
if(true && (PluginManagerHolder.pluginManager.hasGrailsPlugin('springSecurityAcl'))) {
printHtmlPart(16)
invokeTag('message','g',81,['code':("spring.security.ui.menu.acl")],-1)
printHtmlPart(12)
invokeTag('message','g',83,['code':("spring.security.ui.menu.aclClass")],-1)
printHtmlPart(18)
createTagBody(3, {->
invokeTag('message','g',85,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',85,['controller':("aclClass"),'action':("search")],3)
printHtmlPart(19)
createTagBody(3, {->
invokeTag('message','g',86,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',86,['controller':("aclClass"),'action':("create")],3)
printHtmlPart(20)
invokeTag('message','g',89,['code':("spring.security.ui.menu.aclSid")],-1)
printHtmlPart(18)
createTagBody(3, {->
invokeTag('message','g',90,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',90,['controller':("aclSid"),'action':("search")],3)
printHtmlPart(19)
createTagBody(3, {->
invokeTag('message','g',92,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',92,['controller':("aclSid"),'action':("create")],3)
printHtmlPart(20)
invokeTag('message','g',93,['code':("spring.security.ui.menu.aclObjectIdentity")],-1)
printHtmlPart(18)
createTagBody(3, {->
invokeTag('message','g',97,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',97,['controller':("aclObjectIdentity"),'action':("search")],3)
printHtmlPart(19)
createTagBody(3, {->
invokeTag('message','g',100,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',100,['controller':("aclObjectIdentity"),'action':("create")],3)
printHtmlPart(20)
invokeTag('message','g',100,['code':("spring.security.ui.menu.aclEntry")],-1)
printHtmlPart(18)
createTagBody(3, {->
invokeTag('message','g',104,['code':("spring.security.ui.search")],-1)
})
invokeTag('link','g',104,['controller':("aclEntry"),'action':("search")],3)
printHtmlPart(19)
createTagBody(3, {->
invokeTag('message','g',106,['code':("spring.security.ui.create")],-1)
})
invokeTag('link','g',106,['controller':("aclEntry"),'action':("create")],3)
printHtmlPart(21)
}
printHtmlPart(16)
invokeTag('message','g',110,['code':("spring.security.ui.menu.appinfo")],-1)
printHtmlPart(22)
createTagBody(2, {->
invokeTag('message','g',112,['code':("spring.security.ui.menu.appinfo.config")],-1)
})
invokeTag('link','g',112,['action':("config"),'controller':("securityInfo")],2)
printHtmlPart(23)
createTagBody(2, {->
invokeTag('message','g',114,['code':("spring.security.ui.menu.appinfo.mappings")],-1)
})
invokeTag('link','g',114,['action':("mappings"),'controller':("securityInfo")],2)
printHtmlPart(23)
createTagBody(2, {->
invokeTag('message','g',116,['code':("spring.security.ui.menu.appinfo.auth")],-1)
})
invokeTag('link','g',116,['action':("currentAuth"),'controller':("securityInfo")],2)
printHtmlPart(23)
createTagBody(2, {->
invokeTag('message','g',120,['code':("spring.security.ui.menu.appinfo.usercache")],-1)
})
invokeTag('link','g',120,['action':("usercache"),'controller':("securityInfo")],2)
printHtmlPart(23)
createTagBody(2, {->
invokeTag('message','g',121,['code':("spring.security.ui.menu.appinfo.filters")],-1)
})
invokeTag('link','g',121,['action':("filterChain"),'controller':("securityInfo")],2)
printHtmlPart(23)
createTagBody(2, {->
invokeTag('message','g',124,['code':("spring.security.ui.menu.appinfo.logout")],-1)
})
invokeTag('link','g',124,['action':("logoutHandler"),'controller':("securityInfo")],2)
printHtmlPart(23)
createTagBody(2, {->
invokeTag('message','g',126,['code':("spring.security.ui.menu.appinfo.voters")],-1)
})
invokeTag('link','g',126,['action':("voters"),'controller':("securityInfo")],2)
printHtmlPart(23)
createTagBody(2, {->
invokeTag('message','g',127,['code':("spring.security.ui.menu.appinfo.providers")],-1)
})
invokeTag('link','g',127,['action':("providers"),'controller':("securityInfo")],2)
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(25)
invokeTag('username','sec',133,[:],-1)
printHtmlPart(26)
createClosureForHtmlPart(27, 3)
invokeTag('link','g',133,['controller':("logout")],3)
printHtmlPart(28)
})
invokeTag('ifLoggedIn','sec',133,[:],2)
printHtmlPart(17)
createClosureForHtmlPart(29, 2)
invokeTag('ifNotLoggedIn','sec',139,[:],2)
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(31)
expressionOut.print(request.contextPath)
printHtmlPart(32)
invokeTag('switchedUserOriginalUsername','sec',141,[:],-1)
printHtmlPart(33)
})
invokeTag('ifSwitched','sec',141,[:],2)
printHtmlPart(34)
invokeTag('layoutResources','s2ui',143,['module':("spring-security-ui")],-1)
printHtmlPart(17)
invokeTag('layoutBody','g',143,[:],-1)
printHtmlPart(35)
invokeTag('render','g',143,['template':("/includes/ajaxLogin"),'plugin':("spring-security-ui")],-1)
printHtmlPart(2)
invokeTag('showFlash','s2ui',144,[:],-1)
printHtmlPart(2)
})
invokeTag('captureBody','sitemesh',144,[:],1)
printHtmlPart(36)
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
