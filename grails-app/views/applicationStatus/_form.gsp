<%@ page import="genomicsmdt.ApplicationStatus" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: applicationStatusInstance, field: 'applicationStatusName', 'error')} ">
						<label for="applicationStatusName" class="control-label"><g:message code="applicationStatus.applicationStatusName.label" default="Application Status Name" /></label>
						<div>
							<g:textField class="form-control" name="applicationStatusName" value="${applicationStatusInstance?.applicationStatusName}"/>
							<span class="help-inline">${hasErrors(bean: applicationStatusInstance, field: 'applicationStatusName', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

