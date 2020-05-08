package com.spring.aop06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:aop06.xml");
		
		Message message = (Message)ctx.getBean("target");

		message.helloAop();
		
		ctx.close();
	}

}
