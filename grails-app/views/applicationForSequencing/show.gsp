
<%@ page import="genomicsmdt.ApplicationForSequencing" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'applicationForSequencing.label', default: 'Application For Sequencing')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-applicationForSequencing" class="first">

	<table class="table">
		<tbody>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="applicationForSequencing.discussionRecord.label" default="Discussion Record" /></td>

				<td valign="top" class="value"><g:link controller="discussionRecord" action="show" id="${applicationForSequencingInstance?.discussionRecord?.id}">${applicationForSequencingInstance?.discussionRecord?.encodeAsHTML()}</g:link></td>

			</tr>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="applicationForSequencing.applicationStatus.label" default="Application Status" /></td>

				<td valign="top" class="value"><g:link controller="applicationStatus" action="show" id="${applicationForSequencingInstance?.applicationStatus?.id}">${applicationForSequencingInstance?.applicationStatus?.encodeAsHTML()}</g:link></td>
				
			</tr>
		
		</tbody>
	</table>
</section>

<hr style="border:1; height:1px" />

<p class="text-primary">Available Actions</p>

<a class='btn btn-primary btn-small' <g:link controller="correspondence" action="create" params="['applicationForSequencing.id': applicationForSequencingInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Add Correspondence</g:link>

<hr style="border:1; height:1px" />

</body>

</html>
