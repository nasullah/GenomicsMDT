
<%@ page import="genomicsmdt.Ethnicity" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'ethnicity.label', default: 'Ethnicity')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-ethnicity" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="ethnicityName" title="${message(code: 'ethnicity.ethnicityName.label', default: 'Ethnicity Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${ethnicityInstanceList}" status="i" var="ethnicityInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${ethnicityInstance.id}">${fieldValue(bean: ethnicityInstance, field: "ethnicityName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${ethnicityInstanceCount}" />
	</div>
</section>

</body>

</html>
