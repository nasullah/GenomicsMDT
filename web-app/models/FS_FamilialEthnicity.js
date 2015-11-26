define(["require", "exports", "knockout", "./FE_Relation", "./FE_Ethnicity", "./FE_OtherEthnicity"], function (require, exports, ko, FE_Relation, FE_Ethnicity, FE_OtherEthnicity) {
    var FS_FamilialEthnicity = (function () {
        function FS_FamilialEthnicity(params) {
            this['relation'] = (params && params['relation']) ? ((ko.isObservable(params['relation'])) ? params['relation'] : FE_Relation(params['relation'])) : FE_Relation();
            this['ethnicity'] = (params && params['ethnicity']) ? ((ko.isObservable(params['ethnicity'])) ? params['ethnicity'] : FE_Ethnicity(params['ethnicity'])) : FE_Ethnicity();
            this['otherEthnicity'] = (params && params['otherEthnicity']) ? ((ko.isObservable(params['otherEthnicity'])) ? params['otherEthnicity'] : FE_OtherEthnicity(params['otherEthnicity'])) : FE_OtherEthnicity();
        }
        return FS_FamilialEthnicity;
    })();
    return FS_FamilialEthnicity;
});
