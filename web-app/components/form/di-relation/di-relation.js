/// <amd-dependency path="text!components/form/di-relation/di-relation.html!strip" />
define(["require", "exports", "knockout", "text!components/form/di-relation/di-relation.html!strip"], function (require, exports, ko) {
    // For registering with Knockout component registry
    exports.template = require("text!components/form/di-relation/di-relation.html!strip");
    exports.viewModel = {
        createViewModel: function (params, componentInfo) {
            return new DI_RelationViewModel(params);
        }
    };
    exports.synchronous = true;
    //View Model
    var DI_RelationViewModel = (function () {
        function DI_RelationViewModel(params) {
            this.metadata = {
                "ClassName": "DI_Relation",
                "Component Name": "di-relation",
                "Control": "select1",
                "Data Item Name": "Relation",
                "Datatype": "xs:string",
                "Description": "",
                "Enumeration": [
                    {
                        "key": "1",
                        "value": "Maternal"
                    },
                    {
                        "key": "2",
                        "value": "Paternal"
                    }
                ],
                "Short Name": "Relation"
            };
            this.data = params.data || ko.observable('');
            this.id = params.id;
            this.name = params.name;
            this.options = this.metadata.Enumeration;
        }
        return DI_RelationViewModel;
    })();
    exports.DI_RelationViewModel = DI_RelationViewModel;
});
