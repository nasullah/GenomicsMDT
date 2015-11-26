/// <amd-dependency path="text!components/form/di-history-details/di-history-details.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-history-details/di-history-details.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-history-details/di-history-details.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_HistoryDetailsViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_HistoryDetailsViewModel = (function () {
        function DI_HistoryDetailsViewModel(params) {
            this.metadata = {
                "ClassName": "DI_HistoryDetails",
                "Component Name": "di-history-details",
                "Control": "text",
                "Data Item Name": "History Details",
                "Datatype": "xs:string",
                "Description": "",
                "Short Name": "History Details"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.placeholder = params.placeholder || '';
        }
        return DI_HistoryDetailsViewModel;
    })();
    exports.DI_HistoryDetailsViewModel = DI_HistoryDetailsViewModel;
});
