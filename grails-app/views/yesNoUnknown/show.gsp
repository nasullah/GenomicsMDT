
<%@ page import="genomicsmdt.YesNoUnknown" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'yesNoUnknown.label', default: 'Yes No Unknown')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-yesNoUnknown" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="yesNoUnknown.yesNoUnknownName.label" default="Yes No Unknown Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: yesNoUnknownInstance, field: "yesNoUnknownName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
