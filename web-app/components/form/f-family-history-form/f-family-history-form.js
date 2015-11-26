/// <amd-dependency path="text!components/form/f-family-history-form/f-family-history-form.html!strip" />
define(["require", "exports", "knockout", "models/F_FamilyHistoryForm", "text!components/form/f-family-history-form/f-family-history-form.html!strip"], function (require, exports, ko, F_FamilyHistoryForm) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/f-family-history-form/f-family-history-form.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new F_FamilyHistoryFormViewModel(params);
        }
    };
    exports.synchronous = true;
    var noSubmitCallback = function (o) {
        console.log('No callback supplied to submit form');
    };
    //View Model
    var F_FamilyHistoryFormViewModel = (function () {
        function F_FamilyHistoryFormViewModel(params) {
            this.metadata = {
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
            this.data = params.data || ko.observable(new F_FamilyHistoryForm());
            this.id = params.id;
            this.name = params.name;
            this.formTitle = params.formTitle || this.metadata['Form Title'];
            this.formHeaderText = params.formHeaderText || this.metadata['Form Header Text'];
            this.formFooterText = params.formFooterText || this.metadata['Form Footer Text'];
            this.submitCallback = params.submitCallback || noSubmitCallback;
        }
        F_FamilyHistoryFormViewModel.prototype.submitForm = function () {
            this.submitCallback(ko.toJS(this.data()));
        };
        return F_FamilyHistoryFormViewModel;
    })();
});
