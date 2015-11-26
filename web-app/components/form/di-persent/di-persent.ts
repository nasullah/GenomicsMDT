/// <amd-dependency path="text!components/form/di-persent/di-persent.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-persent/di-persent.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_PersentViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_PersentViewModel {
    public metadata = {
    "ClassName": "DI_Persent",
    "Component Name": "di-persent",
    "Control": "select1",
    "Data Item Name": "Persent",
    "Datatype": "xs:string",
    "Description": "",
    "Enumeration": [
        {
            "key": "1",
            "value": "Yes"
        },
        {
            "key": "2",
            "value": "No"
        },
        {
            "key": "99",
            "value": "Not Known"
        }
    ],
    "Short Name": "Persent"
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
