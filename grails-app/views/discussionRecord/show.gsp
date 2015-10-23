
<%@ page import="genomicsmdt.DiscussionRecord" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'discussionRecord.label', default: 'Discussion Record')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-discussionRecord" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="discussionRecord.meeting.label" default="Meeting" /></td>
				
				<td valign="top" class="value"><g:link controller="meeting" action="show" id="${discussionRecordInstance?.meeting?.id}">${discussionRecordInstance?.meeting?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="discussionRecord.referralRecord.label" default="Referral Record" /></td>
				
				<td valign="top" class="value"><g:link controller="referralRecord" action="show" id="${discussionRecordInstance?.referralRecord?.id}">${discussionRecordInstance?.referralRecord?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="discussionRecord.status.label" default="Status" /></td>

				<td valign="top" class="value"><g:link controller="discussionStatus" action="show" id="${discussionRecordInstance?.status?.id}">${discussionRecordInstance?.status?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="discussionRecord.discussionSummary.label" default="Discussion Summary" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: discussionRecordInstance, field: "discussionSummary")}</td>
				
			</tr>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="discussionRecord.approvalToInform.label" default="Approval To Inform" /></td>

				<td valign="top" class="value"><g:formatBoolean boolean="${discussionRecordInstance?.approvalToInform}" false="No" true="Yes" /></td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="discussionRecord.correspondence.label" default="Correspondence" /></td>

				<td valign="top" class="value">${fieldValue(bean: discussionRecordInstance, field: "correspondence")}</td>

			</tr>

			<g:if test="${discussionRecord?.applicationForSequencing}">
				<tr class="prop">
					<td valign="top" class="name"><g:message code="discussionRecord.applicationForSequencing.label" default="Application For Sequencing" /></td>

					<td valign="top" style="text-align: left;" class="value">
						<ul>
							<g:each in="${discussionRecord?.applicationForSequencing}" var="a">
								<li><g:link controller="applicationForSequencing" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
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

<a class='btn btn-primary btn-small' <g:link controller="applicationForSequencing" action="create" params="['discussionRecord.id': discussionRecordInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Application For Sequencing</g:link>

<hr style="border:1; height:1px" />

</body>

</html>
