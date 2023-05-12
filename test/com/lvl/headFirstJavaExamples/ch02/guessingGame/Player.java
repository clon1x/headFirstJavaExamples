package com.lvl.headFirstJavaExamples.ch02.guessingGame;

import java.util.Iterator;
import java.util.Set;

public class Player {

	private int number;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}

	public void blindGuess() {
		this.number = (int) (Math.random() * 10);
	}
	
	public void informedGuess(Object[] options) {
		int option = (int) (Math.random() * options.length);
		this.number = (int) options[option];
	}

	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
}
