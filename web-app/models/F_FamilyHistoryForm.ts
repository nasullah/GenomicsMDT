import ko = require("knockout");
import FS_FamilyHistory = require("./FS_FamilyHistory");
import FS_HistoryItem = require("./FS_HistoryItem");
import FS_Pedigree = require("./FS_Pedigree");
import FS_FamilialEthnicity = require("./FS_FamilialEthnicity");

class F_FamilyHistoryForm {
    public 'familyHistory': KnockoutObservable< FS_FamilyHistory >;
    public 'historyItem': KnockoutObservable< FS_HistoryItem >;
    public 'pedigree': KnockoutObservable< FS_Pedigree >;
    public 'familialEthnicity': KnockoutObservable< FS_FamilialEthnicity >;
    
    constructor(params?: any) {
        this['familyHistory'] = (params && params['familyHistory']) ? ((ko.isObservable(params['familyHistory'])) ? params['familyHistory'] : ko.observable(new FS_FamilyHistory(params['familyHistory']))) : ko.observable(new FS_FamilyHistory());
        this['historyItem'] = (params && params['historyItem']) ? ((ko.isObservable(params['historyItem'])) ? params['historyItem'] : ko.observable(new FS_HistoryItem(params['historyItem']))) : ko.observable(new FS_HistoryItem());
        this['pedigree'] = (params && params['pedigree']) ? ((ko.isObservable(params['pedigree'])) ? params['pedigree'] : ko.observable(new FS_Pedigree(params['pedigree']))) : ko.observable(new FS_Pedigree());
        this['familialEthnicity'] = (params && params['familialEthnicity']) ? ((ko.isObservable(params['familialEthnicity'])) ? params['familialEthnicity'] : ko.observable(new FS_FamilialEthnicity(params['familialEthnicity']))) : ko.observable(new FS_FamilialEthnicity());
        
    }
}

export = F_FamilyHistoryForm;
