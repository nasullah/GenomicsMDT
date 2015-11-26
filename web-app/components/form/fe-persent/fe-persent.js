/// <amd-dependency path="text!components/form/fe-persent/fe-persent.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-persent/fe-persent.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-persent/fe-persent.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_PersentViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_PersentViewModel = (function () {
        function FE_PersentViewModel(params) {
            this.metadata = {
                "ClassName": "FE_Persent",
                "Component Name": "fe-persent",
                "Description": "",
                "Form Element Name": "Persent",
                "Form Input Component": [
                    "di-persent"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_Persent",
                        "propertyName": "persent"
                    }
                ],
                "Question Text": "Persent:",
                "Short Name": "Persent"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_PersentViewModel;
    })();
    exports.FE_PersentViewModel = FE_PersentViewModel;
});
