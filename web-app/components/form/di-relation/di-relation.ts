/// <amd-dependency path="text!components/form/di-relation/di-relation.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-relation/di-relation.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_RelationViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_RelationViewModel {
    public metadata = {
    "ClassName": "DI_Relation",
    "Component Name": "di-relation",
    "Control": "select1",
    "Data Item Name": "Relation",
    "Datatype": "xs:string",
    "Description": "",
    "Enumeration": [
        {
            "key": "1",
            "value": "Maternal"
        },
        {
            "key": "2",
            "value": "Paternal"
        }
    ],
    "Short Name": "Relation"
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
