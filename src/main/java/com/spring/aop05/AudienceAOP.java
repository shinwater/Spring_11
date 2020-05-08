package com.spring.aop05;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//공통관심사항 클래스 ==>Aspect

@Aspect
public class AudienceAOP {
	@Pointcut("execution(public * performance.*())")
	public void perform() { }//형식적으로 메서드 작성.이름도 임의로 정해주면됑
	
	@Before("perform()")
	public void takeSeat() {
		System.out.println("자리엥앉기~");
	}
	
	@Before("perform()")
	public void turnOffPhone() {
		System.out.println("휴대전화 끄기~");
	}
	
	@AfterReturning("perform()")
	public void applaud() {
		System.out.println("와우~ 감동적이네요... 앵콜...");
	}
	
	@AfterThrowing("perform()")
	public void demandRefund() {
		System.out.println("우우,. 재미없어~ 돈돌려쥬~~");
	}
}
