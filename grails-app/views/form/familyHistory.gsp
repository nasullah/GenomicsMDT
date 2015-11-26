<%--
  Created by IntelliJ IDEA.
  User: Nasullah.Alham
  Date: 02/10/2015
  Time: 14:04
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
</head>

<body>
<div data-bind="component: {name: formName, params: {submitCallback: callback}}"></div>

<script src="../app/require.config.js"></script>
<script src="../bower_modules/requirejs/require.js"></script>

<script >
    require(["jquery", "knockout", "models/F_FamilyHistoryForm", "models/FS_FamilialEthnicity", "knockout-punches", "bootstrap"], function ($, ko, F_FamilyHistoryForm, FS_FamilialEthnicity) {
        //ko.components.register("${componentName}", { template: {require: 'text!forms/output/${componentName}/${componentName}.html'}});
        ko.components.register('f-family-history-form', { require: 'components/form/f-family-history-form/f-family-history-form' });
        ko.components.register('fs-family-history', { require: 'components/form/fs-family-history/fs-family-history' });
        ko.components.register('fs-history-item', { require: 'components/form/fs-history-item/fs-history-item' });
        ko.components.register('fs-pedigree', { require: 'components/form/fs-pedigree/fs-pedigree' });
        ko.components.register('fs-familial-ethnicity', { require: 'components/form/fs-familial-ethnicity/fs-familial-ethnicity' });
        ko.components.register('fe-relation', { require: 'components/form/fe-relation/fe-relation' });
        ko.components.register('fe-condition', { require: 'components/form/fe-condition/fe-condition' });
        ko.components.register('fe-persent', { require: 'components/form/fe-persent/fe-persent' });
        ko.components.register('fe-pedigree', { require: 'components/form/fe-pedigree/fe-pedigree' });
        ko.components.register('fe-pedigree-type', { require: 'components/form/fe-pedigree-type/fe-pedigree-type' });
        ko.components.register('fe-ethnicity', { require: 'components/form/fe-ethnicity/fe-ethnicity' });
        ko.components.register('fe-other-ethnicity', { require: 'components/form/fe-other-ethnicity/fe-other-ethnicity' });
        ko.components.register('fe-consanguinity', { require: 'components/form/fe-consanguinity/fe-consanguinity' });
        ko.components.register('fe-consanguinity-details', { require: 'components/form/fe-consanguinity-details/fe-consanguinity-details' });
        ko.components.register('fe-history-details', { require: 'components/form/fe-history-details/fe-history-details' });
        ko.components.register('fe-ethnicity-notes', { require: 'components/form/fe-ethnicity-notes/fe-ethnicity-notes' });
        ko.components.register('fe-added-on', { require: 'components/form/fe-added-on/fe-added-on' });
        ko.components.register('fe-anonymised', { require: 'components/form/fe-anonymised/fe-anonymised' });
        ko.components.register('fe-notes', { require: 'components/form/fe-notes/fe-notes' });
        ko.components.register('di-relation', { require: 'components/form/di-relation/di-relation' });
        ko.components.register('di-condition', { require: 'components/form/di-condition/di-condition' });
        ko.components.register('di-persent', { require: 'components/form/di-persent/di-persent' });
        ko.components.register('di-pedigree', { require: 'components/form/di-pedigree/di-pedigree' });
        ko.components.register('di-pedigree-type', { require: 'components/form/di-pedigree-type/di-pedigree-type' });
        ko.components.register('di-ethnicity', { require: 'components/form/di-ethnicity/di-ethnicity' });
        ko.components.register('di-other-ethnicity', { require: 'components/form/di-other-ethnicity/di-other-ethnicity' });
        ko.components.register('di-consanguinity', { require: 'components/form/di-consanguinity/di-consanguinity' });
        ko.components.register('di-consanguinity-details', { require: 'components/form/di-consanguinity-details/di-consanguinity-details' });
        ko.components.register('di-history-details', { require: 'components/form/di-history-details/di-history-details' });
        ko.components.register('di-ethnicity-notes', { require: 'components/form/di-ethnicity-notes/di-ethnicity-notes' });
        ko.components.register('di-added-on', { require: 'components/form/di-added-on/di-added-on' });
        ko.components.register('di-anonymised', { require: 'components/form/di-anonymised/di-anonymised' });
        ko.components.register('di-notes', { require: 'components/form/di-notes/di-notes' });

        ko.punches.enableAll();

        //var instance = new F_FamilyHistoryForm();
//        instance.familialEthnicity = new FS_FamilialEthnicity();
//        instance.familialEthnicity.otherEthnicity = 'other';
//        instance.familyHistory = {};
//        instance.historyItem = {};
//        instance.pedigree = {};

        ko.applyBindings({
            formName: "${componentName}",
//            instance: instance,
            callback: function(data) {
                console.log(ko.toJSON(data, null, 4));
                var params = {
                    formComponent: "${componentName}",
                    jsonContent: JSON.stringify(data),
                    referralRecord:"${referralRecord}"
                };
                $.ajax({
                    type: 'POST',
                    url: "/genomicsmdt/attachedEvidence/save",
                    data: params,
                    dataType: 'json',
                    async: false,
                    success: window.location="${createLink(controller:'referralRecord', action:'show', id:"${referralRecord}")}"
                }).done(function(data){
                    console.log("Success");
                }).error(function(error) {
                    console.log(error);
                });

            }

        });
    });
</script>
<div id="success"></div>
</body>
</html>