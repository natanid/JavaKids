package com.tl.javakids;

public class PetMaster {

	public static void main(String[] args) {
		String petReaction;
		Pet myPet = new Pet();
		myPet.eat();
		petReaction = myPet.say("Hey, hey!!");
		System.out.println(petReaction);
		myPet.sleep();

	}

}
