<%@ page import="genomicsmdt.ApplicationForSequencing" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: applicationForSequencingInstance, field: 'discussionRecord', 'error')} required">
						<label for="discussionRecord" class="control-label"><g:message code="applicationForSequencing.discussionRecord.label" default="Discussion Record" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="discussionRecord" name="discussionRecord.id" from="${genomicsmdt.DiscussionRecord.list()}" optionKey="id" required="" value="${applicationForSequencingInstance?.discussionRecord?.id}"/>
							<span class="help-inline">${hasErrors(bean: applicationForSequencingInstance, field: 'discussionRecord', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: applicationForSequencingInstance, field: 'applicationStatus', 'error')} required">
						<label for="applicationStatus" class="control-label"><g:message code="applicationForSequencing.applicationStatus.label" default="Application Status" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="applicationStatus" name="applicationStatus.id" from="${genomicsmdt.ApplicationStatus.list()}" optionKey="id" required="" value="${applicationForSequencingInstance?.applicationStatus?.id}"/>
							<span class="help-inline">${hasErrors(bean: applicationForSequencingInstance, field: 'applicationStatus', 'error')}</span>
						</div>
					</div>
				</div>
			</div>



