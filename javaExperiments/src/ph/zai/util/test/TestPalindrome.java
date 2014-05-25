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

	@Test
	public final void testIsIntPalindrome(){
		int[] ints = {1,3,2,5,6,7,12,90,23};
		int[] ints2 = {1,3,2,5,6,7,12,90,23,90,12,7,6,5,2,3,1};
		
		assertEquals(false, Palindrome.isPalindrome(ints));
		assertEquals(true, Palindrome.isPalindrome(ints2));
	}
}
