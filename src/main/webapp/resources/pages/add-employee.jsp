<div>
	<h1>Add employees</h1>

	<form method="post" ng-controller="EmployeeController" name="userForm">
	
	<label for="empId">Id</label>
		<input type="text" class="form-control" name="empId" ng-model="employee.empId">
	
		<label for="firstName">First Name</label>
		<input type="text" class="form-control" name="firstName" ng-model="employee.firstName">
			
		<label for="lastName">Last Name</label>
		<input type="text" class="form-control" name="lastName" ng-model="employee.lastName">
		
		<label for="contactNo">Contact Info</label>
		<input type="text" class="form-control" name="contactNo" ng-model="employee.contactNo">
		
		<label for="PerHourRate">Pay PerHour</label>
		<input type="text" class="form-control" name="PerHourRate" ng-model="employee.perHourRate">
		
		<input type="submit" value="Submit" ng-click="adduser(employee)">
		
	</form>
</div>