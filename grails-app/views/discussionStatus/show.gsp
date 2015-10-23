
<%@ page import="genomicsmdt.DiscussionStatus" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'discussionStatus.label', default: 'Discussion Status')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-discussionStatus" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="discussionStatus.discussionStatusName.label" default="Discussion Status Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: discussionStatusInstance, field: "discussionStatusName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
