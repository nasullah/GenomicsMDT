/// <amd-dependency path="text!components/form/di-ethnicity-notes/di-ethnicity-notes.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-ethnicity-notes/di-ethnicity-notes.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-ethnicity-notes/di-ethnicity-notes.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_EthnicityNotesViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_EthnicityNotesViewModel = (function () {
        function DI_EthnicityNotesViewModel(params) {
            this.metadata = {
                "ClassName": "DI_EthnicityNotes",
                "Component Name": "di-ethnicity-notes",
                "Control": "textarea",
                "Data Item Name": "Ethnicity Notes",
                "Datatype": "xs:text",
                "Description": "",
                "Short Name": "Ethnicity Notes"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.placeholder = params.placeholder || '';
            this.rows = (params.row && params.rows.toFixed(0)) || 1;
        }
        return DI_EthnicityNotesViewModel;
    })();
    exports.DI_EthnicityNotesViewModel = DI_EthnicityNotesViewModel;
});
