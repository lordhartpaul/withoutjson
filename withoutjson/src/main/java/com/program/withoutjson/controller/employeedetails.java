package com.program.withoutjson.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employeedetails {
	
	
	@Id
	@Column(name = "empId")
	private int empId;
	@Column(name = "empName")
	private String empName;
	@Column(name = "empSalary")
	private int empSalary;
	
	
	public employeedetails() {
		
	}
	
	public employeedetails(int empId, String empName, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}


}
