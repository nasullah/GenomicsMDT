package genomicsmdt

/**
 * AttendenceStatus
 * A domain class describes the data object and it's mapping to the database
 */
class AttendenceStatus {

    static constraints = {
        attendenceStatusName()
    }

    String attendenceStatusName
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${attendenceStatusName}";
	}
}
