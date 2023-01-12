package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
	    //ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	    ApplicationContext context=new AnnotationConfigApplicationContext("com.training.spring.config.ApplicationConfig.class");
	    
	    //person p1=new Person();
	    
	    Person person1=(Person)context.getBean("person");
	    
	   System.out.println("Name is:"+person1.getFristName()+" "+person1.getLastName());
	   System.out.println("Age of the person is:"+person1.getAge());
	    //Person person2=(Person)context.getBean("person");	
	   // person2.setFristName("John");
	   // person2.setFristName("Peter");
	    
	   // System.out.println("Name of person 1:"+person1.getFristName()+""+person1.getLastName());
	    System.out.println("person details:"+person1.personDetail());
	    
	  //  Employee empl=(Employee)context.getBean("employee"); 
	    
	    //System.out.println("Employee Details:" +empl.getEmployeerDetails());

	}

}
