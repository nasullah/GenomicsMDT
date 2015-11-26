/// <amd-dependency path="text!components/form/di-pedigree-type/di-pedigree-type.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-pedigree-type/di-pedigree-type.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-pedigree-type/di-pedigree-type.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_PedigreeTypeViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_PedigreeTypeViewModel = (function () {
        function DI_PedigreeTypeViewModel(params) {
            this.metadata = {
                "ClassName": "DI_PedigreeType",
                "Component Name": "di-pedigree-type",
                "Control": "text",
                "Data Item Name": "Pedigree Type",
                "Datatype": "xs:string",
                "Description": "",
                "Short Name": "Pedigree Type"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.placeholder = params.placeholder || '';
        }
        return DI_PedigreeTypeViewModel;
    })();
    exports.DI_PedigreeTypeViewModel = DI_PedigreeTypeViewModel;
});
