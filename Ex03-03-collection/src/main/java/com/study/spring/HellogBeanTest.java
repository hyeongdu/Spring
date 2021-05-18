package com.study.spring;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HellogBeanTest {

	public static void main(String[] args) {

		String configLocation = "classpath:beans.xml";
		// 1.IoC 컨테이너 생성
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(configLocation);
		// 스프링 구조가 만들어져있어야 위가 가능

		// 2.Hello Bean 가져오기
		Hello hello = (Hello) context.getBean("hello");
		
		//list 출력
		List<String> myList = hello.getNames();
		for(String value : myList) {
			System.out.println("list : " + value);
		}
		
		//set 출력
		Set<Integer> mySet1 = hello.getNums();
		for(Integer value : mySet1) {
			System.out.println("Set : " + value);
		}
		
		//map 출력
		Map<String, Integer> map = hello.getAges();
		
		//방법 01 : entryset
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Map 1 : " + entry.getKey() +  " - " + entry.getValue());
		}
		
		//방법 02 : keySet
				for(String key : map.keySet()) {
					Integer value = map.get(key);
					System.out.println("Map 2 : " + key +  " - " + value);
				}
				
			//방법 03 : Iterator
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("map3 : " + key + " - " + value);
		
			}
		// context.close();

	}

}
