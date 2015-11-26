/// <amd-dependency path="text!components/form/di-condition/di-condition.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-condition/di-condition.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_ConditionViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_ConditionViewModel {
    public metadata = {
    "ClassName": "DI_Condition",
    "Component Name": "di-condition",
    "Control": "select1",
    "Data Item Name": "Condition",
    "Datatype": "xs:string",
    "Description": "",
    "Enumeration": [
        {
            "key": "1",
            "value": "Term1"
        },
        {
            "key": "2",
            "value": "Term2"
        }
    ],
    "Short Name": "Condition"
};
    public data: KnockoutObservable<any>;
    public id: string;
    public name: string;
    public options: any[];

    constructor(params: any) {
        this.data = params.data || ko.observable('');
        this.id = params.id;
        this.name = params.name;
        this.options = this.metadata.Enumeration;
    }
}
