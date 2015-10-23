
<%@ page import="genomicsmdt.Speciality" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'speciality.label', default: 'Speciality')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-speciality" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<th><g:message code="speciality.person.label" default="Person" /></th>
			
				<th><g:message code="speciality.speciality.label" default="Speciality" /></th>
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${specialityInstanceList}" status="i" var="specialityInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${specialityInstance.id}">${fieldValue(bean: specialityInstance, field: "person")}</g:link></td>
			
				<td>${fieldValue(bean: specialityInstance, field: "speciality")}</td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${specialityInstanceCount}" />
	</div>
</section>

</body>

</html>
