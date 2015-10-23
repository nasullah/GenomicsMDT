package genomicsmdt

/**
 * OMIM_Term
 * A domain class describes the data object and it's mapping to the database
 */
class OMIM_Term {

    static constraints = {
        omimTermName()
    }
    String omimTermName

    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${omimTermName}";
	}
}
