package com.simple.ex05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.simple.ex02.Hotel;
import com.simple.ex03.MemberDAO;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Hotel hotel = ctx.getBean(Hotel.class);
		hotel.getChef().cooking();
		
		MemberDAO memberDAO = ctx.getBean(MemberDAO.class);
		System.out.println(memberDAO.getDataSource());
	}
}
