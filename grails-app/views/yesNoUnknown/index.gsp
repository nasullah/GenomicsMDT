
<%@ page import="genomicsmdt.YesNoUnknown" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'yesNoUnknown.label', default: 'Yes No Unknown')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-yesNoUnknown" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="yesNoUnknownName" title="${message(code: 'yesNoUnknown.yesNoUnknownName.label', default: 'Yes No Unknown Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${yesNoUnknownInstanceList}" status="i" var="yesNoUnknownInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${yesNoUnknownInstance.id}">${fieldValue(bean: yesNoUnknownInstance, field: "yesNoUnknownName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${yesNoUnknownInstanceCount}" />
	</div>
</section>

</body>

</html>
