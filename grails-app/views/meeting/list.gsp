
<%@ page import="genomicsmdt.Meeting" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'meeting.label', default: 'Meeting')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
	<r:require module="filterpane" />
</head>

<body>

<p>
<p>
<div style="background: rgba(80, 110, 56, 0.04);">
	<div class="container">
		<p>
		<h5 class="text-center">Search Options</h5>
		<p>
			<filterpane:filterButton text="Filter This List" />
			<filterpane:filterPane domain="genomicsmdt.Meeting"
								   excludeProperties="date"/>
		<p>
		<p>
	</div>
</div>

<section id="list-meeting" class="first">

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
		<bs:paginate total="${meetingInstanceTotal}" />
	</div>
</section>

</body>

</html>
