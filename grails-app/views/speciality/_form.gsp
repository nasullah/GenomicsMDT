<%@ page import="genomicsmdt.Speciality" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: specialityInstance, field: 'person', 'error')} required">
						<label for="person" class="control-label"><g:message code="speciality.person.label" default="Person" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="person" name="person.id" from="${genomicsmdt.Person.list()}" optionKey="id" required="" value="${specialityInstance?.person?.id}"/>
							<span class="help-inline">${hasErrors(bean: specialityInstance, field: 'person', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: specialityInstance, field: 'speciality', 'error')} required">
						<label for="speciality" class="control-label"><g:message code="speciality.speciality.label" default="Speciality" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="speciality" name="speciality.id" from="${genomicsmdt.OMIM_Term.list()}" optionKey="id" required="" value="${specialityInstance?.speciality?.id}"  noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: specialityInstance, field: 'speciality', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

