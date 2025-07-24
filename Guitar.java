package com.aurionpro.guitarFinal.model;

public class Guitar implements CharSequence {
	String serialNumber;
	double price;
	GuitarSpec specs;
	
	
	public Guitar(String serialNumber, double price,GuitarSpec specs) {
		
		this.serialNumber = serialNumber;
		this.price = price;
		this.specs = specs;
		
	}

	public GuitarSpec getSpecs() {
		return specs;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}
