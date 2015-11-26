/// <amd-dependency path="text!components/form/fe-added-on/fe-added-on.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-added-on/fe-added-on.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_AddedOnViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_AddedOnViewModel {
    public metadata = {
    "ClassName": "FE_AddedOn",
    "Component Name": "fe-added-on",
    "Description": "",
    "Form Element Name": "Added On",
    "Form Input Component": [
        "di-added-on"
    ],
    "Form Input Property": [
        {
            "className": "DI_AddedOn",
            "propertyName": "addedOn"
        }
    ],
    "Question Text": "Added On:",
    "Short Name": "Added On"
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
