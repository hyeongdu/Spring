package com.study.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hello 
{
	@Value("홍길동")
	private String name;
	@Value("전우치")
	private String nickname;
	@Autowired
	@Qualifier("printerA")
	private Printer printer;
	//레퍼런스 등록할 시 
	
	
	public Hello() {
		super();
	};
	
	public Hello(String name, String nickname, Printer printer) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}
	
	
	//예제를 보면 printer로 들어갈수있는게  2개나 되기 때문에 qualifier로 명확하게 지정을 해준다. 
	//오토와이어 퀄리파이어 순서 기억
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setNickname(String nickname) {
//		this.nickname = nickname;
//	}
//	public void setPrinter(Printer printer) {
//		this.printer = printer;
//	}
//	
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	

	public String sayHello () {
		return "Hello " + name + " : " + nickname;
	}
	
	public void print() {
		printer.print(sayHello());
	}
	
}
