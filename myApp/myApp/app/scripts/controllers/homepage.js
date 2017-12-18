'use strict';

/**
 * @ngdoc function
 * @name myApplicationApp.controller:HomepageCtrl
 * @description
 * # HomepageCtrl
 * Controller of the myApplicationApp
 */
 var app= angular.module('myApplicationApp');
  app.controller('HomepageCtrl', function ($scope,$http,$location,RegionService) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

    var clientToPass={};
    var regionToPass={};
    var projectToPass={};
    var countryToPass={};
    var practiceToPass;

    $scope.myStyle = {
    "background-color" : "#FFFFFF",
   
    "margin": "0 auto 20px",
    "width": "60%",
    "border": "3px solid #73AD21",
    "padding": "10px",
    "max-width": "400px",
    "padding": "19px 29px 40px",
   
    "border": "1px solid #e5e5e5",
    "border-radius": "5px",
    "box-shadow": "0px 1px 2px rgba(0, 0, 0, 0.05)",
    "align" : "center",
     "margin-top": "40px"
    }

     $scope.header = {
      "background-color" : "lightgray",
      "margin-top": "10px",
      "text-align": "center"
     }

	$scope.getDetails = function(){


       
/*    $http({
        url: 'http://localhost:8080/EstimatorApp/rest/static/addRegions',
        method: 'POST',
        data: {id : $scope.region, desc : $scope.region},
        contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    headers: { "Accept":"application/json",
                          'Content-Type': 'application/json',
                          "Access-Control-Allow-Origin": "*"}    
    }).then(function(data, status, headers, config) {
    });*/

    if($scope.selectedClient==null){
      clientToPass= JSON.parse(JSON.stringify({"id":null,"name":$scope.client}));      
    }else{
      clientToPass=$scope.selectedClient
    }
        if($scope.selectedProject==null){
      projectToPass= JSON.parse(JSON.stringify({"id":null,"name":$scope.project}));      
    }else{
      projectToPass=$scope.selectedProject
    }
        if($scope.selectedRegion==null){
      regionToPass= JSON.parse(JSON.stringify({"id":null,"desc":$scope.region}));      
    }else{
      regionToPass=$scope.selectedRegion
    }
        if($scope.selectedCountry==null){
      countryToPass= JSON.parse(JSON.stringify({"countryID":null,"countryName":$scope.country}));      
    }else{
      countryToPass=$scope.selectedCountry
    }
    practiceToPass=$scope.selectedPractice
	
	var clientData = {
		clientName : clientToPass.name,
		clientID:clientToPass.id,
		projectName : projectToPass.name,
		projectID:projectToPass.id,
		countryName:countryToPass.countryName,
		countryID:countryToPass.countryID,
		regionName:regionToPass.desc,
		regionID:regionToPass.id,
		practiceID:practiceToPass.praticeID};
	
     $http({
        url: 'http://localhost:8080/EstimatorApp/rest/static/addClients',
        method: 'POST',
        data: clientData,
        contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    headers: { "Accept":"application/json"}    
    }).then(function(response) {

    });
  
      $location.path('/searchcriteria/').search({selectedClient: clientToPass,selectedProject:projectToPass,selectedCountry:countryToPass,selectedRegion:regionToPass,selectedPractice:practiceToPass});
	  
    }

/* 
           $scope.getMatchesClient = function (text) {
      return  $http.get('http://localhost:8080/EstimatorApp/rest/static/loadClients').then(function(response){
         return response.data.clients; // usually response.data
    });
        }



        $scope.getMatchesRegion = function (str) {
      return  $http.get('http://localhost:8080/EstimatorApp/rest/static/loadRegions').then(function(response){
         return response.data.regions; // usually response.data
    });
        }

        $scope.getMatchesCountry = function (text) {
      return  $http.get('http://localhost:8080/EstimatorApp/rest/static/loadCountries').then(function(response){
         return response.data.country; // usually response.data
    })
        }


      $scope.getMatchesProject = function (text) {
      var projs=  $http.get('http://localhost:8080/EstimatorApp/rest/static/loadProjects').then(function(response){
         return response.data.projects; // usually response.data
    })

      return projs
        }*/

          $http.get('http://localhost:8080/EstimatorApp/rest/static/loadProjects').then(function(response){
          $scope.getMatchesProject= response.data.projects; // usually response.data
    })

          
        $http.get('http://localhost:8080/EstimatorApp/rest/static/loadCountries').then(function(response){
         $scope.getMatchesCountry= response.data.country; // usually response.data
    })

      
        $http.get('http://localhost:8080/EstimatorApp/rest/static/loadRegions').then(function(response){
         $scope.getMatchesRegion= response.data.regions; // usually response.data
    })

        $http.get('http://localhost:8080/EstimatorApp/rest/static/loadClients').then(function(response){
         $scope.getMatchesClient = response.data.clients; // usually response.data
    })
     


		$http.get('http://localhost:8080/EstimatorApp/rest/static/loadPratices').then(function(response){
				 $scope.pratices = response.data.pratices; // usually response.data
			})


//$scope.pratices = ["Insurance","Oracle","SAP"];
    function createFilterFor(query) {
      var lowercaseQuery = angular.lowercase(query);

      return function filterFn(text) {
        return (text.name.indexOf(lowercaseQuery) === 0);
      };

    }

  });
