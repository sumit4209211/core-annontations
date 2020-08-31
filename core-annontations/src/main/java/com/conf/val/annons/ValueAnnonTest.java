package com.conf.val.annons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueAnnonTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/conf/val/annons/value-beans.xml");
		Ticket ticket = context.getBean("ticket", Ticket.class);
		System.out.println(ticket);
	}
}
