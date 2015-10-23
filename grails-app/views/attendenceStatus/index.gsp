
<%@ page import="genomicsmdt.AttendenceStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'attendenceStatus.label', default: 'Attendence Status')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-attendenceStatus" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="attendenceStatusName" title="${message(code: 'attendenceStatus.attendenceStatusName.label', default: 'Attendence Status Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${attendenceStatusInstanceList}" status="i" var="attendenceStatusInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${attendenceStatusInstance.id}">${fieldValue(bean: attendenceStatusInstance, field: "attendenceStatusName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${attendenceStatusInstanceCount}" />
	</div>
</section>

</body>

</html>
