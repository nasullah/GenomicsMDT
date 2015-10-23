
<%@ page import="genomicsmdt.Ethnicity" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'ethnicity.label', default: 'Ethnicity')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-ethnicity" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="ethnicity.ethnicityName.label" default="Ethnicity Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: ethnicityInstance, field: "ethnicityName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
