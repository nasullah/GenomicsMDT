<%@ page import="genomicsmdt.Form" %>




			<div class="${hasErrors(bean: formInstance, field: 'mdt', 'error')} ">
				<label for="mdt" class="control-label"><g:message code="form.mdt.label" default="Mdt" /></label>
				<div>
					<g:select class="form-control" name="mdt" from="${genomicsmdt.MDT.list()}" multiple="multiple" optionKey="id" size="1" value="${formInstance?.mdt*.id}" required="" class="many-to-many"/>
					<span class="help-inline">${hasErrors(bean: formInstance, field: 'mdt', 'error')}</span>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: formInstance, field: 'formTitle', 'error')} ">
						<label for="formTitle" class="control-label"><g:message code="form.formTitle.label" default="Form Title" /></label>
						<div>
							<g:textField class="form-control" name="formTitle" value="${formInstance?.formTitle}"/>
							<span class="help-inline">${hasErrors(bean: formInstance, field: 'formTitle', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: formInstance, field: 'componentName', 'error')} ">
						<label for="componentName" class="control-label"><g:message code="form.componentName.label" default="Component Name" /></label>
						<div>
							<g:textField class="form-control" name="componentName" value="${formInstance?.componentName}"/>
							<span class="help-inline">${hasErrors(bean: formInstance, field: 'componentName', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: formInstance, field: 'referral', 'error')} ">
						<label for="referral" class="control-label"><g:message code="form.referral.label" default="Referral" /></label>
						<div>
							<bs:checkBox name="referral" value="${formInstance?.referral}" onLabel="Yes" offLabel="No" />
							<span class="help-inline">${hasErrors(bean: formInstance, field: 'referral', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: formInstance, field: 'discussion', 'error')} ">
						<label for="discussion" class="control-label"><g:message code="form.discussion.label" default="Discussion" /></label>
						<div>
							<bs:checkBox name="discussion" value="${formInstance?.discussion}" onLabel="Yes" offLabel="No" />
							<span class="help-inline">${hasErrors(bean: formInstance, field: 'discussion', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

