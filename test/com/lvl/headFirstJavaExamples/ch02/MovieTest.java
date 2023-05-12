package com.lvl.headFirstJavaExamples.ch02;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MovieTest {

	private static final String TITLE_1 = "Gone with the Stock";
	private static final String TITLE_2 = "Lost in Cublice Space";
	private static final String TITLE_3 = "Byte Club";
	private static final String GENRE_1 = "Tragic";
	private static final String GENRE_2 = "Comedy";
	private static final String GENRE_3 = "Tragic but ultimately uplifting";
	private static final int RATING_1 = -2;
	private static final int RATING_2 = 5;
	private static final int RATING_3 = 127;
	
	@Test
	void testMovie() {

		// given
		Movie one = new Movie(TITLE_1, GENRE_1);
		one.setRating(RATING_1);
		
		Movie two = new Movie(TITLE_2, GENRE_2);
		two.setRating(RATING_2);
		
		Movie three = new Movie(TITLE_3, GENRE_3);
		three.setRating(RATING_3);

		String[] expectedTitles = {TITLE_1, TITLE_2, TITLE_3};
		String[] expectedGenres = {GENRE_1, GENRE_2, GENRE_3}; 
		int[] expectedRatings = {RATING_1, RATING_2, RATING_3};
		String[] expectedPlays = {"Playing the movie: '" + TITLE_1 + "'", "Playing the movie: '" + TITLE_2 + "'", "Playing the movie: '" + TITLE_3 + "'"};
		
		
		// when
		String[] actualTitles = {one.getTitle(), two.getTitle(), three.getTitle()};
		String[] actualGenres = {one.getGenre(), two.getGenre(), three.getGenre()};
		int[] actualRatings = {one.getRating(), two.getRating(), three.getRating()};
		String[] actualPlays = {one.playIt(), two.playIt(), three.playIt()};
		
		// then
		assertAll( "Movies properties",
				() -> assertArrayEquals(expectedTitles, actualTitles, "Titles"),
				() -> assertArrayEquals(expectedGenres, actualGenres, "Genres"),
				() -> assertArrayEquals(expectedRatings, actualRatings, "Ratings"),
				() -> assertArrayEquals(expectedPlays, actualPlays, "Play Strings")
				);
		
	}

}