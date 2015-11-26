/// <amd-dependency path="text!components/form/fe-ethnicity/fe-ethnicity.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-ethnicity/fe-ethnicity.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-ethnicity/fe-ethnicity.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_EthnicityViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_EthnicityViewModel = (function () {
        function FE_EthnicityViewModel(params) {
            this.metadata = {
                "ClassName": "FE_Ethnicity",
                "Component Name": "fe-ethnicity",
                "Description": "",
                "Form Element Name": "Ethnicity",
                "Form Input Component": [
                    "di-ethnicity"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_Ethnicity",
                        "propertyName": "ethnicity"
                    }
                ],
                "Question Text": "Ethnicity:",
                "Short Name": "Ethnicity"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_EthnicityViewModel;
    })();
    exports.FE_EthnicityViewModel = FE_EthnicityViewModel;
});
