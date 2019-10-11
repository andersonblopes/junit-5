package com.lopes.junit5;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void length_basic() {
		assertEquals(4, "ABCD".length());
	}
	
	@Test
	void toUpperCase_basic() {
		assertNotNull("abcd".toUpperCase());
		assertEquals("ABCD", "abcd".toUpperCase());
	}
	
	@Test
	void contains_basic() {
		assertFalse("abcdefgh".contains("ijk"));
	}
	
	@Test
	void split_basic() {
		String str = "abc def ghi";
		String[] actualResult = str.split(" ");
		String[] expectedResult = new String[] {"abc","def","ghi"};
		assertArrayEquals(actualResult, expectedResult);
	}

}
