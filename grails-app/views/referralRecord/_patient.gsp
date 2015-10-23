



            <div class="${hasErrors(bean: referralRecordInstance, field: 'patient', 'error')} required">
                <label for="patient" class="control-label"><g:message code="referralRecord.patient.label" default="Patient" /><span class="required-indicator">*</span></label>
                <div>
                    <g:select class="form-control" id="patient" name="patient.id" from="${getPatient}" optionKey="id" required="" value="${referralRecordInstance?.patient?.id}" />
                    <span class="help-inline">${hasErrors(bean: referralRecordInstance, field: 'patient', 'error')}</span>
                </div>
            </div>