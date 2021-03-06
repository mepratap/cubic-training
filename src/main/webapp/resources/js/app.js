'use strict';

var myApp = angular.module('trainingApp', ['ngRoute']);

myApp.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : 'resources/pages/dashboard.jsp',
		controller : 'DashboardCtrl'
	}).when('/add-employee', {
		templateUrl : 'resources/pages/add-employee.jsp',
		controller : 'EmployeeController'
	}).when('/view-employee', {
		templateUrl : 'resources/pages/view-employee.jsp',
		controller : 'EmployeeController'
	}).when('/calc-salary', {
		templateUrl : 'resources/pages/calc-salary.jsp',
		controller : 'EmployeeController'
	}).otherwise({
		redirectTo : '/'
	})
} ]);
