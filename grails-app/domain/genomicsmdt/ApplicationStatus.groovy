package genomicsmdt

/**
 * ApplicationStatus
 * A domain class describes the data object and it's mapping to the database
 */
class ApplicationStatus {

    static constraints = {
        applicationStatusName()
    }

    String applicationStatusName
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${applicationStatusName}";
	}
}
