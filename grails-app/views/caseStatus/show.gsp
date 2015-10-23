
<%@ page import="genomicsmdt.CaseStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'caseStatus.label', default: 'Case Status')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-caseStatus" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="caseStatus.caseStatusName.label" default="Case Status Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: caseStatusInstance, field: "caseStatusName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
