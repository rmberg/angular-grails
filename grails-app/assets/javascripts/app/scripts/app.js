'use strict';

/**
 * @ngdoc overview
 * @name angularTemplateApp
 * @description
 * # angularTemplateApp
 *
 * Main module of the application.
 */
angular
        .module('app', [
//            'ngAnimate',
//            'ngCookies',
            'ngResource',
            'ngRoute'
//            'ngSanitize',
//            'ngTouch'
        ])
        .config(function ($routeProvider, $httpProvider) {
            $routeProvider
                    .when('/', {
                        templateUrl: 'partials/main.html',
                        controller: 'MainCtrl'
                    })
                    .when('/login', {
                        templateUrl: 'partials/login.html'
                    })
                    .when('/book', {
                        templateUrl: 'partials/book.html',
                        controller: 'BookCtrl'
                    })
                    .otherwise({
                        redirectTo: '/'
                    });

        });