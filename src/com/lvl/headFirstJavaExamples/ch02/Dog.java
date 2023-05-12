package com.lvl.headFirstJavaExamples.ch02;

public class Dog {

	private int size;
	private String breed;
	private String name;
	
	public Dog(int size, String breed, String name) {
		super();
		this.size = size;
		this.breed = breed;
		this.name = name;
	}
	
	
	public int getSize() {
		return size;
	}



	public String getBreed() {
		return breed;
	}



	public String getName() {
		return name;
	}



	public String bark() {
		return String.format("%s, a %d inches %s, barks once", name, size, breed);
	}
	
}
