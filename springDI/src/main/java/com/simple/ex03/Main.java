package com.simple.ex03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("application-context.xml");
		
		DataSource ds = ctx.getBean(DataSource.class);
		System.out.println(ds);
		
		MemberDAO memberDAO = ctx.getBean("memberDAO", MemberDAO.class);
		System.out.println(memberDAO.getDataSource());
	}
}
