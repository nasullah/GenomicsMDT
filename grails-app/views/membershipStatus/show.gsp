
<%@ page import="genomicsmdt.MembershipStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'membershipStatus.label', default: 'Membership Status')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-membershipStatus" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="membershipStatus.membershipStatusName.label" default="Membership Status Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: membershipStatusInstance, field: "membershipStatusName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
