
<%@ page import="genomicsmdt.OutcomeRecord" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'outcomeRecord.label', default: 'Outcome Record')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-outcomeRecord" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="outcomeRecord.patient.label" default="Patient" /></td>
				
				<td valign="top" class="value"><g:link controller="patient" action="show" id="${outcomeRecordInstance?.patient?.id}">${outcomeRecordInstance?.patient?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="outcomeRecord.outcomeDate.label" default="Outcome Date" /></td>
				
				<td valign="top" class="value"><g:formatDate format="yyyy-MM-dd" date="${outcomeRecordInstance?.outcomeDate}" /></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="outcomeRecord.outcome.label" default="Outcome" /></td>

				<td valign="top" class="value"><g:link controller="outcomeStatus" action="show" id="${outcomeRecordInstance?.outcome?.id}">${outcomeRecordInstance?.outcome?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="outcomeRecord.finalDiagnosis.label" default="Final Diagnosis" /></td>
				
				<td valign="top" class="value">${outcomeRecordInstance?.finalDiagnosis?.encodeAsHTML()}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="outcomeRecord.outcomeNotes.label" default="Outcome Notes" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: outcomeRecordInstance, field: "outcomeNotes")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="outcomeRecord.sequenceReceivedOn.label" default="Sequence Received On" /></td>
				
				<td valign="top" class="value"><g:formatDate format="yyyy-MM-dd" date="${outcomeRecordInstance?.sequenceReceivedOn}" /></td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
