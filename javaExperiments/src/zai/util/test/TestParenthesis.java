package zai.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import zai.util.Parenthesis;

public class TestParenthesis {

	@Test
	public final void testIsValidSet() {
		String testStr1 = "[()]{}{[()()]()}";
		String testStr2 = "{}}}{())(";
		assertEquals(true, Parenthesis.isValidSet(testStr1));
		assertEquals(false, Parenthesis.isValidSet(testStr2));
	}

}
