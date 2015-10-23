<%@ page import="genomicsmdt.CorrespondenceType" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: correspondenceTypeInstance, field: 'correspondenceTypeName', 'error')} ">
						<label for="correspondenceTypeName" class="control-label"><g:message code="correspondenceType.correspondenceTypeName.label" default="Correspondence Type Name" /></label>
						<div>
							<g:textField class="form-control" name="correspondenceTypeName" value="${correspondenceTypeInstance?.correspondenceTypeName}"/>
							<span class="help-inline">${hasErrors(bean: correspondenceTypeInstance, field: 'correspondenceTypeName', 'error')}</span>
						</div>
					</div>
				</div>
			</div>
