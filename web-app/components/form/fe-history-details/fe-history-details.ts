/// <amd-dependency path="text!components/form/fe-history-details/fe-history-details.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-history-details/fe-history-details.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_HistoryDetailsViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_HistoryDetailsViewModel {
    public metadata = {
    "ClassName": "FE_HistoryDetails",
    "Component Name": "fe-history-details",
    "Description": "",
    "Form Element Name": "History Details",
    "Form Input Component": [
        "di-history-details"
    ],
    "Form Input Property": [
        {
            "className": "DI_HistoryDetails",
            "propertyName": "historyDetails"
        }
    ],
    "Question Text": "History Details:",
    "Short Name": "History Details"
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
