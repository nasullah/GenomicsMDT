
<%@ page import="genomicsmdt.ProposedDiagnosis" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'proposedDiagnosis.label', default: 'Proposed Diagnosis')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-proposedDiagnosis" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<th><g:message code="proposedDiagnosis.referralRecord.label" default="Referral Record" /></th>
			
				<th><g:message code="proposedDiagnosis.proposedDiagnosis.label" default="Proposed Diagnosis" /></th>
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${proposedDiagnosisInstanceList}" status="i" var="proposedDiagnosisInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${proposedDiagnosisInstance.id}">${fieldValue(bean: proposedDiagnosisInstance, field: "referralRecord")}</g:link></td>
			
				<td>${fieldValue(bean: proposedDiagnosisInstance, field: "proposedDiagnosis")}</td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${proposedDiagnosisInstanceCount}" />
	</div>
</section>

</body>

</html>
