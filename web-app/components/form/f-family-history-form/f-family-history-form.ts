/// <amd-dependency path="text!components/form/f-family-history-form/f-family-history-form.html!strip" />

import ko = require("knockout");
import F_FamilyHistoryForm = require("models/F_FamilyHistoryForm");

// For registering with Knockout component registry
export var template: string = require("text!components/form/f-family-history-form/f-family-history-form.html!strip");
export var viewModel = {
    createViewModel: function(params, componentInfo) {
        return new F_FamilyHistoryFormViewModel(params);
    }
};
export var synchronous = true;

var noSubmitCallback = (o?: any) => {
    console.log('No callback supplied to submit form');
};

//View Model
class F_FamilyHistoryFormViewModel {
    public metadata = {
    "ClassName": "F_FamilyHistoryForm",
    "Component Name": "f-family-history-form",
    "Description": "",
    "Form Name": "Family History Form",
    "Form Section Component": [
        {
            "component": "fs-family-history"
        },
        {
            "component": "fs-history-item"
        },
        {
            "component": "fs-pedigree"
        },
        {
            "component": "fs-familial-ethnicity"
        }
    ],
    "Form Section Property": [
        {
            "className": "FS_FamilyHistory",
            "propertyName": "familyHistory"
        },
        {
            "className": "FS_HistoryItem",
            "propertyName": "historyItem"
        },
        {
            "className": "FS_Pedigree",
            "propertyName": "pedigree"
        },
        {
            "className": "FS_FamilialEthnicity",
            "propertyName": "familialEthnicity"
        }
    ],
    "Form Title": "Family History Form",
    "Short Name": "Family History Form"
};
    public data: KnockoutObservable<any>;
    public id: string;
    public name: string;
    public formTitle: any;
    public formHeaderText: any;
    public formFooterText: any;
    public submitCallback: Function;

    constructor(params: any) {
        this.data = params.data || ko.observable(new F_FamilyHistoryForm());
        this.id = params.id;
        this.name = params.name;
        this.formTitle = params.formTitle || this.metadata['Form Title'];
        this.formHeaderText = params.formHeaderText || this.metadata['Form Header Text'];
        this.formFooterText = params.formFooterText || this.metadata['Form Footer Text'];
        this.submitCallback = params.submitCallback || noSubmitCallback;
    }

    public submitForm() {
        this.submitCallback(ko.toJS(this.data()));
    }
}
