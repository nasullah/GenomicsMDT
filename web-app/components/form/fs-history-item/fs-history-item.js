/// <amd-dependency path="text!components/form/fs-history-item/fs-history-item.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fs-history-item/fs-history-item.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fs-history-item/fs-history-item.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FS_HistoryItemViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FS_HistoryItemViewModel = (function () {
        function FS_HistoryItemViewModel(params) {
            this.metadata = {
                "ClassName": "FS_HistoryItem",
                "Component Name": "fs-history-item",
                "Description": "",
                "Form Element Component": [
                    {
                        "component": "fe-relation"
                    },
                    {
                        "component": "fe-condition"
                    },
                    {
                        "component": "fe-persent"
                    }
                ],
                "Form Element Property": [
                    {
                        "className": "FE_Relation",
                        "propertyName": "relation"
                    },
                    {
                        "className": "FE_Condition",
                        "propertyName": "condition"
                    },
                    {
                        "className": "FE_Persent",
                        "propertyName": "persent"
                    }
                ],
                "Form Section Name": "History Item",
                "Section Title": "History Item",
                "Short Name": "History Item"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.sectionTitle = params.sectionTitle || this.metadata['Section Title'];
            this.sectionHeaderText = params.sectionHeaderText || this.metadata['Section Header Text'];
            this.sectionFooterText = params.sectionFooterText || this.metadata['Section Footer Text'];
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FS_HistoryItemViewModel;
    })();
    exports.FS_HistoryItemViewModel = FS_HistoryItemViewModel;
});
