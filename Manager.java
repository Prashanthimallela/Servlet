package com.training.spring;

public class Manager {
	private String mgName;
	private int  mgSalary;
	
	public String getMgName() {
		return mgName;
	}

	public void setMgName(String mgName) {
		this.mgName = mgName;
	}

	public int getMgSalary() {
		return mgSalary;
	}

	public void setMgSalary(int mgSalary) {
		this.mgSalary = mgSalary;
	}

	public Manager() {
		super();
	}
	public String getManagerDetails() {
		
		return mgName+":"+mgSalary;

		}

}
