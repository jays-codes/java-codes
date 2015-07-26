package zai.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import zai.util.Prime;

public class TestPrime {

	@Test
	public final void test() {
		assertEquals(true, Prime.is(1299827));
		
	}

}
