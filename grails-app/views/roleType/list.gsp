
<%@ page import="genomicsmdt.RoleType" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'roleType.label', default: 'Role Type')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-roleType" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="roleTypeName" title="${message(code: 'roleType.roleTypeName.label', default: 'Role Type Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${roleTypeInstanceList}" status="i" var="roleTypeInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${roleTypeInstance.id}">${fieldValue(bean: roleTypeInstance, field: "roleTypeName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${roleTypeInstanceCount}" />
	</div>
</section>

</body>

</html>
