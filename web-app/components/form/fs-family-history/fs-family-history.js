/// <amd-dependency path="text!components/form/fs-family-history/fs-family-history.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fs-family-history/fs-family-history.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fs-family-history/fs-family-history.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FS_FamilyHistoryViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FS_FamilyHistoryViewModel = (function () {
        function FS_FamilyHistoryViewModel(params) {
            this.metadata = {
                "ClassName": "FS_FamilyHistory",
                "Component Name": "fs-family-history",
                "Description": "",
                "Form Element Component": [
                    {
                        "component": "fe-added-on"
                    },
                    {
                        "component": "fe-anonymised"
                    },
                    {
                        "component": "fe-notes"
                    },
                    {
                        "component": "fe-consanguinity"
                    },
                    {
                        "component": "fe-consanguinity-details"
                    },
                    {
                        "component": "fe-history-details"
                    },
                    {
                        "component": "fe-ethnicity-notes"
                    }
                ],
                "Form Element Property": [
                    {
                        "className": "FE_AddedOn",
                        "propertyName": "addedOn"
                    },
                    {
                        "className": "FE_Anonymised",
                        "propertyName": "anonymised"
                    },
                    {
                        "className": "FE_Notes",
                        "propertyName": "notes"
                    },
                    {
                        "className": "FE_Consanguinity",
                        "propertyName": "consanguinity"
                    },
                    {
                        "className": "FE_ConsanguinityDetails",
                        "propertyName": "consanguinityDetails"
                    },
                    {
                        "className": "FE_HistoryDetails",
                        "propertyName": "historyDetails"
                    },
                    {
                        "className": "FE_EthnicityNotes",
                        "propertyName": "ethnicityNotes"
                    }
                ],
                "Form Section Name": "Family History",
                "Section Title": "Family History",
                "Short Name": "Family History"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.sectionTitle = params.sectionTitle || this.metadata['Section Title'];
            this.sectionHeaderText = params.sectionHeaderText || this.metadata['Section Header Text'];
            this.sectionFooterText = params.sectionFooterText || this.metadata['Section Footer Text'];
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FS_FamilyHistoryViewModel;
    })();
    exports.FS_FamilyHistoryViewModel = FS_FamilyHistoryViewModel;
});
