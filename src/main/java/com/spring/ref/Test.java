package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ref/refconfig.xml");
		ClassA aobA =(ClassA) context.getBean("aref");
		
		System.out.println(aobA);
	}
}
