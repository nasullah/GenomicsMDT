<%@ page import="genomicsmdt.Gender" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: genderInstance, field: 'genderName', 'error')} ">
						<label for="genderName" class="control-label"><g:message code="gender.genderName.label" default="Gender Name" /></label>
						<div>
							<g:textField class="form-control" name="genderName" value="${genderInstance?.genderName}"/>
							<span class="help-inline">${hasErrors(bean: genderInstance, field: 'genderName', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

