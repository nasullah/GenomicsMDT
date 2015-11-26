/// <amd-dependency path="text!components/form/di-persent/di-persent.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-persent/di-persent.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-persent/di-persent.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_PersentViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_PersentViewModel = (function () {
        function DI_PersentViewModel(params) {
            this.metadata = {
                "ClassName": "DI_Persent",
                "Component Name": "di-persent",
                "Control": "select1",
                "Data Item Name": "Persent",
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
                "Short Name": "Persent"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.options = this.metadata.Enumeration;
        }
        return DI_PersentViewModel;
    })();
    exports.DI_PersentViewModel = DI_PersentViewModel;
});
