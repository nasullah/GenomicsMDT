/// <amd-dependency path="text!components/form/fe-persent/fe-persent.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-persent/fe-persent.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_PersentViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_PersentViewModel {
    public metadata = {
    "ClassName": "FE_Persent",
    "Component Name": "fe-persent",
    "Description": "",
    "Form Element Name": "Persent",
    "Form Input Component": [
        "di-persent"
    ],
    "Form Input Property": [
        {
            "className": "DI_Persent",
            "propertyName": "persent"
        }
    ],
    "Question Text": "Persent:",
    "Short Name": "Persent"
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
