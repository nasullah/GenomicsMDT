package genomicsmdt

class Patient{

    static hasOne = [outcomeRecord:OutcomeRecord]
    static hasMany = [referralRecords:ReferralRecord]
    static constraints = {
        givenName()
        familyName()
        nhsNumber()
        mrn()
        familyNumber(nullable: true)
        otherIdentifier(nullable: true)
        dateOfBirth(nullable: true)
        gender(nullable: true)
        ethnicity(nullable: true)
        otherEthnicity(nullable: true)
        outcomeRecord(nullable: true)
    }
    String givenName
    String familyName
    String nhsNumber
    String mrn
    String familyNumber
    String otherIdentifier
    Date dateOfBirth
    Gender gender
    Ethnicity ethnicity
    String otherEthnicity

    /*
     * Methods of the Domain Class
     */
    @Override	// Override toString for a nicer / more descriptive UI
    public String toString() {
        return "Patient- ${givenName} ${familyName}, NHS Number: ${nhsNumber}";
    }
}
