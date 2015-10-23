
<%@ page import="genomicsmdt.OMIM_Term" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'OMIM_Term.label', default: 'OMIM Term')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-OMIM_Term" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="omimTermName" title="${message(code: 'OMIM_Term.omimTermName.label', default: 'OMIM Term Name')}" />

			</tr>
		</thead>
		<tbody>
		<g:each in="${OMIM_TermInstanceList}" status="i" var="OMIM_TermInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${OMIM_TermInstance.id}">${fieldValue(bean: OMIM_TermInstance, field: "omimTermName")}</g:link></td>

			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${OMIM_TermInstanceCount}" />
	</div>
</section>

</body>

</html>
