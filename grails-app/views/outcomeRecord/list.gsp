
<%@ page import="genomicsmdt.OutcomeRecord" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'outcomeRecord.label', default: 'Outcome Record')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-outcomeRecord" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<th><g:message code="outcomeRecord.referralRecord.label" default="Referral Record" /></th>
			
				<g:sortableColumn property="outcomeDate" title="${message(code: 'outcomeRecord.outcomeDate.label', default: 'Outcome Date')}" />
			
				<g:sortableColumn property="outcome" title="${message(code: 'outcomeRecord.outcome.label', default: 'Outcome')}" />
			
				<g:sortableColumn property="finalDiagnosis" title="${message(code: 'outcomeRecord.finalDiagnosis.label', default: 'Final Diagnosis')}" />

				<g:sortableColumn property="sequenceReceivedOn" title="${message(code: 'outcomeRecord.sequenceReceivedOn.label', default: 'Sequence Received On')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${outcomeRecordInstanceList}" status="i" var="outcomeRecordInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${outcomeRecordInstance.id}">${fieldValue(bean: outcomeRecordInstance, field: "referralRecord")}</g:link></td>
			
				<td><g:formatDate format="yyyy-MM-dd" date="${outcomeRecordInstance.outcomeDate}" /></td>
			
				<td>${fieldValue(bean: outcomeRecordInstance, field: "outcome")}</td>
			
				<td>${fieldValue(bean: outcomeRecordInstance, field: "finalDiagnosis")}</td>

				<td><g:formatDate format="yyyy-MM-dd" date="${outcomeRecordInstance.sequenceReceivedOn}" /></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${outcomeRecordInstanceCount}" />
	</div>
</section>

</body>

</html>
