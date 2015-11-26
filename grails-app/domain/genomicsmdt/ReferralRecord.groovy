package genomicsmdt

/**
 * ReferralRecord
 * A domain class describes the data object and it's mapping to the database
 */
class ReferralRecord {

    static mapping = {
        potentialBenefits type: "text"
    }

	static	belongsTo	= [patient:Patient, person:Person]	// tells GORM to cascade commands: e.g., delete this object if the "parent" is deleted.
    static hasMany = [proposedDiagnosis:ProposedDiagnosis, attachedEvidence:AttachedEvidence]
    static constraints = {
        patient()
        person()
        referralDate()
        descriptionOfDisorder(nullable: true)
        caseStatus()
        potentialBenefits(widget: 'textarea', nullable: true, )
        numberOfSamples(nullable: true)
        mdt()
    }

    Date referralDate
    String descriptionOfDisorder
    CaseStatus caseStatus
    String potentialBenefits
    Integer numberOfSamples
    MDT mdt
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "ReferralRecord- Patient: ${patient.familyName}, Referral Date: ${referralDate.format('yyyy-MM-dd')}, Case Status: ${caseStatus}, Person: ${person.name}";
	}
}
