package genomicsmdt

/**
 * Meeting
 * A domain class describes the data object and it's mapping to the database
 */
class Meeting {

    static hasMany = [attendenceRecords:AttendenceRecord, discussionRecords:DiscussionRecord]
    static constraints = {
        date()
        time()
        duration(nullable: true)
        location()
        status()
        minutes(nullable: true)
        additionalPapers(nullable: true)
        mdt()
    }

    Date date
    String time
    TimeInterval duration
    String location
    MeetingStatus status
    String minutes
    String additionalPapers
    MDT mdt
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "Meeting- Date: ${date.format('yyyy-MM-dd')}, Time: ${time}, Status: ${status}, Location: ${location}";
	}
}
