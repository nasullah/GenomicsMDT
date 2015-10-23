



                <div class="${hasErrors(bean: referralRecordInstance, field: 'person', 'error')} required">
                    <label for="person" class="control-label"><g:message code="referralRecord.person.label" default="Person" /><span class="required-indicator">*</span></label>
                    <div>
                        <g:select class="form-control" id="person" name="person.id" from="${listPerson}" optionKey="id" required="" value="${referralRecordInstance?.person?.id}"/>
                        <span class="help-inline">${hasErrors(bean: referralRecordInstance, field: 'person', 'error')}</span>
                    </div>
                </div>