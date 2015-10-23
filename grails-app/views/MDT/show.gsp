
<%@ page import="genomicsmdt.MDT" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'MDT.label', default: 'MDT')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-MDT" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="MDT.name.label" default="Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: MDTInstance, field: "name")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="MDT.email.label" default="Email" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: MDTInstance, field: "email")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="MDT.telephone.label" default="Telephone" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: MDTInstance, field: "telephone")}</td>
				
			</tr>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="MDT.notes.label" default="Notes" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: MDTInstance, field: "notes")}</td>
				
			</tr>


			<tr class="prop">
				<td valign="top" class="name"><g:message code="MDT.quorum.label" default="Quorum" /></td>

				<td valign="top" class="value">${fieldValue(bean: MDTInstance, field: "quorum")}</td>

			</tr>

			<g:if test="${MDTInstance?.members}">
				<tr class="prop">
					<td valign="top" class="name"><g:message code="meeting.discussionRecords.label" default="Members" /></td>

					<td valign="top" style="text-align: left;" class="value">
						<ul>
							<g:each in="${MDTInstance?.members}" var="m">
								<li><g:link controller="membership" action="show" id="${m.id}">${m?.encodeAsHTML()}</g:link></li>
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

<a class='btn btn-primary btn-small' <g:link controller="membership" action="create" params="['mdt.id': MDTInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Add Member</g:link>

<hr style="border:1; height:1px" />

</body>

</html>
