/// <amd-dependency path="text!components/form/fe-consanguinity-details/fe-consanguinity-details.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-consanguinity-details/fe-consanguinity-details.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-consanguinity-details/fe-consanguinity-details.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_ConsanguinityDetailsViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_ConsanguinityDetailsViewModel = (function () {
        function FE_ConsanguinityDetailsViewModel(params) {
            this.metadata = {
                "ClassName": "FE_ConsanguinityDetails",
                "Component Name": "fe-consanguinity-details",
                "Description": "",
                "Form Element Name": "Consanguinity Details",
                "Form Input Component": [
                    "di-consanguinity-details"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_ConsanguinityDetails",
                        "propertyName": "consanguinityDetails"
                    }
                ],
                "Question Text": "Consanguinity Details:",
                "Short Name": "Consanguinity Details"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_ConsanguinityDetailsViewModel;
    })();
    exports.FE_ConsanguinityDetailsViewModel = FE_ConsanguinityDetailsViewModel;
});
