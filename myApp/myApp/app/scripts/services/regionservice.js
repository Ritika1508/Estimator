'use strict';

/**
 * @ngdoc service
 * @name myApplicationApp.RegionService
 * @description
 * # RegionService
 * Service in the myApplicationApp.
 */
angular.module('myApplicationApp')
  .service('RegionService', function ($http, $q,$location) {
    // AngularJS will instantiate a singleton by calling "new" on this function
 /*   var self = this;
   self.authenticateUser = function () {   	
   	var deferred = $q.defer();
		$http({
			method : 'GET',
			url : 'http://localhost:8080/estimator/getData/getRegions',
			headers : {
        	'Content-Type' : 'application/json'
    		}
		}).then(function (response) {
			debugger;
        	console.log("mySuccess");
        	return deferred.resolve(response);
    	}, function (error) {
        	console.log("error");
        	 return deferred.reject(error);
    	});
    	return deferred.promise;
    }*/
  });
