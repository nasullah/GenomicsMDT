<%@ page import="genomicsmdt.DiscussionStatus" %>



			<div class="row">
				<div class="col-lg-6">
					<div class="${hasErrors(bean: discussionStatusInstance, field: 'discussionStatusName', 'error')} ">
						<label for="discussionStatusName" class="control-label"><g:message code="discussionStatus.discussionStatusName.label" default="Discussion Status Name" /></label>
						<div>
							<g:textField class="form-control" name="discussionStatusName" value="${discussionStatusInstance?.discussionStatusName}"/>
							<span class="help-inline">${hasErrors(bean: discussionStatusInstance, field: 'discussionStatusName', 'error')}</span>
						</div>
					</div>
				</div>
			</div>

