/// <amd-dependency path="text!components/form/fe-consanguinity/fe-consanguinity.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-consanguinity/fe-consanguinity.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-consanguinity/fe-consanguinity.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_ConsanguinityViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_ConsanguinityViewModel = (function () {
        function FE_ConsanguinityViewModel(params) {
            this.metadata = {
                "ClassName": "FE_Consanguinity",
                "Component Name": "fe-consanguinity",
                "Description": "",
                "Form Element Name": "Consanguinity",
                "Form Input Component": [
                    "di-consanguinity"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_Consanguinity",
                        "propertyName": "consanguinity"
                    }
                ],
                "Question Text": "Consanguinity:",
                "Short Name": "Consanguinity"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_ConsanguinityViewModel;
    })();
    exports.FE_ConsanguinityViewModel = FE_ConsanguinityViewModel;
});
