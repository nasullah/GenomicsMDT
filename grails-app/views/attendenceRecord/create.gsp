<%@ page import="genomicsmdt.AttendenceRecord" %>
<!DOCTYPE html>
<html>

<head>
	<meta name="layout" content="kickstart" />

	<title>Attendence Record</title>
</head>

<body>

	<section id="create-attendenceRecord" class="first">

		<g:form action="saveAll" class="form-horizontal" role="form" >

			<div class="row">
				<div class="col-lg-6">
					<div class="">
						<label for="meeting" class="control-label"><g:message code="attendenceRecord.meeting.label" default="Meeting" /><span class="required-indicator">*</span></label>
						<div>
							<g:select class="form-control" id="meeting" name="meeting.id" from="${genomicsmdt.Meeting.list()}" optionKey="id" required="" value="${meetingInstance?.id}"/>
							<span class="help-inline"></span>
						</div>
					</div>
				</div>
			</div>
			<hr style="border:1; height:1px" />
       		<label for="meeting" class="control-label"><g:message code="attendenceRecord.meeting.label" default="Select Persons" /><span class="required-indicator">*</span></label>
			<g:each var="member" in="${mdtMembers}" status="i">
				<div class="row">
					<div class="col-lg-10">
						<div class="">
							<div class="input-group">
								<span class="input-group-addon">
									<input type="checkbox" name="checkbox_${i}" value="${member?.person?.id}"/>
								</span>
								<input type="text" class="form-control" value="${member?.person}"/>
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
