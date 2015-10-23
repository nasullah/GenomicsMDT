<%@ page import="genomicsmdt.ReferralRecord" %>





			<g:if test="${!referralRecordInstance?.person?.id}">
				<div class="row">
					<div class="col-lg-6">
						<label for="person" class="control-label"><g:message code="referralRecord.person.label" default="Find Person" /><span class="required-indicator">*</span></label>
						<div class="input-group">
							<g:textField type="text" id="searchPerson" name="searchPerson" class="form-control"  placeholder="Enter person's name" required="" ></g:textField>
							<div class="input-group-btn">
								<button type="button" class="btn btn-success" value="Find" onClick= 'getPerson()'><span class="glyphicon glyphicon-search"></span> Find</button>
							</div>
						</div>
					</div>

					<div class="col-lg-6">
						<div id="selectPerson"></div>
					</div>
				</div>
			</g:if>

			<g:if test="${referralRecordInstance?.person?.id}">
				<div class="row">
					<div class="col-lg-6">
						<div class="${hasErrors(bean: referralRecordInstance, field: 'person', 'error')} required">
							<label for="person" class="control-label"><g:message code="referralRecord.person.label" default="Person" /><span class="required-indicator">*</span></label>
							<div>
								<g:select class="form-control" id="person" name="person.id" from="${genomicsmdt.Person.list()}" optionKey="id" required="" value="${referralRecordInstance?.person?.id}"/>
								<span class="help-inline">${hasErrors(bean: referralRecordInstance, field: 'person', 'error')}</span>
							</div>
						</div>
					</div>
				</div>
			</g:if>

			<g:if test="${!referralRecordInstance?.patient?.id}">
				<div class="row">
					<div class="col-lg-6">
						<label for="patient" class="control-label"><g:message code="referralRecord.patient.label" default="Find Patient" /><span class="required-indicator">*</span></label>
						<div class="input-group">
							<g:textField type="text" id="searchPatient" name="searchPatient" class="form-control"  placeholder="Enter patient's given name, family name, NHS or MRN" required="" ></g:textField>
							<div class="input-group-btn">
								<button type="button" class="btn btn-success" value="Find" onClick= 'getPatient()'><span class="glyphicon glyphicon-search"></span> Find</button>
							</div>
						</div>
					</div>

					<div class="col-lg-6">
						<div id="selectPatient"></div>
					</div>
				</div>
			</g:if>

			<g:if test="${referralRecordInstance?.patient?.id}">
				<div class="row">
					<div class="col-lg-6">
						<div class="${hasErrors(bean: referralRecordInstance, field: 'patient', 'error')} required">
							<label for="patient" class="control-label"><g:message code="referralRecord.patient.label" default="Patient" /><span class="required-indicator">*</span></label>
							<div>
								<g:select class="form-control" id="patient" name="patient.id" from="${genomicsmdt.Patient.list()}" optionKey="id" required="" value="${referralRecordInstance?.patient?.id}" />
								<span class="help-inline">${hasErrors(bean: referralRecordInstance, field: 'patient', 'error')}</span>
							</div>
						</div>
					</div>
				</div>
			</g:if>

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
					<div class="${hasErrors(bean: referralRecordInstance, field: 'preferredProgram', 'error')} ">
						<label for="preferredProgram" class="control-label"><g:message code="referralRecord.preferredProgram.label" default="Preferred Program" /></label>
						<div>
							<g:select class="form-control" id="preferredProgram" name="preferredProgram.id" from="${genomicsmdt.Program.list()}" optionKey="id" value="${referralRecordInstance?.preferredProgram?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: referralRecordInstance, field: 'preferredProgram', 'error')}</span>
						</div>
					</div>
				</div>

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

			<div class="modal fade" id="personNotFound">
				<div class="modal-dialog" style="position: absolute; left: 0%;">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
							<h4 class="modal-title">Not Found!</h4>
						</div>
						<div class="modal-body">
							<p>No person found! </p>
						</div>
						<div class="modal-footer">
							<a class='btn btn-primary btn-small' <g:link controller="person" action="create" ><i class="glyphicon glyphicon-plus"></i> ${message(code: 'default.add.label', args: [message(code: 'person.label', default: 'Person')])}</g:link>
							<button type="button" class="btn" data-dismiss="modal">Close</button>
						</div>
					</div>
				</div>
			</div>

				<div class="modal fade" id="patientNotFound">
					<div class="modal-dialog" style="position: absolute; left: 0%;">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
								<h4 class="modal-title">Not Found!</h4>
							</div>
							<div class="modal-body">
								<p>No patient found! </p>
							</div>
							<div class="modal-footer">
								<a class='btn btn-primary btn-small' <g:link controller="patient" action="create" ><i class="glyphicon glyphicon-plus"></i> ${message(code: 'default.add.label', args: [message(code: 'patient.label', default: 'Patient')])}</g:link>
								<button type="button" class="btn" data-dismiss="modal">Close</button>
							</div>
						</div>
					</div>
				</div>

<g:javascript plugin="jquery" library="jquery" />
<script>
	function getPerson(){
		${remoteFunction (controller: 'referralRecord',
                        action: 'findPerson',
                        params: '"searchPerson=" + $("#searchPerson").val()',
                        update: 'selectPerson',
                        onFailure:'personError()'
                )}
	}

	function personError(){
		var select = $("#selectPerson");
		select.empty().append("Person not found");
		$('#personNotFound').modal()
	}

	function getPatient(){
		${remoteFunction (controller: 'referralRecord',
                        action: 'findPatient',
                        params: '"searchPatient=" + $("#searchPatient").val()',
                        update: 'selectPatient',
                        onFailure:'patientError()'
                )}
	}

	function patientError(){
		var select = $("#selectPatient");
		select.empty().append("Patient not found");
		$('#patientNotFound').modal()
	}
</script>

