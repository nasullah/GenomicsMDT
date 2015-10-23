
<%@ page import="genomicsmdt.OutcomeStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'outcomeStatus.label', default: 'Outcome Status')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-outcomeStatus" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="outcomeStatus" title="${message(code: 'outcomeStatus.outcomeStatus.label', default: 'Outcome Status')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${outcomeStatusInstanceList}" status="i" var="outcomeStatusInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${outcomeStatusInstance.id}">${fieldValue(bean: outcomeStatusInstance, field: "outcomeStatus")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${outcomeStatusInstanceCount}" />
	</div>
</section>

</body>

</html>
