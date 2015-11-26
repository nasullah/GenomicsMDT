/// <amd-dependency path="text!components/form/fs-pedigree/fs-pedigree.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fs-pedigree/fs-pedigree.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fs-pedigree/fs-pedigree.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FS_PedigreeViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FS_PedigreeViewModel = (function () {
        function FS_PedigreeViewModel(params) {
            this.metadata = {
                "ClassName": "FS_Pedigree",
                "Component Name": "fs-pedigree",
                "Description": "",
                "Form Element Component": [
                    {
                        "component": "fe-pedigree"
                    },
                    {
                        "component": "fe-pedigree-type"
                    }
                ],
                "Form Element Property": [
                    {
                        "className": "FE_Pedigree",
                        "propertyName": "pedigree"
                    },
                    {
                        "className": "FE_PedigreeType",
                        "propertyName": "pedigreeType"
                    }
                ],
                "Form Section Name": "Pedigree",
                "Section Title": "Pedigree",
                "Short Name": "Pedigree"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.sectionTitle = params.sectionTitle || this.metadata['Section Title'];
            this.sectionHeaderText = params.sectionHeaderText || this.metadata['Section Header Text'];
            this.sectionFooterText = params.sectionFooterText || this.metadata['Section Footer Text'];
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FS_PedigreeViewModel;
    })();
    exports.FS_PedigreeViewModel = FS_PedigreeViewModel;
});
