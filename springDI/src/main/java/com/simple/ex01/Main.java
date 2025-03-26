package com.simple.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		Hello b = new Hello();
		b.sayHello();
		
		//스프링 방식으로 위와 똑같이 한다면 GenericXmlApplicationContext(저장소)에서 빈을 꺼냄
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("application-context.xml");
		
		Hello h = (Hello)ctx.getBean("gildong");
		h.sayHello();
		
		
	}
}
