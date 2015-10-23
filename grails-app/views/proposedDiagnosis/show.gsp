
<%@ page import="genomicsmdt.ProposedDiagnosis" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'proposedDiagnosis.label', default: 'Proposed Diagnosis')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-proposedDiagnosis" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="proposedDiagnosis.referralRecord.label" default="Referral Record" /></td>
				
				<td valign="top" class="value"><g:link controller="referralRecord" action="show" id="${proposedDiagnosisInstance?.referralRecord?.id}">${proposedDiagnosisInstance?.referralRecord?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="proposedDiagnosis.proposedDiagnosis.label" default="Proposed Diagnosis" /></td>
				
				<td valign="top" class="value"><g:link controller="OMIM_Term" action="show" id="${proposedDiagnosisInstance?.proposedDiagnosis?.id}">${proposedDiagnosisInstance?.proposedDiagnosis?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
