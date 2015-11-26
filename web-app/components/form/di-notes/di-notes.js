/// <amd-dependency path="text!components/form/di-notes/di-notes.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-notes/di-notes.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-notes/di-notes.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_NotesViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_NotesViewModel = (function () {
        function DI_NotesViewModel(params) {
            this.metadata = {
                "ClassName": "DI_Notes",
                "Component Name": "di-notes",
                "Control": "textarea",
                "Data Item Name": "Notes",
                "Datatype": "xs:text",
                "Description": "",
                "Short Name": "Notes"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.placeholder = params.placeholder || '';
            this.rows = (params.row && params.rows.toFixed(0)) || 1;
        }
        return DI_NotesViewModel;
    })();
    exports.DI_NotesViewModel = DI_NotesViewModel;
});
