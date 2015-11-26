/// <amd-dependency path="text!components/form/fe-condition/fe-condition.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-condition/fe-condition.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_ConditionViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_ConditionViewModel {
    public metadata = {
    "ClassName": "FE_Condition",
    "Component Name": "fe-condition",
    "Description": "",
    "Form Element Name": "Condition",
    "Form Input Component": [
        "di-condition"
    ],
    "Form Input Property": [
        {
            "className": "DI_Condition",
            "propertyName": "condition"
        }
    ],
    "Question Text": "Condition:",
    "Short Name": "Condition"
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
