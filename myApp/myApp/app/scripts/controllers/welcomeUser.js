 'use strict';

/**
 * @ngdoc function
 * @name myApplicationApp.controller:LoginCtrl
 * @description
 * # LoginCtrl
 * Controller of the myApplicationApp
 */
angular.module('myApplicationApp')
  .controller('welcomeCtrl', function ($scope,$http,$location,authenticationService,$routeParams) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
    var self = this;
$scope.user=$routeParams.userEmail

    $scope.addNew = function(){
     
        $location.path('/homePage');
      
    };

        $scope.search = function(){

     
        $location.path('/searchEstimation');
      
    };


    $scope.myStyle = {
    "background-color" : "#FFFFFF",
   
    "margin": "0 auto 100px",
    "padding": "10px",
    "max-width": "400px",
    "padding": "29px 29px 29px 29px",
     "margin-top": "60px"
    }


    
  });
