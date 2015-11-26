/// <amd-dependency path="text!components/form/di-pedigree/di-pedigree.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-pedigree/di-pedigree.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-pedigree/di-pedigree.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_PedigreeViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_PedigreeViewModel = (function () {
        function DI_PedigreeViewModel(params) {
            this.metadata = {
                "ClassName": "DI_Pedigree",
                "Component Name": "di-pedigree",
                "Control": "text",
                "Data Item Name": "Pedigree",
                "Datatype": "xs:string",
                "Description": "",
                "Short Name": "Pedigree"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.placeholder = params.placeholder || '';
        }
        return DI_PedigreeViewModel;
    })();
    exports.DI_PedigreeViewModel = DI_PedigreeViewModel;
});
