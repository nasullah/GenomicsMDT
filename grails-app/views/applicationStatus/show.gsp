
<%@ page import="genomicsmdt.ApplicationStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'applicationStatus.label', default: 'Application Status')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-applicationStatus" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="applicationStatus.applicationStatusName.label" default="Application Status Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: applicationStatusInstance, field: "applicationStatusName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
