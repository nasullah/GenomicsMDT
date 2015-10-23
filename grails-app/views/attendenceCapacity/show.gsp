
<%@ page import="genomicsmdt.AttendenceCapacity" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'attendenceCapacity.label', default: 'Attendence Capacity')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-attendenceCapacity" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="attendenceCapacity.attendenceCapacity.label" default="Attendence Capacity" /></td>
				
				<td valign="top" class="value"><g:link controller="roleType" action="show" id="${attendenceCapacityInstance?.attendenceCapacity?.id}">${attendenceCapacityInstance?.attendenceCapacity?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="attendenceCapacity.attendenceRecord.label" default="Attendence Record" /></td>
				
				<td valign="top" class="value"><g:link controller="attendenceRecord" action="show" id="${attendenceCapacityInstance?.attendenceRecord?.id}">${attendenceCapacityInstance?.attendenceRecord?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
