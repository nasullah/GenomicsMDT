<%@ page import="genomicsmdt.RoleType" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: roleTypeInstance, field: 'roleTypeName', 'error')} ">
						<label for="roleTypeName" class="control-label"><g:message code="roleType.roleTypeName.label" default="Role Type Name" /></label>
						<div>
							<g:textField class="form-control" name="roleTypeName" value="${roleTypeInstance?.roleTypeName}"/>
							<span class="help-inline">${hasErrors(bean: roleTypeInstance, field: 'roleTypeName', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

