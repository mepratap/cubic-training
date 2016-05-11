package com.cubic.train.dao;

import java.util.List;
import java.util.Map;

import com.cubic.train.model.Department;
import com.cubic.train.model.Employee;

public interface MyDataDao {
	
	public  Double calculateSalary(String empNo, Integer totalDays);
	
	public  void saveEmployee(Employee emp);
	
	public  Map<String, Employee> getAllEmployess();
	
	public List<Department> getDepartments();
	

}
