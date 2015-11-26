/// <amd-dependency path="text!components/form/fe-anonymised/fe-anonymised.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-anonymised/fe-anonymised.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-anonymised/fe-anonymised.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_AnonymisedViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_AnonymisedViewModel = (function () {
        function FE_AnonymisedViewModel(params) {
            this.metadata = {
                "ClassName": "FE_Anonymised",
                "Component Name": "fe-anonymised",
                "Description": "",
                "Form Element Name": "Anonymised",
                "Form Input Component": [
                    "di-anonymised"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_Anonymised",
                        "propertyName": "anonymised"
                    }
                ],
                "Question Text": "Anonymised:",
                "Short Name": "Anonymised"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_AnonymisedViewModel;
    })();
    exports.FE_AnonymisedViewModel = FE_AnonymisedViewModel;
});
