/// <amd-dependency path="text!components/form/fs-family-history/fs-family-history.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fs-family-history/fs-family-history.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FS_FamilyHistoryViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FS_FamilyHistoryViewModel {
    public metadata = {
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
