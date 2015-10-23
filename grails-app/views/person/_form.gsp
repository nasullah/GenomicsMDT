<%@ page import="genomicsmdt.Person" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: personInstance, field: 'name', 'error')} ">
						<label for="name" class="control-label"><g:message code="person.name.label" default="Name" /><span class="required-indicator">*</span></label>
						<div>
							<g:textField class="form-control" name="name" value="${personInstance?.name}" required=""/>
							<span class="help-inline">${hasErrors(bean: personInstance, field: 'name', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: personInstance, field: 'email', 'error')} ">
						<label for="email" class="control-label"><g:message code="person.email.label" default="Email" /></label>
						<div>
							<g:field type="email" class="form-control" name="email" value="${personInstance?.email}"/>
							<span class="help-inline">${hasErrors(bean: personInstance, field: 'email', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: personInstance, field: 'notes', 'error')} ">
						<label for="notes" class="control-label"><g:message code="person.notes.label" default="Notes" /></label>
						<div>
							<g:textArea class="form-control" name="notes" cols="40" rows="4" value="${personInstance?.notes}"/>
							<span class="help-inline">${hasErrors(bean: personInstance, field: 'notes', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: personInstance, field: 'telephone', 'error')} ">
						<label for="telephone" class="control-label"><g:message code="person.telephone.label" default="Telephone" /></label>
						<div>
							<g:field type="number" class="form-control" name="telephone" value="${personInstance?.telephone}"/>
							<span class="help-inline">${hasErrors(bean: personInstance, field: 'telephone', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: personInstance, field: 'nhsContract', 'error')} ">
						<label for="nhsContract" class="control-label"><g:message code="person.nhsContract.label" default="NHS Contract" /></label>
						<div>
							<bs:checkBox name="nhsContract" value="${personInstance?.nhsContract}" offLabel="No" onLabel="Yes" />
							<span class="help-inline">${hasErrors(bean: personInstance, field: 'nhsContract', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

			%{--<div class="${hasErrors(bean: personInstance, field: 'specialities', 'error')} ">--}%
				%{--<label for="specialities" class="control-label"><g:message code="person.specialities.label" default="Specialities" /></label>--}%
				%{--<div>--}%
					%{----}%
%{--<ul class="one-to-many">--}%
%{--<g:each in="${personInstance?.specialities?}" var="s">--}%
    %{--<li><g:link controller="OMIM_Term" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></li>--}%
%{--</g:each>--}%
%{--<li class="add">--}%
%{--<g:link controller="OMIM_Term" action="create" params="['person.id': personInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'OMIM_Term.label', default: 'OMIM_Term')])}</g:link>--}%
%{--</li>--}%
%{--</ul>--}%

					%{--<span class="help-inline">${hasErrors(bean: personInstance, field: 'specialities', 'error')}</span>--}%
				%{--</div>--}%
			%{--</div>--}%

