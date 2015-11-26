/// <amd-dependency path="text!components/form/di-consanguinity/di-consanguinity.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-consanguinity/di-consanguinity.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-consanguinity/di-consanguinity.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_ConsanguinityViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_ConsanguinityViewModel = (function () {
        function DI_ConsanguinityViewModel(params) {
            this.metadata = {
                "ClassName": "DI_Consanguinity",
                "Component Name": "di-consanguinity",
                "Control": "select1",
                "Data Item Name": "Consanguinity",
                "Datatype": "xs:string",
                "Description": "",
                "Enumeration": [
                    {
                        "key": "1",
                        "value": "Yes"
                    },
                    {
                        "key": "2",
                        "value": "No"
                    },
                    {
                        "key": "99",
                        "value": "Not Known"
                    }
                ],
                "Short Name": "Consanguinity"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.options = this.metadata.Enumeration;
        }
        return DI_ConsanguinityViewModel;
    })();
    exports.DI_ConsanguinityViewModel = DI_ConsanguinityViewModel;
});
