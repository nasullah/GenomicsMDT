/// <amd-dependency path="text!components/form/fe-consanguinity/fe-consanguinity.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-consanguinity/fe-consanguinity.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_ConsanguinityViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_ConsanguinityViewModel {
    public metadata = {
    "ClassName": "FE_Consanguinity",
    "Component Name": "fe-consanguinity",
    "Description": "",
    "Form Element Name": "Consanguinity",
    "Form Input Component": [
        "di-consanguinity"
    ],
    "Form Input Property": [
        {
            "className": "DI_Consanguinity",
            "propertyName": "consanguinity"
        }
    ],
    "Question Text": "Consanguinity:",
    "Short Name": "Consanguinity"
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
