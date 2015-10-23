<%@ page import="genomicsmdt.DiscussionRecord" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />
	<g:set var="entityName" value="${message(code: 'discussionRecord.label', default: 'Discussion Record')}" />
	<title><g:message code="default.create.label" args="[entityName]" /></title>
</head>

<body>

	<section id="create-discussionRecord" class="first">

		%{--<g:hasErrors bean="${discussionRecordInstance}">--}%
		%{--<div class="alert alert-danger">--}%
			%{--<g:renderErrors bean="${discussionRecordInstance}" as="list" />--}%
		%{--</div>--}%
		%{--</g:hasErrors>--}%

		<g:form action="saveAll" class="form-horizontal" role="form" >
			%{--<g:render template="form"/>--}%
			<div class="row">
				<div class="col-lg-6">
					<div class="">
						<label for="meeting" class="control-label"><g:message code="discussionRecord.meeting.label" default="Meeting" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="meeting" name="meeting.id" from="${genomicsmdt.Meeting.list()}" optionKey="id" required="" value="${meetingInstance?.id}"/>
							<span class="help-inline"></span>
						</div>
					</div>
				</div>
			</div>
			<hr style="border:1; height:1px" />
        	<label for="meeting" class="control-label"><g:message code="discussionRecord.meeting.label" default="Select agenda items" /><span class="required-indicator">*</span></label>
			<g:each var="referralRecord" in="${referralRecords}" status="i">
				<div class="row">
					<div class="col-lg-10">
						<div class="">
							<div class="input-group">
								<span class="input-group-addon">
									<input type="checkbox" name="checkbox_${i}" value="${referralRecord?.id}"/>
								</span>
								<input type="text" class="form-control" value="${referralRecord}"/>
							</div>
						</div>
					</div>
				</div>
				<p>
				<p>
			</g:each>
			<hr style="border:1; height:1px" />
			<div class="form-actions margin-top-medium">
				<g:submitButton name="create" class="btn btn-primary" value="Save" />
	            <button class="btn" type="reset"><g:message code="default.button.reset.label" default="Reset" /></button>
			</div>
		</g:form>

	</section>

<hr style="border:1; height:1px" />

</body>

</html>
