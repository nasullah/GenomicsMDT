package genomicsmdt

/**
 * YesNoUnknown
 * A domain class describes the data object and it's mapping to the database
 */
class YesNoUnknown {

    static constraints = {
        yesNoUnknownName()
    }

    String yesNoUnknownName
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${yesNoUnknownName}";
	}
}
