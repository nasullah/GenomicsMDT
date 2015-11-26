/// <amd-dependency path="text!components/form/fe-history-details/fe-history-details.html!strip" />
define(["require", "exports", "knockout", "text!components/form/fe-history-details/fe-history-details.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/fe-history-details/fe-history-details.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new FE_HistoryDetailsViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var FE_HistoryDetailsViewModel = (function () {
        function FE_HistoryDetailsViewModel(params) {
            this.metadata = {
                "ClassName": "FE_HistoryDetails",
                "Component Name": "fe-history-details",
                "Description": "",
                "Form Element Name": "History Details",
                "Form Input Component": [
                    "di-history-details"
                ],
                "Form Input Property": [
                    {
                        "className": "DI_HistoryDetails",
                        "propertyName": "historyDetails"
                    }
                ],
                "Question Text": "History Details:",
                "Short Name": "History Details"
            };
            this.data = params.data;
            this.id = params.id;
            this.name = params.name;
            this.questionText = params.questionText || ko.observable(this.metadata['Question Text']);
            this.cssClass = params.cssClass || ko.observable(this.metadata['CSS Class']);
        }
        return FE_HistoryDetailsViewModel;
    })();
    exports.FE_HistoryDetailsViewModel = FE_HistoryDetailsViewModel;
});
