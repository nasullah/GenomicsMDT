<%@ page import="genomicsmdt.CaseStatus" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: caseStatusInstance, field: 'caseStatusName', 'error')} ">
						<label for="caseStatusName" class="control-label"><g:message code="caseStatus.caseStatusName.label" default="Case Status Name" /></label>
						<div>
							<g:textField class="form-control" name="caseStatusName" value="${caseStatusInstance?.caseStatusName}"/>
							<span class="help-inline">${hasErrors(bean: caseStatusInstance, field: 'caseStatusName', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

