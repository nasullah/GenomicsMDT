package genomicsmdt

/**
 * ReceiveReplyController
 * A controller class handles incoming web requests and performs actions such as redirects, rendering views and so on.
 */
class ReceiveReplyController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def reply(){
        def accessGUID = params.accessGUID
        def attendenceRecord = AttendenceRecord.findByAccessGUID(accessGUID)
        if (attendenceRecord && attendenceRecord?.status != AttendenceStatus?.findByAttendenceStatusName("Confirmed")){
            attendenceRecord.status = AttendenceStatus.findByAttendenceStatusName("Confirmed")
            attendenceRecord.save flush: true
        }
    }
}
