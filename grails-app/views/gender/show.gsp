
<%@ page import="genomicsmdt.Gender" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'gender.label', default: 'Gender')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-gender" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="gender.genderName.label" default="Gender Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: genderInstance, field: "genderName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
