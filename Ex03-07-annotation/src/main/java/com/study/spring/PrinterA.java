package com.study.spring;

import org.springframework.stereotype.Component;

//스트레오타입은 추가정보라는 뜻으로 알고 있자 

//괄호안의 내용으로 컴포넌트 등록되고 입력값 안주면 클래스 이름 가지고 소문자로 바꿔서 입력한다. 
@Component("printerA")
public class PrinterA implements Printer 
{

	public void print(String message)
	{
		System.out.println("Printer A : " + message);
	}

}
