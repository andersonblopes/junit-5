package com.lopes.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void testLenght() {
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		assertEquals(expectedLength, actualLength);
		
		
	}

}
