package com.assi2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
	 ListDemo c=(ListDemo)context.getBean("demo");
		c.show();
	}

}