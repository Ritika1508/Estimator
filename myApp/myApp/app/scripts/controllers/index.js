'use strict';

/**
 * @ngdoc function
 * @name myApplicationApp.controller:HomepageCtrl
 * @description
 * # HomepageCtrl
 * Controller of the myApplicationApp
 */
angular.module('myApplicationApp')
  .controller('searchJS', function ($scope,$http,$location,RegionService,commonService) {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

var client={};
var proj={};
var country={};
var reg={};


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

    $scope.search = function(){
		var userName = commonService.getuserName();
		var searchObject = {
			"clientID":$scope.selectedClient.id,
			"clientName":$scope.selectedClient.name,
			"projectID":$scope.selectedProject.id,
			"projectName":$scope.selectedProject.name,
			"regionID":$scope.selectedRegion.id,
			"regionName":$scope.selectedRegion.desc,
			"countryID":$scope.selectedCountry.countryID,
			"countryName":$scope.selectedCountry.countryName, 
			"fromDate": $scope.myDate1,
			"toDate": $scope.myDate2,
			"userID": userName
		}
								   
    $http({
        url: 'http://localhost:8080/EstimatorApp/rest/static/searchEstimation',
        method: 'POST',
        data: searchObject,
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        headers: { "Accept":"application/json"}    
    }).then(function(response) {
		
		
		var data = response.data;
		var jsonExtract=JSON.stringify(data, undefined, 2);
		
		var jsonobject = JSON.parse(jsonExtract);
		
		var myTable='';
		if(jsonobject.status=='200' && jsonobject.message=='Successful Search'){
			  console.log(jsonobject);
				var estimateData = jsonobject.estimateList;
				console.log(estimateData);
				myTable = "<table width='100%' style='background-color: lightgrey;' ng-style='tableStyle'><tr>"
				myTable+= "<td style='text-align: center;' ng-style='tableStyle'>Estimation Code</td>";
				myTable+= "<td style='text-align: center;' ng-style='tableStyle'>Client Name</td>";
				myTable+= "<td style='text-align: center;' ng-style='tableStyle'>Project Name</td>";
				myTable+= "<td style='text-align: center;' ng-style='tableStyle'>Created Date</td>";
				myTable+= "<td style='text-align: center;' ng-style='tableStyle'>Created By</td>";
				myTable+= "<td style='text-align: center;' ng-style='tableStyle'>Version</td>";
				myTable+= "<td style='text-align: center;' ng-style='tableStyle'>Download (Link)</td></tr>";
				
				for(var i =0; i< estimateData.length; i++){
					myTable+= "<tr><td style='text-align: center; background-color: #fffff0' ng-style='tableStyle'>"+estimateData[i].estimationCode+"</td>";
					myTable+= "<td  style='text-align: center; background-color: #fffff0' ng-style='tableStyle'>"+estimateData[i].clientName+"</td>";
					myTable+= "<td  style='text-align: center; background-color: #fffff0' ng-style='tableStyle'>"+estimateData[i].projectName+"</td>";
					myTable+= "<td  style='text-align: center; background-color: #fffff0' ng-style='tableStyle'>"+estimateData[i].createDate+"</td>";
					myTable+= "<td  style='text-align: center; background-color: #fffff0' ng-style='tableStyle'>"+estimateData[i].userID+"</td>";
					myTable+= "<td  style='text-align: center; background-color: #fffff0' ng-style='tableStyle'>"+estimateData[i].version+"</td>";
					myTable+= "<td  style='text-align: center; background-color: #fffff0' ng-style='tableStyle'><a href="+estimateData[i].filePath+"><div style='height:100%;width:100%'>Download</div></a></td>";
				
				}
				myTable+="</table>";
				
				//myTable+= "<td  style='color: Green; width: 100px;'>"+estimateData[i].createDate+"</td>";
		 //estimation code : Client Name : Project Name : Created Date : Created By : Version : Download (Link)

		}
		else{
			myTable="<h1 align='center'> No Records Found</h1>" ;
		}
					 

		document.getElementById('tablePrint').innerHTML = myTable;

                    
    });
  
    	
    }
	
/*
    $http.get('http://localhost:8080/EstimatorApp/rest/static/loadRegions').then(function(response){
			$scope.regions =  response.data.regions; // usually response.data
		});

	$http.get('http://localhost:8080/EstimatorApp/rest/static/loadCountries').then(function(response){
			$scope.countries =  response.data.country; // usually response.data
		});
 
	$http.get('http://localhost:8080/EstimatorApp/rest/static/loadClients').then(function(response){
			$scope.clientNames =  response.data.clients; // usually response.data
		});
    
	$http.get('http://localhost:8080/EstimatorApp/rest/static/loadProjects').then(function(response){
			$scope.projects = response.data.projects; // usually response.data
		})
		*/
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
   
	
        $scope.myDate1= new Date();
        $scope.myDate2= new Date();

      
 
  // runs once per controller instantiation

  });
