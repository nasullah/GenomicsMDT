/// <amd-dependency path="text!components/form/fe-notes/fe-notes.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-notes/fe-notes.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_NotesViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_NotesViewModel {
    public metadata = {
    "ClassName": "FE_Notes",
    "Component Name": "fe-notes",
    "Description": "",
    "Form Element Name": "Notes",
    "Form Input Component": [
        "di-notes"
    ],
    "Form Input Property": [
        {
            "className": "DI_Notes",
            "propertyName": "notes"
        }
    ],
    "Question Text": "Notes:",
    "Short Name": "Notes"
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
