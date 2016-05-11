package com.cubic.train.model;

public class Department {
	private String name; 
	private String depCode; 
	private String description;
	
	
	
	public Department(String name, String depCode, String description) {
		super();
		this.name = name;
		this.depCode = depCode;
		this.description = description;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepCode() {
		return depCode;
	}
	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	} 
	
	
}
