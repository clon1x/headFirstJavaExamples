package com.lvl.headFirstJavaExamples.ch02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogTest {

	@Test
	void test() {
		
		// given
		Dog herbie = new Dog(25, "bull-dog", "Herbie");
		String expected = "Herbie, a 25 inches bull-dog, barks once";
		
		// when
		String actual = herbie.bark();
		
		// then
		assertEquals(expected, actual);
		
	}

}
