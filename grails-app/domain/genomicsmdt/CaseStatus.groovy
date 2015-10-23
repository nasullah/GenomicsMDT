package genomicsmdt

/**
 * CaseStatus
 * A domain class describes the data object and it's mapping to the database
 */
class CaseStatus {

    static constraints = {
        caseStatusName()
    }

    String caseStatusName

    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${caseStatusName}";
	}
}
