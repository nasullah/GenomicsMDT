/// <amd-dependency path="text!components/form/fe-condition/fe-condition.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-condition/fe-condition.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-condition/fe-condition.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_ConditionViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_ConditionViewModel = (function () {
        function FE_ConditionViewModel(params) {
            this.metadata = {
                "ClassName": "FE_Condition",
                "Component Name": "fe-condition",
                "Description": "",
                "Form Element Name": "Condition",
                "Form Input Component": [
                    "di-condition"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_Condition",
                        "propertyName": "condition"
                    }
                ],
                "Question Text": "Condition:",
                "Short Name": "Condition"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_ConditionViewModel;
    })();
    exports.FE_ConditionViewModel = FE_ConditionViewModel;
});
