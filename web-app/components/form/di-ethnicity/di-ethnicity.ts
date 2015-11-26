/// <amd-dependency path="text!components/form/di-ethnicity/di-ethnicity.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-ethnicity/di-ethnicity.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_EthnicityViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_EthnicityViewModel {
    public metadata = {
    "ClassName": "DI_Ethnicity",
    "Component Name": "di-ethnicity",
    "Control": "select1",
    "Data Item Name": "Ethnicity",
    "Datatype": "xs:string",
    "Description": "",
    "Enumeration": [
        {
            "key": "1",
            "value": "Ethnicity1"
        },
        {
            "key": "2",
            "value": "Ethnicity2"
        },
        {
            "key": "99",
            "value": "Not Known"
        }
    ],
    "Short Name": "Ethnicity"
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
