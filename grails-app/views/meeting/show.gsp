
<%@ page import="genomicsmdt.Meeting" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'meeting.label', default: 'Meeting')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-meeting" class="first">

	<table class="table">
		<tbody>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="meeting.mdt.label" default="MDT" /></td>

				<td valign="top" class="value"><g:link controller="MDT" action="show" id="${meetingInstance?.mdt?.id}">${meetingInstance?.mdt?.encodeAsHTML()}</g:link></td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="meeting.date.label" default="Date" /></td>
				
				<td valign="top" class="value"><g:formatDate format="yyyy-MM-dd" date="${meetingInstance?.date}" /></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="meeting.time.label" default="Time" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: meetingInstance, field: "time")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="meeting.duration.label" default="Duration" /></td>

				<td valign="top" class="value"><g:link controller="timeInterval" action="show" id="${meetingInstance?.duration?.id}">${meetingInstance?.duration?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="meeting.location.label" default="Location" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: meetingInstance, field: "location")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="meeting.status.label" default="Status" /></td>

				<td valign="top" class="value"><g:link controller="meetingStatus" action="show" id="${meetingInstance?.status?.id}">${meetingInstance?.status?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="meeting.minutes.label" default="Minutes" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: meetingInstance, field: "minutes")}</td>
				
			</tr>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="meeting.additionalPapers.label" default="Additional Papers" /></td>

				<td valign="top" class="value">${fieldValue(bean: meetingInstance, field: "additionalPapers")}</td>

			</tr>

			<g:if test="${meetingInstance?.attendenceRecords}">
				<tr class="prop">
					<td valign="top" class="name"><g:message code="meeting.attendenceRecords.label" default="Invited People" /></td>

					<td valign="top" style="text-align: left;" class="value">
						<ul>
							<g:each in="${meetingInstance.attendenceRecords}" var="a">
								<li><g:link controller="attendenceRecord" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
							</g:each>
						</ul>
					</td>

				</tr>
			</g:if>

			<g:if test="${meetingInstance?.discussionRecords}">
				<tr class="prop">
					<td valign="top" class="name"><g:message code="meeting.discussionRecords.label" default="Agenda Items" /></td>

					<td valign="top" style="text-align: left;" class="value">
						<ul>
							<g:each in="${meetingInstance.discussionRecords}" var="d">
								<li><g:link controller="discussionRecord" action="show" id="${d.id}">${d?.encodeAsHTML()}</g:link></li>
							</g:each>
						</ul>
					</td>

				</tr>
			</g:if>
		
		</tbody>
	</table>
</section>

<hr style="border:1; height:1px" />

<p class="text-primary">Available Actions</p>
<g:if test="${meetingInstance.status.toString() != 'Occurred'}">
	<a class='btn btn-primary btn-small' <g:link controller="attendenceRecord" action="createMultiple" params="['meeting': meetingInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Invite People </g:link>
	<a class='btn btn-primary btn-small' <g:link controller="discussionRecord" action="createMultiple" params="['meeting': meetingInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Add Agenda Items</g:link>
</g:if>
<hr style="border:1; height:1px" />

</body>

</html>
