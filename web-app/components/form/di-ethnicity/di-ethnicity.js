/// <amd-dependency path="text!components/form/di-ethnicity/di-ethnicity.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-ethnicity/di-ethnicity.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-ethnicity/di-ethnicity.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_EthnicityViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_EthnicityViewModel = (function () {
        function DI_EthnicityViewModel(params) {
            this.metadata = {
                "ClassName": "DI_Ethnicity",
                "Component Name": "di-ethnicity",
                "Control": "select1",
                "Data Item Name": "Ethnicity",
                "Datatype": "xs:string",
                "Description": "",
                "Enumeration": [
                    {
                        "key": "1",
                        "value": "Ethnicity1"
                    },
                    {
                        "key": "2",
                        "value": "Ethnicity2"
                    },
                    {
                        "key": "99",
                        "value": "Not Known"
                    }
                ],
                "Short Name": "Ethnicity"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.options = this.metadata.Enumeration;
        }
        return DI_EthnicityViewModel;
    })();
    exports.DI_EthnicityViewModel = DI_EthnicityViewModel;
});
