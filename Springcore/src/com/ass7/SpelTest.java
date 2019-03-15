package com.ass7;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ass7.Customer;

public class SpelTest {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring7.xml");
		Customer customer1=(Customer) context.getBean("customer");
	System.out.println(customer1);
	}

}
