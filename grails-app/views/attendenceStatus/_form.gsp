<%@ page import="genomicsmdt.AttendenceStatus" %>



		<div class="row">
			<div class="col-lg-6">
				<div class="${hasErrors(bean: attendenceStatusInstance, field: 'attendenceStatusName', 'error')} ">
					<label for="attendenceStatusName" class="control-label"><g:message code="attendenceStatus.attendenceStatusName.label" default="Attendence Status Name" /></label>
					<div>
						<g:textField class="form-control" name="attendenceStatusName" value="${attendenceStatusInstance?.attendenceStatusName}"/>
						<span class="help-inline">${hasErrors(bean: attendenceStatusInstance, field: 'attendenceStatusName', 'error')}</span>
					</div>
				</div>
			</div>
		</div>

