package genomicsmdt

/**
 * AttachedEvidence
 * A domain class describes the data object and it's mapping to the database
 */
class AttachedEvidence {

    static belongsTo = [referralRecord:ReferralRecord]
    static mapping = {
        content type: "text"
    }
    static constraints = {
        referralRecord()
        content()
    }

    String content
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "AttachedEvidence- Patient: ${referralRecord?.patient?.familyName}";
	}
}
