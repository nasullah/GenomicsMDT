
<%@ page import="genomicsmdt.ApplicationForSequencing" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'applicationForSequencing.label', default: 'Application For Sequencing')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-applicationForSequencing" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
		<tr>

			<g:sortableColumn property="applicationStatus" title="${message(code: 'applicationForSequencing.applicationStatus.label', default: 'Application Status')}" />

			<th><g:message code="applicationForSequencing.discussionRecord.label" default="Discussion Record" /></th>

		</tr>
		</thead>
		<tbody>
		<g:each in="${applicationForSequencingInstanceList}" status="i" var="applicationForSequencingInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

				<td><g:link action="show" id="${applicationForSequencingInstance.id}">${fieldValue(bean: applicationForSequencingInstance, field: "applicationStatus")}</g:link></td>

				<td>${fieldValue(bean: applicationForSequencingInstance, field: "discussionRecord")}</td>

			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${applicationForSequencingInstanceCount}" />
	</div>
</section>

</body>

</html>
