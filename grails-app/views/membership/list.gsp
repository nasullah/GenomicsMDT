
<%@ page import="genomicsmdt.Membership" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'membership.label', default: 'Membership')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-membership" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<th><g:message code="membership.mdt.label" default="Mdt" /></th>
			
				<th><g:message code="membership.person.label" default="Person" /></th>
			
				<g:sortableColumn property="role" title="${message(code: 'membership.role.label', default: 'Role')}" />
			
				<g:sortableColumn property="status" title="${message(code: 'membership.status.label', default: 'Status')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${membershipInstanceList}" status="i" var="membershipInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${membershipInstance.id}">${fieldValue(bean: membershipInstance, field: "mdt")}</g:link></td>
			
				<td>${fieldValue(bean: membershipInstance, field: "person")}</td>
			
				<td>${fieldValue(bean: membershipInstance, field: "role")}</td>
			
				<td>${fieldValue(bean: membershipInstance, field: "status")}</td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${membershipInstanceCount}" />
	</div>
</section>

</body>

</html>
