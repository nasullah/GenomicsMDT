package genomicsmdt

/**
 * Membership
 * A domain class describes the data object and it's mapping to the database
 */
class Membership {

    static constraints = {
        mdt()
        person()
        role()
        status()
    }

    Person person
    MDT mdt
    RoleType role
    MembershipStatus status

    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "Membership- Person: ${person.name}, Role: ${role}, Status: ${status}";
	}
}
