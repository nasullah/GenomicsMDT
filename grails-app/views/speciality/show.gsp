
<%@ page import="genomicsmdt.Speciality" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'speciality.label', default: 'Speciality')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-speciality" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="speciality.person.label" default="Person" /></td>
				
				<td valign="top" class="value"><g:link controller="person" action="show" id="${specialityInstance?.person?.id}">${specialityInstance?.person?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="speciality.speciality.label" default="Speciality" /></td>
				
				<td valign="top" class="value"><g:link controller="OMIM_Term" action="show" id="${specialityInstance?.speciality?.id}">${specialityInstance?.speciality?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
