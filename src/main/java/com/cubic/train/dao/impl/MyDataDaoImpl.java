package com.cubic.train.dao.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cubic.train.dao.MyDataDao;
import com.cubic.train.model.Department;
import com.cubic.train.model.Employee;

@Repository
public class MyDataDaoImpl implements MyDataDao {
	private static Map<String, Employee> employess;
	private static Double FEDERAL_TAX = 890.45;

	@Override
	public void saveEmployee(Employee emp) {
		if (employess == null)
			employess = new HashMap<String, Employee>();

		employess.put(emp.getEmpId(), emp);
	}

	@Override
	public Map<String, Employee> getAllEmployess() {
		return employess;
	}

	@Override
	public Double calculateSalary(String empNo, Integer totalDays) {
		Employee emp = employess.get(empNo);
		Double perHourRate = emp.getPerHourRate();
		Double payscale = (perHourRate * totalDays * 8) - FEDERAL_TAX;
		return payscale;
	}

	@Override
	public List<Department> getDepartments() {
		List<Department> departments = Arrays.asList(new Department("IT", "D0001", "Development"),
				new Department("Staffing", "D0002", "Recruting"), new Department("Account", "D0003", "Salary Calc"),
				new Department("Management", "D0004", "Manage the Team"));
		return departments;
	}
}
