package com.autowire.annons;

public class Circuit {
	private String manufacturer;
	private long watt;

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setWatt(long watt) {
		this.watt = watt;
	}

	@Override
	public String toString() {
		return "Circuit [manufacturer=" + manufacturer + ", watt=" + watt + "]";
	}

}
