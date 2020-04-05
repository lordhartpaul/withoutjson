package com.program.withoutjson.controller;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class empservice {
	
	
	@Autowired
	private employeeRepository emprepository;
	
	
	public List<employeedetails> getAll()
	{
		List<employeedetails> s = new ArrayList<>();
		emprepository.findAll()
		.forEach(s::add);
		return s;
	}
	
	public employeedetails getbyid(int empId)
	
	{
		
	
		return emprepository.findOne(empId);
		
	}

	public void addEmployees(employeedetails empdetail) {
		
		emprepository.save(empdetail);
		
	}

	public void updateEmployees(int empId, employeedetails empdetail) {
		
		emprepository.save(empdetail);
		
		
	}

	public void deleteEmployees(int empId) {
		
		emprepository.delete(empId);
		
	}
	
	
	
	

}
