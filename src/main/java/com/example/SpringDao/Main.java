package com.example.SpringDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	// Instantiating spring IOC container
	private static ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
	
	// driving code
	public static void main(String[] args) {
		
		// getting the bean values
		SequenceDao dao = (SequenceDao) context.getBean("sequenceDao");
		
		// generating next value
		for(int i=0; i<5; i++) {
			System.out.println("#"+(i+1)+"'th sequence is: "+dao.getNextValue("IT"));
		}
	}
}
