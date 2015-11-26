/// <amd-dependency path="text!components/form/fe-anonymised/fe-anonymised.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-anonymised/fe-anonymised.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_AnonymisedViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_AnonymisedViewModel {
    public metadata = {
    "ClassName": "FE_Anonymised",
    "Component Name": "fe-anonymised",
    "Description": "",
    "Form Element Name": "Anonymised",
    "Form Input Component": [
        "di-anonymised"
    ],
    "Form Input Property": [
        {
            "className": "DI_Anonymised",
            "propertyName": "anonymised"
        }
    ],
    "Question Text": "Anonymised:",
    "Short Name": "Anonymised"
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
