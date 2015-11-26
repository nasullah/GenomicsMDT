/// <amd-dependency path="text!components/form/fe-relation/fe-relation.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-relation/fe-relation.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_RelationViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_RelationViewModel {
    public metadata = {
    "ClassName": "FE_Relation",
    "Component Name": "fe-relation",
    "Description": "",
    "Form Element Name": "Relation",
    "Form Input Component": [
        "di-relation"
    ],
    "Form Input Property": [
        {
            "className": "DI_Relation",
            "propertyName": "relation"
        }
    ],
    "Question Text": "Relation:",
    "Short Name": "Relation"
};
    public data: KnockoutObservable<any>;
    public id: string;
    public name: string;
    public questionText: KnockoutObservable<string>;
    public cssClass: KnockoutObservable<string>;

    constructor(params: any) {
        this.data = params.data;
        this.id = params.id;
        this.name = params.name;
        this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
        this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
    }
}
