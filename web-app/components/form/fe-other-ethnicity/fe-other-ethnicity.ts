/// <amd-dependency path="text!components/form/fe-other-ethnicity/fe-other-ethnicity.html!strip" />

import ko = require("knockout");

// For registering with Knockout component registry
export var template: string = require("text!components/form/fe-other-ethnicity/fe-other-ethnicity.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new FE_OtherEthnicityViewModel(params);
    }
};
export var synchronous = true;

//View Model
export class FE_OtherEthnicityViewModel {
    public metadata = {
    "ClassName": "FE_OtherEthnicity",
    "Component Name": "fe-other-ethnicity",
    "Description": "",
    "Form Element Name": "Other Ethnicity",
    "Form Input Component": [
        "di-other-ethnicity"
    ],
    "Form Input Property": [
        {
            "className": "DI_OtherEthnicity",
            "propertyName": "otherEthnicity"
        }
    ],
    "Question Text": "Other Ethnicity:",
    "Short Name": "Other Ethnicity"
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
