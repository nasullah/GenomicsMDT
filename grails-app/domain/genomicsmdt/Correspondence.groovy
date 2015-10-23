package genomicsmdt

/**
 * Correspondence
 * A domain class describes the data object and it's mapping to the database
 */
class Correspondence {

    static belongsTo = [applicationForSequencing:ApplicationForSequencing]
    static constraints = {
        applicationForSequencing()
        document(nullable: true)
        date()
        type()
    }

    String document
    Date date
    CorrespondenceType type

    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${type}";
	}
}
