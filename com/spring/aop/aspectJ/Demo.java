package com.spring.aop.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.aspectJ.advice.AspectAdvice;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Operation obj = context.getBean("op",Operation.class);
		obj.printName();
		
	}
}
