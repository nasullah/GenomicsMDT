package genomicsmdt

/**
 * AttendenceCapacity
 * A domain class describes the data object and it's mapping to the database
 */
class AttendenceCapacity {

	static belongsTo	= [attendenceRecord:AttendenceRecord]	// tells GORM to cascade commands: e.g., delete this object if the "parent" is deleted.
    static constraints = {
        attendenceCapacity()
    }

    RoleType attendenceCapacity
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "${attendenceCapacity}";
	}
}
