/// <amd-dependency path="text!components/form/fe-consanguinity-details/fe-consanguinity-details.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-consanguinity-details/fe-consanguinity-details.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_ConsanguinityDetailsViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_ConsanguinityDetailsViewModel {
    public metadata = {
    "ClassName": "FE_ConsanguinityDetails",
    "Component Name": "fe-consanguinity-details",
    "Description": "",
    "Form Element Name": "Consanguinity Details",
    "Form Input Component": [
        "di-consanguinity-details"
    ],
    "Form Input Property": [
        {
            "className": "DI_ConsanguinityDetails",
            "propertyName": "consanguinityDetails"
        }
    ],
    "Question Text": "Consanguinity Details:",
    "Short Name": "Consanguinity Details"
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
