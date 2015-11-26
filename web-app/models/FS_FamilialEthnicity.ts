import ko = require("knockout");
import FE_Relation = require("./FE_Relation");
import FE_Ethnicity = require("./FE_Ethnicity");
import FE_OtherEthnicity = require("./FE_OtherEthnicity");

class FS_FamilialEthnicity {
    public 'relation': KnockoutObservable<any>;
    public 'ethnicity': KnockoutObservable<any>;
    public 'otherEthnicity': KnockoutObservable<any>;
    
    constructor(params?: any) {
        this['relation'] = (params && params['relation']) ? ((ko.isObservable(params['relation'])) ? params['relation'] : FE_Relation(params['relation'])) : FE_Relation();
        this['ethnicity'] = (params && params['ethnicity']) ? ((ko.isObservable(params['ethnicity'])) ? params['ethnicity'] : FE_Ethnicity(params['ethnicity'])) : FE_Ethnicity();
        this['otherEthnicity'] = (params && params['otherEthnicity']) ? ((ko.isObservable(params['otherEthnicity'])) ? params['otherEthnicity'] : FE_OtherEthnicity(params['otherEthnicity'])) : FE_OtherEthnicity();
        
    }
}

export = FS_FamilialEthnicity;
