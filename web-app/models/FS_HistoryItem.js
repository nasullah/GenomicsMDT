define(["require", "exports", "knockout", "./FE_Relation", "./FE_Condition", "./FE_Persent"], function (require, exports, ko, FE_Relation, FE_Condition, FE_Persent) {
    var FS_HistoryItem = (function () {
        function FS_HistoryItem(params) {
            this['relation'] = (params && params['relation']) ? ((ko.isObservable(params['relation'])) ? params['relation'] : FE_Relation(params['relation'])) : FE_Relation();
            this['condition'] = (params && params['condition']) ? ((ko.isObservable(params['condition'])) ? params['condition'] : FE_Condition(params['condition'])) : FE_Condition();
            this['persent'] = (params && params['persent']) ? ((ko.isObservable(params['persent'])) ? params['persent'] : FE_Persent(params['persent'])) : FE_Persent();
        }
        return FS_HistoryItem;
    })();
    return FS_HistoryItem;
});
