
<%@ page import="genomicsmdt.Form" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'form.label', default: 'Form')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-form" class="first">

	<table class="table">
		<tbody>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="form.mdt.label" default="Mdt" /></td>

				<td valign="top" style="text-align: left;" class="value">
					<ul>
						<g:each in="${formInstance.mdt}" var="m">
							<li><g:link controller="MDT" action="show" id="${m.id}">${m?.encodeAsHTML()}</g:link></li>
						</g:each>
					</ul>
				</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="form.formTitle.label" default="Form Title" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: formInstance, field: "formTitle")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="form.componentName.label" default="Component Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: formInstance, field: "componentName")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="form.referral.label" default="Referral" /></td>
				
				<td valign="top" class="value"><g:formatBoolean boolean="${formInstance?.referral}" true="Yes" false="No" /></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="form.discussion.label" default="Discussion" /></td>
				
				<td valign="top" class="value"><g:formatBoolean boolean="${formInstance?.discussion}" true="Yes" false="No"/></td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
