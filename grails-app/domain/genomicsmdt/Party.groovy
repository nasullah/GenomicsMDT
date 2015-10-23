package genomicsmdt

/**
 * Party
 * A domain class describes the data object and it's mapping to the database
 */
class Party {

    static mapping = {
        notes type: "text"
    }

    static constraints = {
        name()
        email(nullable: true)
        telephone(nullable: true)
        notes(widget: 'textarea', nullable: true)

    }

    String name
    String email
    String telephone
    String notes

    /*
     * Methods of the Domain Class
     */
//	@Override	// Override toString for a nicer / more descriptive UI 
//	public String toString() {
//		return "${name}";
//	}
}
