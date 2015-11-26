/// <amd-dependency path="text!components/form/di-other-ethnicity/di-other-ethnicity.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-other-ethnicity/di-other-ethnicity.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-other-ethnicity/di-other-ethnicity.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_OtherEthnicityViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_OtherEthnicityViewModel = (function () {
        function DI_OtherEthnicityViewModel(params) {
            this.metadata = {
                "ClassName": "DI_OtherEthnicity",
                "Component Name": "di-other-ethnicity",
                "Control": "text",
                "Data Item Name": "Other Ethnicity",
                "Datatype": "xs:string",
                "Description": "",
                "Short Name": "Other Ethnicity"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.placeholder = params.placeholder || '';
        }
        return DI_OtherEthnicityViewModel;
    })();
    exports.DI_OtherEthnicityViewModel = DI_OtherEthnicityViewModel;
});
