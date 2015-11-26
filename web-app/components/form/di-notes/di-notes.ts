/// <amd-dependency path="text!components/form/di-notes/di-notes.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-notes/di-notes.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_NotesViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_NotesViewModel {
    public metadata = {
    "ClassName": "DI_Notes",
    "Component Name": "di-notes",
    "Control": "textarea",
    "Data Item Name": "Notes",
    "Datatype": "xs:text",
    "Description": "",
    "Short Name": "Notes"
};
    public data: KnockoutObservable<any>;
    public id: string;
    public name: string;
    public placeholder: string;
    public rows: number;

    constructor(params: any) {
        this.data = params.data || ko.observable('');
        this.id = params.id;
        this.name = params.name;
        this.placeholder = params.placeholder || '';
        this.rows = (params.row && params.rows.toFixed(0)) || 1;
    }
}
