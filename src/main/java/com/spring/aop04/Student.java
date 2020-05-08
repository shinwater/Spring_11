package com.spring.aop04;

import lombok.Data;

@Data
public class Student {

	private String name;
	private String hakbun;
	private int age;
	private int grade;
	
	//학생 정보를 얻어오는 메서드
	public void getStudentInfo() {
		System.out.println("학생 이름 : " +name);
		System.out.println("학생 학번 : " +hakbun);
		System.out.println("학생 나이 : " +age);
		System.out.println("학생 학년 : " +grade);
	}
}
