package com.spring.aop04;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceLog {

	//proceedingJoinPoint 객체는 원래 실행되어야 할 대상 메서드(핵심 기능)
	//스프링은 AOP를 위한 프록시 객체를 생성할 때 실제 생성할 Bean객체가 인터페이스를 상속 받고 있으면
	// 인터페이스를 이용해서 프록시를 생성한다.
	public Object profile(ProceedingJoinPoint jp) throws Throwable {
		//getSignature() : 호출되는 메서드에 대한 정보를 구해주는 메서드.
		String singStr = jp.getSignature().toString();
		System.out.println(singStr+"is start!!!");
		
		long startTime = System.currentTimeMillis();
		
		Object obj = jp.proceed(); //핵심 기능을 실행 시키는 메서드.반환타입 Object
		
		long endTime = System.currentTimeMillis();
		System.out.println(singStr+"is end!!!");
		System.out.println("경과 시간 ==> "+(endTime-startTime));
		
		return obj;
	}
}
