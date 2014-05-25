package ph.zai.exercises.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.exercises.Fibonacci;

public class TestFibonacci {
	int ans = 21;
	
	@Test
	public final void testFibonacci(){
		assertEquals(ans, Fibonacci.compute(0 + 1, 0, 8 ));
	}
	
	@Test
	public final void testFibonacci2(){
		assertEquals(ans, Fibonacci.F(8));
	}
}
