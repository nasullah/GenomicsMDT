<%@ page import="genomicsmdt.Meeting" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: meetingInstance, field: 'mdt', 'error')} required">
						<label for="mdt" class="control-label"><g:message code="meeting.mdt.label" default="MDT" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="mdt" name="mdt.id" from="${genomicsmdt.MDT.list()}" optionKey="id" required="" value="${meetingInstance?.mdt?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: meetingInstance, field: 'mdt', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: meetingInstance, field: 'date', 'error')} required">
						<label for="date" class="control-label"><g:message code="meeting.date.label" default="Date" /><span class="required-indicator">*</span></label>
						<div>
							<bs:datePicker name="date" precision="day"  value="${meetingInstance?.date}"  />
							<span class="help-inline">${hasErrors(bean: meetingInstance, field: 'date', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: meetingInstance, field: 'time', 'error')} ">
						<label for="time" class="control-label"><g:message code="meeting.time.label" default="Time" /><span class="required-indicator">*</span></label>
						<div>
							<g:field class="form-control" type="time" name="time"  value="${meetingInstance?.time}" required="" />
							<span class="help-inline">${hasErrors(bean: meetingInstance, field: 'time', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: meetingInstance, field: 'duration', 'error')} ">
						<label for="duration" class="control-label"><g:message code="meeting.duration.label" default="Duration" /></label>
						<div>
							<g:select class="form-control" id="duration" name="duration.id" from="${genomicsmdt.TimeInterval.list()}" optionKey="id"  value="${meetingInstance?.duration?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: meetingInstance, field: 'duration', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: meetingInstance, field: 'location', 'error')} ">
						<label for="location" class="control-label"><g:message code="meeting.location.label" default="Location" /><span class="required-indicator">*</span></label>
						<div>
							<g:textField class="form-control" name="location" required="" value="${meetingInstance?.location}"/>
							<span class="help-inline">${hasErrors(bean: meetingInstance, field: 'location', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: meetingInstance, field: 'status', 'error')} required">
						<label for="status" class="control-label"><g:message code="meeting.status.label" default="Status" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="status" name="status.id" from="${genomicsmdt.MeetingStatus.list()}" optionKey="id" required="" value="${meetingInstance?.status?.id}" noSelection="['':'- Choose -']"/>
							<span class="help-inline">${hasErrors(bean: meetingInstance, field: 'status', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: meetingInstance, field: 'minutes', 'error')} ">
						<label for="minutes" class="control-label"><g:message code="meeting.minutes.label" default="Minutes" /></label>
						<div>
							%{--<g:textField class="form-control" name="minutes" value="${meetingInstance?.minutes}"/>--}%
							<input id="inputField" type="file" name="minutes" />
							<span class="help-inline">${hasErrors(bean: meetingInstance, field: 'minutes', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: meetingInstance, field: 'additionalPapers', 'error')} ">
						<label for="additionalPapers" class="control-label"><g:message code="meeting.additionalPapers.label" default="Additional Papers" /></label>
						<div>
							%{--<g:textField class="form-control" name="minutes" value="${meetingInstance?.minutes}"/>--}%
							<input id="inputField" type="file" name="additionalPapers" />
							<span class="help-inline">${hasErrors(bean: meetingInstance, field: 'additionalPapers', 'error')}</span>
						</div>
					</div>
				</div>
			</div>



