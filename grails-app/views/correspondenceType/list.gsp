
<%@ page import="genomicsmdt.CorrespondenceType" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'correspondenceType.label', default: 'Correspondence Type')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>

<body>

<section id="list-correspondenceType" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="correspondenceTypeName" title="${message(code: 'correspondenceType.correspondenceTypeName.label', default: 'Correspondence Type Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${correspondenceTypeInstanceList}" status="i" var="correspondenceTypeInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${correspondenceTypeInstance.id}">${fieldValue(bean: correspondenceTypeInstance, field: "correspondenceTypeName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${correspondenceTypeInstanceCount}" />
	</div>
</section>

</body>

</html>
