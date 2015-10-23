package genomicsmdt

/**
 * RoleType
 * A domain class describes the data object and it's mapping to the database
 */
class RoleType {

    static constraints = {
        roleTypeName()
    }

    String roleTypeName

    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${roleTypeName}";
	}
}
