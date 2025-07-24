package com.aurionpro.guitarFinal.model;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
	
	
	public static Builder fromInt(int i) {
		switch (i) {
			case 1: return FENDER;
			case 2: return MARTIN;
			case 3: return GIBSON;
			case 4: return COLLINGS;
			case 5: return OLSON;
			case 6: return RYAN;
			case 7: return PRS;
			case 8: return ANY;
			default: throw new IllegalArgumentException("Invalid builder index: " + i);
		}
	}

	

}
