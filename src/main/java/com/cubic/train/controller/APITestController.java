package com.cubic.train.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cubic.train.model.Department;
import com.cubic.train.model.Employee;
import com.cubic.train.service.EmployeeService;


@Controller
public class APITestController {
	Logger logger = Logger.getLogger(APITestController.class);
	@Autowired
	private EmployeeService employeeService; 
	
	@RequestMapping(value = "/all_department", method = RequestMethod.GET)
	public @ResponseBody List<Department> getDepartments() {
		logger.info("++++ Getting Departments ++++++++++");
		return employeeService.getDepartments();
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public @ResponseBody Employee createEmployee(@RequestBody Employee employee){
		employeeService.saveEmployee(employee);
		return employee;
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public @ResponseBody List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}
	
	@RequestMapping(value = "/calc_salary", method = RequestMethod.GET)
	public @ResponseBody Double calculateSalary(String empNo, Integer totalWorkingDays) {
		return employeeService.calculateSalary(empNo, totalWorkingDays);
	}
	
	
}
