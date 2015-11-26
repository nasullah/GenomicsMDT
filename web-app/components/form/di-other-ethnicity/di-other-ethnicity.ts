/// <amd-dependency path="text!components/form/di-other-ethnicity/di-other-ethnicity.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-other-ethnicity/di-other-ethnicity.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_OtherEthnicityViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_OtherEthnicityViewModel {
    public metadata = {
    "ClassName": "DI_OtherEthnicity",
    "Component Name": "di-other-ethnicity",
    "Control": "text",
    "Data Item Name": "Other Ethnicity",
    "Datatype": "xs:string",
    "Description": "",
    "Short Name": "Other Ethnicity"
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
