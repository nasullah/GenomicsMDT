package genomicsmdt

/**
 * Form
 * A domain class describes the data object and it's mapping to the database
 */
class Form {

    static hasMany = [mdt:MDT]
    static constraints = {
        formTitle()
        componentName()
        referral()
        discussion()
    }

    String formTitle
    String componentName
    boolean referral = Boolean.TRUE
    boolean discussion = Boolean.TRUE

    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "From- Title: ${formTitle}, MDT: ${mdt}";
	}
}
