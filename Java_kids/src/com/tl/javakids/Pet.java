package com.tl.javakids;

public class Pet {
	int age;
	float weight;
	float height;
	String color;

public void sleep() {
		System.out.println("Good night! Till tomorrow");
	}
public void eat() {
	System.out.println("Let's eat");
}
public String say(String aWord) {
	String petResponse = "That's ok!! " +aWord;
	return petResponse;
}
}