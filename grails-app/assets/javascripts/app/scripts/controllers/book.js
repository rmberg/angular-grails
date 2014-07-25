'use strict';

/**
 * @ngdoc function
 * @name app.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the app
 */
angular.module('app')
  .controller('BookCtrl', function ($scope, $resource) {

            var Book = $resource('http://localhost:8080/angular-grails/book/:id.json', {id:'@id'});

            var results = Book.query();

            $scope.results = results;
            console.log("Results: " + results.length);

  });
