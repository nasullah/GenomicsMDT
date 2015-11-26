
<%@ page import="genomicsmdt.AttachedEvidence" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'attachedEvidence.label', default: 'Attached Evidence')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-attachedEvidence" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
		<tr>

			<th><g:message code="attachedEvidence.referralRecord.label" default="Referral Record" /></th>

			%{--<g:sortableColumn property="content" title="${message(code: 'attachedEvidence.content.label', default: 'Content')}" />--}%

		</tr>
		</thead>
		<tbody>
		<g:each in="${attachedEvidenceInstanceList}" status="i" var="attachedEvidenceInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

				<td><g:link action="show" id="${attachedEvidenceInstance.id}">${fieldValue(bean: attachedEvidenceInstance.referralRecord.patient, field: "familyName")}</g:link></td>

				%{--<td>${fieldValue(bean: attachedEvidenceInstance, field: "content")}</td>--}%

			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${attachedEvidenceInstanceCount}" />
	</div>
</section>

</body>

</html>
