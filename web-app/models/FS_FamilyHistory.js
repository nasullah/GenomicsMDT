define(["require", "exports", "knockout", "./FE_AddedOn", "./FE_Anonymised", "./FE_Notes", "./FE_Consanguinity", "./FE_ConsanguinityDetails", "./FE_HistoryDetails", "./FE_EthnicityNotes"], function (require, exports, ko, FE_AddedOn, FE_Anonymised, FE_Notes, FE_Consanguinity, FE_ConsanguinityDetails, FE_HistoryDetails, FE_EthnicityNotes) {
    var FS_FamilyHistory = (function () {
        function FS_FamilyHistory(params) {
            this['addedOn'] = (params && params['addedOn']) ? ((ko.isObservable(params['addedOn'])) ? params['addedOn'] : FE_AddedOn(params['addedOn'])) : FE_AddedOn();
            this['anonymised'] = (params && params['anonymised']) ? ((ko.isObservable(params['anonymised'])) ? params['anonymised'] : FE_Anonymised(params['anonymised'])) : FE_Anonymised();
            this['notes'] = (params && params['notes']) ? ((ko.isObservable(params['notes'])) ? params['notes'] : FE_Notes(params['notes'])) : FE_Notes();
            this['consanguinity'] = (params && params['consanguinity']) ? ((ko.isObservable(params['consanguinity'])) ? params['consanguinity'] : FE_Consanguinity(params['consanguinity'])) : FE_Consanguinity();
            this['consanguinityDetails'] = (params && params['consanguinityDetails']) ? ((ko.isObservable(params['consanguinityDetails'])) ? params['consanguinityDetails'] : FE_ConsanguinityDetails(params['consanguinityDetails'])) : FE_ConsanguinityDetails();
            this['historyDetails'] = (params && params['historyDetails']) ? ((ko.isObservable(params['historyDetails'])) ? params['historyDetails'] : FE_HistoryDetails(params['historyDetails'])) : FE_HistoryDetails();
            this['ethnicityNotes'] = (params && params['ethnicityNotes']) ? ((ko.isObservable(params['ethnicityNotes'])) ? params['ethnicityNotes'] : FE_EthnicityNotes(params['ethnicityNotes'])) : FE_EthnicityNotes();
        }
        return FS_FamilyHistory;
    })();
    return FS_FamilyHistory;
});
