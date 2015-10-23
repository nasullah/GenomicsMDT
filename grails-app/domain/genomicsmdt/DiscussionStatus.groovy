package genomicsmdt

/**
 * DiscussionStatus
 * A domain class describes the data object and it's mapping to the database
 */
class DiscussionStatus {

    static constraints = {
        discussionStatusName()
    }

    String discussionStatusName
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${discussionStatusName}";
	}
}
