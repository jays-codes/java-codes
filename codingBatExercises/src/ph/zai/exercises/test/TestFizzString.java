package ph.zai.exercises.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.exercises.FizzString;

public class TestFizzString {

	FizzString fizz = new FizzString();
	
	
	//yoyoyo
	
	@Test
	public final void test() {
		
		assertEquals("Fizz", fizz.fizzString("fig"));
		assertEquals("Buzz", fizz.fizzString("dib"));
		assertEquals("FizzBuzz", fizz.fizzString("fib"));
	}

}
