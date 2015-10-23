<%@ page import="genomicsmdt.OMIM_Term" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'OMIM_Term.label', default: 'OMIM Term')}" />
	<title><g:message code="default.edit.label" args="[entityName]" /></title>
</head>

<body>

	<section id="edit-OMIM_Term" class="first">

		<g:hasErrors bean="${OMIM_TermInstance}">
		<div class="alert alert-danger">
			<g:renderErrors bean="${OMIM_TermInstance}" as="list" />
		</div>
		</g:hasErrors>

		<g:form method="post" class="form-horizontal" role="form" >
			<g:hiddenField name="id" value="${OMIM_TermInstance?.id}" />
			<g:hiddenField name="version" value="${OMIM_TermInstance?.version}" />
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
