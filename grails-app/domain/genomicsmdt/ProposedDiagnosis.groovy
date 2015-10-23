package genomicsmdt

/**
 * ProposedDiagnosis
 * A domain class describes the data object and it's mapping to the database
 */
class ProposedDiagnosis {

    static belongsTo = [referralRecord:ReferralRecord]
    static constraints = {
        referralRecord()
        proposedDiagnosis()
    }

    OMIM_Term proposedDiagnosis
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${proposedDiagnosis}";
	}
}
