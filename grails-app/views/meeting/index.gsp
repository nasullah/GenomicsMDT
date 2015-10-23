
<%@ page import="genomicsmdt.Meeting" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'meeting.label', default: 'Meeting')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-meeting" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="date" title="${message(code: 'meeting.date.label', default: 'Date')}" />
			
				<g:sortableColumn property="time" title="${message(code: 'meeting.time.label', default: 'Time')}" />
			
				<g:sortableColumn property="duration" title="${message(code: 'meeting.duration.label', default: 'Duration')}" />
			
				<g:sortableColumn property="location" title="${message(code: 'meeting.location.label', default: 'Location')}" />
			
				<g:sortableColumn property="status" title="${message(code: 'meeting.status.label', default: 'Status')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${meetingInstanceList}" status="i" var="meetingInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${meetingInstance.id}">${fieldValue(bean: meetingInstance, field: "date")}</g:link></td>
			
				<td>${fieldValue(bean: meetingInstance, field: "time")}</td>
			
				<td>${fieldValue(bean: meetingInstance, field: "duration")}</td>
			
				<td>${fieldValue(bean: meetingInstance, field: "location")}</td>
			
				<td>${fieldValue(bean: meetingInstance, field: "status")}</td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${meetingInstanceCount}" />
	</div>
</section>

</body>

</html>
