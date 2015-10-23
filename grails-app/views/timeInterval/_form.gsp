<%@ page import="genomicsmdt.TimeInterval" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: timeIntervalInstance, field: 'timeIntervalName', 'error')} ">
						<label for="timeIntervalName" class="control-label"><g:message code="timeInterval.timeIntervalName.label" default="Time Interval Name" /></label>
						<div>
							<g:textField class="form-control" name="timeIntervalName" value="${timeIntervalInstance?.timeIntervalName}"/>
							<span class="help-inline">${hasErrors(bean: timeIntervalInstance, field: 'timeIntervalName', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

