
<%@ page import="genomicsmdt.OMIM_Term" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'OMIM_Term.label', default: 'OMIM Term')}" />
	<title><g:message code="default.show.label" args="[entityName]" /></title>
</head>

<body>

<section id="show-OMIM_Term" class="first">

	<table class="table">
		<tbody>

			<tr class="prop">
				<td valign="top" class="name"><g:message code="OMIM_Term.omimTermName.label" default="OMIM Term Name" /></td>

				<td valign="top" class="value">${fieldValue(bean: OMIM_TermInstance, field: "omimTermName")}</td>
			</tr>
		
		</tbody>
	</table>
</section>

</body>

</html>
