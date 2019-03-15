package com.cg.springaoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appmain {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("Springnew.xml"); 
//Shape sh=context.getBean("sh",Shape.class);
//System.out.println(sh.getCircle().getName());

//System.out.println(sh.getTriangle().getName());
//sh.getCircle().setName("madhu");
FactoryService fs=new FactoryService();
Shape sh=(Shape)fs.getBean("sh");
sh.getCircle();
	}

}
