/// <amd-dependency path="text!components/form/fs-familial-ethnicity/fs-familial-ethnicity.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fs-familial-ethnicity/fs-familial-ethnicity.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fs-familial-ethnicity/fs-familial-ethnicity.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FS_FamilialEthnicityViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FS_FamilialEthnicityViewModel = (function () {
        function FS_FamilialEthnicityViewModel(params) {
            this.metadata = {
                "ClassName": "FS_FamilialEthnicity",
                "Component Name": "fs-familial-ethnicity",
                "Description": "",
                "Form Element Component": [
                    {
                        "component": "fe-relation"
                    },
                    {
                        "component": "fe-ethnicity"
                    },
                    {
                        "component": "fe-other-ethnicity"
                    }
                ],
                "Form Element Property": [
                    {
                        "className": "FE_Relation",
                        "propertyName": "relation"
                    },
                    {
                        "className": "FE_Ethnicity",
                        "propertyName": "ethnicity"
                    },
                    {
                        "className": "FE_OtherEthnicity",
                        "propertyName": "otherEthnicity"
                    }
                ],
                "Form Section Name": "Familial Ethnicity",
                "Section Title": "Familial Ethnicity",
                "Short Name": "Familial Ethnicity"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.sectionTitle = params.sectionTitle || this.metadata['Section Title'];
            this.sectionHeaderText = params.sectionHeaderText || this.metadata['Section Header Text'];
            this.sectionFooterText = params.sectionFooterText || this.metadata['Section Footer Text'];
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FS_FamilialEthnicityViewModel;
    })();
    exports.FS_FamilialEthnicityViewModel = FS_FamilialEthnicityViewModel;
});
