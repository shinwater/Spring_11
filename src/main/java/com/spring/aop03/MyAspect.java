package com.spring.aop03;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//공! 통! 클! 래 ! 쓰!~~~~~~~~ 

@Aspect
@Component//비ㄴㄴ으로 등록됨
public class MyAspect {
	private double time;
	
	@Pointcut("execution(* doSomething())")
	public void myPointcut() {}
	
	
	@Before("myPointcut()")
	public void before() {
		time = System.currentTimeMillis();
		System.out.println("문을 열고!~!!! 집에!!들어갑니다~~!@!!~!");
	}
	
	@AfterReturning("myPointcut()")
	public void after_returning() {
		System.out.println("잠을 잠");
	}
	
	
	
	@AfterThrowing("myPointcut()")
	public void after_throwing() {
		System.out.println("ghkwoqkftod: 119dp tlsrhgkqslek...nn ");
	}
	
	@After("myPointcut()")
	public void after() {
		time = System.currentTimeMillis() - time;
		
		
		System.out.println("문을 열고! 빚을 낭보니다!");
		System.out.println("걸린시간 : "+time+"ms");
		
	}
}
