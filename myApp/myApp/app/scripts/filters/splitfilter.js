'use strict';

/**
 * @ngdoc filter
 * @name myApplicationApp.filter:SplitFilter
 * @function
 * @description
 * # SplitFilter
 * Filter in the myApplicationApp.
 */
angular.module('myApplicationApp')
  .filter('SplitFilter', function () {
	return function (input,splitChar) {
    	var input1 = input+''.toString();
    	var array =  input1.split(splitChar);
    	return array;
    };
  });
