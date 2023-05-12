package com.lvl.headFirstJavaExamples.ch01;

public class PraseOMatic {

	public static void main(String[] args) {
		
		String[] wordList1 = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", 
				"web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		
		String[] wordList2 = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
				"clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged",
				"aligned", "targeted", "shared", "cooperative", "accelerated"};
		
		String[] wordList3 = {"process", "tipping-point", "solution", "architecture", "core competency",
				"strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
		
		int rand1 = (int) (Math.random() * wordList1.length);
		int rand2 = (int) (Math.random() * wordList2.length);
		int rand3 = (int) (Math.random() * wordList3.length);
		
		String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];
		
		System.out.println("What we need is a " + phrase);
		
	}

}
