/// <amd-dependency path="text!components/form/fe-ethnicity-notes/fe-ethnicity-notes.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-ethnicity-notes/fe-ethnicity-notes.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_EthnicityNotesViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_EthnicityNotesViewModel {
    public metadata = {
    "ClassName": "FE_EthnicityNotes",
    "Component Name": "fe-ethnicity-notes",
    "Description": "",
    "Form Element Name": "Ethnicity Notes",
    "Form Input Component": [
        "di-ethnicity-notes"
    ],
    "Form Input Property": [
        {
            "className": "DI_EthnicityNotes",
            "propertyName": "ethnicityNotes"
        }
    ],
    "Question Text": "Ethnicity Notes:",
    "Short Name": "Ethnicity Notes"
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
