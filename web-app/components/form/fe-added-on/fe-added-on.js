/// <amd-dependency path="text!components/form/fe-added-on/fe-added-on.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-added-on/fe-added-on.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-added-on/fe-added-on.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_AddedOnViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_AddedOnViewModel = (function () {
        function FE_AddedOnViewModel(params) {
            this.metadata = {
                "ClassName": "FE_AddedOn",
                "Component Name": "fe-added-on",
                "Description": "",
                "Form Element Name": "Added On",
                "Form Input Component": [
                    "di-added-on"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_AddedOn",
                        "propertyName": "addedOn"
                    }
                ],
                "Question Text": "Added On:",
                "Short Name": "Added On"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_AddedOnViewModel;
    })();
    exports.FE_AddedOnViewModel = FE_AddedOnViewModel;
});
