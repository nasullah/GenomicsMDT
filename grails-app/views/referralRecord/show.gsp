
<%@ page import="genomicsmdt.ReferralRecord" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'referralRecord.label', default: 'Referral Record')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-referralRecord" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="referralRecord.patient.label" default="Patient" /></td>
				
				<td valign="top" class="value"><g:link controller="patient" action="show" id="${referralRecordInstance?.patient?.id}">${referralRecordInstance?.patient?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="referralRecord.person.label" default="Person" /></td>
				
				<td valign="top" class="value"><g:link controller="person" action="show" id="${referralRecordInstance?.person?.id}">${referralRecordInstance?.person?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="referralRecord.referralDate.label" default="Referral Date" /></td>
				
				<td valign="top" class="value"><g:formatDate format="yyyy-MM-dd" date="${referralRecordInstance?.referralDate}" /></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="referralRecord.descriptionOfDisorder.label" default="Description Of Disorder" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: referralRecordInstance, field: "descriptionOfDisorder")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="referralRecord.caseStatus.label" default="Case Status" /></td>

				<td valign="top" class="value"><g:link controller="caseStatus" action="show" id="${referralRecordInstance?.caseStatus?.id}">${referralRecordInstance?.caseStatus?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="referralRecord.potentialBenefits.label" default="Potential Benefits" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: referralRecordInstance, field: "potentialBenefits")}</td>
				
			</tr>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="referralRecord.numberOfSamples.label" default="Number of Samples" /></td>

				<td valign="top" class="value">${fieldValue(bean: referralRecordInstance, field: "numberOfSamples")}</td>

			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="referralRecord.preferredProgram.label" default="Preferred Program" /></td>
				
				<td valign="top" class="value"><g:link controller="program" action="show" id="${referralRecordInstance?.preferredProgram?.id}">${referralRecordInstance?.preferredProgram?.encodeAsHTML()}</g:link></td>
				
			</tr>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="referralRecord.mdt.label" default="MDT" /></td>

				<td valign="top" class="value"><g:link controller="MDT" action="show" id="${referralRecordInstance?.mdt?.id}">${referralRecordInstance?.mdt?.encodeAsHTML()}</g:link></td>

			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="referralRecord.proposedDiagnosis.label" default="Proposed Diagnosis" /></td>
				
				<td valign="top" style="text-align: left;" class="value">
					<ul>
					<g:each in="${referralRecordInstance.proposedDiagnosis}" var="p">
						<li><g:link controller="proposedDiagnosis" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
					</g:each>
					</ul>
				</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

<hr style="border:1; height:1px" />

<p class="text-primary">Available Actions</p>

<a class='btn btn-primary btn-small' <g:link controller="proposedDiagnosis" action="create" params="['referralRecord.id': referralRecordInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Add Proposed Diagnosis</g:link>

<hr style="border:1; height:1px" />

</body>

</html>
