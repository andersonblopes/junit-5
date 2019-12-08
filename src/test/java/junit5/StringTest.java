package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
