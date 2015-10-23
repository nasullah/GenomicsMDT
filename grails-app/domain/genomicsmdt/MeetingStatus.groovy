package genomicsmdt

/**
 * MeetingStatus
 * A domain class describes the data object and it's mapping to the database
 */
class MeetingStatus {

    static constraints = {
        meetingStatusName()
    }

    String meetingStatusName

    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${meetingStatusName}";
	}
}
