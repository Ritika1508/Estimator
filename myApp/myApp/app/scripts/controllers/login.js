 'use strict';

/**
 * @ngdoc function
 * @name myApplicationApp.controller:LoginCtrl
 * @description
 * # LoginCtrl
 * Controller of the myApplicationApp
 */
angular.module('myApplicationApp')
  .controller('LoginCtrl', function ($scope,$http,$location,authenticationService,commonService) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
    var self = this;
    $scope.login = function(){

      var userEmail = $scope.userEmail;
      var password = $scope.password;
    	authenticationService.authenticateUser($scope.userEmail, $scope.password).then(function (response){
        debugger;
        self.response = response;
		commonService.setuserName(userEmail);
        $location.path('/welcomeUser/').search({userEmail:userEmail});
      },
      function(error){
        //alert("Invalid Username or Password");
		commonService.setuserName(userEmail);
        $location.path("/welcomeUser").search({userEmail:userEmail});
      });
    }

    $scope.myStyle = {
    "background-color" : "#FFFFFF",
   
    "margin": "0 auto 20px",
    "width": "60%",
    "border": "3px solid #73AD21",
    "padding": "10px",
    "max-width": "400px",
    "padding": "19px 29px 29px",
   
    "border": "1px solid #e5e5e5",
    "border-radius": "5px",
    "box-shadow": "0px 1px 2px rgba(0, 0, 0, 0.05)",
    "align" : "center",
     "margin-top": "40px"
    }
    
  });
