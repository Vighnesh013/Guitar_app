package com.aurionpro.guitarFinal.model;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHAGONY, MAPLE, COCOBOLO, CEDAR, ADRINONDACK, ALDER, SITKA;
	

	public static Wood fromInt(int i) {
		switch (i) {
			case 1: return INDIAN_ROSEWOOD;
			case 2: return BRAZILIAN_ROSEWOOD;
			case 3: return MAHAGONY;
			case 4: return MAPLE;
			case 5: return COCOBOLO;
			case 6: return CEDAR;
			case 7: return ADRINONDACK;
			case 8: return ALDER;
			case 9: return SITKA;
			default: throw new IllegalArgumentException("Invalid builder index: " + i);
		}
	}
}
