    'use strict';

    /**
     * @ngdoc function
     * @name myApplicationApp.controller:UsecasestabCtrl
     * @description
     * # UsecasestabCtrl
     * Controller of the myApplicationApp
     */
	 
	 //Dynamic usecase page: Injected commonService Angular Service in below controller
     angular.module('myApplicationApp')
     .controller('UsecasestabCtrl', function ($scope,$timeout,Excel,$window,$http , commonService) {
        this.awesomeThings = [
        'HTML5 Boilerplate',
        'AngularJS',
        'Karma'
        ];

			$scope.populateUseCases = function(){
				$location.path("/useCases");
			};


			$scope.exportToExcel=function(tableId){ // ex: '#my-table'
			var exportHref=Excel.tableToExcel(tableId,'CC Configuration');
						$timeout(function(){location.href=exportHref;},100); // trigger download
			};

					//Code to generate Excel File by Shikha
			window.saveExcelFile = function saveExcelFile () {
					   //var data1 = [{a:'',b:'',c:'',d:'',e:'Development BaseLine',f:'',g:'580',h:'',i:''},{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total'},{a:'1',b:'Notification FNOL - New Claim',c:'LOB Mapping',d:'STD',e:'Simple',f:'Moderate',g:'160'},{a:'2',b:'Notification FNOL - New Claim',c:'Admin Data Loader - Organization structure',d:'STD',e:'Simple',f:'Large',g:'240'},{a:'3',b:'Notification FNOL - New Claim',c:'Policy Search',d:'STD',e:'Simple',f:'Moderate',g:'160'}];
			
			var Person=	commonService.getPersonArray();
			var numberSheets=	commonService.getPersonArray().length;
			//var autoArray = commonService.getselectedTypesArray();
			var autoArray = commonService.getselectedLobsArray();
			var opts=[];
			var data=[];
			var row=[];
			var j   =0;
			var k   =0;
			var m=0;
			var n=0;
			var o=0;
			var p=0;
			
			var testccConfig = $scope.useCaseOptions[0].ccConfig;
			var testccInteg = $scope.useCaseOptions[0].ccInteg;
			var testbcConfig = $scope.useCaseOptions[0].bcConfig;
			var testpcConfig = $scope.useCaseOptions[0].pcConfig;
			var testbcInteg = $scope.useCaseOptions[0].bcInteg;
			var testiNexus = $scope.useCaseOptions[0].iNexus;			
						
			
			for (var i = 0; i < numberSheets; i++) {
			opts[i] = {"sheetid":Person[i].title,"header":false};
			//alert("Person i is fund as "+Person[i].title)
			if(Person[i].title=='CC Configuration')
			{
			if(autoArray.length<2)
			{
			data[i] = [{a:'',b:'',c:'',d:'',e:'Development BaseLine',f:'',g:'580',h:'',i:'',j:autoArray[p].name,k:'',l:'',m:$scope.personalAutoaggregate_ccconfig[0]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total'}];
			for(var ii=0; ii< testccConfig.length; ii++){
			if(ii==0)				
			data[i].push({a:testccConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testccConfig[ii].useCase,d:testccConfig[ii].featureType,e:testccConfig[ii].baseComplexity1,f:testccConfig[ii].baseCustomization1,g:testccConfig[ii].baseTotal1,h:$scope.availableOptions_ccconfig['00'],i:$scope.availableComplexity_ccconfig['00'],j:$scope.availableCustomization_ccconfig['00'],k:$scope.availableAccelerator_ccconfig['00'],l:$scope.availableConfidenceLevel_ccconfig['00'],m:$scope.personalAutoTotalArray_ccconfig[0]});
			if(ii==1)	
			data[i].push({a:testccConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testccConfig[ii].useCase,d:testccConfig[ii].featureType,e:testccConfig[ii].baseComplexity1,f:testccConfig[ii].baseCustomization1,g:testccConfig[ii].baseTotal1,h:$scope.availableOptions_ccconfig[10],i:$scope.availableComplexity_ccconfig[10],j:$scope.availableCustomization_ccconfig[10],k:$scope.availableAccelerator_ccconfig[10],l:$scope.availableConfidenceLevel_ccconfig['10'],m:$scope.personalAutoTotalArray_ccconfig[10]});
			if(ii==2)
			data[i].push({a:testccConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testccConfig[ii].useCase,d:testccConfig[ii].featureType,e:testccConfig[ii].baseComplexity1,f:testccConfig[ii].baseCustomization1,g:testccConfig[ii].baseTotal1,h:$scope.availableOptions_ccconfig[20],i:$scope.availableComplexity_ccconfig[20],j:$scope.availableCustomization_ccconfig[20],k:$scope.availableAccelerator_ccconfig[20],l:$scope.availableConfidenceLevel_ccconfig[20],m:$scope.personalAutoTotalArray_ccconfig[20]});
			}
			}
			if(autoArray.length>=2)
			{
			data[i] = [{a:'', b:'', c:'', d:'', e:'Development BaseLine', f:'', g:'580', h:'', i:'', j:autoArray[p].name,k:'', l:'', m:$scope.personalAutoaggregate_ccconfig[0], n:'', o:'', p:autoArray[p+1].name , q:'',r:'',s:$scope.personalAutoaggregate_ccconfig[1]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total',n:'InScope', o:'Complexity', p:'Customization' , q:'Accelerator Available',r:'Confidence Level',s:'Total'}];
			for(var ii=0; ii< testccConfig.length; ii++){
			if(ii==0)	
			data[i].push({a:testccConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testccConfig[ii].useCase,d:testccConfig[ii].featureType,e:testccConfig[ii].baseComplexity1,f:testccConfig[ii].baseCustomization1,g:testccConfig[ii].baseTotal1,h:$scope.availableOptions_ccconfig['00'],i:$scope.availableComplexity_ccconfig['00'],j:$scope.availableCustomization_ccconfig['00'],k:$scope.availableAccelerator_ccconfig['00'],l:$scope.availableConfidenceLevel_ccconfig['00'],m:$scope.personalAutoTotalArray_ccconfig[0],n:$scope.availableOptions_ccconfig['01'],o:$scope.availableComplexity_ccconfig['01'],p:$scope.availableCustomization_ccconfig['01'],q:$scope.availableAccelerator_ccconfig['01'],r:$scope.availableConfidenceLevel_ccconfig['01'],s:$scope.personalAutoTotalArray_ccconfig[1]});
			if(ii==1)	
			data[i].push({a:testccConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testccConfig[ii].useCase,d:testccConfig[ii].featureType,e:testccConfig[ii].baseComplexity1,f:testccConfig[ii].baseCustomization1,g:testccConfig[ii].baseTotal1,h:$scope.availableOptions_ccconfig[10],i:$scope.availableComplexity_ccconfig[10],j:$scope.availableCustomization_ccconfig[10],k:$scope.availableAccelerator_ccconfig[10],l:$scope.availableConfidenceLevel_ccconfig['10'],m:$scope.personalAutoTotalArray_ccconfig[10],n:$scope.availableOptions_ccconfig[11],o:$scope.availableComplexity_ccconfig[11],p:$scope.availableCustomization_ccconfig[11],q:$scope.availableAccelerator_ccconfig[11],r:$scope.availableConfidenceLevel_ccconfig['11'],s:$scope.personalAutoTotalArray_ccconfig[11]});
			if(ii==2)
			data[i].push({a:testccConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testccConfig[ii].useCase,d:testccConfig[ii].featureType,e:testccConfig[ii].baseComplexity1,f:testccConfig[ii].baseCustomization1,g:testccConfig[ii].baseTotal1,h:$scope.availableOptions_ccconfig[20],i:$scope.availableComplexity_ccconfig[20],j:$scope.availableCustomization_ccconfig[20],k:$scope.availableAccelerator_ccconfig[20],l:$scope.availableConfidenceLevel_ccconfig[20],m:$scope.personalAutoTotalArray_ccconfig[20],n:$scope.availableOptions_ccconfig[21],o:$scope.availableComplexity_ccconfig[21],p:$scope.availableCustomization_ccconfig[21],q:$scope.availableAccelerator_ccconfig[21],r:$scope.availableConfidenceLevel_ccconfig['21'],s:$scope.personalAutoTotalArray_ccconfig[21]});
			}
			}
			}
			if(Person[i].title=='CC Integeration')
			{
			if(autoArray.length<2)
			{
			data[i] = [{a:'',b:'',c:'',d:'',e:'Development BaseLine',f:'',g:'580',h:'',i:'',j:autoArray[j].name,k:'',l:'',m:$scope.personalAutoaggregate_ccInteg[0]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total'}];
			for(var ii=0; ii< testccInteg.length; ii++){
			if(ii==0)	
			data[i].push({a:testccInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testccInteg[ii].useCase,d:testccInteg[ii].featureType,e:testccInteg[ii].baseComplexity1,f:testccInteg[ii].baseCustomization1,g:testccInteg[ii].baseTotal1,h:$scope.availableOptions_ccInteg['00'],i:$scope.availableComplexity_ccInteg['00'],j:$scope.availableCustomization_ccInteg['00'],k:$scope.availableAccelerator_ccInteg['00'],l:$scope.availableConfidenceLevel_ccInteg['00'],m:$scope.personalAutoTotalArray_ccInteg[0]});
			if(ii==1)	
			data[i].push({a:testccInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testccInteg[ii].useCase,d:testccInteg[ii].featureType,e:testccInteg[ii].baseComplexity1,f:testccInteg[ii].baseCustomization1,g:testccInteg[ii].baseTotal1,h:$scope.availableOptions_ccInteg[10],i:$scope.availableComplexity_ccInteg[10],j:$scope.availableCustomization_ccInteg[10],k:$scope.availableAccelerator_ccInteg[10],l:$scope.availableConfidenceLevel_ccInteg['10'],m:$scope.personalAutoTotalArray_ccInteg[10]});
			if(ii==2)	
			data[i].push({a:testccInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testccInteg[ii].useCase,d:testccInteg[ii].featureType,e:testccInteg[ii].baseComplexity1,f:testccInteg[ii].baseCustomization1,g:testccInteg[ii].baseTotal1,h:$scope.availableOptions_ccInteg[20],i:$scope.availableComplexity_ccInteg[20],j:$scope.availableCustomization_ccInteg[20],k:$scope.availableAccelerator_ccInteg[20],l:$scope.availableConfidenceLevel_ccInteg[20],m:$scope.personalAutoTotalArray_ccInteg[20]});
			}
			}
			if(autoArray.length>=2)
			{
			data[i] = [{a:'', b:'', c:'', d:'', e:'Development BaseLine', f:'', g:'580', h:'', i:'', j:autoArray[j].name,k:'', l:'', m:$scope.personalAutoaggregate_ccInteg[0], n:'', o:'', p:autoArray[j+1].name , q:'',r:'',s:$scope.personalAutoaggregate_ccInteg[1]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total',n:'InScope', o:'Complexity', p:'Customization' , q:'Accelerator Available',r:'Confidence Level',s:'Total'}];
			for(var ii=0; ii< testccInteg.length; ii++){
			if(ii==0)	
			data[i].push({a:testccInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testccInteg[ii].useCase,d:testccInteg[ii].featureType,e:testccInteg[ii].baseComplexity1,f:testccInteg[ii].baseCustomization1,g:testccInteg[ii].baseTotal1,h:$scope.availableOptions_ccInteg['00'],i:$scope.availableComplexity_ccInteg['00'],j:$scope.availableCustomization_ccInteg['00'],k:$scope.availableAccelerator_ccInteg['00'],l:$scope.availableConfidenceLevel_ccInteg['00'],m:$scope.personalAutoTotalArray_ccInteg[0],n:$scope.availableOptions_ccInteg['01'],o:$scope.availableComplexity_ccInteg['01'],p:$scope.availableCustomization_ccInteg['01'],q:$scope.availableAccelerator_ccInteg['01'],r:$scope.availableConfidenceLevel_ccInteg['01'],s:$scope.personalAutoTotalArray_ccInteg[1]});
			if(ii==1)	
			data[i].push({a:testccInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testccInteg[ii].useCase,d:testccInteg[ii].featureType,e:testccInteg[ii].baseComplexity1,f:testccInteg[ii].baseCustomization1,g:testccInteg[ii].baseTotal1,h:$scope.availableOptions_ccInteg[10],i:$scope.availableComplexity_ccInteg[10],j:$scope.availableCustomization_ccInteg[10],k:$scope.availableAccelerator_ccInteg[10],l:$scope.availableConfidenceLevel_ccInteg['10'],m:$scope.personalAutoTotalArray_ccInteg[10],n:$scope.availableOptions_ccInteg[11],o:$scope.availableComplexity_ccInteg[11],p:$scope.availableCustomization_ccInteg[11],q:$scope.availableAccelerator_ccInteg[11],r:$scope.availableConfidenceLevel_ccInteg['11'],s:$scope.personalAutoTotalArray_ccInteg[11]});
			if(ii==2)	
			data[i].push({a:testccInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testccInteg[ii].useCase,d:testccInteg[ii].featureType,e:testccInteg[ii].baseComplexity1,f:testccInteg[ii].baseCustomization1,g:testccInteg[ii].baseTotal1,h:$scope.availableOptions_ccInteg[20],i:$scope.availableComplexity_ccInteg[20],j:$scope.availableCustomization_ccInteg[20],k:$scope.availableAccelerator_ccInteg[20],l:$scope.availableConfidenceLevel_ccInteg[20],m:$scope.personalAutoTotalArray_ccInteg[20],n:$scope.availableOptions_ccInteg[21],o:$scope.availableComplexity_ccInteg[21],p:$scope.availableCustomization_ccInteg[21],q:$scope.availableAccelerator_ccInteg[21],r:$scope.availableConfidenceLevel_ccInteg['21'],s:$scope.personalAutoTotalArray_ccInteg[21]});
			}
			}
			}
			if(Person[i].title=='PC Configuration')
			{
			if(autoArray.length<2)
			{
			data[i] = [{a:'',b:'',c:'',d:'',e:'Development BaseLine',f:'',g:'580',h:'',i:'',j:autoArray[k].name,k:'',l:'',m:$scope.personalAutoaggregate_pcconfig[0]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total'}];
			for(var ii=0; ii< testpcConfig.length; ii++){
			if(ii==0)	
			data[i].push({a:testpcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testpcConfig[ii].useCase,d:testpcConfig[ii].featureType,e:testpcConfig[ii].baseComplexity1,f:testpcConfig[ii].baseCustomization1,g:testpcConfig[ii].baseTotal1,h:$scope.availableOptions_pcconfig['00'],i:$scope.availableComplexity_pcconfig['00'],j:$scope.availableCustomization_pcconfig['00'],k:$scope.availableAccelerator_pcconfig['00'],l:$scope.availableConfidenceLevel_pcconfig['00'],m:$scope.personalAutoTotalArray_pcconfig[0]});
			if(ii==1)	
			data[i].push({a:testpcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testpcConfig[ii].useCase,d:testpcConfig[ii].featureType,e:testpcConfig[ii].baseComplexity1,f:testpcConfig[ii].baseCustomization1,g:testpcConfig[ii].baseTotal1,h:$scope.availableOptions_pcconfig[10],i:$scope.availableComplexity_pcconfig[10],j:$scope.availableCustomization_pcconfig[10],k:$scope.availableAccelerator_pcconfig[10],l:$scope.availableConfidenceLevel_pcconfig['10'],m:$scope.personalAutoTotalArray_pcconfig[10]});
			if(ii==2)	
			data[i].push({a:testpcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testpcConfig[ii].useCase,d:testpcConfig[ii].featureType,e:testpcConfig[ii].baseComplexity1,f:testpcConfig[ii].baseCustomization1,g:testpcConfig[ii].baseTotal1,h:$scope.availableOptions_pcconfig[20],i:$scope.availableComplexity_pcconfig[20],j:$scope.availableCustomization_pcconfig[20],k:$scope.availableAccelerator_pcconfig[20],l:$scope.availableConfidenceLevel_pcconfig[20],m:$scope.personalAutoTotalArray_pcconfig[20]});
			}
			}
			if(autoArray.length>=2)
			{
			data[i] = [{a:'', b:'', c:'', d:'', e:'Development BaseLine', f:'', g:'580', h:'', i:'', j:autoArray[k].name,k:'', l:'', m:$scope.personalAutoaggregate_pcconfig[0], n:'', o:'', p:autoArray[k+1].name , q:'',r:'',s:$scope.personalAutoaggregate_pcconfig[1]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total',n:'InScope', o:'Complexity', p:'Customization' , q:'Accelerator Available',r:'Confidence Level',s:'Total'}];
			for(var ii=0; ii< testpcConfig.length; ii++){
			if(ii==0)	
			data[i].push({a:testpcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testpcConfig[ii].useCase,d:testpcConfig[ii].featureType,e:testpcConfig[ii].baseComplexity1,f:testpcConfig[ii].baseCustomization1,g:testpcConfig[ii].baseTotal1,h:$scope.availableOptions_pcconfig['00'],i:$scope.availableComplexity_pcconfig['00'],j:$scope.availableCustomization_pcconfig['00'],k:$scope.availableAccelerator_pcconfig['00'],l:$scope.availableConfidenceLevel_pcconfig['00'],m:$scope.personalAutoTotalArray_pcconfig[0],n:$scope.availableOptions_pcconfig['01'],o:$scope.availableComplexity_pcconfig['01'],p:$scope.availableCustomization_pcconfig['01'],q:$scope.availableAccelerator_pcconfig['01'],r:$scope.availableConfidenceLevel_pcconfig['01'],s:$scope.personalAutoTotalArray_pcconfig[1]});
			if(ii==1)	
			data[i].push({a:testpcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testpcConfig[ii].useCase,d:testpcConfig[ii].featureType,e:testpcConfig[ii].baseComplexity1,f:testpcConfig[ii].baseCustomization1,g:testpcConfig[ii].baseTotal1,h:$scope.availableOptions_pcconfig[10],i:$scope.availableComplexity_pcconfig[10],j:$scope.availableCustomization_pcconfig[10],k:$scope.availableAccelerator_pcconfig[10],l:$scope.availableConfidenceLevel_pcconfig['10'],m:$scope.personalAutoTotalArray_pcconfig[10],n:$scope.availableOptions_pcconfig[11],o:$scope.availableComplexity_pcconfig[11],p:$scope.availableCustomization_pcconfig[11],q:$scope.availableAccelerator_pcconfig[11],r:$scope.availableConfidenceLevel_pcconfig['11'],s:$scope.personalAutoTotalArray_pcconfig[11]});
			if(ii==2)	
			data[i].push({a:testpcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testpcConfig[ii].useCase,d:testpcConfig[ii].featureType,e:testpcConfig[ii].baseComplexity1,f:testpcConfig[ii].baseCustomization1,g:testpcConfig[ii].baseTotal1,h:$scope.availableOptions_pcconfig[20],i:$scope.availableComplexity_pcconfig[20],j:$scope.availableCustomization_pcconfig[20],k:$scope.availableAccelerator_pcconfig[20],l:$scope.availableConfidenceLevel_pcconfig[20],m:$scope.personalAutoTotalArray_pcconfig[20],n:$scope.availableOptions_pcconfig[21],o:$scope.availableComplexity_pcconfig[21],p:$scope.availableCustomization_pcconfig[21],q:$scope.availableAccelerator_pcconfig[21],r:$scope.availableConfidenceLevel_pcconfig['21'],s:$scope.personalAutoTotalArray_pcconfig[21]});
			}
			}
			}
			if(Person[i].title=='BC Configuration')
			{
			if(autoArray.length<2)
			{
			data[i] = [{a:'',b:'',c:'',d:'',e:'Development BaseLine',f:'',g:'580',h:'',i:'',j:autoArray[m].name,k:'',l:'',m:$scope.personalAutoaggregate_bcconfig[0]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total'}];
			for(var ii=0; ii< testbcConfig.length; ii++){
			if(ii==0)	
			data[i].push({a:testbcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testbcConfig[ii].useCase,d:testbcConfig[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcconfig['00'],i:$scope.availableComplexity_bcconfig['00'],j:$scope.availableCustomization_bcconfig['00'],k:$scope.availableAccelerator_bcconfig['00'],l:$scope.availableConfidenceLevel_bcconfig['00'],m:$scope.personalAutoTotalArray_bcconfig[0]});
			if(ii==1)	
			data[i].push({a:testbcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testbcConfig[ii].useCase,d:testbcConfig[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcconfig[10],i:$scope.availableComplexity_bcconfig[10],j:$scope.availableCustomization_bcconfig[10],k:$scope.availableAccelerator_bcconfig[10],l:$scope.availableConfidenceLevel_bcconfig['10'],m:$scope.personalAutoTotalArray_bcconfig[10]});
			if(ii==2)	
			data[i].push({a:testbcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testbcConfig[ii].useCase,d:testbcConfig[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcconfig[20],i:$scope.availableComplexity_bcconfig[20],j:$scope.availableCustomization_bcconfig[20],k:$scope.availableAccelerator_bcconfig[20],l:$scope.availableConfidenceLevel_bcconfig[20],m:$scope.personalAutoTotalArray_bcconfig[20]});
			}
			}
			if(autoArray.length>=2)
			{
			data[i] = [{a:'', b:'', c:'', d:'', e:'Development BaseLine', f:'', g:'580', h:'', i:'', j:autoArray[m].name,k:'', l:'', m:$scope.personalAutoaggregate_bcconfig[0], n:'', o:'', p:autoArray[m+1].name , q:'',r:'',s:$scope.personalAutoaggregate_bcconfig[1]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total',n:'InScope', o:'Complexity', p:'Customization' , q:'Accelerator Available',r:'Confidence Level',s:'Total'}];
			for(var ii=0; ii< testbcConfig.length; ii++){
			if(ii==0)	
			data[i].push({a:testbcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testbcConfig[ii].useCase,d:testbcConfig[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcconfig['00'],i:$scope.availableComplexity_bcconfig['00'],j:$scope.availableCustomization_bcconfig['00'],k:$scope.availableAccelerator_bcconfig['00'],l:$scope.availableConfidenceLevel_bcconfig['00'],m:$scope.personalAutoTotalArray_bcconfig[0],n:$scope.availableOptions_bcconfig['01'],o:$scope.availableComplexity_bcconfig['01'],p:$scope.availableCustomization_bcconfig['01'],q:$scope.availableAccelerator_bcconfig['01'],r:$scope.availableConfidenceLevel_bcconfig['01'],s:$scope.personalAutoTotalArray_bcconfig[1]});
			if(ii==1)	
			data[i].push({a:testbcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testbcConfig[ii].useCase,d:testbcConfig[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcconfig[10],i:$scope.availableComplexity_bcconfig[10],j:$scope.availableCustomization_bcconfig[10],k:$scope.availableAccelerator_bcconfig[10],l:$scope.availableConfidenceLevel_bcconfig['10'],m:$scope.personalAutoTotalArray_bcconfig[10],n:$scope.availableOptions_bcconfig[11],o:$scope.availableComplexity_bcconfig[11],p:$scope.availableCustomization_bcconfig[11],q:$scope.availableAccelerator_bcconfig[11],r:$scope.availableConfidenceLevel_bcconfig['11'],s:$scope.personalAutoTotalArray_bcconfig[11]});
			if(ii==2)	
			data[i].push({a:testbcConfig[ii].sNo,b:'Notification FNOL - New Claim',c:testbcConfig[ii].useCase,d:testbcConfig[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcconfig[20],i:$scope.availableComplexity_bcconfig[20],j:$scope.availableCustomization_bcconfig[20],k:$scope.availableAccelerator_bcconfig[20],l:$scope.availableConfidenceLevel_bcconfig[20],m:$scope.personalAutoTotalArray_bcconfig[20],n:$scope.availableOptions_bcconfig[21],o:$scope.availableComplexity_bcconfig[21],p:$scope.availableCustomization_bcconfig[21],q:$scope.availableAccelerator_bcconfig[21],r:$scope.availableConfidenceLevel_bcconfig['21'],s:$scope.personalAutoTotalArray_bcconfig[21]});
			}
			}
			}
			if(Person[i].title=='BC Integeration')
			{
			if(autoArray.length<2)
			{
			data[i] = [{a:'',b:'',c:'',d:'',e:'Development BaseLine',f:'',g:'580',h:'',i:'',j:autoArray[n].name,k:'',l:'',m:$scope.personalAutoaggregate_bcInteg[0]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total'}];
			for(var ii=0; ii< testbcInteg.length; ii++){
			if(ii==0)	
			data[i].push({a:testbcInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testbcInteg[ii].useCase,d:testbcInteg[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcInteg['00'],i:$scope.availableComplexity_bcInteg['00'],j:$scope.availableCustomization_bcInteg['00'],k:$scope.availableAccelerator_bcInteg['00'],l:$scope.availableConfidenceLevel_bcInteg['00'],m:$scope.personalAutoTotalArray_bcInteg[0]});
			if(ii==1)	
			data[i].push({a:testbcInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testbcInteg[ii].useCase,d:testbcInteg[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcInteg[10],i:$scope.availableComplexity_bcInteg[10],j:$scope.availableCustomization_bcInteg[10],k:$scope.availableAccelerator_bcInteg[10],l:$scope.availableConfidenceLevel_bcInteg['10'],m:$scope.personalAutoTotalArray_bcInteg[10]});
			if(ii==2)	
			data[i].push({a:testbcInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testbcInteg[ii].useCase,d:testbcInteg[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcInteg[20],i:$scope.availableComplexity_bcInteg[20],j:$scope.availableCustomization_bcInteg[20],k:$scope.availableAccelerator_bcInteg[20],l:$scope.availableConfidenceLevel_bcInteg[20],m:$scope.personalAutoTotalArray_bcInteg[20]});
			}
			}
			if(autoArray.length>=2)
			{
			data[i] = [{a:'', b:'', c:'', d:'', e:'Development BaseLine', f:'', g:'580', h:'', i:'', j:autoArray[n].name,k:'', l:'', m:$scope.personalAutoaggregate_bcInteg[0], n:'', o:'', p:autoArray[n+1].name , q:'',r:'',s:$scope.personalAutoaggregate_bcInteg[1]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total',n:'InScope', o:'Complexity', p:'Customization' , q:'Accelerator Available',r:'Confidence Level',s:'Total'}];
			for(var ii=0; ii< testbcInteg.length; ii++){
			if(ii==0)	
			data[i].push({a:testbcInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testbcInteg[ii].useCase,d:testbcInteg[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcInteg['00'],i:$scope.availableComplexity_bcInteg['00'],j:$scope.availableCustomization_bcInteg['00'],k:$scope.availableAccelerator_bcInteg['00'],l:$scope.availableConfidenceLevel_bcInteg['00'],m:$scope.personalAutoTotalArray_bcInteg[0],n:$scope.availableOptions_bcInteg['01'],o:$scope.availableComplexity_bcInteg['01'],p:$scope.availableCustomization_bcInteg['01'],q:$scope.availableAccelerator_bcInteg['01'],r:$scope.availableConfidenceLevel_bcInteg['01'],s:$scope.personalAutoTotalArray_bcInteg[1]});
			if(ii==1)	
			data[i].push({a:testbcInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testbcInteg[ii].useCase,d:testbcInteg[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcInteg[10],i:$scope.availableComplexity_bcInteg[10],j:$scope.availableCustomization_bcInteg[10],k:$scope.availableAccelerator_bcInteg[10],l:$scope.availableConfidenceLevel_bcInteg['10'],m:$scope.personalAutoTotalArray_bcInteg[10],n:$scope.availableOptions_bcInteg[11],o:$scope.availableComplexity_bcInteg[11],p:$scope.availableCustomization_bcInteg[11],q:$scope.availableAccelerator_bcInteg[11],r:$scope.availableConfidenceLevel_bcInteg['11'],s:$scope.personalAutoTotalArray_bcInteg[11]});
			if(ii==2)	
			data[i].push({a:testbcInteg[ii].sNo,b:'Notification FNOL - New Claim',c:testbcInteg[ii].useCase,d:testbcInteg[ii].featureType,e:testbcConfig[ii].baseComplexity1,f:testbcConfig[ii].baseCustomization1,g:testbcConfig[ii].baseTotal1,h:$scope.availableOptions_bcInteg[20],i:$scope.availableComplexity_bcInteg[20],j:$scope.availableCustomization_bcInteg[20],k:$scope.availableAccelerator_bcInteg[20],l:$scope.availableConfidenceLevel_bcInteg[20],m:$scope.personalAutoTotalArray_bcInteg[20],n:$scope.availableOptions_bcInteg[21],o:$scope.availableComplexity_bcInteg[21],p:$scope.availableCustomization_bcInteg[21],q:$scope.availableAccelerator_bcInteg[21],r:$scope.availableConfidenceLevel_bcInteg['21'],s:$scope.personalAutoTotalArray_bcInteg[21]});
			}
			}
			}	
			if(Person[i].title=='iNexus')
			{
			if(autoArray.length<2)
			{
			data[i] = [{a:'',b:'',c:'',d:'',e:'Development BaseLine',f:'',g:'580',h:'',i:'',j:autoArray[o].name,k:'',l:'',m:$scope.personalAutoaggregate_iNexus[0]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total'}];
			for(var ii=0; ii< testiNexus.length; ii++){
			if(ii==0)	
			data[i].push({a:testiNexus[ii].sNo,b:'Notification FNOL - New Claim',c:testiNexus[ii].useCase,d:testiNexus[ii].featureType,e:testiNexus[ii].baseComplexity1,f:testiNexus[ii].baseCustomization1,g:testiNexus[ii].baseTotal1,h:$scope.availableOptions_iNexus['00'],i:$scope.availableComplexity_iNexus['00'],j:$scope.availableCustomization_iNexus['00'],k:$scope.availableAccelerator_iNexus['00'],l:$scope.availableConfidenceLevel_iNexus['00'],m:$scope.personalAutoTotalArray_iNexus[0]});
			if(ii==1)	
			data[i].push({a:testiNexus[ii].sNo,b:'Notification FNOL - New Claim',c:testiNexus[ii].useCase,d:testiNexus[ii].featureType,e:testiNexus[ii].baseComplexity1,f:testiNexus[ii].baseCustomization1,g:testiNexus[ii].baseTotal1,h:$scope.availableOptions_iNexus[10],i:$scope.availableComplexity_iNexus[10],j:$scope.availableCustomization_iNexus[10],k:$scope.availableAccelerator_iNexus[10],l:$scope.availableConfidenceLevel_iNexus['10'],m:$scope.personalAutoTotalArray_iNexus[10]});
			if(ii==1)	
			data[i].push({a:testiNexus[ii].sNo,b:'Notification FNOL - New Claim',c:testiNexus[ii].useCase,d:testiNexus[ii].featureType,e:testiNexus[ii].baseComplexity1,f:testiNexus[ii].baseCustomization1,g:testiNexus[ii].baseTotal1,h:$scope.availableOptions_iNexus[20],i:$scope.availableComplexity_iNexus[20],j:$scope.availableCustomization_iNexus[20],k:$scope.availableAccelerator_iNexus[20],l:$scope.availableConfidenceLevel_iNexus[20],m:$scope.personalAutoTotalArray_iNexus[20]});
			}
			}
			if(autoArray.length>=2)
			{
			data[i] = [{a:'', b:'', c:'', d:'', e:'Development BaseLine', f:'', g:'580', h:'', i:'', j:autoArray[o].name,k:'', l:'', m:$scope.personalAutoaggregate_iNexus[0], n:'', o:'', p:autoArray[o+1].name , q:'',r:'',s:$scope.personalAutoaggregate_iNexus[1]},
			{a:'S.No',b:'Feature',c:'Use Case',d:'Feature Type',e:'Complexity',f:'Customization',g:'Total',h:'InScope',i:'Complexity',j:'Customization',k:'Accelerator Available',l:'Confidence Level',m:'Total',n:'InScope', o:'Complexity', p:'Customization' , q:'Accelerator Available',r:'Confidence Level',s:'Total'}];
			for(var ii=0; ii< testiNexus.length; ii++){
			if(ii==0)	
			data[i].push({a:testiNexus[ii].sNo,b:'Notification FNOL - New Claim',c:testiNexus[ii].useCase,d:testiNexus[ii].featureType,e:testiNexus[ii].baseComplexity1,f:testiNexus[ii].baseCustomization1,g:testiNexus[ii].baseTotal1,h:$scope.availableOptions_iNexus['00'],i:$scope.availableComplexity_iNexus['00'],j:$scope.availableCustomization_iNexus['00'],k:$scope.availableAccelerator_iNexus['00'],l:$scope.availableConfidenceLevel_iNexus['00'],m:$scope.personalAutoTotalArray_iNexus[0],n:$scope.availableOptions_iNexus['01'],o:$scope.availableComplexity_iNexus['01'],p:$scope.availableCustomization_iNexus['01'],q:$scope.availableAccelerator_iNexus['01'],r:$scope.availableConfidenceLevel_iNexus['01'],s:$scope.personalAutoTotalArray_iNexus[1]});
			if(ii==1)	
			data[i].push({a:testiNexus[ii].sNo,b:'Notification FNOL - New Claim',c:testiNexus[ii].useCase,d:testiNexus[ii].featureType,e:testiNexus[ii].baseComplexity1,f:testiNexus[ii].baseCustomization1,g:testiNexus[ii].baseTotal1,h:$scope.availableOptions_iNexus[10],i:$scope.availableComplexity_iNexus[10],j:$scope.availableCustomization_iNexus[10],k:$scope.availableAccelerator_iNexus[10],l:$scope.availableConfidenceLevel_iNexus['10'],m:$scope.personalAutoTotalArray_iNexus[10],n:$scope.availableOptions_iNexus[11],o:$scope.availableComplexity_iNexus[11],p:$scope.availableCustomization_iNexus[11],q:$scope.availableAccelerator_iNexus[11],r:$scope.availableConfidenceLevel_iNexus['11'],s:$scope.personalAutoTotalArray_iNexus[11]});
			if(ii==2)	
			data[i].push({a:testiNexus[ii].sNo,b:'Notification FNOL - New Claim',c:testiNexus[ii].useCase,d:testiNexus[ii].featureType,e:testiNexus[ii].baseComplexity1,f:testiNexus[ii].baseCustomization1,g:testiNexus[ii].baseTotal1,h:$scope.availableOptions_iNexus[20],i:$scope.availableComplexity_iNexus[20],j:$scope.availableCustomization_iNexus[20],k:$scope.availableAccelerator_iNexus[20],l:$scope.availableConfidenceLevel_iNexus[20],m:$scope.personalAutoTotalArray_iNexus[20],n:$scope.availableOptions_iNexus[21],o:$scope.availableComplexity_iNexus[21],p:$scope.availableCustomization_iNexus[21],q:$scope.availableAccelerator_iNexus[21],r:$scope.availableConfidenceLevel_iNexus['21'],s:$scope.personalAutoTotalArray_iNexus[21]});
			}
			}
			}
			}
			
			var res = alasql('SELECT INTO XLSX("restest344b.xlsx",?) FROM ?',[opts,data]);
							// [opts,[data]);
		}
		//End code to generate excel file by Shikha 
			
			
            $scope.update = function(baseTotal,availableOptions,availableComplexity,availableCustomization,availableAccelerator,availableConfidenceLevel,changedValue,sNo,Index){
                debugger;
				if($scope.currentTab === 'ccConfig.tpl.html'){
					
					this.personalAutoTotalArray = this.personalAutoTotalArray_ccconfig;
					this.personalAutoaggregate = ($scope.personalAutoaggregate_ccconfig[Index] == undefined? +0 : $scope.personalAutoaggregate_ccconfig[Index]);
					
					this.addedCustomisation_old = this.addedCustomisation_old_ccconfig;
					this.addedComplexity_old = this.addedComplexity_old_ccconfig;
					this.addedAccelerator_old = this.addedAccelerator_old_ccconfig;
					this.addedConfidence_old = this.addedConfidence_old_ccconfig;
					
					this.personalAutoTotalArray_old = this.personalAutoTotalArray_old_ccconfig;
					
				} else if($scope.currentTab === 'ccInteg.tpl.html'){
										
					this.personalAutoTotalArray = this.personalAutoTotalArray_ccInteg;
					this.personalAutoaggregate = ($scope.personalAutoaggregate_ccInteg[Index] == undefined? +0 : $scope.personalAutoaggregate_ccInteg[Index]);
					
					this.addedCustomisation_old = this.addedCustomisation_old_ccInteg;
					this.addedComplexity_old = this.addedComplexity_old_ccInteg;
					this.addedAccelerator_old = this.addedAccelerator_old_ccInteg;
					this.addedConfidence_old = this.addedConfidence_old_ccInteg;
				
					this.personalAutoTotalArray_old = this.personalAutoTotalArray_old_ccInteg;
					
				} else if($scope.currentTab === 'pcConfig.tpl.html'){
										
					this.personalAutoTotalArray = this.personalAutoTotalArray_pcconfig;
					this.personalAutoaggregate = ($scope.personalAutoaggregate_pcconfig[Index] == undefined? +0 : $scope.personalAutoaggregate_pcconfig[Index]);
					
					this.addedCustomisation_old = this.addedCustomisation_old_pcconfig;
					this.addedComplexity_old = this.addedComplexity_old_pcconfig;
					this.addedAccelerator_old = this.addedAccelerator_old_pcconfig;
					this.addedConfidence_old = this.addedConfidence_old_pcconfig;
				
					this.personalAutoTotalArray_old = this.personalAutoTotalArray_old_pcconfig;
					
				} else if($scope.currentTab === 'bcConfig.tpl.html'){
										
					this.personalAutoTotalArray = this.personalAutoTotalArray_bcconfig;
					this.personalAutoaggregate = ($scope.personalAutoaggregate_bcconfig[Index] == undefined? +0 : $scope.personalAutoaggregate_bcconfig[Index]);
					
					this.addedCustomisation_old = this.addedCustomisation_old_bcconfig;
					this.addedComplexity_old = this.addedComplexity_old_bcconfig;
					this.addedAccelerator_old = this.addedAccelerator_old_bcconfig;
					this.addedConfidence_old = this.addedConfidence_old_bcconfig;
				
					this.personalAutoTotalArray_old = this.personalAutoTotalArray_old_bcconfig;
					
				} else if($scope.currentTab === 'bcInteg.tpl.html'){
										
					this.personalAutoTotalArray = this.personalAutoTotalArray_bcInteg;
					this.personalAutoaggregate = ($scope.personalAutoaggregate_bcInteg[Index] == undefined? +0 : $scope.personalAutoaggregate_bcInteg[Index]);
					
					this.addedCustomisation_old = this.addedCustomisation_old_bcInteg;
					this.addedComplexity_old = this.addedComplexity_old_bcInteg;
					this.addedAccelerator_old = this.addedAccelerator_old_bcInteg;
					this.addedConfidence_old = this.addedConfidence_old_bcInteg;
				
					this.personalAutoTotalArray_old = this.personalAutoTotalArray_old_bcInteg;
					
				} else if($scope.currentTab === 'iNexus.tpl.html'){
										
					this.personalAutoTotalArray = this.personalAutoTotalArray_iNexus;
					this.personalAutoaggregate = ($scope.personalAutoaggregate_iNexus[Index] == undefined? +0 : $scope.personalAutoaggregate_iNexus[Index]);
					
					this.addedCustomisation_old = this.addedCustomisation_old_iNexus;
					this.addedComplexity_old = this.addedComplexity_old_iNexus;
					this.addedAccelerator_old = this.addedAccelerator_old_iNexus
					this.addedConfidence_old = this.addedConfidence_old_iNexus;
				
					this.personalAutoTotalArray_old = this.personalAutoTotalArray_old_iNexus;
					
				}
				//this.availableOptions_ccconfig[sNo] = availableOptions;
				
                if("Yes" == availableOptions){
					debugger;
                    if((availableComplexity != undefined && availableComplexity != "" && availableComplexity != '')
                        || (availableCustomization != undefined && availableCustomization != "" && availableCustomization != '')
                        || (availableAccelerator != undefined && availableAccelerator != "" && availableAccelerator != '')
                        || (availableConfidenceLevel != undefined && availableConfidenceLevel != "" && availableConfidenceLevel != '')){
                        //$http.get('http://localhost:8080/estimator/resources/estimator.properties').then(function (response) {
						if(true){
                            debugger;
							
							//Dynamic usecase page: added below values for testing purpose.
                            $scope.Simple = 10;
                            $scope.Medium = 20;
                            $scope.High = 30;
                            $scope.Small = 40;
                            $scope.Moderate = 50;
                            $scope.Large = 60;
                            $scope.AcceleratorYes = 5;
                            $scope.AcceleratorNo = 10;
                            $scope.Optimistic = 10;
                            $scope.Pessimistic = 20;
							
							/*$scope.Simple = response.data.Simple;
                            $scope.Medium = response.data.Medium;
                            $scope.High = response.data.High;
                            $scope.Small = response.data.Small;
                            $scope.Moderate = response.data.Moderate;
                            $scope.Large = response.data.Large;
                            $scope.AcceleratorYes = response.data.AcceleratorYes;
                            $scope.AcceleratorNo = response.data.AcceleratorNo;
                            $scope.Optimistic = response.data.Optimistic;
                            $scope.Pessimistic = response.data.Pessimistic;*/

                            if(availableComplexity != undefined && availableComplexity != "" && availableComplexity != ''){   

                               if(availableComplexity == "Simple"){
									$scope.percentComplex = $scope.Simple;
								}else if(availableComplexity == "Medium"){
									$scope.percentComplex = $scope.Medium;
								}else if(availableComplexity == "High"){
									$scope.percentComplex = $scope.High;
								}else{
									$scope.percentComplex = 0;
								}
								$scope.addedComplexity = ((($scope.percentComplex - 0) *  baseTotal)/100);
								
							}   

							if(availableCustomization != undefined && availableCustomization != "" && availableCustomization != ''){

								if(availableCustomization == "Small"){
									$scope.addCustomization = $scope.Small;
								}else if(availableCustomization == "Moderate"){
									$scope.addCustomization = $scope.Moderate;
								}else if(availableCustomization == "Large"){
									$scope.addCustomization = $scope.Large;
								}else{
									$scope.addCustomization = 0;
								}
								$scope.addedCustomisation = ((($scope.addCustomization - 30) *  baseTotal)/100);
								
							}

							if(availableAccelerator != undefined && availableAccelerator != "" && availableAccelerator != ''){

								if(availableAccelerator == "Yes"){
									$scope.addAccelerator = $scope.AcceleratorYes;
								}else if(availableAccelerator == "No"){
									$scope.addAccelerator = $scope.AcceleratorNo;
								}else{
									$scope.addAccelerator = 0;
								}
								$scope.addedAccelerator = (($scope.addAccelerator*baseTotal)/100);
								
							}
							if(availableConfidenceLevel != undefined && availableConfidenceLevel != "" && availableConfidenceLevel != ''){

								if(availableConfidenceLevel == "Optimistic"){
									$scope.addConfidence = $scope.Optimistic;
								}else if(availableConfidenceLevel == "Pessimistic"){
									$scope.addConfidence = $scope.Pessimistic;
								}else{
									$scope.addConfidence = 0;
								}
								$scope.addedConfidence = (($scope.addConfidence*baseTotal)/100);
								
							}

							
							//Dynamic usecase page: modified below formulae to meet various test cases - Start
							
							this.personalAutoTotalArray[sNo] = (this.personalAutoTotalArray[sNo] == undefined? +parseInt(baseTotal) : parseInt(this.personalAutoTotalArray[sNo])) 
																	+ (changedValue == 'availableCustomization'?($scope.addedCustomisation == undefined? +0 : $scope.addedCustomisation) : +0)
																	+ (changedValue == 'availableComplexity'? ($scope.addedComplexity == undefined? +0 : $scope.addedComplexity) : +0)
																	- (changedValue == 'availableAccelerator'? ($scope.addedAccelerator == undefined? +0 : $scope.addedAccelerator) : +0)
																	+ (changedValue == 'availableConfidenceLevel'? ($scope.addedConfidence == undefined? +0 : $scope.addedConfidence) : +0)
																		- (changedValue == 'availableCustomization'?($scope.addedCustomisation_old[sNo] == undefined? +0 : $scope.addedCustomisation_old[sNo]) : +0)
																		- (changedValue == 'availableComplexity'? ($scope.addedComplexity_old[sNo] == undefined? +0 : $scope.addedComplexity_old[sNo]) : +0)
																		+ (changedValue == 'availableAccelerator'? ($scope.addedAccelerator_old[sNo] == undefined? +0 : $scope.addedAccelerator_old[sNo]) : +0)
																		- (changedValue == 'availableConfidenceLevel'? ($scope.addedConfidence_old[sNo] == undefined? +0 : $scope.addedConfidence_old[sNo]) : +0);
																		 
							
							
							if(this.personalAutoaggregate != 0){
								
								var y = 0;
								for( var x = Index; x < this.personalAutoTotalArray.length;x = x+10){
									
									y = y + (this.personalAutoTotalArray[x] == undefined? +0 : this.personalAutoTotalArray[x]);
									this.personalAutoaggregate = y;
								}
								
							} else{
								
								this.personalAutoaggregate = this.personalAutoTotalArray[sNo] 
								
							}
							
							$scope.addedCustomisation_old[sNo] = (changedValue == 'availableCustomization'?($scope.addedCustomisation == undefined? +0 : $scope.addedCustomisation) : +0)
							$scope.addedComplexity_old[sNo] = (changedValue == 'availableComplexity'? ($scope.addedComplexity == undefined? +0 : $scope.addedComplexity) : +0)
							$scope.addedAccelerator_old[sNo] =	(changedValue == 'availableAccelerator'? ($scope.addedAccelerator == undefined? +0 : $scope.addedAccelerator) : +0)
							$scope.addedConfidence_old[sNo] =	(changedValue == 'availableConfidenceLevel'? ($scope.addedConfidence == undefined? +0 : $scope.addedConfidence) : +0)
							
							$scope.personalAutoTotalArray_old[sNo] = this.personalAutoTotalArray[sNo];
							
							
						}
						//});
					}else{
						
						
						this.personalAutoTotalArray[sNo] = parseInt(baseTotal);
						
						
						$scope.addedCustomisation_old[sNo] = 0;
						$scope.addedComplexity_old[sNo] =	0;
						$scope.addedAccelerator_old[sNo] =	0;
						$scope.addedConfidence_old[sNo] =	0;
						
						$scope.personalAutoTotalArray_old[sNo] = 0;
						
						
						if(this.personalAutoaggregate != 0){
								
								var y = 0;
								for( var x = Index; x < this.personalAutoTotalArray.length;x = x+10){
									
									y = y + (this.personalAutoTotalArray[x] == undefined? +0 : this.personalAutoTotalArray[x]);
									this.personalAutoaggregate = y;
								}
								
						} else{
								
								this.personalAutoaggregate = this.personalAutoTotalArray[sNo] 
								
						}
					}
				}else if("No" == availableOptions){
					this.personalAutoaggregate = this.personalAutoaggregate -  (this.personalAutoTotalArray[sNo] == undefined? +0 : this.personalAutoTotalArray[sNo]);
					this.personalAutoTotalArray[sNo]=0;
					
					
					$scope.addedCustomisation_old[sNo] = 0;
					$scope.addedComplexity_old[sNo] =	0;
					$scope.addedAccelerator_old[sNo] =	0;
					$scope.addedConfidence_old[sNo] =	0;
					
					$scope.personalAutoTotalArray_old[sNo] = 0;
				}
				
				if($scope.currentTab === 'ccConfig.tpl.html'){
										
					$scope.personalAutoTotalArray_ccconfig = this.personalAutoTotalArray;
					$scope.personalAutoaggregate_ccconfig[Index] = this.personalAutoaggregate;
					
					this.addedCustomisation_old_ccconfig = this.addedCustomisation_old;
					this.addedComplexity_old_ccconfig = this.addedComplexity_old;
					this.addedAccelerator_old_ccconfig = this.addedAccelerator_old;
					this.addedConfidence_old_ccconfig = this.addedConfidence_old;
				
					this.personalAutoTotalArray_old_ccconfig = this.personalAutoTotalArray_old;
					
				} else if($scope.currentTab === 'ccInteg.tpl.html'){
										
					this.personalAutoTotalArray_ccInteg = this.personalAutoTotalArray;
					$scope.personalAutoaggregate_ccInteg[Index] = this.personalAutoaggregate;
					
					this.addedCustomisation_old_ccInteg = this.addedCustomisation_old;
					this.addedComplexity_old_ccInteg = this.addedComplexity_old;
					this.addedAccelerator_old_ccInteg = this.addedAccelerator_old;
					this.addedConfidence_old_ccInteg = this.addedConfidence_old;
				
					this.personalAutoTotalArray_old_ccInteg = this.personalAutoTotalArray_old;
					
				} else if($scope.currentTab === 'pcConfig.tpl.html'){
										
					this.personalAutoTotalArray_pcconfig = this.personalAutoTotalArray;
					$scope.personalAutoaggregate_pcconfig[Index] = this.personalAutoaggregate;
					
					this.addedCustomisation_old_pcconfig = this.addedCustomisation_old;
					this.addedComplexity_old_pcconfig = this.addedComplexity_old;
					this.addedAccelerator_old_pcconfig = this.addedAccelerator_old;
					this.addedConfidence_old_pcconfig = this.addedConfidence_old;
				
					this.personalAutoTotalArray_old_pcconfig = this.personalAutoTotalArray_old;
					
				} else if($scope.currentTab === 'bcConfig.tpl.html'){
										
					this.personalAutoTotalArray_bcconfig = this.personalAutoTotalArray;
					$scope.personalAutoaggregate_bcconfig[Index] = this.personalAutoaggregate;
					
					this.addedCustomisation_old_bcconfig = this.addedCustomisation_old;
					this.addedComplexity_old_bcconfig = this.addedComplexity_old;
					this.addedAccelerator_old_bcconfig = this.addedAccelerator_old;
					this.addedConfidence_old_bcconfig = this.addedConfidence_old;
				
					this.personalAutoTotalArray_old_bcconfig = this.personalAutoTotalArray_old;
					
				} else if($scope.currentTab === 'bcInteg.tpl.html'){
										
					this.personalAutoTotalArray_bcInteg = this.personalAutoTotalArray;
					$scope.personalAutoaggregate_bcInteg[Index] = this.personalAutoaggregate;
					
					this.addedCustomisation_old_bcInteg = this.addedCustomisation_old;
					this.addedComplexity_old_bcInteg = this.addedComplexity_old;
					this.addedAccelerator_old_bcInteg = this.addedAccelerator_old;
					this.addedConfidence_old_bcInteg = this.addedConfidence_old;
				
					this.personalAutoTotalArray_old_bcInteg = this.personalAutoTotalArray_old;
					
				} else if($scope.currentTab === 'iNexus.tpl.html'){
										
					this.personalAutoTotalArray_iNexus = this.personalAutoTotalArray;
					$scope.personalAutoaggregate_iNexus[Index] = this.personalAutoaggregate;
					
					this.addedCustomisation_old_iNexus = this.addedCustomisation_old;
					this.addedComplexity_old_iNexus = this.addedComplexity_old;
					this.addedAccelerator_old_iNexus = this.addedAccelerator_old;
					this.addedConfidence_old_iNexus = this.addedConfidence_old;
				
					this.personalAutoTotalArray_old_iNexus = this.personalAutoTotalArray_old;
					
				}
					//Dynamic usecase page: modified below formulae to meet various test cases - END
			}

           /* $scope.updateComplex = function(availableComplexity){
                $http.get('http://localhost:8080/estimator/resources/estimator.properties').then(function (response) {
                    debugger;
                    $scope.Simple = response.data.Simple;
                    $scope.Medium = response.data.Medium;
                    $scope.High = response.data.High;
                    
                    if(availableComplexity == "Simple"){
                        $scope.percent = $scope.Simple;
                    }else if(availableComplexity == "Medium"){
                        $scope.percent = $scope.Medium;
                    }else if(availableComplexity == "High"){
                        $scope.percent = $scope.High;
                    }else{
                        $scope.percent = 0;
                    }
                    $scope.personalAutoTotal = $scope.baseTotal + ((($scope.percent - 0) *  $scope.baseTotal)/100) ;          
                });
            }*/

         /*   $scope.updateCustomization = function(availableCustomization){
                $http.get('http://localhost:8080/estimator/resources/estimator.properties').then(function (response) {
                    debugger;
                    $scope.Small = response.data.Small;
                    $scope.Moderate = response.data.Moderate;
                    $scope.Large = response.data.Large;
                    $scope.addCustomization;
                    if(availableCustomization == "Small"){
                        $scope.addCustomization = $scope.Small;
                    }else if(availableCustomization == "Moderate"){
                        $scope.addCustomization = $scope.Moderate;
                    }else if(availableCustomization == "Large"){
                        $scope.addCustomization = $scope.Large;
                    }else{
                        $scope.addCustomization = 0;
                    }
                    $scope.personalAutoTotal = $scope.baseTotal + ((($scope.addCustomization - 30) *  $scope.baseTotal)/100) ;          
                });
            }
            */

            $scope.tableStyle = {
                "border-collapse": "collapse",
                "border": "1px solid black",   
            }

            $scope.myStyle = {
                "background-color" : "#FFFFFF",

                "margin": "0 auto 20px",
                "width": "100%",
                "border": "3px solid #73AD21",
                "padding": "10px",
                "max-width": "2000px",
                "padding": "19px 29px 40px",

                "border": "1px solid #e5e5e5",
                "border-radius": "5px",
                "box-shadow": "0px 1px 2px rgba(0, 0, 0, 0.05)",
                "align" : "center",
                "margin-top": "40px",
				"overflow": "scroll"
            }
			
			////alert($routeParams.selectedItems[]);
			/*console.log($routeParams);
            $scope.tabs = [{
                title: 'CC Configuration',
                url: 'ccConfig.tpl.html'
            }, {
                title: 'CC Integration',
                url: 'CCInteg.tpl.html'
            }, {
                title: 'PC Configuration',
                url: 'PCConfig.tpl.html'
            }];*/
			
			/*$scope.types = [{
                title : 'Personal Auto'
            }, {
                title : 'Commercial Auto'
            }, {
                title : 'Commercial Auto'
            }, {
                title : 'Commercial Auto'
            }, {
                title : 'Commercial Auto'
            }];*/
			
			$scope.tabs = commonService.getPersonArray();
			$scope.types = commonService.getselectedLobsArray();
			//$scope.types = commonService.getselectedTypesArray();
			//$scope.LOBs = commonService.getselectedLobsArray();
			$scope.loading = true;
			$scope.useCaseOptions = commonService.getuseCaseObjectArray();
			console.log($scope.useCaseOptions);
            //$scope.currentTab = 'ccConfig.tpl.html';
			$scope.currentTab = $scope.tabs[0].url;
			
            $scope.onClickTab = function (tab) {
                $scope.currentTab = tab.url;
				
            }

            $scope.isActiveTab = function(tabUrl) {
                return tabUrl == $scope.currentTab;
				
            }
			
			$scope.submitSheet = function(){
				
					var clientObject = commonService.getclientObject();
					var projectObject = commonService.getprojectObject();
					var regionObject = commonService.getregionObject();
					var countryObject = commonService.getcountryObject();
					var userName = commonService.getuserName();
					//versionSelected
				
					var data = {
								   "clientID":clientObject.id,
								   "clientName":clientObject.name,
								   "projectID":projectObject.id,
								   "projectName":projectObject.name,
								   "regionID":regionObject.id,
								   "regionName":regionObject.desc,
								   "countryID":countryObject.countryID,
								   "countryName":countryObject.countryName, 
								   "userID":userName,
								   "version":$scope.versionSelected,
								   "filePath":"C:\\New folder\\estimation35.xls"
					};
					
					var insertEstimationObject=JSON.stringify(eval(data));
		
					$http.post('http://localhost:8080/EstimatorApp/rest/static/insertEstimation', insertEstimationObject).then(function(response){
						
						var jsonExtract=JSON.stringify(response, undefined, 2);
						var jsonobjectTemp = JSON.parse(jsonExtract);
						var jsonobject = jsonobjectTemp.data;
						if(jsonobject.status=='200' && jsonobject.message=='Successful Search'){
							alert ("Status : " + jsonobject.status + " " + "message : " + jsonobject.message);
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

			}
			
            $scope.init = function() {

                $scope.availableOpts = ["Yes","No"];
                $scope.availableComplexities = ["Simple","Medium","High"];
                $scope.availableCustomizations = ["Small","Moderate","Large"];
                $scope.availableConfidenceLevels = ["Optimistic","Pessimistic"];
                $scope.accelerators = ["Yes","No"];
				$scope.availableVersions = ["BaseLine","Intermediate","Final"];
				//Dynamic usecase page: Declaration and Initializing all the required varialbles - Start
                $scope.versionSelected = '';
				
				$scope.personalAutoTotalArray = [];
				$scope.personalAutoaggregate = 100;
				
				$scope.addedCustomisation_old = [];
				$scope.addedComplexity_old = [];
				$scope.addedAccelerator_old = [];
				$scope.addedConfidence_old = [];
				
				$scope.personalAutoTotalArray_old = [];
				
				$scope.availableOptions_ccconfig = [];
				$scope.availableOptions_ccInteg = [];
				$scope.availableOptions_pcconfig = [];
				$scope.availableOptions_bcconfig = [];
				$scope.availableOptions_bcInteg = [];
				$scope.availableOptions_iNexus = [];
				
				$scope.availableComplexity_ccconfig = [];
				$scope.availableComplexity_ccInteg = [];
				$scope.availableComplexity_pcconfig = [];
				$scope.availableComplexity_bcconfig = [];
				$scope.availableComplexity_bcInteg = [];
				$scope.availableComplexity_iNexus = [];
				
				$scope.availableCustomization_ccconfig = [];
				$scope.availableCustomization_ccInteg = [];
				$scope.availableCustomization_pcconfig = [];
				$scope.availableCustomization_iNexus = [];
				$scope.availableCustomization_bcconfig = [];
				$scope.availableCustomization_bcInteg = [];
				
				$scope.availableAccelerator_ccconfig = [];
				$scope.availableAccelerator_ccInteg = [];
				$scope.availableAccelerator_pcconfig = [];
				$scope.availableAccelerator_iNexus = [];
				$scope.availableAccelerator_bcconfig = [];
				$scope.availableAccelerator_bcInteg = [];
				
				$scope.availableConfidenceLevel_ccconfig = [];
				$scope.availableConfidenceLevel_ccInteg = [];
				$scope.availableConfidenceLevel_pcconfig = [];
				$scope.availableConfidenceLevel_iNexus = [];
				$scope.availableConfidenceLevel_bcconfig = [];
				$scope.availableConfidenceLevel_bcInteg = [];
				
				$scope.personalAutoTotalArray_ccconfig = [];
				$scope.personalAutoTotalArray_ccInteg = [];
				$scope.personalAutoTotalArray_pcconfig = [];
				$scope.personalAutoTotalArray_iNexus = [];
				$scope.personalAutoTotalArray_bcconfig = [];
				$scope.personalAutoTotalArray_bcInteg = [];
				
				$scope.personalAutoaggregate_ccconfig = [];
				$scope.personalAutoaggregate_ccInteg = [];
				$scope.personalAutoaggregate_pcconfig = [];
				$scope.personalAutoaggregate_iNexus = [];
				$scope.personalAutoaggregate_bcconfig = [];
				$scope.personalAutoaggregate_bcInteg = [];
				
				$scope.addedCustomisation_old_ccconfig = [];
				$scope.addedComplexity_old_ccconfig = [];
				$scope.addedAccelerator_old_ccconfig = [];
				$scope.addedConfidence_old_ccconfig = [];
				
				$scope.addedCustomisation_old_ccInteg = [];
				$scope.addedComplexity_old_ccInteg = [];
				$scope.addedAccelerator_old_ccInteg = [];
				$scope.addedConfidence_old_ccInteg = [];
				
				$scope.addedCustomisation_old_pcconfig = [];
				$scope.addedComplexity_old_pcconfig = [];
				$scope.addedAccelerator_old_pcconfig = [];
				$scope.addedConfidence_old_pcconfig = [];
				
				$scope.addedCustomisation_old_bcconfig = [];
				$scope.addedComplexity_old_bcconfig = [];
				$scope.addedAccelerator_old_bcconfig = [];
				$scope.addedConfidence_old_bcconfig = [];
				
				$scope.addedCustomisation_old_bcInteg = [];
				$scope.addedComplexity_old_bcInteg = [];
				$scope.addedAccelerator_old_bcInteg = [];
				$scope.addedConfidence_old_bcInteg = [];
				
				$scope.addedCustomisation_old_iNexus = [];
				$scope.addedComplexity_old_iNexus = [];
				$scope.addedAccelerator_old_iNexus = [];
				$scope.addedConfidence_old_iNexus = [];
				
				$scope.personalAutoTotalArray_old_ccconfig = [];
				$scope.personalAutoTotalArray_old_ccInteg = [];
				$scope.personalAutoTotalArray_old_pcconfig = [];
				$scope.personalAutoTotalArray_old_bcconfig = [];
				$scope.personalAutoTotalArray_old_bcInteg = [];
				$scope.personalAutoTotalArray_old_iNexus = [];
				
				
				//Dynamic usecase page: Declaration and Initializing all the required varialbles - END
				
				//Dynamic usecase page: Below JSON object is hardcoded for testing purpose and will be retrieved from API Services post integration
				
				
					
				/*
				$scope.useCaseOptions = 
				
				[
				  {
					ccConfig: [
					  {
						sNo: '1',
						feature: 'Notification FNOL - New Claim',
						useCase: 'LOB Mapping',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '2',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Admin Data Loader - Organization structure',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Large',
						baseTotal1: '240',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '3',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Policy Search',
						featureType: 'STD',
						baseComplexity1: 'Medium',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  }
					],
					ccInteg: [
					  {
						sNo: '1',
						feature: 'Notification FNOL - New Claim',
						useCase: 'LOB Mapping',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '2',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Admin Data Loader - Organization structure',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Large',
						baseTotal1: '240',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '3',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Policy Search',
						featureType: 'STD',
						baseComplexity1: 'Medium',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  }
					],
					pcConfig: [
					  {
						sNo: '1',
						feature: 'Notification FNOL - New Claim',
						useCase: 'LOB Mapping',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '2',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Admin Data Loader - Organization structure',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Large',
						baseTotal1: '240',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '3',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Policy Search',
						featureType: 'STD',
						baseComplexity1: 'Medium',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  }
					],
					bcConfig: [
					  {
						sNo: '1',
						feature: 'Notification FNOL - New Claim',
						useCase: 'LOB Mapping',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '2',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Admin Data Loader - Organization structure',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Large',
						baseTotal1: '240',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '3',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Policy Search',
						featureType: 'STD',
						baseComplexity1: 'Medium',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  }
					],
					bcInteg: [
					  {
						sNo: '1',
						feature: 'Notification FNOL - New Claim',
						useCase: 'LOB Mapping',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '2',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Admin Data Loader - Organization structure',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Large',
						baseTotal1: '240',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '3',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Policy Search',
						featureType: 'STD',
						baseComplexity1: 'Medium',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  }
					],
					iNexus: [
					  {
						sNo: '1',
						feature: 'Notification FNOL - New Claim',
						useCase: 'LOB Mapping',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '2',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Admin Data Loader - Organization structure',
						featureType: 'STD',
						baseComplexity1: 'Simple',
						baseCustomization1: 'Large',
						baseTotal1: '240',
						personalAutoTotal1: ''
					  },
					  {
						sNo: '3',
						feature: 'Notification FNOL - New Claim',
						useCase: 'Policy Search',
						featureType: 'STD',
						baseComplexity1: 'Medium',
						baseCustomization1: 'Moderate',
						baseTotal1: '160',
						personalAutoTotal1: ''
					  }
					]
				  }
				];
				
				*/
				
                $scope.baseTotal =160; 
               


                $scope.baseTotal1 =160; 
                $scope.baseComplexity1 = "Simple";
                $scope.baseCustomization1 = "Moderate";

                $scope.baseTotal2 =240; 
                $scope.baseComplexity2 = "Simple";
                $scope.baseCustomization2 = "Large";

                $scope.baseTotal3 =160; 
                $scope.baseComplexity3 = "Medium";
                $scope.baseCustomization3 = "Moderate";

                $scope.baseTotal4 =240; 
                $scope.baseComplexity4 = "Medium";
                $scope.baseCustomization4 = "Large";

                $scope.baseTotal5 =240; 
                $scope.baseComplexity5 = "Medium";
                $scope.baseCustomization5 = "Large";

                $scope.baseTotal6 =120; 
                $scope.baseComplexity6 = "Simple";
                $scope.baseCustomization6 = "Small";

                $scope.baseTotal7 =120; 
                $scope.baseComplexity7 = "Simple";
                $scope.baseCustomization7 = "Small";

                $scope.baseTotal8 =160; 
                $scope.baseComplexity8 = "Simple";
                $scope.baseCustomization8 = "Moderate";

                $scope.baseTotal9 =160; 
                $scope.baseComplexity9 = "Medium";
                $scope.baseCustomization9 = "Small";

                $scope.baseTotal10 =160; 
                $scope.baseComplexity10 = "Medium";
                $scope.baseCustomization10 = "Moderate";
                

            };
      // runs once per controller instantiation
      $scope.init();


  });
