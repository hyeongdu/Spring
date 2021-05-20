package com.study.spring;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		String config = null;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		if(str.equals("dev")) {
			config = "dev";
		} else if(str.equals("run")) {
			config = "run";
		}
		scanner.close();
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.getEnvironment().setActiveProfiles(config);
		context.load("beans_dev.xml", "beans_run.xml");
		
		ServerInfo info = context.getBean("serverInfo", ServerInfo.class);
		
		System.out.println("ip : "+ info.getIpNum());
		System.out.println("port : " + info.getPortNum());
		
		context.close();
		
		//동일한 스프링 빈을 여러 개 만들어 놓고 상황에 따라 적절한 스프링 빈을 사용할 수 있다. 
	}

}
