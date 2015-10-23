<%@ page import="genomicsmdt.MDT" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: MDTInstance, field: 'name', 'error')} ">
						<label for="name" class="control-label"><g:message code="MDT.name.label" default="Name" /><span class="required-indicator">*</span></label>
						<div>
							<g:textField class="form-control" name="name" value="${MDTInstance?.name}" required=""/>
							<span class="help-inline">${hasErrors(bean: MDTInstance, field: 'name', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: MDTInstance, field: 'email', 'error')} ">
						<label for="email" class="control-label"><g:message code="MDT.email.label" default="Email" /></label>
						<div>
							<g:field type="email" class="form-control" name="email" value="${MDTInstance?.email}"/>
							<span class="help-inline">${hasErrors(bean: MDTInstance, field: 'email', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: MDTInstance, field: 'notes', 'error')} ">
						<label for="notes" class="control-label"><g:message code="MDT.notes.label" default="Notes" /></label>
						<div>
							<g:textArea class="form-control" name="notes" cols="40" rows="4" value="${MDTInstance?.notes}"/>
							<span class="help-inline">${hasErrors(bean: MDTInstance, field: 'notes', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: MDTInstance, field: 'telephone', 'error')} ">
						<label for="telephone" class="control-label"><g:message code="MDT.telephone.label" default="Telephone" /></label>
						<div>
							<g:field type="number" class="form-control" name="telephone" value="${MDTInstance?.telephone}"/>
							<span class="help-inline">${hasErrors(bean: MDTInstance, field: 'telephone', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: MDTInstance, field: 'quorum', 'error')} ">
						<label for="quorum" class="control-label"><g:message code="MDTInstance.quorum.label" default="Quorum" /><span class="required-indicator">*</span></label>
						<div>
							%{--<g:textField class="form-control" name="minutes" value="${meetingInstance?.minutes}"/>--}%
							<input class="form-control"  id="inputField" type="number" name="quorum" required="" value="${MDTInstance?.quorum}"/>
							<span class="help-inline">${hasErrors(bean: MDTInstance, field: 'quorum', 'error')}</span>
						</div>
					</div>
				</div>
			</div>


