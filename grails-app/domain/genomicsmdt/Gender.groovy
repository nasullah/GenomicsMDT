package genomicsmdt

/**
 * Gender
 * A domain class describes the data object and it's mapping to the database
 */
class Gender {

    static constraints = {
        genderName()
    }

    String genderName
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${genderName}";
	}
}
