
<%@ page import="genomicsmdt.Form" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'form.label', default: 'Form')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-form" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="formTitle" title="${message(code: 'form.formTitle.label', default: 'Form Title')}" />
			
				<g:sortableColumn property="componentName" title="${message(code: 'form.componentName.label', default: 'Component Name')}" />
			
				<g:sortableColumn property="referral" title="${message(code: 'form.referral.label', default: 'Referral')}" />
			
				<g:sortableColumn property="discussion" title="${message(code: 'form.discussion.label', default: 'Discussion')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${formInstanceList}" status="i" var="formInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${formInstance.id}">${fieldValue(bean: formInstance, field: "formTitle")}</g:link></td>
			
				<td>${fieldValue(bean: formInstance, field: "componentName")}</td>
			
				<td><g:formatBoolean boolean="${formInstance.referral}" /></td>
			
				<td><g:formatBoolean boolean="${formInstance.discussion}" /></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${formInstanceCount}" />
	</div>
</section>

</body>

</html>
