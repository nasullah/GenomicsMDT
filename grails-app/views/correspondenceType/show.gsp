
<%@ page import="genomicsmdt.CorrespondenceType" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'correspondenceType.label', default: 'Correspondence Type')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-correspondenceType" class="first">

	<table class="table">
		<tbody>
		
			<tr class="prop">
				<td valign="top" class="name"><g:message code="correspondenceType.correspondenceTypeName.label" default="Correspondence Type Name" /></td>
				
				<td valign="top" class="value">${fieldValue(bean: correspondenceTypeInstance, field: "correspondenceTypeName")}</td>
				
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
