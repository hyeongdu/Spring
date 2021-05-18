package com.study.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HellogBeanTest {

	public static void main(String[] args) {
		
		
		
		String configLocation = "classpath:beans.xml";

	      AbstractApplicationContext context = 
	            new GenericXmlApplicationContext(configLocation);
	      //스프링 구조가 만들어져있어야 위가 가능
	      
	      
	      //2.Hello Bean 가져오기
	      Hello hello = (Hello)context.getBean("hello");
	      hello.print();
	      
	      //3.PrinterB Bean 가져오기
	      Printer printer = context.getBean("printerB", Printer.class);
	      hello.setPrinter(printer);
	      hello.print();
	      
	      //4.싱글톤인지 확인
	      Hello hello2 = context.getBean("hello", Hello.class);
	      System.out.println(hello == hello2);
	      
	      //context.close();

	}

}
