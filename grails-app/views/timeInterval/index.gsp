
<%@ page import="genomicsmdt.TimeInterval" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'timeInterval.label', default: 'Time Interval')}" />
	<title><g:message code="default.index.label" args="[entityName]" /></title>
</head>

<body>

<section id="index-timeInterval" class="first">

	<table class="table table-bordered margin-top-medium">
		<thead>
			<tr>
			
				<g:sortableColumn property="timeIntervalName" title="${message(code: 'timeInterval.timeIntervalName.label', default: 'Time Interval Name')}" />
			
			</tr>
		</thead>
		<tbody>
		<g:each in="${timeIntervalInstanceList}" status="i" var="timeIntervalInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			
				<td><g:link action="show" id="${timeIntervalInstance.id}">${fieldValue(bean: timeIntervalInstance, field: "timeIntervalName")}</g:link></td>
			
			</tr>
		</g:each>
		</tbody>
	</table>
	<div>
		<bs:paginate total="${timeIntervalInstanceCount}" />
	</div>
</section>

</body>

</html>
