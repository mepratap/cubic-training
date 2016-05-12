'use strict';
myApp.controller('EmployeeController', [ '$scope', '$http', '$location', '$q',
		'employeeService',
		function($scope, $http, $location, $q, employeeService) {

			/* Create Methods and Call Service Methods */
			$scope.getVendorWithCandidate = function() {
				AdminService.getVendorWithCandidate().then(function(response) {
					$scope.vcModels = response;
					console.log("list of user \t" + JSON.stringify(response));

				});

				// Model to JSON for demo purpose
				$scope.$watch('vcModels', function(model) {
					$scope.vcModelAsJson = angular.toJson(model, true);
				}, true);

			};

			$scope.adduser = function(employee) {
				console.log(employee);
				employeeService.addUser(employee).then(function(response) {
					alert("add employee success.....");
					$scope.employee = response;
					console.log("list of employee \t" + JSON.stringify(response));

				})
			};

		} ]);
