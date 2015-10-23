
<%@ page import="genomicsmdt.MembershipStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'membershipStatus.label', default: 'Membership Status')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-membershipStatus" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="membershipStatusName" title="${message(code: 'membershipStatus.membershipStatusName.label', default: 'Membership Status Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${membershipStatusInstanceList}" status="i" var="membershipStatusInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${membershipStatusInstance.id}">${fieldValue(bean: membershipStatusInstance, field: "membershipStatusName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${membershipStatusInstanceCount}" />
	</div>
</section>

</body>

</html>
