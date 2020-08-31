package com.stereotype.annons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeTest {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/stereotype/annons/stereotype-beans.xml");
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext("com.stereotype.annons");
		Toy toy1 = context.getBean("toy1", Toy.class);
		// Toy toy2 = context.getBean("toy1", Toy.class);

		// System.out.println("toy1 == toy2 ? :" + (toy1 == toy2));

		// toy1.play();
	}
}
