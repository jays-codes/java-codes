package ph.zai.exercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFizzString {

	FizzString fizz = new FizzString();
	
	@Test
	public final void test() {
		
		assertEquals("Fizz", fizz.fizzString("fig"));
		assertEquals("Buzz", fizz.fizzString("dib"));
		assertEquals("FizzBuzz", fizz.fizzString("fib"));
	}

}
