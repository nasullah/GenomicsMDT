/// <amd-dependency path="text!components/form/di-anonymised/di-anonymised.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-anonymised/di-anonymised.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-anonymised/di-anonymised.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_AnonymisedViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_AnonymisedViewModel = (function () {
        function DI_AnonymisedViewModel(params) {
            this.metadata = {
                "ClassName": "DI_Anonymised",
                "Component Name": "di-anonymised",
                "Control": "select1",
                "Data Item Name": "Anonymised",
                "Datatype": "xs:boolean",
                "Description": "",
                "Enumeration": [
                    {
                        "key": "Y",
                        "value": "Yes"
                    },
                    {
                        "key": "N",
                        "value": "No"
                    }
                ],
                "Short Name": "Anonymised"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.options = this.metadata.Enumeration;
        }
        return DI_AnonymisedViewModel;
    })();
    exports.DI_AnonymisedViewModel = DI_AnonymisedViewModel;
});
