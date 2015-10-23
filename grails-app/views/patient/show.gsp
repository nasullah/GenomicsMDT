
<%@ page import="genomicsmdt.Patient" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'patient.label', default: 'Patient')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-patient" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="patient.givenName.label" default="Given Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: patientInstance, field: "givenName")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="patient.familyName.label" default="Family Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: patientInstance, field: "familyName")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="patient.nhsNumber.label" default="NHS Number" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: patientInstance, field: "nhsNumber")}</td>
				
			</tr>


			<tr class="prop">
				<td valign="top" class="name"><g:message code="patient.dateOfBirth.label" default="Date Of Birth" /></td>

				<td valign="top" class="value"><g:formatDate format="yyyy-MM-dd" date="${patientInstance?.dateOfBirth}" /></td>

			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="patient.mrn.label" default="MRN" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: patientInstance, field: "mrn")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="patient.familyNumber.label" default="Family Number" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: patientInstance, field: "familyNumber")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="patient.otherIdentifier.label" default="Other Identifier" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: patientInstance, field: "otherIdentifier")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="patient.gender.label" default="Gender" /></td>

				<td valign="top" class="value"><g:link controller="gender" action="show" id="${attendenceRecordInstance?.gender?.id}">${attendenceRecordInstance?.gender?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="patient.ethnicity.label" default="Ethnicity" /></td>

				<td valign="top" class="value"><g:link controller="ethnicity" action="show" id="${attendenceRecordInstance?.ethnicity?.id}">${attendenceRecordInstance?.ethnicity?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="patient.otherEthnicity.label" default="Other Ethnicity" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: patientInstance, field: "otherEthnicity")}</td>
				
			</tr>

			<g:if test="${patientInstance.referralRecords}">
				<tr class="prop">
					<td valign="top" class="name"><g:message code="patient.referralRecords.label" default="Referral Records" /></td>

					<td valign="top" style="text-align: left;" class="value">
						<ul>
						<g:each in="${patientInstance.referralRecords}" var="r">
							<li><g:link controller="referralRecord" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></li>
						</g:each>
						</ul>
					</td>

				</tr>
			</g:if>

			<g:if test="${patientInstance.outcomeRecord}">
				<tr class="prop">
					<td valign="top" class="name"><g:message code="patient.outcomeRecord.label" default="Outcome Record" /></td>

					<td valign="top" class="value"><g:link controller="outcomeRecord" action="show" id="${patientInstance?.outcomeRecord?.id}">${patientInstance?.outcomeRecord?.encodeAsHTML()}</g:link></td>

				</tr>
			</g:if>
		</tbody>
	</table>
</section>

<hr style="border:1; height:1px" />

<p class="text-primary">Available Actions</p>

<a class='btn btn-primary btn-small' <g:link controller="referralRecord" action="create" params="['patient.id': patientInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Refer this patient</g:link>

<g:if test="${!patientInstance?.outcomeRecord}">
	<a class='btn btn-primary btn-small' <g:link controller="outcomeRecord" action="create" params="['patient.id': patientInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Add Outcome Record</g:link>
</g:if>

<hr style="border:1; height:1px" />

</body>

</html>
