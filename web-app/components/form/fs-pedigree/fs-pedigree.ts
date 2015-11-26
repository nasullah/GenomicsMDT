/// <amd-dependency path="text!components/form/fs-pedigree/fs-pedigree.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fs-pedigree/fs-pedigree.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FS_PedigreeViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FS_PedigreeViewModel {
    public metadata = {
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
