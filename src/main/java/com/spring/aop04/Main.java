package com.spring.aop04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:aop04.xml");
		
		Student student =(Student)ctx.getBean("student");
		student.getStudentInfo();
		
		
		System.out.println("===========================");
		
		Staff staff = (Staff)ctx.getBean("staff");
		staff.getStaffInfo();
		ctx.close();
		
		
	}

}
