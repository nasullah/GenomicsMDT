
<%@ page import="genomicsmdt.TimeInterval" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'timeInterval.label', default: 'Time Interval')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-timeInterval" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="timeInterval.timeIntervalName.label" default="Time Interval Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: timeIntervalInstance, field: "timeIntervalName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
