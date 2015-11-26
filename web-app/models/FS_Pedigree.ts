import ko = require("knockout");
import FE_Pedigree = require("./FE_Pedigree");
import FE_PedigreeType = require("./FE_PedigreeType");

class FS_Pedigree {
    public 'pedigree': KnockoutObservable<any>;
    public 'pedigreeType': KnockoutObservable<any>;
    
    constructor(params?: any) {
        this['pedigree'] = (params && params['pedigree']) ? ((ko.isObservable(params['pedigree'])) ? params['pedigree'] : FE_Pedigree(params['pedigree'])) : FE_Pedigree();
        this['pedigreeType'] = (params && params['pedigreeType']) ? ((ko.isObservable(params['pedigreeType'])) ? params['pedigreeType'] : FE_PedigreeType(params['pedigreeType'])) : FE_PedigreeType();
        
    }
}

export = FS_Pedigree;
