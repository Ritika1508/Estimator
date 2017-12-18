'use strict';

/**
 * @ngdoc overview
 * @name myApplicationApp
 * @description
 * # myApplicationApp
 *
 * Main module of the application.
 */
angular
  .module('myApplicationApp', [
    'ngAnimate',
    'ngAria',
    'ngCookies',
    'ngMessages',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ngMaterial'
  ])
  .config(function ($routeProvider,$locationProvider,$httpProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'LoginCtrl'
      })
      .when('/homePage', {
        templateUrl: 'views/homePage.html',
        title: 'Welcome to Home Page',
        controller: 'HomepageCtrl',
      })
      .when('/searchcriteria', {
        templateUrl: 'views/searchcriteria.html',
      })
       .when('/useCases', {
        templateUrl: 'views/useCases.html',
        css: ['styles/useCase.css']

      })
       .when('/searchEstimation', {
        templateUrl: 'views/searchEstimation.html',
        controller:'searchJS'

      })
              .when('/welcomeUser', {
        templateUrl: 'views/welcomeUser.html',
        controller:'welcomeCtrl',

      })

      .otherwise({
        redirectTo: '/'
      });


      
  });
