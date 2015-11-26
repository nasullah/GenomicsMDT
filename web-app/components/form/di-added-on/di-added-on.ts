/// <amd-dependency path="text!components/form/di-added-on/di-added-on.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-added-on/di-added-on.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_AddedOnViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_AddedOnViewModel {
    public metadata = {
    "ClassName": "DI_AddedOn",
    "Component Name": "di-added-on",
    "Control": "date",
    "Data Item Name": "Added On",
    "Datatype": "xs:date",
    "Description": "",
    "Short Name": "Added On"
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
