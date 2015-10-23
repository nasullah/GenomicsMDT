package genomicsmdt

/**
 * DiscussionRecord
 * A domain class describes the data object and it's mapping to the database
 */
class DiscussionRecord {

    static hasMany = [applicationForSequencing:ApplicationForSequencing]
    static constraints = {
        meeting()
        referralRecord()
        status()
        discussionSummary(nullable: true)
        approvalToInform()
        correspondence(nullable: true)
    }

    Meeting meeting
    ReferralRecord referralRecord
    DiscussionStatus status
    String discussionSummary
    Boolean approvalToInform
    String correspondence

    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "Discussion Record- Patient: ${referralRecord.patient.familyName}, Status: ${status}";
	}
}
