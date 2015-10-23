package genomicsmdt

/**
 * Person
 * A domain class describes the data object and it's mapping to the database
 */
class Person extends Party{

    static hasMany = [specialities:Speciality, referralRecord:ReferralRecord]
    static constraints = {
        name()
        email(nullable: true)
        telephone(nullable: true)
        notes(widget: 'textarea', nullable: true)
        nhsContract()
    }
    boolean nhsContract = Boolean.TRUE

    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
        if (nhsContract){
            return "Person- ${name}, NHS Contract";
        }else {
            return "Person- ${name}, No NHS Contract";
        }
	}
}
