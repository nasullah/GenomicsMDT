
<%@ page import="genomicsmdt.AttendenceRecord" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'attendenceRecord.label', default: 'Attendence Record')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-attendenceRecord" class="first">

	<table class="table">
		<tbody>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="attendenceRecord.meeting.label" default="Meeting" /></td>

				<td valign="top" class="value"><g:link controller="meeting" action="show" id="${attendenceRecordInstance?.meeting?.id}">${attendenceRecordInstance?.meeting?.encodeAsHTML()}</g:link></td>

			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="attendenceRecord.invitedOn.label" default="Invited On" /></td>
				
				<td valign="top" class="value"><g:formatDate format="yyyy-MM-dd" date="${attendenceRecordInstance?.invitedOn}" /></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="attendenceRecord.repliedOn.label" default="Replied On" /></td>
				
				<td valign="top" class="value"><g:formatDate format="yyyy-MM-dd" date="${attendenceRecordInstance?.repliedOn}" /></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="attendenceRecord.status.label" default="Status" /></td>

				<td valign="top" class="value"><g:link controller="attendenceStatus" action="show" id="${attendenceRecordInstance?.status?.id}">${attendenceRecordInstance?.status?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="attendenceRecord.person.label" default="Person" /></td>
				
				<td valign="top" class="value"><g:link controller="person" action="show" id="${attendenceRecordInstance?.person?.id}">${attendenceRecordInstance?.person?.encodeAsHTML()}</g:link></td>
				
			</tr>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="attendenceRecord.attendenceCapacity.label" default="Attendence Capacity" /></td>

				<td valign="top" style="text-align: left;" class="value">
					<ul>
						<g:each in="${attendenceRecordInstance.attendenceCapacity}" var="a">
							<li><g:link controller="attendenceCapacity" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
						</g:each>
					</ul>
				</td>

			</tr>
		
		</tbody>
	</table>
</section>

<hr style="border:1; height:1px" />

<p class="text-primary">Available Actions</p>

<a class='btn btn-primary btn-small' <g:link controller="attendenceCapacity" action="create" params="['attendenceRecord.id': attendenceRecordInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Add Attendence Capacity </g:link>

<hr style="border:1; height:1px" />

</body>

</html>
