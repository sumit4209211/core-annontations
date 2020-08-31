package com.autowire.annons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Motor {
	/**
	 * 1. if we dont have any post construction logic to be performed with the
	 * dependency being injected and 2. if we want our class to immutable then avoid
	 * constructor and setter go for attribute level injection
	 */
	@Autowired
	@Qualifier("myController")
	private MicroController microController;

	@Override
	public String toString() {
		return "Motor [microController=" + microController + "]";
	}

	/* @Autowired */
	// private Circuit circuit;

	/**
	 * Its an alternate for constructor injection and can make it optional
	 * 
	 * @param microController
	 * @param circuit
	 */
	/*
	 * @Autowired public void newMotor(MicroController microController, Circuit
	 * circuit) { System.out.println("newMotor(microController, circuit)");
	 * this.microController = microController; this.circuit = circuit; }
	 */

	/*
	 * @Autowired(required = false) public Motor(MicroController microController) {
	 * System.out.println("Motor(microController)"); this.microController =
	 * microController; }
	 * 
	 * @Autowired(required = false) public Motor(Circuit circuit) { this.circuit =
	 * circuit; }
	 */

	/*
	 * @Autowired(required = false) public void setMicroController(MicroController
	 * microController) { this.microController = microController; }
	 */

}
