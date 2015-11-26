/// <amd-dependency path="text!components/form/fe-pedigree/fe-pedigree.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-pedigree/fe-pedigree.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_PedigreeViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_PedigreeViewModel {
    public metadata = {
    "ClassName": "FE_Pedigree",
    "Component Name": "fe-pedigree",
    "Description": "",
    "Form Element Name": "Pedigree",
    "Form Input Component": [
        "di-pedigree"
    ],
    "Form Input Property": [
        {
            "className": "DI_Pedigree",
            "propertyName": "pedigree"
        }
    ],
    "Question Text": "Pedigree:",
    "Short Name": "Pedigree"
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
