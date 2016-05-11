<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<title>My Dashboard</title>

<!-- CSS Files -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link href="<c:url value='resources/css/styles.css' />" rel="stylesheet"></link>

<!-- Library Files -->
<script src="<c:url value='resources/js/angular.min.js' />"></script>
<script src="<c:url value='resources/js/angular-route.js' />"></script>

<!-- Angular Materials -->
<script src="<c:url value='resources/js/app.js' />"></script>


</head>
<body ng-app="trainingApp">
	<div class="menubg">
		<div class="menu">
				<a href="#dashboard">Dashboard</a>
				<a href="#add-employee">Add Employee</a>
				<a href="#view-employee">View Employee</a>
				<a href="#calc-salary">Calculate Salary</a>
		</div>
	</div>

	<div class="content" ng-view>
		
	</div>

	<div class="footer">
		<p class="footer-con">Copyright &copy; 2015. All rights reserved at Cubic
			Technologies, LLC.</p>
	</div>


</body>
</html>
