
<%@ page import="genomicsmdt.OutcomeStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'outcomeStatus.label', default: 'Outcome Status')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-outcomeStatus" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="outcomeStatus.outcomeStatus.label" default="Outcome Status" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: outcomeStatusInstance, field: "outcomeStatus")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
