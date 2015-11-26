define(["require", "exports", "knockout", "./FS_FamilyHistory", "./FS_HistoryItem", "./FS_Pedigree", "./FS_FamilialEthnicity"], function (require, exports, ko, FS_FamilyHistory, FS_HistoryItem, FS_Pedigree, FS_FamilialEthnicity) {
    var F_FamilyHistoryForm = (function () {
        function F_FamilyHistoryForm(params) {
            this['familyHistory'] = (params && params['familyHistory']) ? ((ko.isObservable(params['familyHistory'])) ? params['familyHistory'] : ko.observable(new FS_FamilyHistory(params['familyHistory']))) : ko.observable(new FS_FamilyHistory());
            this['historyItem'] = (params && params['historyItem']) ? ((ko.isObservable(params['historyItem'])) ? params['historyItem'] : ko.observable(new FS_HistoryItem(params['historyItem']))) : ko.observable(new FS_HistoryItem());
            this['pedigree'] = (params && params['pedigree']) ? ((ko.isObservable(params['pedigree'])) ? params['pedigree'] : ko.observable(new FS_Pedigree(params['pedigree']))) : ko.observable(new FS_Pedigree());
            this['familialEthnicity'] = (params && params['familialEthnicity']) ? ((ko.isObservable(params['familialEthnicity'])) ? params['familialEthnicity'] : ko.observable(new FS_FamilialEthnicity(params['familialEthnicity']))) : ko.observable(new FS_FamilialEthnicity());
        }
        return F_FamilyHistoryForm;
    })();
    return F_FamilyHistoryForm;
});
