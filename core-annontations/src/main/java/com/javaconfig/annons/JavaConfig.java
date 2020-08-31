package com.javaconfig.annons;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

	@Bean(name = "vehicle")
	@Lazy
	// @Scope("prototype")
	public Vehicle newVehicle() {
		Vehicle vehicle = new Vehicle();
		return vehicle;
	}
}
