package com.study.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		
	
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		
	
		ctx.load("classpath:beans.xml");
		System.out.println("1111111111111");
		
		ctx.refresh();
		System.out.println("2222222222222222222");
	
		ctx.close();
		System.out.println("33333333333333333");
		
	

	}

}
