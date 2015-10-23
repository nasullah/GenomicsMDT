<%@ page import="genomicsmdt.Patient" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: patientInstance, field: 'givenName', 'error')} ">
						<label for="givenName" class="control-label"><g:message code="patient.givenName.label" default="Given Name" /><span class="required-indicator">*</span></label>
						<div>
							<g:textField class="form-control" name="givenName" value="${patientInstance?.givenName}" required=""/>
							<span class="help-inline">${hasErrors(bean: patientInstance, field: 'givenName', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: patientInstance, field: 'familyName', 'error')} ">
						<label for="familyName" class="control-label"><g:message code="patient.familyName.label" default="Family Name" /><span class="required-indicator">*</span></label>
						<div>
							<g:textField class="form-control" name="familyName" value="${patientInstance?.familyName}" required=""/>
							<span class="help-inline">${hasErrors(bean: patientInstance, field: 'familyName', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: patientInstance, field: 'nhsNumber', 'error')} ">
						<label for="nhsNumber" class="control-label"><g:message code="patient.nhsNumber.label" default="NHS Number" /><span class="required-indicator">*</span></label>
						<div>
							<g:textField class="form-control" name="nhsNumber" value="${patientInstance?.nhsNumber}" required=""/>
							<span class="help-inline">${hasErrors(bean: patientInstance, field: 'nhsNumber', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: patientInstance, field: 'mrn', 'error')} ">
						<label for="mrn" class="control-label"><g:message code="patient.mrn.label" default="MRN" /><span class="required-indicator">*</span></label>
						<div>
							<g:textField class="form-control" name="mrn" value="${patientInstance?.mrn}" required=""/>
							<span class="help-inline">${hasErrors(bean: patientInstance, field: 'mrn', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: patientInstance, field: 'familyNumber', 'error')} ">
						<label for="familyNumber" class="control-label"><g:message code="patient.familyNumber.label" default="Family Number" /></label>
						<div>
							<g:textField class="form-control" name="familyNumber" value="${patientInstance?.familyNumber}"/>
							<span class="help-inline">${hasErrors(bean: patientInstance, field: 'familyNumber', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: patientInstance, field: 'otherIdentifier', 'error')} ">
						<label for="otherIdentifier" class="control-label"><g:message code="patient.otherIdentifier.label" default="Other Identifier" /></label>
						<div>
							<g:textField class="form-control" name="otherIdentifier" value="${patientInstance?.otherIdentifier}"/>
							<span class="help-inline">${hasErrors(bean: patientInstance, field: 'otherIdentifier', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: patientInstance, field: 'dateOfBirth', 'error')} ">
						<label for="dateOfBirth" class="control-label"><g:message code="patient.dateOfBirth.label" default="Date Of Birth" /></label>
						<div>
							<bs:datePicker name="dateOfBirth" precision="day"  value="${patientInstance?.dateOfBirth}" default="none" noSelection="['': '']" />
							<span class="help-inline">${hasErrors(bean: patientInstance, field: 'dateOfBirth', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: patientInstance, field: 'gender', 'error')} ">
						<label for="gender" class="control-label"><g:message code="patient.gender.label" default="Gender" /></label>
						<div>
							<g:select class="form-control" id="gender" name="gender.id" from="${genomicsmdt.Gender.list()}" optionKey="id" value="${attendenceRecordInstance?.gender?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: patientInstance, field: 'gender', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: patientInstance, field: 'ethnicity', 'error')} ">
						<label for="ethnicity" class="control-label"><g:message code="patient.ethnicity.label" default="Ethnicity" /></label>
						<div>
							<g:select class="form-control" id="ethnicity" name="ethnicity.id" from="${genomicsmdt.Ethnicity.list()}" optionKey="id" value="${attendenceRecordInstance?.ethnicity?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: patientInstance, field: 'ethnicity', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: patientInstance, field: 'otherEthnicity', 'error')} ">
						<label for="otherEthnicity" class="control-label"><g:message code="patient.otherEthnicity.label" default="Other Ethnicity" /></label>
						<div>
							<g:textField class="form-control" name="otherEthnicity" value="${patientInstance?.otherEthnicity}"/>
							<span class="help-inline">${hasErrors(bean: patientInstance, field: 'otherEthnicity', 'error')}</span>
						</div>
					</div>
				</div>
			</div>


			%{--<div class="${hasErrors(bean: patientInstance, field: 'referralRecords', 'error')} ">--}%
				%{--<label for="referralRecords" class="control-label"><g:message code="patient.referralRecords.label" default="Referral Records" /></label>--}%
				%{--<div>--}%
					%{----}%
%{--<ul class="one-to-many">--}%
%{--<g:each in="${patientInstance?.referralRecords?}" var="r">--}%
    %{--<li><g:link controller="referralRecord" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></li>--}%
%{--</g:each>--}%
%{--<li class="add">--}%
%{--<g:link controller="referralRecord" action="create" params="['patient.id': patientInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'referralRecord.label', default: 'ReferralRecord')])}</g:link>--}%
%{--</li>--}%
%{--</ul>--}%

					%{--<span class="help-inline">${hasErrors(bean: patientInstance, field: 'referralRecords', 'error')}</span>--}%
				%{--</div>--}%
			%{--</div>--}%

