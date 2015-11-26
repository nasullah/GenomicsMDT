import ko = require("knockout");
import FE_AddedOn = require("./FE_AddedOn");
import FE_Anonymised = require("./FE_Anonymised");
import FE_Notes = require("./FE_Notes");
import FE_Consanguinity = require("./FE_Consanguinity");
import FE_ConsanguinityDetails = require("./FE_ConsanguinityDetails");
import FE_HistoryDetails = require("./FE_HistoryDetails");
import FE_EthnicityNotes = require("./FE_EthnicityNotes");

class FS_FamilyHistory {
    public 'addedOn': KnockoutObservable<any>;
    public 'anonymised': KnockoutObservable<any>;
    public 'notes': KnockoutObservable<any>;
    public 'consanguinity': KnockoutObservable<any>;
    public 'consanguinityDetails': KnockoutObservable<any>;
    public 'historyDetails': KnockoutObservable<any>;
    public 'ethnicityNotes': KnockoutObservable<any>;
    
    constructor(params?: any) {
        this['addedOn'] = (params && params['addedOn']) ? ((ko.isObservable(params['addedOn'])) ? params['addedOn'] : FE_AddedOn(params['addedOn'])) : FE_AddedOn();
        this['anonymised'] = (params && params['anonymised']) ? ((ko.isObservable(params['anonymised'])) ? params['anonymised'] : FE_Anonymised(params['anonymised'])) : FE_Anonymised();
        this['notes'] = (params && params['notes']) ? ((ko.isObservable(params['notes'])) ? params['notes'] : FE_Notes(params['notes'])) : FE_Notes();
        this['consanguinity'] = (params && params['consanguinity']) ? ((ko.isObservable(params['consanguinity'])) ? params['consanguinity'] : FE_Consanguinity(params['consanguinity'])) : FE_Consanguinity();
        this['consanguinityDetails'] = (params && params['consanguinityDetails']) ? ((ko.isObservable(params['consanguinityDetails'])) ? params['consanguinityDetails'] : FE_ConsanguinityDetails(params['consanguinityDetails'])) : FE_ConsanguinityDetails();
        this['historyDetails'] = (params && params['historyDetails']) ? ((ko.isObservable(params['historyDetails'])) ? params['historyDetails'] : FE_HistoryDetails(params['historyDetails'])) : FE_HistoryDetails();
        this['ethnicityNotes'] = (params && params['ethnicityNotes']) ? ((ko.isObservable(params['ethnicityNotes'])) ? params['ethnicityNotes'] : FE_EthnicityNotes(params['ethnicityNotes'])) : FE_EthnicityNotes();
        
    }
}

export = FS_FamilyHistory;
