<%@ page import="genomicsmdt.ReferralRecord" %>




			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: referralRecordInstance, field: 'patient', 'error')} required">
						<label for="patient" class="control-label"><g:message code="referralRecord.patient.label" default="Patient" /><span class="required-indicator">*</span></label>
						<div>
							<richui:autoComplete class="form-control"  name="patientName" action="${createLinkTo('dir': 'referralRecord/findPatient')}" value="${referralRecordInstance?.patient}" onItemSelect="callPatient(id)"  />
							<g:hiddenField id ="patient" name ="patient" value="${referralRecordInstance?.patient?.id}"/>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: referralRecordInstance, field: 'person', 'error')} required">
					<label for="person" class="control-label"><g:message code="referralRecord.person.label" default="Person" /><span class="required-indicator">*</span></label>
						<div>
							<richui:autoComplete class="form-control"  name="personName" action="${createLinkTo('dir': 'referralRecord/findPerson')}" value="${referralRecordInstance?.person}" onItemSelect="callPerson(id)"  />
							<g:hiddenField id ="person" name ="person" value="${referralRecordInstance?.person?.id}"/>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: referralRecordInstance, field: 'referralDate', 'error')} required">
						<label for="referralDate" class="control-label"><g:message code="referralRecord.referralDate.label" default="Referral Date" /><span class="required-indicator">*</span></label>
						<div>
							<bs:datePicker name="referralDate" precision="day"  value="${referralRecordInstance?.referralDate}"  />
							<span class="help-inline">${hasErrors(bean: referralRecordInstance, field: 'referralDate', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: referralRecordInstance, field: 'potentialBenefits', 'error')} ">
						<label for="potentialBenefits" class="control-label"><g:message code="referralRecord.potentialBenefits.label" default="Potential Benefits" /></label>
						<div>
							<g:textField class="form-control" name="potentialBenefits" value="${referralRecordInstance?.potentialBenefits}"/>
							<span class="help-inline">${hasErrors(bean: referralRecordInstance, field: 'potentialBenefits', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: referralRecordInstance, field: 'descriptionOfDisorder', 'error')} ">
						<label for="descriptionOfDisorder" class="control-label"><g:message code="referralRecord.descriptionOfDisorder.label" default="Description Of Disorder" /></label>
						<div>
							<g:textArea class="form-control" name="descriptionOfDisorder" cols="40" rows="4" value="${referralRecordInstance?.descriptionOfDisorder}"/>
							<span class="help-inline">${hasErrors(bean: referralRecordInstance, field: 'descriptionOfDisorder', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: referralRecordInstance, field: 'caseStatus', 'error')} required">
						<label for="caseStatus" class="control-label"><g:message code="referralRecord.caseStatus.label" default="Case Status" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="caseStatus" name="caseStatus.id" from="${genomicsmdt.CaseStatus.list()}" optionKey="id" required="" value="${referralRecordInstance?.caseStatus?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: referralRecordInstance, field: 'caseStatus', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: referralRecordInstance, field: 'numberOfSamples', 'error')} ">
						<label for="numberOfSamples" class="control-label"><g:message code="referralRecord.numberOfSamples.label" default="Number of Samples" /></label>
						<div>
							<g:field type="number" class="form-control" name="numberOfSamples" value="${referralRecordInstance?.numberOfSamples}"/>
							<span class="help-inline">${hasErrors(bean: referralRecordInstance, field: 'preferredProgram', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: referralRecordInstance, field: 'mdt', 'error')} required">
						<label for="mdt" class="control-label"><g:message code="referralRecord.mdt.label" default="MDT" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="mdt" name="mdt.id" from="${genomicsmdt.MDT.list()}" optionKey="id" required="" value="${referralRecordInstance?.mdt?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: referralRecordInstance, field: 'mdt', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

<g:javascript plugin="jquery" library="jquery" />
<script>
	function callPerson(person){
		document.getElementById('person').value = person;
	}

	function callPatient(patient){
		document.getElementById('patient').value = patient;
	}
</script>

