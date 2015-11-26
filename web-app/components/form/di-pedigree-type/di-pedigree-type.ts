/// <amd-dependency path="text!components/form/di-pedigree-type/di-pedigree-type.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-pedigree-type/di-pedigree-type.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_PedigreeTypeViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_PedigreeTypeViewModel {
    public metadata = {
    "ClassName": "DI_PedigreeType",
    "Component Name": "di-pedigree-type",
    "Control": "text",
    "Data Item Name": "Pedigree Type",
    "Datatype": "xs:string",
    "Description": "",
    "Short Name": "Pedigree Type"
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
