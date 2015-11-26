// require.js looks for the following global when initializing
var require = {
    baseUrl: '..',
    paths: {
        "bootstrap":            "bower_modules/components-bootstrap/js/bootstrap.min",
        "crossroads":           "bower_modules/crossroads/dist/crossroads.min",
        "hasher":               "bower_modules/hasher/dist/js/hasher.min",
        "jquery":               "bower_modules/jquery/dist/jquery",
        "jquery-transit":       "bower_modules/jquery.transit/jquery.transit",
        "knockout":             "bower_modules/knockout/dist/knockout",
        "knockout-punches":     "bower_modules/knockout.punches/knockout.punches",
        "signals":              "bower_modules/js-signals/dist/signals.min",
        "text":                 "bower_modules/requirejs-text/text",
        "moment":               "bower_modules/moment/moment",
        "bluebird":             "bower_modules/bluebird/js/browser/bluebird"
    },
    shim: {
        "bootstrap": { deps: ["jquery"] },
        "knockout-punches": {
            deps: ["knockout"],
            export: "ko"
        },
        "jquery-transit": {
            deps: ["jquery"],
            export: "$"
        }
    },
    config: {
        moment: {
            noGlobal: true
        }
    }
};
