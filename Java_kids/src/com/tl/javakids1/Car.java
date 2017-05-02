package com.tl.javakids1;

public class Car {

	public void start() {
	}

	public void stop() {
	}

	public int drive(int howlong) {
		int distanse;
		distanse = howlong * 60;
		
		System.out.println("howlong will I go: " + howlong + " hours");
		System.out.println("My distanse will be: " + distanse + " km");
		
		return distanse;
	}

}
