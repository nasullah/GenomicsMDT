
<%@ page import="genomicsmdt.Person" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'person.label', default: 'Person')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-person" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="person.name.label" default="Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: personInstance, field: "name")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="person.email.label" default="Email" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: personInstance, field: "email")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="person.telephone.label" default="Telephone" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: personInstance, field: "telephone")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="person.notes.label" default="Notes" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: personInstance, field: "notes")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="person.nhsContract.label" default="NHS Contract" /></td>
				
				<td valign="top" class="value"><g:formatBoolean boolean="${personInstance?.nhsContract}" false="No" true="Yes" /></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="person.specialities.label" default="Specialities" /></td>
				
				<td valign="top" style="text-align: left;" class="value">
					<ul>
					<g:each in="${personInstance.specialities}" var="s">
						<li><g:link controller="speciality" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></li>
					</g:each>
					</ul>
				</td>
				
			</tr>

			<g:if test="${personInstance.referralRecord}">
				<tr class="prop">
					<td valign="top" class="name"><g:message code="patient.referralRecords.label" default="Referral Records" /></td>

					<td valign="top" style="text-align: left;" class="value">
						<ul>
							<g:each in="${personInstance.referralRecord}" var="r">
								<li><g:link controller="referralRecord" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></li>
							</g:each>
						</ul>
					</td>

				</tr>
			</g:if>
		
		</tbody>
	</table>
</section>

<hr style="border:1; height:1px" />

<p class="text-primary">Available Actions</p>

<a class='btn btn-primary btn-small' <g:link controller="speciality" action="create" params="['person.id': personInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Add Speciality</g:link>

<a class='btn btn-primary btn-small' <g:link controller="referralRecord" action="create" params="['person.id': personInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Add Referral Record</g:link>

<hr style="border:1; height:1px" />

</body>

</html>
