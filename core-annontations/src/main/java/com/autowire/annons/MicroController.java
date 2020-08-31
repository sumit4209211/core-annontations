package com.autowire.annons;

public class MicroController {
	private String manufacturer;
	private String model;

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "MicroController [manufacturer=" + manufacturer + ", model=" + model + "]";
	}

}
