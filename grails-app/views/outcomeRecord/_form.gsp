<%@ page import="genomicsmdt.OutcomeRecord" %>




			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: outcomeRecordInstance, field: 'patient', 'error')} required">
						<label for="patient" class="control-label"><g:message code="outcomeRecord.patient.label" default="Patient" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="patient" name="patient.id" from="${genomicsmdt.Patient.list()}" optionKey="id" required="" value="${outcomeRecordInstance?.patient?.id}"/>
							<span class="help-inline">${hasErrors(bean: outcomeRecordInstance, field: 'patient', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: outcomeRecordInstance, field: 'outcomeDate', 'error')} required">
						<label for="outcomeDate" class="control-label"><g:message code="outcomeRecord.outcomeDate.label" default="Outcome Date" /><span class="required-indicator">*</span></label>
						<div>
							<bs:datePicker name="outcomeDate" precision="day"  value="${outcomeRecordInstance?.outcomeDate}"  />
							<span class="help-inline">${hasErrors(bean: outcomeRecordInstance, field: 'outcomeDate', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: outcomeRecordInstance, field: 'outcome', 'error')} required">
						<label for="outcome" class="control-label"><g:message code="outcomeRecord.outcome.label" default="Outcome" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="outcome" name="outcome.id" from="${genomicsmdt.OutcomeStatus.list()}" optionKey="id" required="" value="${outcomeRecordInstance?.outcome?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: outcomeRecordInstance, field: 'outcome', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: outcomeRecordInstance, field: 'outcomeNotes', 'error')} ">
						<label for="outcomeNotes" class="control-label"><g:message code="outcomeRecord.outcomeNotes.label" default="Outcome Notes" /></label>
						<div>
							<g:textArea class="form-control" name="outcomeNotes" cols="40" rows="4" value="${outcomeRecordInstance?.outcomeNotes}"/>
							<span class="help-inline">${hasErrors(bean: outcomeRecordInstance, field: 'outcomeNotes', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: outcomeRecordInstance, field: 'finalDiagnosis', 'error')} ">
						<label for="finalDiagnosis" class="control-label"><g:message code="outcomeRecord.finalDiagnosis.label" default="Final Diagnosis" /></label>
						<div>
							<g:select class="form-control" id="finalDiagnosis" name="finalDiagnosis.id" from="${genomicsmdt.OMIM_Term.list()}" optionKey="id" value="${outcomeRecordInstance?.finalDiagnosis?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: outcomeRecordInstance, field: 'finalDiagnosis', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: outcomeRecordInstance, field: 'sequenceReceivedOn', 'error')} ">
						<label for="sequenceReceivedOn" class="control-label"><g:message code="outcomeRecord.sequenceReceivedOn.label" default="Sequence Received On" /></label>
						<div>
							<bs:datePicker name="sequenceReceivedOn" precision="day"  value="${outcomeRecordInstance?.sequenceReceivedOn}" default="none" noSelection="['': '']" />
							<span class="help-inline">${hasErrors(bean: outcomeRecordInstance, field: 'sequenceReceivedOn', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

