package com.spring.aop06;

import lombok.Data;

@Data
public class MessageImpl implements Message {
	
	private String name;
	
	@Override
	public void helloAop() {
		// TODO Auto-generated method stub
		System.out.println("Hello!!!!!!!!!!!!!!!!!!!" +name+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
