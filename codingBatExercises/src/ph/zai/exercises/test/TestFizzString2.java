package ph.zai.exercises.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.exercises.FizzString2;

public class TestFizzString2 {

	FizzString2 fizz2 = new FizzString2();
	
	@Test
	public final void test() {
		assertEquals("1!", fizz2.fizzString2(1));
		assertEquals("2!", fizz2.fizzString2(2));
		assertEquals("Fizz!", fizz2.fizzString2(3));

	}

}
