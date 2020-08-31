package com.javaconfig.annons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		// Vehicle vehicle1 = context.getBean("vehicle", Vehicle.class);
		// Vehicle vehicle2 = context.getBean("vehicle", Vehicle.class);

		// System.out.println("vehicle1 == vehicle2 ? : " + (vehicle1 == vehicle2));
	}
}
