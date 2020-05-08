package com.spring.aop04;

import lombok.Data;

@Data
public class Staff {

	private String name;
	private int age;
	private String dept;
	
	//staff에 대한 정보를 가져오는 메서드
	public void getStaffInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("부서 : " + dept);
	}
}
