package com.cubic.train.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubic.train.dao.MyDataDao;
import com.cubic.train.model.Department;
import com.cubic.train.model.Employee;
import com.cubic.train.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private MyDataDao myDataDao;

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>(); 
		Map<String, Employee> map = myDataDao.getAllEmployess();
		for(Map.Entry<String, Employee> m: map.entrySet()){
			employees.add(m.getValue());
		}
		return employees;
	}

	@Override
	public void saveEmployee(Employee emp) {
		myDataDao.saveEmployee(emp);
	}

	@Override
	public Double calculateSalary(String empNo, Integer totalWorkingDays) {
		return myDataDao.calculateSalary(empNo, totalWorkingDays);
	}

	@Override
	public List<Department> getDepartments() {
		return myDataDao.getDepartments();
	}

}
