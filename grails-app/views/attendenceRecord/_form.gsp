<%@ page import="genomicsmdt.AttendenceRecord" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: attendenceRecordInstance, field: 'meeting', 'error')} required">
						<label for="meeting" class="control-label"><g:message code="attendenceRecord.meeting.label" default="Meeting" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="meeting" name="meeting.id" from="${genomicsmdt.Meeting.list()}" optionKey="id" required="" value="${attendenceRecordInstance?.meeting?.id}"/>
							<span class="help-inline">${hasErrors(bean: attendenceRecordInstance, field: 'meeting', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: attendenceRecordInstance, field: 'person', 'error')} required">
						<label for="person" class="control-label"><g:message code="attendenceRecord.person.label" default="Person" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="person" name="person.id" from="${genomicsmdt.Person.list()}" optionKey="id" required="" value="${attendenceRecordInstance?.person?.id}"/>
							<span class="help-inline">${hasErrors(bean: attendenceRecordInstance, field: 'person', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: attendenceRecordInstance, field: 'invitedOn', 'error')} required">
						<label for="invitedOn" class="control-label"><g:message code="attendenceRecord.invitedOn.label" default="Invited On" /><span class="required-indicator">*</span></label>
						<div>
							<bs:datePicker name="invitedOn" precision="day"  value="${attendenceRecordInstance?.invitedOn}"  />
							<span class="help-inline">${hasErrors(bean: attendenceRecordInstance, field: 'invitedOn', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: attendenceRecordInstance, field: 'repliedOn', 'error')} required">
						<label for="repliedOn" class="control-label"><g:message code="attendenceRecord.repliedOn.label" default="Replied On" /><span class="required-indicator">*</span></label>
						<div>
							<bs:datePicker name="repliedOn" precision="day"  value="${attendenceRecordInstance?.repliedOn}"  />
							<span class="help-inline">${hasErrors(bean: attendenceRecordInstance, field: 'repliedOn', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: attendenceRecordInstance, field: 'status', 'error')} required">
						<label for="status" class="control-label"><g:message code="attendenceRecord.status.label" default="Status" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="status" name="status.id" from="${genomicsmdt.AttendenceStatus.list()}" optionKey="id" required="" value="${attendenceRecordInstance?.status?.id}"/>
							<span class="help-inline">${hasErrors(bean: attendenceRecordInstance, field: 'status', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

