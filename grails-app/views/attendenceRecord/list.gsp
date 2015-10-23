
<%@ page import="genomicsmdt.AttendenceRecord" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'attendenceRecord.label', default: 'Attendence Record')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-attendenceRecord" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="attendenceCapacity" title="${message(code: 'attendenceRecord.attendenceCapacity.label', default: 'Attendence Capacity')}" />
			
				<g:sortableColumn property="invitedOn" title="${message(code: 'attendenceRecord.invitedOn.label', default: 'Invited On')}" />
			
				<g:sortableColumn property="repliedOn" title="${message(code: 'attendenceRecord.repliedOn.label', default: 'Replied On')}" />
			
				<g:sortableColumn property="status" title="${message(code: 'attendenceRecord.status.label', default: 'Status')}" />
			
				<th><g:message code="attendenceRecord.meeting.label" default="Meeting" /></th>
			
				<th><g:message code="attendenceRecord.person.label" default="Person" /></th>
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${attendenceRecordInstanceList}" status="i" var="attendenceRecordInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${attendenceRecordInstance.id}">${fieldValue(bean: attendenceRecordInstance, field: "attendenceCapacity")}</g:link></td>
			
				<td><g:formatDate format="yyyy-MM-dd" date="${attendenceRecordInstance.invitedOn}" /></td>
			
				<td><g:formatDate format="yyyy-MM-dd" date="${attendenceRecordInstance.repliedOn}" /></td>
			
				<td>${fieldValue(bean: attendenceRecordInstance, field: "status")}</td>
			
				<td>${fieldValue(bean: attendenceRecordInstance, field: "meeting")}</td>
			
				<td>${fieldValue(bean: attendenceRecordInstance, field: "person")}</td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${attendenceRecordInstanceCount}" />
	</div>
</section>

</body>

</html>
