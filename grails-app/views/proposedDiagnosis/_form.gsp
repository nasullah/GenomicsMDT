<%@ page import="genomicsmdt.ProposedDiagnosis" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: proposedDiagnosisInstance, field: 'referralRecord', 'error')} required">
						<label for="referralRecord" class="control-label"><g:message code="proposedDiagnosis.referralRecord.label" default="Referral Record" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="referralRecord" name="referralRecord.id" from="${genomicsmdt.ReferralRecord.list()}" optionKey="id" required="" value="${proposedDiagnosisInstance?.referralRecord?.id}"/>
							<span class="help-inline">${hasErrors(bean: proposedDiagnosisInstance, field: 'referralRecord', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: proposedDiagnosisInstance, field: 'proposedDiagnosis', 'error')} required">
						<label for="proposedDiagnosis" class="control-label"><g:message code="proposedDiagnosis.proposedDiagnosis.label" default="Proposed Diagnosis" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="proposedDiagnosis" name="proposedDiagnosis.id" from="${genomicsmdt.OMIM_Term.list()}" optionKey="id" required="" value="${proposedDiagnosisInstance?.proposedDiagnosis?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: proposedDiagnosisInstance, field: 'proposedDiagnosis', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

