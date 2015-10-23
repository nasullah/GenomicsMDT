
<%@ page import="genomicsmdt.RoleType" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'roleType.label', default: 'Role Type')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-roleType" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="roleType.roleTypeName.label" default="Role Type Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: roleTypeInstance, field: "roleTypeName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
