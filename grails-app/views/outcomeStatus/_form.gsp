<%@ page import="genomicsmdt.OutcomeStatus" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: outcomeStatusInstance, field: 'outcomeStatus', 'error')} ">
						<label for="outcomeStatus" class="control-label"><g:message code="outcomeStatus.outcomeStatus.label" default="Outcome Status" /></label>
						<div>
							<g:textField class="form-control" name="outcomeStatus" value="${outcomeStatusInstance?.outcomeStatus}"/>
							<span class="help-inline">${hasErrors(bean: outcomeStatusInstance, field: 'outcomeStatus', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

