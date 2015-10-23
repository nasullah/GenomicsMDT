
<%@ page import="genomicsmdt.Correspondence" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'correspondence.label', default: 'Correspondence')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-correspondence" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<th><g:message code="correspondence.applicationForSequencing.label" default="Application For Sequencing" /></th>
			
				<g:sortableColumn property="document" title="${message(code: 'correspondence.document.label', default: 'Document')}" />
			
				<g:sortableColumn property="date" title="${message(code: 'correspondence.date.label', default: 'Date')}" />
			
				<th><g:message code="correspondence.type.label" default="Type" /></th>
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${correspondenceInstanceList}" status="i" var="correspondenceInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${correspondenceInstance.id}">${fieldValue(bean: correspondenceInstance, field: "applicationForSequencing")}</g:link></td>
			
				<td>${fieldValue(bean: correspondenceInstance, field: "document")}</td>
			
				<td><g:formatDate date="${correspondenceInstance.date}" /></td>
			
				<td>${fieldValue(bean: correspondenceInstance, field: "type")}</td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${correspondenceInstanceCount}" />
	</div>
</section>

</body>

</html>
