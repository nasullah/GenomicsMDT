/// <amd-dependency path="text!components/form/di-added-on/di-added-on.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-added-on/di-added-on.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-added-on/di-added-on.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_AddedOnViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_AddedOnViewModel = (function () {
        function DI_AddedOnViewModel(params) {
            this.metadata = {
                "ClassName": "DI_AddedOn",
                "Component Name": "di-added-on",
                "Control": "date",
                "Data Item Name": "Added On",
                "Datatype": "xs:date",
                "Description": "",
                "Short Name": "Added On"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.placeholder = params.placeholder || '';
        }
        return DI_AddedOnViewModel;
    })();
    exports.DI_AddedOnViewModel = DI_AddedOnViewModel;
});
