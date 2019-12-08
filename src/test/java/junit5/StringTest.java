package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * The type String test.
 */
class StringTest {

	/**
	 * Length basic.
	 */
	@Test
	void length_basic() {
		assertEquals(4, "ABCD".length());
	}

	/**
	 * To upper case basic.
	 */
	@Test
	void toUpperCase_basic() {
		assertNotNull("abcd".toUpperCase());
		assertEquals("ABCD", "abcd".toUpperCase());
	}

	/**
	 * Contains basic.
	 */
	@Test
	void contains_basic() {
		assertFalse("abcdefgh".contains("ijk"));
	}

	/**
	 * Split basic.
	 */
	@Test
	void split_basic() {
		String str = "abc def ghi";
		String[] actualResult = str.split(" ");
		String[] expectedResult = new String[] {"abc","def","ghi"};
		assertArrayEquals(actualResult, expectedResult);
	}

}
