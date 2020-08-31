package com.autowire.annons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/annons/autowire-beans.xml");
		Motor motor = context.getBean("motor", Motor.class);

		System.out.println(motor);

	}
}
