/// <amd-dependency path="text!components/form/fs-familial-ethnicity/fs-familial-ethnicity.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fs-familial-ethnicity/fs-familial-ethnicity.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FS_FamilialEthnicityViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FS_FamilialEthnicityViewModel {
    public metadata = {
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
