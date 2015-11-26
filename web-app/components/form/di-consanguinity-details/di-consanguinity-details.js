/// <amd-dependency path="text!components/form/di-consanguinity-details/di-consanguinity-details.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-consanguinity-details/di-consanguinity-details.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-consanguinity-details/di-consanguinity-details.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_ConsanguinityDetailsViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_ConsanguinityDetailsViewModel = (function () {
        function DI_ConsanguinityDetailsViewModel(params) {
            this.metadata = {
                "ClassName": "DI_ConsanguinityDetails",
                "Component Name": "di-consanguinity-details",
                "Control": "text",
                "Data Item Name": "Consanguinity Details",
                "Datatype": "xs:string",
                "Description": "",
                "Short Name": "Consanguinity Details"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.placeholder = params.placeholder || '';
        }
        return DI_ConsanguinityDetailsViewModel;
    })();
    exports.DI_ConsanguinityDetailsViewModel = DI_ConsanguinityDetailsViewModel;
});
