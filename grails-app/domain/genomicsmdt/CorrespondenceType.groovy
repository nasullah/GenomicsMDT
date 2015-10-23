package genomicsmdt

/**
 * CorrespondenceType
 * A domain class describes the data object and it's mapping to the database
 */
class CorrespondenceType {

    static constraints = {
        correspondenceTypeName()
    }

    String correspondenceTypeName
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${correspondenceTypeName}";
	}
}
