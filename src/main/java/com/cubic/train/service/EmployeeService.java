package com.cubic.train.service;

import java.util.List;
import java.util.Map;

import com.cubic.train.model.Department;
import com.cubic.train.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();

	public void saveEmployee(Employee emp);

	public Double calculateSalary(String empNo, Integer totalWorkingDays);
	
	public List<Department> getDepartments();

}
