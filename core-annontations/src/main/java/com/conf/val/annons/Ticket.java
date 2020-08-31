package com.conf.val.annons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ticket {
	@Value("#{appProps.Ticket_ticketNo}")
	private int ticketNo;
	@Value("#{appProps.Ticket_passengerName}")
	private String passengerName;
	@Value("#{appProps.Ticket_source}")
	private String source;
	@Value("#{appProps.Ticket_destination}")
	private String destination;
	@Value("#{appProps.Ticket_amount}")
	private double amount;

	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", passengerName=" + passengerName + ", source=" + source
				+ ", destination=" + destination + ", amount=" + amount + "]";
	}

}
