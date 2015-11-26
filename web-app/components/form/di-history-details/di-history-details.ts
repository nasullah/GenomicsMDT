/// <amd-dependency path="text!components/form/di-history-details/di-history-details.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/di-history-details/di-history-details.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new DI_HistoryDetailsViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class DI_HistoryDetailsViewModel {
    public metadata = {
    "ClassName": "DI_HistoryDetails",
    "Component Name": "di-history-details",
    "Control": "text",
    "Data Item Name": "History Details",
    "Datatype": "xs:string",
    "Description": "",
    "Short Name": "History Details"
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
