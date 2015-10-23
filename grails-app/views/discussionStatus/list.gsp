
<%@ page import="genomicsmdt.DiscussionStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'discussionStatus.label', default: 'Discussion Status')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-discussionStatus" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="discussionStatusName" title="${message(code: 'discussionStatus.discussionStatusName.label', default: 'Discussion Status Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${discussionStatusInstanceList}" status="i" var="discussionStatusInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${discussionStatusInstance.id}">${fieldValue(bean: discussionStatusInstance, field: "discussionStatusName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${discussionStatusInstanceCount}" />
	</div>
</section>

</body>

</html>
