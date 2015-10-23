
<%@ page import="genomicsmdt.AttendenceCapacity" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'attendenceCapacity.label', default: 'Attendence Capacity')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-attendenceCapacity" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<th><g:message code="attendenceCapacity.attendenceCapacity.label" default="Attendence Capacity" /></th>
			
				<th><g:message code="attendenceCapacity.attendenceRecord.label" default="Attendence Record" /></th>
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${attendenceCapacityInstanceList}" status="i" var="attendenceCapacityInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${attendenceCapacityInstance.id}">${fieldValue(bean: attendenceCapacityInstance, field: "attendenceCapacity")}</g:link></td>
			
				<td>${fieldValue(bean: attendenceCapacityInstance, field: "attendenceRecord")}</td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${attendenceCapacityInstanceCount}" />
	</div>
</section>

</body>

</html>
