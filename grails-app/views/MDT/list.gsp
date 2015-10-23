
<%@ page import="genomicsmdt.MDT" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'MDT.label', default: 'MDT')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
	<r:require module="filterpane" />
</head>

<body>

<p>
<p>
<div style="background: rgba(80, 110, 56, 0.04);">
	<div class="container">
		<p>
		<h5 class="text-center">Search Options</h5>
		<p>
			<filterpane:filterButton text="Filter This List" />
			<filterpane:filterPane domain="genomicsmdt.MDT"/>
		<p>
		<p>
	</div>
</div>

<section id="list-MDT" class="first">

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
		<bs:paginate total="${MDTInstanceTotal}" />
	</div>
</section>

</body>

</html>
