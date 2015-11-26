/// <amd-dependency path="text!components/form/fe-other-ethnicity/fe-other-ethnicity.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-other-ethnicity/fe-other-ethnicity.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-other-ethnicity/fe-other-ethnicity.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_OtherEthnicityViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_OtherEthnicityViewModel = (function () {
        function FE_OtherEthnicityViewModel(params) {
            this.metadata = {
                "ClassName": "FE_OtherEthnicity",
                "Component Name": "fe-other-ethnicity",
                "Description": "",
                "Form Element Name": "Other Ethnicity",
                "Form Input Component": [
                    "di-other-ethnicity"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_OtherEthnicity",
                        "propertyName": "otherEthnicity"
                    }
                ],
                "Question Text": "Other Ethnicity:",
                "Short Name": "Other Ethnicity"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_OtherEthnicityViewModel;
    })();
    exports.FE_OtherEthnicityViewModel = FE_OtherEthnicityViewModel;
});
