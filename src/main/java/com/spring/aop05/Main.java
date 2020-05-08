package com.spring.aop05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. aop05.xml 파일을 읽어들여서 스프링 컨테이너를 생성
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:aop05.xml");
		
		//2.getBean() 메서드를 이용하여 빈을 가져온다.
		performance per = (performance)ctx.getBean("perform");
		per.perform();
		
		//3. 어플리케이션 종료 시 컨테이너에 존재하는 모든 빈(객체)를 종료
		ctx.close();

		
	}

}
