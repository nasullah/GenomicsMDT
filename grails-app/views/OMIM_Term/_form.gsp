<%@ page import="genomicsmdt.OMIM_Term" %>




			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: OMIM_TermInstance, field: 'omimTermName', 'error')} ">
						<label for="speciality" class="control-label"><g:message code="OMIM_Term.omimTermName.label" default="OMIM Term Name" /></label>
						<div>
							<g:textField class="form-control" name="omimTermName" value="${OMIM_TermInstance?.omimTermName}"/>
							<span class="help-inline">${hasErrors(bean: OMIM_TermInstance, field: 'omimTermName', 'error')}</span>
						</div>
					</div>
				</div>
			</div>



