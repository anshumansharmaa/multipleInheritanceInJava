package com.personal.multipleInheritance;

public class Information implements Human, Animals {
	public void speak() {
		System.out.println("Humans speak!!");
	}

	public void sound() {
		System.out.println("Animals make sound!!");

	}

}
