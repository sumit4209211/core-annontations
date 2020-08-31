package com.req.annons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReqTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/req/annons/req-beans.xml");
		Motor motor = context.getBean("motor", Motor.class);
		System.out.println(motor);
	}
}
