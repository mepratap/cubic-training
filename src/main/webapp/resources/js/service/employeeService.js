myApp.factory('employeeService',['$http','$q', function($http,$q){
	return{
		addUser: function(employee){
			return $http.post('employee',employee,{
				headers:{
					'Content-Type':'application/json',
					"Accept":"application/json"
				}
			}).then(function(response){
				return response.data;
			},function(errResponse){
				console.log('---ERor while creating employee---');
				console.log(errResponse);
				$q.reject(errResponse);
				return errResponse.data;
			});
			
		},
		
		getAllEmployees: function() {
			return $http({
				method : 'GET',
				url : 'employee',
				data : '',
				DataType : 'application/json',
				headers : {
					'Accept' : 'application/json; charset=utf-8',
					'Content-Type' : 'application/json; charset=utf-8'
				}
			}).then(function(response) {
				console.log(response.data);
				return response.data;
			}, function(errResponse) {
				$q.reject(errResponse);
				return errResponse.data;
			});
		}
	}
}]);