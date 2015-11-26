
<%@ page import="genomicsmdt.AttachedEvidence" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'attachedEvidence.label', default: 'Attached Evidence')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-attachedEvidence" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="attachedEvidence.referralRecord.label" default="Referral Record" /></td>
				
				<td valign="top" class="value"><g:link controller="referralRecord" action="show" id="${attachedEvidenceInstance?.referralRecord?.id}">${attachedEvidenceInstance?.referralRecord?.encodeAsHTML()}</g:link></td>
				
			</tr>

			<tr class="prop">
				<td valign="top" class="name">Added On</td>

				<td valign="top" class="value">${result?.familyHistory?.addedOn}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Anonymised</td>

				<td valign="top" class="value">${result?.familyHistory?.anonymised?.value}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Notes</td>

				<td valign="top" class="value">${result?.familyHistory?.notes}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Consanguinity</td>

				<td valign="top" class="value">${result?.familyHistory?.consanguinity?.value}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Consanguinity Details</td>

				<td valign="top" class="value">${result?.familyHistory?.consanguinityDetails}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">History Details</td>

				<td valign="top" class="value">${result?.familyHistory?.historyDetails}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Ethnicity Notes</td>

				<td valign="top" class="value">${result?.familyHistory?.ethnicityNotes}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Relation</td>

				<td valign="top" class="value">${result?.familialEthnicity?.relation?.value}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Condition</td>

				<td valign="top" class="value">${result?.historyItem?.condition?.value}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Present</td>

				<td valign="top" class="value">${result?.historyItem?.persent?.value}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Pedigree</td>

				<td valign="top" class="value">${result?.pedigree?.pedigree}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Pedigree Type</td>

				<td valign="top" class="value">${result?.pedigree?.pedigreeType}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Relation</td>

				<td valign="top" class="value">${result?.familialEthnicity?.relation?.value}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Ethnicity</td>

				<td valign="top" class="value">${result?.familialEthnicity?.ethnicity?.value}</td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name">Other Ethnicity</td>

				<td valign="top" class="value">${result?.familialEthnicity?.otherEthnicity}</td>

			</tr>

		</tbody>
	</table>
</section>

</body>

</html>
