<%@ page import="genomicsmdt.Membership" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: membershipInstance, field: 'mdt', 'error')} required">
						<label for="mdt" class="control-label"><g:message code="membership.mdt.label" default="Mdt" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="mdt" name="mdt.id" from="${genomicsmdt.MDT.list()}" optionKey="id" required="" value="${membershipInstance?.mdt?.id}" />
							<span class="help-inline">${hasErrors(bean: membershipInstance, field: 'mdt', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: membershipInstance, field: 'person', 'error')} required">
						<label for="person" class="control-label"><g:message code="membership.person.label" default="Person" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="person" name="person.id" from="${genomicsmdt.Person.list()}" optionKey="id" required="" value="${membershipInstance?.person?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: membershipInstance, field: 'person', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: membershipInstance, field: 'role', 'error')} required">
						<label for="role" class="control-label"><g:message code="membership.role.label" default="Role" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="role" name="role.id" from="${genomicsmdt.RoleType.list()}" optionKey="id" required="" value="${membershipInstance?.role?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: membershipInstance, field: 'role', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: membershipInstance, field: 'status', 'error')} required">
						<label for="status" class="control-label"><g:message code="membership.status.label" default="Status" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="status" name="status.id" from="${genomicsmdt.MembershipStatus.list()}" optionKey="id" required="" value="${membershipInstance?.status?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: membershipInstance, field: 'status', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

