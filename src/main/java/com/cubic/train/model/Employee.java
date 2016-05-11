package com.cubic.train.model;

public class Employee {
	private String empId;
	private String firstName;
	private String lastName;
	private String contactNo;
	private Department department;
	private Double perHourRate;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Double getPerHourRate() {
		return perHourRate;
	}

	public void setPerHourRate(Double perHourRate) {
		this.perHourRate = perHourRate;
	}

}
