package genomicsmdt

/**
 * OutcomeStatus
 * A domain class describes the data object and it's mapping to the database
 */
class OutcomeStatus {

    static constraints = {
        outcomeStatus()
    }

    String outcomeStatus
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${outcomeStatus}";
	}
}
