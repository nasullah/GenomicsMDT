define(["require", "exports", "jquery", "knockout", "knockout-punches", "bootstrap", "app/components"], function (require, exports, $, ko) {
    ko.punches.enableAll();
    
    ko.applyBindings({
        callback: function(data) {
            console.log(ko.toJSON(data, null, 4));
        }
    });
});