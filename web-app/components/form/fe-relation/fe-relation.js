/// <amd-dependency path="text!components/form/fe-relation/fe-relation.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-relation/fe-relation.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-relation/fe-relation.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_RelationViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_RelationViewModel = (function () {
        function FE_RelationViewModel(params) {
            this.metadata = {
                "ClassName": "FE_Relation",
                "Component Name": "fe-relation",
                "Description": "",
                "Form Element Name": "Relation",
                "Form Input Component": [
                    "di-relation"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_Relation",
                        "propertyName": "relation"
                    }
                ],
                "Question Text": "Relation:",
                "Short Name": "Relation"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_RelationViewModel;
    })();
    exports.FE_RelationViewModel = FE_RelationViewModel;
});
