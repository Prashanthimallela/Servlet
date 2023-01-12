package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String fristName;
	private String lastName;
	private int age;
	
	@Autowired 
	private Car car;
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Person() {
		
	}
public Person(int a) {
		age=a;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String personDetail() {

		return fristName+":"+car.getCarDetails();

		}
}
//Create an Employee bean with some attributes and a manager bean also
//you need to show the relationship as employee has a manager 
//Create appropriate methods that shows employee and it's manager
//and also display salaries of both
	

