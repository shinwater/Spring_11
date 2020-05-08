package com.spring.aop02;

//공! 통! 클! 래 ! 쓰!~~~~~~~~ 
public class MyAspect {
	private double time;
	
	public void before() {
		time = System.currentTimeMillis();
		System.out.println("문을 열고!~!!! 집에!!들어갑니다~~!@!!~!");
	}
	
	public void after() {
		time = System.currentTimeMillis() - time;
		
		
		System.out.println("문을 열고! 빚을 낭보니다!");
		System.out.println("걸린시간 : "+time+"ms");
	
	}
	
	public void after_returning() {
		System.out.println("잠을 잠");
	}
	
	public void after_throwing() {
		System.out.println("ghkwoqkftod: 119dp tlsrhgkqslek...nn ");
	}
}
