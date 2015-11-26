define(["require", "exports", "knockout", "./FE_Pedigree", "./FE_PedigreeType"], function (require, exports, ko, FE_Pedigree, FE_PedigreeType) {
    var FS_Pedigree = (function () {
        function FS_Pedigree(params) {
            this['pedigree'] = (params && params['pedigree']) ? ((ko.isObservable(params['pedigree'])) ? params['pedigree'] : FE_Pedigree(params['pedigree'])) : FE_Pedigree();
            this['pedigreeType'] = (params && params['pedigreeType']) ? ((ko.isObservable(params['pedigreeType'])) ? params['pedigreeType'] : FE_PedigreeType(params['pedigreeType'])) : FE_PedigreeType();
        }
        return FS_Pedigree;
    })();
    return FS_Pedigree;
});
