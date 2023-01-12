package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String empName;
	private int empSalary;
	@Autowired
	private Manager mg;

public Manager getMg() {
		return mg;
	}

	public void setMg(Manager mg) {
		this.mg = mg;
	}

public Employee() {
	super();
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


public String getEmployeerDetails() {
	
	return empName+":"+empSalary +" "+mg.getManagerDetails() ;

	}
}