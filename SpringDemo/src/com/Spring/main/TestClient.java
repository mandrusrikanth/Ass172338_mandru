package com.Spring.main;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.Student;

public class TestClient {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("web1.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Student student=(Student)factory.getBean("student");  
	    student.displayInfo();  

	}

}
