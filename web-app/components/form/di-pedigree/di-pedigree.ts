/// <amd-dependency path="text!components/form/di-pedigree/di-pedigree.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-pedigree/di-pedigree.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_PedigreeViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_PedigreeViewModel {
    public metadata = {
    "ClassName": "DI_Pedigree",
    "Component Name": "di-pedigree",
    "Control": "text",
    "Data Item Name": "Pedigree",
    "Datatype": "xs:string",
    "Description": "",
    "Short Name": "Pedigree"
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
