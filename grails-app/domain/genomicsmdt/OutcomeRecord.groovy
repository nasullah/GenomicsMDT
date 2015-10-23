package genomicsmdt

/**
 * OutcomeRecord
 * A domain class describes the data object and it's mapping to the database
 */
class OutcomeRecord {

    static mapping = {
        outcomeNotes type: "text"
    }
    static constraints = {
        patient()
        outcomeDate()
        outcome()
        finalDiagnosis(nullable: true)
        outcomeNotes(nullable: true, widget: 'textarea')
        sequenceReceivedOn(nullable: true)
    }

    Patient patient
    Date outcomeDate
    OutcomeStatus outcome
    OMIM_Term finalDiagnosis
    String outcomeNotes
    Date sequenceReceivedOn
    /*
     * Methods of the Domain Class
     */
	@Override	// Override toString for a nicer / more descriptive UI
	public String toString() {
		return "Outcome Record- Date: ${outcomeDate.format('yyyy-MM-dd')}, Outcome: ${outcome}, Final Diagnosis: ${finalDiagnosis}";
	}
}
