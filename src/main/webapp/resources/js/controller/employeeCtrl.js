
'use strict';
myApp.controller('EmployeeController', ['$scope', '$http', '$location', '$q', function ($scope, $http, $location, $q) {

	/* Create Methods and Call Service Methods */
	$scope.getVendorWithCandidate = function () {
		AdminService.getVendorWithCandidate().then(function (response) {
	        $scope.vcModels = response;
	        console.log("list of user \t" + JSON.stringify(response));

	    });
		
		 // Model to JSON for demo purpose
	    $scope.$watch('vcModels', function(model) {
	        $scope.vcModelAsJson = angular.toJson(model, true);
	    }, true);
	    
	};
	
		    
}]);
