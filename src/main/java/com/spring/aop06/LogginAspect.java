package com.spring.aop06;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LogginAspect {

	public Object logAround(ProceedingJoinPoint jp) throws Throwable {
		String methodName = jp.getSignature().getName();
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		System.out.println("[LOG] Method : " + methodName+ " is calling");

		
		Object obj =jp.proceed(); //어드바이스 대상 메서드(핵심기능) 호출
		
		sw.stop();
		
		System.out.println("[LOG] Method : "+ methodName +" was called");
		System.out.println("[LOG] 처리시간 : "+ sw.getTotalTimeMillis()/1000 +" 초");
		
		return obj;
	}
}
