package com.req.annons;

import org.springframework.beans.factory.annotation.Required;

public class Motor {
	private FuelTank fuelTank;

	@Required
	public void setFuelTank(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
	}

	@Override
	public String toString() {
		return "Motor [fuelTank=" + fuelTank + "]";
	}

}
