
<%@ page import="genomicsmdt.AttendenceStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'attendenceStatus.label', default: 'Attendence Status')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-attendenceStatus" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="attendenceStatus.attendenceStatusName.label" default="Attendence Status Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: attendenceStatusInstance, field: "attendenceStatusName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
