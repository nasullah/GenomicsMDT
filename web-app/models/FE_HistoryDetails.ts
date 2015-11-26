import ko = require("knockout");

var multiple = false;

var FE_HistoryDetails = function(params?: any) {
    var target = null;

    if (ko.isObservable(params)) {
        target = params;
    } else if (Array.isArray(params)) {
        target = ko.observableArray(params);
    } else if (params) {
        if (multiple) {
            target = ko.observableArray([params]);
        } else {
            target = ko.observable(params);
        }
    } else {
        if (multiple) {
            target = ko.observableArray([]);
        } else {
            target = ko.observable();
        }
    }

    //TODO: Attach validation rule to target

    return target;
};

export = FE_HistoryDetails;
