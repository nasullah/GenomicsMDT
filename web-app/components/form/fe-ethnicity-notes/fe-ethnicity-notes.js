/// <amd-dependency path="text!components/form/fe-ethnicity-notes/fe-ethnicity-notes.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-ethnicity-notes/fe-ethnicity-notes.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-ethnicity-notes/fe-ethnicity-notes.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_EthnicityNotesViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_EthnicityNotesViewModel = (function () {
        function FE_EthnicityNotesViewModel(params) {
            this.metadata = {
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
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_EthnicityNotesViewModel;
    })();
    exports.FE_EthnicityNotesViewModel = FE_EthnicityNotesViewModel;
});
