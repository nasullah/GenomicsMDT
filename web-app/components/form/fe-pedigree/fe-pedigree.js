/// <amd-dependency path="text!components/form/fe-pedigree/fe-pedigree.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-pedigree/fe-pedigree.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-pedigree/fe-pedigree.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_PedigreeViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_PedigreeViewModel = (function () {
        function FE_PedigreeViewModel(params) {
            this.metadata = {
                "ClassName": "FE_Pedigree",
                "Component Name": "fe-pedigree",
                "Description": "",
                "Form Element Name": "Pedigree",
                "Form Input Component": [
                    "di-pedigree"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_Pedigree",
                        "propertyName": "pedigree"
                    }
                ],
                "Question Text": "Pedigree:",
                "Short Name": "Pedigree"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_PedigreeViewModel;
    })();
    exports.FE_PedigreeViewModel = FE_PedigreeViewModel;
});
