
<%@ page import="genomicsmdt.MDT" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'MDT.label', default: 'MDT')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-MDT" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="name" title="${message(code: 'MDT.name.label', default: 'Name')}" />
			
				<g:sortableColumn property="email" title="${message(code: 'MDT.email.label', default: 'Email')}" />
			
				<g:sortableColumn property="telephone" title="${message(code: 'MDT.telephone.label', default: 'Telephone')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${MDTInstanceList}" status="i" var="MDTInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${MDTInstance.id}">${fieldValue(bean: MDTInstance, field: "name")}</g:link></td>
			
				<td>${fieldValue(bean: MDTInstance, field: "email")}</td>
			
				<td>${fieldValue(bean: MDTInstance, field: "telephone")}</td>

			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${MDTInstanceCount}" />
	</div>
</section>

</body>

</html>
