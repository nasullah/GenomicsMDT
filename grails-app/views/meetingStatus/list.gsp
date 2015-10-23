
<%@ page import="genomicsmdt.MeetingStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'meetingStatus.label', default: 'Meeting Status')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-meetingStatus" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="meetingStatusName" title="${message(code: 'meetingStatus.meetingStatusName.label', default: 'Meeting Status Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${meetingStatusInstanceList}" status="i" var="meetingStatusInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${meetingStatusInstance.id}">${fieldValue(bean: meetingStatusInstance, field: "meetingStatusName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${meetingStatusInstanceCount}" />
	</div>
</section>

</body>

</html>
