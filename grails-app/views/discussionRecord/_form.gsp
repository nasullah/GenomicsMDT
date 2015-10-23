<%@ page import="genomicsmdt.DiscussionRecord" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: discussionRecordInstance, field: 'meeting', 'error')} required">
						<label for="meeting" class="control-label"><g:message code="discussionRecord.meeting.label" default="Meeting" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="meeting" name="meeting.id" from="${genomicsmdt.Meeting.list()}" optionKey="id" required="" value="${discussionRecordInstance?.meeting?.id}"/>
							<span class="help-inline">${hasErrors(bean: discussionRecordInstance, field: 'meeting', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: discussionRecordInstance, field: 'referralRecord', 'error')} required">
						<label for="referralRecord" class="control-label"><g:message code="discussionRecord.referralRecord.label" default="Referral Record" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="referralRecord" name="referralRecord.id" from="${genomicsmdt.ReferralRecord.list()}" optionKey="id" required="" value="${discussionRecordInstance?.referralRecord?.id}"/>
							<span class="help-inline">${hasErrors(bean: discussionRecordInstance, field: 'referralRecord', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: discussionRecordInstance, field: 'status', 'error')} required">
						<label for="status" class="control-label"><g:message code="discussionRecord.status.label" default="Status" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="status" name="status.id" from="${genomicsmdt.DiscussionStatus.list()}" optionKey="id" required="" value="${discussionRecordInstance?.status?.id}"/>
							<span class="help-inline">${hasErrors(bean: discussionRecordInstance, field: 'status', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: discussionRecordInstance, field: 'discussionSummary', 'error')} ">
						<label for="discussionSummary" class="control-label"><g:message code="discussionRecord.discussionSummary.label" default="Discussion Summary" /></label>
						<div>
							<g:textArea class="form-control" name="discussionSummary" cols="40" rows="4" value="${discussionRecordInstance?.discussionSummary}"/>
							<span class="help-inline">${hasErrors(bean: discussionRecordInstance, field: 'discussionSummary', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: discussionRecordInstance, field: 'approvalToInform', 'error')} ">
						<label for="approvalToInform" class="control-label"><g:message code="discussionRecord.approvalToInform.label" default="Approval To Inform" /></label>
						<div>
							<bs:checkBox name="approvalToInform" value="${discussionRecordInstance?.approvalToInform}" offLabel="No" onLabel="Yes" />
							<span class="help-inline">${hasErrors(bean: discussionRecordInstance, field: 'approvalToInform', 'error')}</span>
						</div>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="${hasErrors(bean: discussionRecordInstance, field: 'correspondence', 'error')} ">
						<label for="correspondence" class="control-label"><g:message code="discussionRecord.correspondence.label" default="Correspondence" /></label>
						<div>
							%{--<g:textField class="form-control" name="minutes" value="${meetingInstance?.minutes}"/>--}%
							<input id="inputField" type="file" name="correspondence" />
							<span class="help-inline">${hasErrors(bean: discussionRecordInstance, field: 'correspondence', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

