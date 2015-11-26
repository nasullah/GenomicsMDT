/// <amd-dependency path="text!components/form/fe-ethnicity/fe-ethnicity.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-ethnicity/fe-ethnicity.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_EthnicityViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_EthnicityViewModel {
    public metadata = {
    "ClassName": "FE_Ethnicity",
    "Component Name": "fe-ethnicity",
    "Description": "",
    "Form Element Name": "Ethnicity",
    "Form Input Component": [
        "di-ethnicity"
    ],
    "Form Input Property": [
        {
            "className": "DI_Ethnicity",
            "propertyName": "ethnicity"
        }
    ],
    "Question Text": "Ethnicity:",
    "Short Name": "Ethnicity"
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
