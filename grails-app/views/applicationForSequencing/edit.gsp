<%@ page import="genomicsmdt.ApplicationForSequencing" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'applicationForSequencing.label', default: 'Application For Sequencing')}" />
	<title><g:message code="default.edit.label" args="[entityName]" /></title>
</head>

<body>

	<section id="edit-applicationForSequencing" class="first">

		<g:hasErrors bean="${applicationForSequencingInstance}">
		<div class="alert alert-danger">
			<g:renderErrors bean="${applicationForSequencingInstance}" as="list" />
		</div>
		</g:hasErrors>

		<g:form method="post" class="form-horizontal" role="form" >
			<g:hiddenField name="id" value="${applicationForSequencingInstance?.id}" />
			<g:hiddenField name="version" value="${applicationForSequencingInstance?.version}" />
			<g:hiddenField name="_method" value="PUT" />
			
			<g:render template="form"/>
			
			<div class="form-actions margin-top-medium">
				<g:actionSubmit class="btn btn-primary" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
	            <button class="btn" type="reset"><g:message code="default.button.reset.label" default="Reset" /></button>
			</div>
		</g:form>

	</section>

</body>

</html>
