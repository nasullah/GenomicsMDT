import ko = require("knockout");
import FE_Relation = require("./FE_Relation");
import FE_Condition = require("./FE_Condition");
import FE_Persent = require("./FE_Persent");

class FS_HistoryItem {
    public 'relation': KnockoutObservable<any>;
    public 'condition': KnockoutObservable<any>;
    public 'persent': KnockoutObservable<any>;
    
    constructor(params?: any) {
        this['relation'] = (params && params['relation']) ? ((ko.isObservable(params['relation'])) ? params['relation'] : FE_Relation(params['relation'])) : FE_Relation();
        this['condition'] = (params && params['condition']) ? ((ko.isObservable(params['condition'])) ? params['condition'] : FE_Condition(params['condition'])) : FE_Condition();
        this['persent'] = (params && params['persent']) ? ((ko.isObservable(params['persent'])) ? params['persent'] : FE_Persent(params['persent'])) : FE_Persent();
        
    }
}

export = FS_HistoryItem;
