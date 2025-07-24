package com.aurionpro.guitarFinal.model;

public enum Type {
	ACOUSTIC, ELECTRIC;
	
	public static Type fromInt(int i) {
	    switch (i) {
	        case 1: return ACOUSTIC;
	        case 2: return ELECTRIC;
	        default: throw new IllegalArgumentException("Invalid Type index: " + i);
	    }
	}



}
