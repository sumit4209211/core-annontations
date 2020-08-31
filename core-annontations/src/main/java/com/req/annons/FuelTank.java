package com.req.annons;

public class FuelTank {
	private String fuelType;
	private int capacity;

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "FuelTank [fuelType=" + fuelType + ", capacity=" + capacity + "]";
	}

}
