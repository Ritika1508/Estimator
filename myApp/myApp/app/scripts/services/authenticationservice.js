'use strict';

/**
 * @ngdoc service
 * @name myApplicationApp.authenticationService
 * @description
 * # authenticationService
 * Service in the myApplicationApp.
 */
angular.module('myApplicationApp')
  .service('authenticationService', function ($http, $q,$location) {
    // AngularJS will instantiate a singleton by calling "new" on this function
    var self = this;
   self.authenticateUser = function (userName, password) {
   	self.userName = userName;
   	
   	var deferred = $q.defer();
		$http({
			method : 'POST',
			url : 'http://localhost:8085/EstimatorApp/rest/login/authenticateUser',
			data : {"userEmail" : userName,"userPassword"   : password},
			headers : {
        	'Content-Type' : 'application/json'
    		}
		}).then(function (response) {
			debugger;
        	console.log("mySuccess");
        	$location.path("/homePage" );
        	return deferred.resolve(response);
    	}, function (error) {
        	console.log("error");
        	 return deferred.reject(error);
    	});
    	return deferred.promise;
    }

    			
  });
