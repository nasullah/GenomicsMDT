/// <amd-dependency path="text!components/form/fe-pedigree-type/fe-pedigree-type.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-pedigree-type/fe-pedigree-type.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-pedigree-type/fe-pedigree-type.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_PedigreeTypeViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_PedigreeTypeViewModel = (function () {
        function FE_PedigreeTypeViewModel(params) {
            this.metadata = {
                "ClassName": "FE_PedigreeType",
                "Component Name": "fe-pedigree-type",
                "Description": "",
                "Form Element Name": "Pedigree Type",
                "Form Input Component": [
                    "di-pedigree-type"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_PedigreeType",
                        "propertyName": "pedigreeType"
                    }
                ],
                "Question Text": "Pedigree Type:",
                "Short Name": "Pedigree Type"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_PedigreeTypeViewModel;
    })();
    exports.FE_PedigreeTypeViewModel = FE_PedigreeTypeViewModel;
});
