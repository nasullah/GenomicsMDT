<%@ page import="genomicsmdt.AttachedEvidence" %>



			<div class="${hasErrors(bean: attachedEvidenceInstance, field: 'referralRecord', 'error')} required">
				<label for="referralRecord" class="control-label"><g:message code="attachedEvidence.referralRecord.label" default="Referral Record" /><span class="required-indicator">*</span></label>
				<div>
					<g:select class="form-control" id="referralRecord" name="referralRecord.id" from="${genomicsmdt.ReferralRecord.list()}" optionKey="id" required="" value="${attachedEvidenceInstance?.referralRecord?.id}" class="many-to-one"/>
					<span class="help-inline">${hasErrors(bean: attachedEvidenceInstance, field: 'referralRecord', 'error')}</span>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Added On</label>
						<div>
							<bs:datePicker name="addedOn" precision="day"  value="${Date.parse('yyyy-MM-dd', result?.familyHistory?.addedOn)}"  />
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Anonymised</label>
						<div>
							<g:select class="form-control" name="anonymised" from="${['Yes', 'No']}" value="${result?.familyHistory?.anonymised?.value}" noSelection="['':'- Choose -']"/>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Notes</label>
						<div>
							<g:textArea class="form-control" name="notes" value="${result?.familyHistory?.notes}" rows="4" cols="40"/>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Consanguinity</label>
						<div>
							<g:select class="form-control" name="consanguinity" from="${['Yes', 'No', 'Not Known']}" value="${result?.familyHistory?.consanguinity?.value}" noSelection="['':'- Choose -']"/>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Consanguinity Details</label>
						<div>
							<g:textField class="form-control" name="consanguinityDetails" value="${result?.familyHistory?.consanguinityDetails}" />
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">History Details</label>
						<div>
							<g:textField class="form-control" name="historyDetails" value="${result?.familyHistory?.historyDetails}" />
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Ethnicity Notes</label>
						<div>
							<g:textField class="form-control" name="ethnicityNotes" value="${result?.familyHistory?.ethnicityNotes}" />
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Relation</label>
						<div>
							<g:select class="form-control" name="historyItemRelation" from="${['Maternal', 'Paternal']}" value="${result?.historyItem?.relation?.value}" noSelection="['':'- Choose -']"/>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Condition</label>
						<div>
							<g:select class="form-control" name="condition" from="${['Term1', 'Term2']}" value="${result?.historyItem?.condition?.value}" noSelection="['':'- Choose -']"/>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Present</label>
						<div>
							<g:select class="form-control" name="persent" from="${['Yes', 'No', 'Not Known']}" value="${result?.historyItem?.persent?.value}" noSelection="['':'- Choose -']"/>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Pedigree</label>
						<div>
							<g:textField class="form-control" name="pedigree" value="${result?.pedigree?.pedigree}" />
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Pedigree Type</label>
						<div>
							<g:textField class="form-control" name="pedigreeType" value="${result?.pedigree?.pedigreeType}" />
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Relation</label>
						<div>
							<g:select class="form-control" name="familialEthnicityRelation" from="${['Maternal', 'Paternal']}" value="${result?.familialEthnicity?.relation?.value}" noSelection="['':'- Choose -']"/>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Ethnicity</label>
						<div>
							<g:select class="form-control" name="ethnicity" from="${['Ethnicity1', 'Ethnicity2']}" value="${result?.familialEthnicity?.ethnicity?.value}" noSelection="['':'- Choose -']"/>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div>
						<label for="content" class="control-label">Other Ethnicity</label>
						<div>
							<g:textField class="form-control" name="otherEthnicity" value="${result?.familialEthnicity?.otherEthnicity}" />
						</div>
					</div>
				</div>
			</div>

