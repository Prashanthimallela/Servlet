package com.training.jsf.bean;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="data")
@SessionScoped
public class UserData {
	
	private String usrClass;
	private String name;
	private int rollNo;
	private int age;
	 
	private static final List<Student> studList = new ArrayList<>(Arrays.asList(
			new Student("Rohan","Civil", 101, 21), new Student("David","Mech", 102, 22),
			new Student("Priya","CS", 103, 23),new Student("Ragini","E&TC", 104, 24)));
	
	public List<Student> getStudents(){
		return studList ;}
	
	/*if(studList.size() == 0) {
		
		
	    Connection con = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			 
		        //Scanner sc = new Scanner(System.in);
		        String url = "jdbc:mysql://localhost:3306/infinite";
		        String user = "root";
		        String pass = "pass123";
		        con = DriverManager.getConnection(url,user,pass);
		        Statement stmt = con.createStatement();
		        ResultSet rs = stmt.executeQuery("select * from student");
		        while(rs.next()) {
		        	studList.add(new Student(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
		        	
		        }
		       
			 }  
		        catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
			finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
					
			return studList;
		}
		else {
			return studList;
		}
		}*/
	
	public void addStudent() {
		studList.add(new Student(name, usrClass, rollNo, age));
	}
	
	public String getUsrClass() {
		return usrClass;
	}
	public void setUsrClass(String usrClass) {
		this.usrClass = usrClass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}