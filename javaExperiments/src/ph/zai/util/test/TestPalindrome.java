package ph.zai.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.util.Palindrome;

public class TestPalindrome {

	@Test
	public final void testIsPalindrome() {
		String testStr1 = "The world is my oyster";
		String testStr2 = "jay is awesome emosewa si yaj";
		
		assertEquals(false, Palindrome.isPalindrome(testStr1));
		assertEquals(true, Palindrome.isPalindrome(testStr2));
	}

}
