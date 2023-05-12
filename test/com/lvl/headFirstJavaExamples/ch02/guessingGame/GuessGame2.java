package com.lvl.headFirstJavaExamples.ch02.guessingGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GuessGame2 {
	
	private int secretNumber;
	private Set<Integer> remainingNumbers;
	private List<Player> players = new ArrayList<>();
	
	public void play(String ... names) {
		
		System.out.println("Choosing a number from 0 to 9");
		initializeGame(names);
		
		Player winner = null;
		while (winner == null) {
			winner = playNextRound();
		}

		System.out.println(winner.getName() + " wins!!");
		
	}

	private void initializeGame(String[] names) {
		
		secretNumber = (int) (Math.random() * 10);
		
		initializeRemainingNumbers();
		
		for (String name : names) {
			Player player = new Player(name);
			players.add(player);
		}
		
		System.out.println("Casting lots on players order...");
		Collections.shuffle(players);
		
	}

	private void initializeRemainingNumbers() {
		remainingNumbers = new HashSet<>();
			for (int i = 0; i < 10; i++) remainingNumbers.add(i);
	}
	
	public Player playNextRound() {
		System.out.println("\nPlayers are guessing...");
		
		for (Player player : players) {
			player.informedGuess(this.remainingNumbers.toArray());
			System.out.println(player.getName() + " guess is: " + player.getNumber());
			if (player.getNumber() == secretNumber) return player;
			this.remainingNumbers.remove(player.getNumber());
		}
		
		return null;
		
	}

}
