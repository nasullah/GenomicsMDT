/// <amd-dependency path="text!components/form/fe-notes/fe-notes.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-notes/fe-notes.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-notes/fe-notes.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_NotesViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_NotesViewModel = (function () {
        function FE_NotesViewModel(params) {
            this.metadata = {
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
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_NotesViewModel;
    })();
    exports.FE_NotesViewModel = FE_NotesViewModel;
});
