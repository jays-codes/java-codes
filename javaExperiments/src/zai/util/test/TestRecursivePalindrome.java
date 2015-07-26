package zai.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import zai.util.RecursivePalindrome;

public class TestRecursivePalindrome {

	@Test
	public final void testIsPalindrome() {
		String testStr1 = "The world is my oyster";
		String testStr2 = "jay is awesome emosewa si yaj";
		
		assertEquals(false, RecursivePalindrome.isPalindrome(testStr1));
		assertEquals(true, RecursivePalindrome.isPalindrome(testStr2));
	}
	
	@Test
	public final void testPalindromize() {
		String testStr1 = "The world is my oyster";
		String testStr1Palindrome = "retsyo ym si dlrow ehT";
		
		System.out.println("str : " + testStr1);
		System.out.println("str palindrome : " + RecursivePalindrome.palindromize(testStr1));
		
		assertEquals(
				testStr1Palindrome,
				RecursivePalindrome.palindromize(testStr1)
				);
	}
	
}

