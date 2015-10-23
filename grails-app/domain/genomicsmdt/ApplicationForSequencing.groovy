package genomicsmdt

/**
 * ApplicationForSequencing
 * A domain class describes the data object and it's mapping to the database
 */
class ApplicationForSequencing {

	static hasMany = [correspondence:Correspondence]
	static	constraints = {
		applicationStatus()
		discussionRecord()
    }

	ApplicationStatus applicationStatus
	DiscussionRecord discussionRecord
	
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${applicationStatus}";
	}
}
