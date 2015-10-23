
<%@ page import="genomicsmdt.Patient" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'patient.label', default: 'Patient')}" />
	<title><g:message code="default.list.label" args="[entityName]" /></title>
	<r:require module="filterpane" />
</head>

<body>

<p>
<p>
<div style="background: rgba(80, 110, 56, 0.04);">
	<div class="container">
		<p>
		<h5 class="text-center">Search Options</h5>
		<p>
			<filterpane:filterButton text="Filter This List" />
			<filterpane:filterPane domain="genomicsmdt.Patient"
								   excludeProperties="dateOfBirth"/>
		<p>
		<p>
	</div>
</div>

<hr style="border:1; height:1px" />

<section id="list-patient" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
		<tr>

			<g:sortableColumn property="givenName" title="${message(code: 'patient.givenName.label', default: 'Given Name')}" />

			<g:sortableColumn property="familyName" title="${message(code: 'patient.familyName.label', default: 'Family Name')}" />

			<g:sortableColumn property="nhsNumber" title="${message(code: 'patient.nhsNumber.label', default: 'NHS Number')}" />

			<g:sortableColumn property="mrn" title="${message(code: 'patient.mrn.label', default: 'MRN')}" />

			<th><g:message code="label" default="Action" /></th>

		</tr>
		</thead>
		<tbody>
		<g:each in="${patientInstanceList}" status="i" var="patientInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

				<td><g:link action="show" id="${patientInstance.id}">${fieldValue(bean: patientInstance, field: "givenName")}</g:link></td>

				<td>${fieldValue(bean: patientInstance, field: "familyName")}</td>

				<td>${fieldValue(bean: patientInstance, field: "nhsNumber")}</td>

				<td>${fieldValue(bean: patientInstance, field: "mrn")}</td>

				<td>
					<a class='btn btn-primary btn-xs' <g:link controller="referralRecord" action="create" params="['patient.id': patientInstance?.id]"><i class="glyphicon glyphicon-plus"></i> Refer this patient</g:link>
				</td>

			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${patientInstanceTotal}" />
	</div>
</section>

</body>

</html>
