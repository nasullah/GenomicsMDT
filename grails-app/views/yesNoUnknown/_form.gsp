<%@ page import="genomicsmdt.YesNoUnknown" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: yesNoUnknownInstance, field: 'yesNoUnknownName', 'error')} ">
						<label for="yesNoUnknownName" class="control-label"><g:message code="yesNoUnknown.yesNoUnknownName.label" default="Yes No Unknown Name" /></label>
						<div>
							<g:textField class="form-control" name="yesNoUnknownName" value="${yesNoUnknownInstance?.yesNoUnknownName}"/>
							<span class="help-inline">${hasErrors(bean: yesNoUnknownInstance, field: 'yesNoUnknownName', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

