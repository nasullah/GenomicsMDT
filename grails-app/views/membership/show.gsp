
<%@ page import="genomicsmdt.Membership" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'membership.label', default: 'Membership')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-membership" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="membership.mdt.label" default="MDT" /></td>
				
				<td valign="top" class="value"><g:link controller="MDT" action="show" id="${membershipInstance?.mdt?.id}">${membershipInstance?.mdt?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="membership.person.label" default="Person" /></td>
				
				<td valign="top" class="value"><g:link controller="person" action="show" id="${membershipInstance?.person?.id}">${membershipInstance?.person?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="membership.role.label" default="Role" /></td>

				<td valign="top" class="value"><g:link controller="roleType" action="show" id="${membershipInstance?.role?.id}">${membershipInstance?.role?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="membership.status.label" default="Status" /></td>

				<td valign="top" class="value"><g:link controller="membershipStatus" action="show" id="${membershipInstance?.status?.id}">${membershipInstance?.status?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
