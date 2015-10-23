<%@ page import="genomicsmdt.MembershipStatus" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: membershipStatusInstance, field: 'membershipStatusName', 'error')} ">
						<label for="membershipStatusName" class="control-label"><g:message code="membershipStatus.membershipStatusName.label" default="Membership Status Name" /></label>
						<div>
							<g:textField class="form-control" name="membershipStatusName" value="${membershipStatusInstance?.membershipStatusName}"/>
							<span class="help-inline">${hasErrors(bean: membershipStatusInstance, field: 'membershipStatusName', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

