
<%@ page import="genomicsmdt.Person" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'person.label', default: 'Person')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-person" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="name" title="${message(code: 'person.name.label', default: 'Name')}" />
			
				<g:sortableColumn property="email" title="${message(code: 'person.email.label', default: 'Email')}" />
			
				<g:sortableColumn property="telephone" title="${message(code: 'person.telephone.label', default: 'Telephone')}" />

				<g:sortableColumn property="nhsContract" title="${message(code: 'person.nhsContract.label', default: 'NHS Contract')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${personInstanceList}" status="i" var="personInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${personInstance.id}">${fieldValue(bean: personInstance, field: "name")}</g:link></td>
			
				<td>${fieldValue(bean: personInstance, field: "email")}</td>
			
				<td>${fieldValue(bean: personInstance, field: "telephone")}</td>

				<td><g:formatBoolean boolean="${personInstance.nhsContract}" false="No" true="Yes" /></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${personInstanceCount}" />
	</div>
</section>

</body>

</html>
