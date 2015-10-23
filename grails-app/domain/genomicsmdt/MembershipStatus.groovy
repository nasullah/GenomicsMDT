package genomicsmdt

/**
 * MembershipStatus
 * A domain class describes the data object and it's mapping to the database
 */
class MembershipStatus {

    static constraints = {
        membershipStatusName()
    }

    String membershipStatusName
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${membershipStatusName}";
	}
}
