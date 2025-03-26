package com.simple.ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.simple.ex01.Hello;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("application-context.xml");
		
		
		//Hotel hotel = (Hotel)ctx.getBean("hotel"); //object  반환이므로 캐스팅 필요
		
		//Hotel hotel = ctx.getBean(Hotel.class);
		
		Hotel hotel2 = ctx.getBean("hotel", Hotel.class);
		hotel2.getChef();
	}
	
}
