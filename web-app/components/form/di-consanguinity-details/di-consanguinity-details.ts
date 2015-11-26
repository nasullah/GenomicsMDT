/// <amd-dependency path="text!components/form/di-consanguinity-details/di-consanguinity-details.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-consanguinity-details/di-consanguinity-details.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_ConsanguinityDetailsViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_ConsanguinityDetailsViewModel {
    public metadata = {
    "ClassName": "DI_ConsanguinityDetails",
    "Component Name": "di-consanguinity-details",
    "Control": "text",
    "Data Item Name": "Consanguinity Details",
    "Datatype": "xs:string",
    "Description": "",
    "Short Name": "Consanguinity Details"
};
    public id: string;
    public name: string;
    public placeholder: string;
    public data: KnockoutObservable<any>;

    constructor(params: any) {
        this.data = params.data || ko.observable('');
        this.id = params.id;
        this.name = params.name;
        this.placeholder = params.placeholder || '';
    }
}
