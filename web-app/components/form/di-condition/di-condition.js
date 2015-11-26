/// <amd-dependency path="text!components/form/di-condition/di-condition.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-condition/di-condition.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-condition/di-condition.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_ConditionViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_ConditionViewModel = (function () {
        function DI_ConditionViewModel(params) {
            this.metadata = {
                "ClassName": "DI_Condition",
                "Component Name": "di-condition",
                "Control": "select1",
                "Data Item Name": "Condition",
                "Datatype": "xs:string",
                "Description": "",
                "Enumeration": [
                    {
                        "key": "1",
                        "value": "Term1"
                    },
                    {
                        "key": "2",
                        "value": "Term2"
                    }
                ],
                "Short Name": "Condition"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.options = this.metadata.Enumeration;
        }
        return DI_ConditionViewModel;
    })();
    exports.DI_ConditionViewModel = DI_ConditionViewModel;
});
