package genomicsmdt

/**
 * Speciality
 * A domain class describes the data object and it's mapping to the database
 */
class Speciality {

    static belongsTo = [person:Person]
    static constraints = {
        person()
        speciality()
    }

    OMIM_Term speciality
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${speciality}";
	}
}
