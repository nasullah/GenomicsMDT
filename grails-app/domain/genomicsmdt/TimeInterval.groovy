package genomicsmdt

/**
 * TimeInterval
 * A domain class describes the data object and it's mapping to the database
 */
class TimeInterval {

    static constraints = {
        timeIntervalName()
    }

    String timeIntervalName

    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${timeIntervalName}";
	}
}
