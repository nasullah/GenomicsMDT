
<%@ page import="genomicsmdt.MeetingStatus; genomicsmdt.Meeting" %>
<!DOCTYPE html>
<html>

<head>
    <meta name="layout" content="kickstart" />
    <title> Scheduled Meetings</title>
</head>

<body>

<hr style="border:1; height:1px" />

<g:form action="saveAllDiscussedPatientAndAttendees" class="form-horizontal" role="form" >
    <div style="background: rgba(139, 240, 37, 0.14);">
        <div class="container">
            <p>
            <h5 class="text-center">Complete meeting details</h5>
            <p>
            <div class="row">
                <div class="col-lg-6">
                    <label class="control-label">Select meeting<span class="required-indicator">*</span></label>
                    <div class="">
                        <g:select class="form-control" id="meeting" name="meeting.id" from="${Meeting.findAllByStatus(MeetingStatus.findByMeetingStatusName('Scheduled'))}" optionKey="id" required=""  value="" noSelection="['':'- Choose a scheduled meeting -']" onchange="findAgendaItemsAndInvitedPeople()"/>
                    </div>
                </div>
            </div>
            <p>
            <p>
        </div>
    </div>

    <div id="invitedPeople"></div>

    <div id="agendaItems"></div>

    <div class="container" id="statusMinutes">
        <div class="row">
            <div class="col-lg-6">
                <div class="${hasErrors(bean: meetingInstance, field: 'status', 'error')} required">
                    <label for="status" class="control-label"><g:message code="meeting.status.label" default="Status" /><span class="required-indicator">*</span></label>
                    <div>
                        <g:select class="form-control" id="status" name="status.id" from="${genomicsmdt.MeetingStatus.list()}" optionKey="id" required=""/>
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
    </div>

    <div class="container" id="save">
        <div class="form-actions margin-top-medium">
            <g:submitButton name="create" class="btn btn-primary" value="Save" />
            <button class="btn" type="reset"><g:message code="default.button.reset.label" default="Reset" /></button>
        </div>
    </div>
</g:form>

<hr style="border:1; height:1px" />

<script>
    $("#save").hide();
    $("#statusMinutes").hide();
    function findAgendaItemsAndInvitedPeople(){
        ${remoteFunction (controller: 'meeting',
                        action: 'findAgendaItems',
                        params: '"meeting=" + $("#meeting").val()',
                        update: 'agendaItems',
                        onFailure:'errorAgendaItems()'
                )}
        ${remoteFunction (controller: 'meeting',
                        action: 'findAttendenceRecords',
                        params: '"meeting=" + $("#meeting").val()',
                        update: 'invitedPeople',
                        onFailure:'errorAttendenceRecords()'
                )}
        if ($("#meeting").val() != ''){
            $("#statusMinutes").show();
            $("#save").show();
            $("#invitedPeople").show();
            $("#agendaItems").show();
        }else{
            $("#statusMinutes").hide();
            $("#save").hide();
            $("#invitedPeople").hide();
            $("#agendaItems").hide();
        }
    }

    function errorAgendaItems(){
        var select = $("#findAgendaItems");
        select.empty().append("Not found");
        select.hide()
    }

    function errorAttendenceRecords(){
        var select = $("#invitedPeople");
        select.empty().append("Not found");
        select.hide()
        $("#statusMinutes").hide();
        $("#save").hide();
    }
</script>

</body>

</html>
