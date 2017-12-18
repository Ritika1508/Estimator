'use strict';

/**
 * @ngdoc service
 * @name myApplicationApp.authenticationService
 * @description
 * # authenticationService
 * Service in the myApplicationApp.
 */
 
//Dynamic usecase page: created this service to share data across controllers
angular.module('myApplicationApp')
  .service('commonService', function () {
	 
	var self = this;
	var personArray;
	var useCaseObjectArray;
	var selectedLobsArray;
	var countryObject;
	var clientObject;
	var projectObject;
	var regionObject;
	var userName;
	 
	self.setPersonArray = function(newObj){
		this.personArray = newObj;
	};
	  
	self.getPersonArray = function(){
		return this.personArray;
	};
    
	self.setuseCaseObjectArray = function(newObj){
		this.useCaseObjectArray = newObj;
	};
	  
	self.getuseCaseObjectArray = function(){
		return this.useCaseObjectArray;
	};
	
	self.setselectedLobsArray = function(newObj){
		this.selectedLobsArray = newObj;
	};
	  
	self.getselectedLobsArray = function(){
		return this.selectedLobsArray;
	};
	
	self.setcountryObject = function(newObj){
		this.countryObject = newObj;
	};
	  
	self.getcountryObject = function(){
		return this.countryObject;
	};
	
	self.setclientObject = function(newObj){
		this.clientObject = newObj;
	};
	  
	self.getclientObject = function(){
		return this.clientObject;
	};
	
	self.setprojectObject = function(newObj){
		this.projectObject = newObj;
	};
	  
	self.getprojectObject = function(){
		return this.projectObject;
	};
	
	self.setregionObject = function(newObj){
		this.regionObject = newObj;
	};
	  
	self.getregionObject = function(){
		return this.regionObject;
	};
	
	self.setuserName = function(newObj){
		this.userName = newObj;
	};
	  
	self.getuserName = function(){
		return this.userName;
	};
	
  });
