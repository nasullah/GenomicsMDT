
<%@ page import="genomicsmdt.Correspondence" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'correspondence.label', default: 'Correspondence')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-correspondence" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="correspondence.applicationForSequencing.label" default="Application For Sequencing" /></td>
				
				<td valign="top" class="value"><g:link controller="applicationForSequencing" action="show" id="${correspondenceInstance?.applicationForSequencing?.id}">${correspondenceInstance?.applicationForSequencing?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="correspondence.document.label" default="Document" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: correspondenceInstance, field: "document")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="correspondence.date.label" default="Date" /></td>
				
				<td valign="top" class="value"><g:formatDate date="${correspondenceInstance?.date}" /></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="correspondence.type.label" default="Type" /></td>
				
				<td valign="top" class="value"><g:link controller="correspondenceType" action="show" id="${correspondenceInstance?.type?.id}">${correspondenceInstance?.type?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
