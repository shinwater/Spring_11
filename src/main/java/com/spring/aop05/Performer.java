package com.spring.aop05;

public class Performer implements performance{

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
		
		System.out.println("연극을 시작합니다~~~~~~~~~~~~~~~~");
		int a=10/0;
	}
	
	

}
