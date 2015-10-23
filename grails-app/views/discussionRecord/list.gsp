
<%@ page import="genomicsmdt.DiscussionRecord" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'discussionRecord.label', default: 'Discussion Record')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-discussionRecord" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<th><g:message code="discussionRecord.meeting.label" default="Meeting" /></th>
			
				<th><g:message code="discussionRecord.referralRecord.label" default="Referral Record" /></th>
			
				<g:sortableColumn property="status" title="${message(code: 'discussionRecord.status.label', default: 'Status')}" />
			
				<g:sortableColumn property="discussionSummary" title="${message(code: 'discussionRecord.discussionSummary.label', default: 'Discussion Summary')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${discussionRecordInstanceList}" status="i" var="discussionRecordInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${discussionRecordInstance.id}">${fieldValue(bean: discussionRecordInstance, field: "meeting")}</g:link></td>
			
				<td>${fieldValue(bean: discussionRecordInstance, field: "referralRecord")}</td>
			
				<td>${fieldValue(bean: discussionRecordInstance, field: "status")}</td>
			
				<td>${fieldValue(bean: discussionRecordInstance, field: "discussionSummary")}</td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${discussionRecordInstanceCount}" />
	</div>
</section>

</body>

</html>
