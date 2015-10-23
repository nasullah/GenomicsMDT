
<%@ page import="genomicsmdt.ReferralRecord" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'referralRecord.label', default: 'Referral Record')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-referralRecord" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<th><g:message code="referralRecord.patient.label" default="Patient" /></th>
			
				<th><g:message code="referralRecord.person.label" default="Person" /></th>
			
				<g:sortableColumn property="referralDate" title="${message(code: 'referralRecord.referralDate.label', default: 'Referral Date')}" />

				<g:sortableColumn property="caseStatus" title="${message(code: 'referralRecord.caseStatus.label', default: 'Case Status')}" />

			</tr>
		</thead>
		<tbody>
		<g:each in="${referralRecordInstanceList}" status="i" var="referralRecordInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${referralRecordInstance.id}">${fieldValue(bean: referralRecordInstance?.patient, field: "familyName")}</g:link></td>
			
				<td>${fieldValue(bean: referralRecordInstance?.person, field: "name")}</td>
			
				<td><g:formatDate format="yyyy-MM-dd" date="${referralRecordInstance.referralDate}" /></td>

				<td>${fieldValue(bean: referralRecordInstance, field: "caseStatus")}</td>

			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${referralRecordInstanceCount}" />
	</div>
</section>

</body>

</html>
