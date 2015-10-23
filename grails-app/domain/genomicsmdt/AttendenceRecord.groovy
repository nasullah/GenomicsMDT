package genomicsmdt

/**
 * AttendenceRecord
 * A domain class describes the data object and it's mapping to the database
 */
class AttendenceRecord {

	static hasMany = [attendenceCapacity:AttendenceCapacity]
	static belongsTo = [meeting:Meeting]
	static	constraints = {
		invitedOn()
		repliedOn(nullable: true)
		status()
    }

	Person person
	Date invitedOn
	Date repliedOn
	AttendenceStatus status
	/*
	 * Methods of the Domain Class
	 */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "Attendence Record- Person: ${person}, Attendence Capacity: ${attendenceCapacity}, Status: ${status}";
	}
}
