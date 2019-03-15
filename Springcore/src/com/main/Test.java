package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.spr.Customer;

public class Test {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Customer customer1=(Customer) context.getBean("customer");
	System.out.println(customer1);
	}

}
