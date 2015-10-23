
<%@ page import="genomicsmdt.ApplicationStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'applicationStatus.label', default: 'Application Status')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-applicationStatus" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="applicationStatusName" title="${message(code: 'applicationStatus.applicationStatusName.label', default: 'Application Status Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${applicationStatusInstanceList}" status="i" var="applicationStatusInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${applicationStatusInstance.id}">${fieldValue(bean: applicationStatusInstance, field: "applicationStatusName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${applicationStatusInstanceCount}" />
	</div>
</section>

</body>

</html>
