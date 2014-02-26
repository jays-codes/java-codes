package ph.zai.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.util.Factorial;

public class TestFactorial {

	@Test
	public final void testFactorial() {

		assertEquals(24, Factorial.of(4));
		System.out.println("4! = " + Factorial.of(4));
	}

}
