package genomicsmdt

/**
 * MDT
 * A domain class describes the data object and it's mapping to the database
 */
class MDT extends Party{

    static hasMany = [members:Membership]
    static constraints = {
        name()
        email(nullable: true)
        telephone(nullable: true)
        notes(widget: 'textarea', nullable: true)
        quorum()
    }
    Integer quorum

    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "MDT- Name: ${name}";
	}
}
