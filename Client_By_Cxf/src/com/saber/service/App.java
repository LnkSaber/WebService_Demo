package com.saber.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext tx = new ClassPathXmlApplicationContext("cxf.xml");
		
		HellowService proxy = (HellowService) tx.getBean("myClient");
		
		
		String sayHello = proxy.sayHello("林Saber");
		
		System.out.println(sayHello);
		
	}

}
