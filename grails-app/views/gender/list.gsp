
<%@ page import="genomicsmdt.Gender" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'gender.label', default: 'Gender')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-gender" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="genderName" title="${message(code: 'gender.genderName.label', default: 'Gender Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${genderInstanceList}" status="i" var="genderInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${genderInstance.id}">${fieldValue(bean: genderInstance, field: "genderName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${genderInstanceCount}" />
	</div>
</section>

</body>

</html>
