package com.simple.ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("autowired-context.xml");
		
		Printer printer = (Printer)ctx.getBean(Printer.class);
		System.out.println(printer.getDocument().data);
		
	}
}
