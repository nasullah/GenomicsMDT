/// <amd-dependency path="text!components/form/fe-pedigree-type/fe-pedigree-type.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-pedigree-type/fe-pedigree-type.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_PedigreeTypeViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_PedigreeTypeViewModel {
    public metadata = {
    "ClassName": "FE_PedigreeType",
    "Component Name": "fe-pedigree-type",
    "Description": "",
    "Form Element Name": "Pedigree Type",
    "Form Input Component": [
        "di-pedigree-type"
    ],
    "Form Input Property": [
        {
            "className": "DI_PedigreeType",
            "propertyName": "pedigreeType"
        }
    ],
    "Question Text": "Pedigree Type:",
    "Short Name": "Pedigree Type"
};
    public data: KnockoutObservable<any>;
    public id: string;
    public name: string;
    public questionText: KnockoutObservable<string>;
    public cssClass: KnockoutObservable<string>;

    constructor(params: any) {
        this.data = params.data;
        this.id = params.id;
        this.name = params.name;
        this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
        this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
    }
}
