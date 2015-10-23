
<%@ page import="genomicsmdt.MeetingStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'meetingStatus.label', default: 'Meeting Status')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-meetingStatus" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="meetingStatus.meetingStatusName.label" default="Meeting Status Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: meetingStatusInstance, field: "meetingStatusName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
