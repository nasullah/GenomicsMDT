<%@ page import="genomicsmdt.MeetingStatus" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: meetingStatusInstance, field: 'meetingStatusName', 'error')} ">
						<label for="meetingStatusName" class="control-label"><g:message code="meetingStatus.meetingStatusName.label" default="Meeting Status Name" /></label>
						<div>
							<g:textField class="form-control" name="meetingStatusName" value="${meetingStatusInstance?.meetingStatusName}"/>
							<span class="help-inline">${hasErrors(bean: meetingStatusInstance, field: 'meetingStatusName', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

