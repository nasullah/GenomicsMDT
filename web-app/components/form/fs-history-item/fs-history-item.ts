/// <amd-dependency path="text!components/form/fs-history-item/fs-history-item.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fs-history-item/fs-history-item.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FS_HistoryItemViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FS_HistoryItemViewModel {
    public metadata = {
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
    public data: KnockoutObservable<any>;
    public id: string;
    public name: string;
    public sectionTitle: any;
    public sectionHeaderText: any;
    public sectionFooterText: any;
    public cssClass: KnockoutObservable<string>;

    constructor(params: any) {
        this.data = params.data;
        this.id = params.id;
        this.name = params.name;
        this.sectionTitle = params.sectionTitle || this.metadata['Section Title'];
        this.sectionHeaderText = params.sectionHeaderText || this.metadata['Section Header Text'];
        this.sectionFooterText = params.sectionFooterText || this.metadata['Section Footer Text'];
        this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
    }
}
