/// <amd-dependency path="text!components/form/di-anonymised/di-anonymised.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-anonymised/di-anonymised.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_AnonymisedViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_AnonymisedViewModel {
    public metadata = {
    "ClassName": "DI_Anonymised",
    "Component Name": "di-anonymised",
    "Control": "select1",
    "Data Item Name": "Anonymised",
    "Datatype": "xs:boolean",
    "Description": "",
    "Enumeration": [
        {
            "key": "Y",
            "value": "Yes"
        },
        {
            "key": "N",
            "value": "No"
        }
    ],
    "Short Name": "Anonymised"
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
