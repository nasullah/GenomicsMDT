
<%@ page import="genomicsmdt.CaseStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'caseStatus.label', default: 'Case Status')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-caseStatus" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="caseStatusName" title="${message(code: 'caseStatus.caseStatusName.label', default: 'Case Status Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${caseStatusInstanceList}" status="i" var="caseStatusInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${caseStatusInstance.id}">${fieldValue(bean: caseStatusInstance, field: "caseStatusName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${caseStatusInstanceCount}" />
	</div>
</section>

</body>

</html>
