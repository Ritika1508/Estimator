'use strict';

/**
 * @ngdoc function
 * @name myApplicationApp.controller:SearchcriteriaCtrl
 * @description
 * # SearchcriteriaCtrl
 * Controller of the myApplicationApp
 */
 
 //Dynamic usecase page: Injected commonService Angular Service in below controller
 angular.module('myApplicationApp')
 .controller('SearchcriteriaCtrl', ['$scope','$location','$filter','$routeParams', 'commonService','$http', '$timeout', function ($scope,$location,$filter,$routeParams,commonService,$http,$timeout) {
  this.awesomeThings = [
  'HTML5 Boilerplate',
  'AngularJS',
  'Karma'
  ];

  $scope.myStyle = {
    "background-color" : "#FFFFFF",
    "margin": "0 auto 20px",
    "width": "100%",
    "border": "3px solid #73AD21",
    "padding": "10px",
    "max-width": "800px",
    "padding": "19px 29px 40px",
    
    "border": "1px solid #e5e5e5",
    "border-radius": "5px",
    "box-shadow": "0px 1px 2px rgba(0, 0, 0, 0.05)",
    "align" : "center",
    "margin-top": "40px"

  }
  $scope.addSelectedModule = function() {

    var splitValues = $filter('SplitFilter')($scope.availableModules,",");
    angular.forEach(splitValues,function(splitValue){
      $scope.selectedMods.push(splitValue);
    });
  }

  $scope.removeSelectedModule = function() {

    alert("removeSelectedModule");
    
  }
  $scope.addSelectedLOB = function() {
    var splitValues = $filter('SplitFilter')($scope.availableLOBs,",");
    angular.forEach(splitValues,function(splitValue){
      $scope.selectedLobs.push(splitValue);
    });
  }

  $scope.removeSelectedLOB = function() {

    alert("removeSelectedLOB");    
  }
  $scope.addSelectedType = function() {

    var splitValues = $filter('SplitFilter')($scope.availableTypes,",");
    angular.forEach(splitValues,function(splitValue){
      $scope.selectedTypes.push(splitValue);
    });
  }

  $scope.removeSelectedType = function() {

    alert("removeSelectedType");    
  }

   
  $scope.populateUseCases = function(){
	  //Dynamic usecase page: passing on selected modules to service to retrieve in other controllers.
	  commonService.setPersonArray($scope.selectedItems);
	  commonService.setselectedLobsArray($scope.selectedLobs);
	  commonService.setclientObject($scope.selectClientName);
	  commonService.setprojectObject($scope.selectProjectName);
	  commonService.setregionObject($scope.selectRegionName);
	  commonService.setcountryObject($scope.selectCountryName);
		
	  //Dynamic USECASES page WebService Call - Start 
		var modulesID = $scope.selectedItems;
		var modulesIDData = [];
		for(var j = 0 ; j< modulesID.length; j++){
		
		modulesIDData[j] = {"moduleID" : modulesID[j].id};
		
		}
		//console.log(modulesIDData);
 		var module=JSON.stringify(eval(modulesIDData));
		
	  	$http.post('http://localhost:8080/EstimatorApp/rest/static/getBaseline', module).then(function(response){
			
			var jsonExtract=JSON.stringify(response, undefined, 2);
			var jsonobjectTemp = JSON.parse(jsonExtract);
			var jsonobject = jsonobjectTemp.data;
			if(jsonobject.status=='200' && jsonobject.message=='Successful Search'){

				var useCaseObject = [];
				useCaseObject[0] = {};
				for(var key in jsonobject.baseLineMap){
	
					var objectLoop = []
					var valueArray = jsonobject.baseLineMap[key];
					for(var k = 0 ; k < valueArray.length; k++){
					
						var valueArrayObject = valueArray[k];
						objectLoop[k] = 
						{
							sNo: k+1,
							feature: 'Notification FNOL - New Claim',
							useCase: valueArrayObject.useCase,
							featureType: valueArrayObject.otbType,
							baseComplexity1: valueArrayObject.complexity,
							baseCustomization1: valueArrayObject.customization,
							baseTotal1: valueArrayObject.total,
							personalAutoTotal1: ''
						};
					}
					if(key == 'CC Config'){
						key = 'ccConfig'
					} else if(key == 'CC Intg'){
						key = 'ccInteg'
					} else if(key == 'PC Config'){
						key = 'pcConfig'
					} else if(key == 'BC Config'){
						key = 'bcConfig'
					} else if(key == 'BC Intg'){
						key = 'bcInteg'
					} else if(key == 'iNexus'){
						key = 'iNexus'
					}
					
					var tempFinalObject = useCaseObject[0];
					tempFinalObject[key] = objectLoop;
				}
				
			}
			else{
				alert ("Status : " + jsonobject.status + " " + "message : " + jsonobject.message);
			}
			
			console.log(useCaseObject);
			//console.log(tempFinalObject);
			commonService.setuseCaseObjectArray(useCaseObject);
			
		},function(error){
			alert ("Status : " + error.status + " " + "message : " + error.message);
		}
		);
		
		//Dynamic USECASES page WebService Call - END

		$timeout(function() {
			$location.path("/useCases")
		}, 100);
   //$location.path("/useCases");
 }
 
 //Dynamic Modules code - Start
 $scope.productUpdate = function(selectedProduct){
		var productID = selectedProduct.productID;
 		var product=JSON.stringify(eval(
		//{"productID" : 2}
		{"productID" : productID}
		));
				
		$http.post('http://localhost:8080/EstimatorApp/rest/static/loadModules', product).then(function(response){
			
			var jsonExtract=JSON.stringify(response, undefined, 2);
			var jsonobjectTemp = JSON.parse(jsonExtract);
			var jsonobject = jsonobjectTemp.data;
			if(jsonobject.status=='200' && jsonobject.message=='Successful Retrival'){
					
				var modulesData = [];
				var title = '';
				var	url = '';
				var modulesTemp = jsonobject.modules;
				for(var i=0; i < modulesTemp.length; i++){
					
					if( modulesTemp[i].moduleName == 'CC Config' ){
						title = "CC Configuration";
						url = "ccConfig.tpl.html";
					} else if( modulesTemp[i].moduleName == 'CC Intg' ){
						title = "CC Integeration";
						url = "ccInteg.tpl.html";
					} else if( modulesTemp[i].moduleName == 'PC Config' ){
						title = "PC Configuration";
						url = "pcConfig.tpl.html";
					} else if( modulesTemp[i].moduleName == 'BC Config' ){
						title = "BC Configuration";
						url = "bcConfig.tpl.html";
					} else if( modulesTemp[i].moduleName == 'BC Intg' ){
						title = "BC Integeration";
						url = "bcInteg.tpl.html";
					} else if( modulesTemp[i].moduleName == 'iNexus' ){
						title = "iNexus";
						url = "iNexus.tpl.html";
					}
					
					modulesData[i] = {'id': modulesTemp[i].moduleID, 'name': modulesTemp[i].moduleName , 'title': title , 'url' : url};
				}
				$scope.items = modulesData;
			 
			}
			else{
				alert ("Status : " + jsonobject.status + " " + "message : " + jsonobject.message);
			}
			
		},function(error){
			alert ("Status : " + error.status + " " + "message : " + error.message);
		}
		);
 }
  //Dynamic Modules code - END
 
 
 $scope.init = function() {
  /*RegionService.authenticateUser().then(function (response){
        debugger;
        self.response = response;
      },
      function(error){
        alert("Error")
      });*/
		$scope.selectClientName = $routeParams.selectedClient;
		$scope.selectProjectName = $routeParams.selectedProject;
		$scope.selectCountryName = $routeParams.selectedCountry;
		$scope.selectRegionName = $routeParams.selectedRegion;
        $scope.selectedPractice =$routeParams.selectedPractice;
		
		//Dynamic Products code - Start
		var practice=JSON.stringify(eval(
		{"praticeID" : $scope.selectedPractice.praticeID}
		));

		
		$http.post('http://localhost:8080/EstimatorApp/rest/static/loadProducts', practice).then(function(response){
			var jsonExtract=JSON.stringify(response, undefined, 2);
			var jsonobjectTemp = JSON.parse(jsonExtract);
			var jsonobject = jsonobjectTemp.data;
			if(jsonobject.status=='200' && jsonobject.message=='Successful Retrival'){
				
				$scope.products = jsonobject.product;
					 
			}
			else{
				alert ("Status : " + jsonobject.status + " " + "message : " + jsonobject.message);
			}
		},function(error){
			alert ("Status : " + error.status + " " + "message : " + error.message);
		}
		);
		
		//Dynamic Products code - END
		
		//Dynamic LOB code - Start
		$http.get('http://localhost:8080/EstimatorApp/rest/static/loadLOB').then(function(response) {		
			
			var jsonExtract=JSON.stringify(response, undefined, 2);
			var jsonobjectTotal = JSON.parse(jsonExtract);
			var jsonobject = jsonobjectTotal.data;
			
			if(jsonobject.status=='200' && jsonobject.message=='Successful Retrival'){
						
			var LOBresponse = jsonobject.lob;
			var LOBData = [];
			
			for(var i=0; i < LOBresponse.length; i++){
				LOBData[i] = {'id': LOBresponse[i].lobId , 'name': LOBresponse[i].lobName}
			}
			
			$scope.availLOBs = LOBData;
			}
		});
		//Dynamic LOB code - END
		
		$scope.pratices = ["Insurance","Oracle","SAP"];
		//$scope.products = ["Guidewire","SAP Supply Chain","Oracle CRM","SAP Financials","Oracle Financials","Oracle Supply Chain","Duckcreek","SAP CRM"];
		$scope.selectedMods = [];
		$scope.selectedLobs = [];
		$scope.selectedTypes = [];
		$scope.availableMods = ["CC Config","CC Intg","PC Config","PC Intg","BC Config","BC Intg","iNexus","Guidewire Portal"];
     
    
	  //$scope.items = [{'id': '50', 'name': 'CC Config' , 'title': 'CC Configuration' , 'url' : 'ccConfig.tpl.html'}, {'id': '45', 'name': 'CC Intg' , 'title': 'CC Integeration' , 'url' : 'ccInteg.tpl.html'}, {'id': '66', 'name': 'PC Config' , 'title': 'PC Configuration' , 'url' : 'pcConfig.tpl.html'}, {'id': '30', 'name' : 'BC Config'  , 'title': 'BC Configuration' , 'url' : 'bcConfig.tpl.html'}, {'id': '41', 'name': 'BC Intg'  , 'title': 'BC Integeration' , 'url' : 'bcInteg.tpl.html'}, {'id': '34', 'name': 'iNexus' , 'title': 'iNexus' , 'url' : 'iNexus.tpl.html'}];
	  //$scope.availLOBs = [{'id': '50', 'name': 'Auto'}, {'id': '45', 'name': 'Property'}, {'id': '66', 'name': 'Workers Comp'}, {'id': '30', 'name' : 'Health' }];
	  //$scope.availTypes = [{'id': '50', 'name': 'Personal Auto'}, {'id': '45', 'name': 'Commercial Auto'}];
	  $scope.selectedItems = [];
    };

    $scope.addSelectedModule = function() {

		var splitValues = $filter('SplitFilter')($scope.availableModules,",");
		angular.forEach(splitValues,function(splitValue){
				$scope.selectedMods.push(splitValue);
		});
	}

 
 $scope.transfer = function(from, to, index) {
    
        if (index >= 0) {
          to.push(from[index]);
          from.splice(index, 1);
        } else {
          for (var i = 0; i < from.length; i++) {
            to.push(from[i]);
          }
          from.length = 0;
        }
      //console.log(to)
    };  
  // runs once per controller instantiation
  $scope.init();
}]);
