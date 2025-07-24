package com.aurionpro.guitarFinal.model;

public class GuitarSpec {
	Builder builder;
	Type type;
	Wood backWood;
	Wood topWood;
	
	private int numString;
	
	
	public GuitarSpec(Builder builder, Type type, Wood topWood, Wood backWood, int numString) {
		
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numString = numString;
		
	}
	
	
	public Builder getBuilder() {
		return builder;
	}


	public Type getType() {
		return type;
	}


	public Wood getBackWood() {
		return backWood;
	}


	public Wood getTopWood() {
		return topWood;
	}


	public int getNumString() {
		return numString;
	}
	
	


	public boolean matches(GuitarSpec otherSpec) {
	    if (otherSpec.getBuilder() != null && builder != otherSpec.getBuilder()) {
	        return false;
	    }
	    if (otherSpec.getType() != null && type != otherSpec.getType()) {
	        return false;
	    }
	    if (otherSpec.getBackWood() != null && backWood != otherSpec.getBackWood()) {
	        return false;
	    }
	    if (otherSpec.getTopWood() != null && topWood != otherSpec.getTopWood()) {
	        return false;
	    }
	    if (otherSpec.getNumString() != 0 && numString != otherSpec.getNumString()) {
	        return false;
	    }
	    return true;
	}



	
	
	

}
