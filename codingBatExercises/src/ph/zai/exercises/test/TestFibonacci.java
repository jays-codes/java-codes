package ph.zai.exercises.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.exercises.Fibonacci;

public class TestFibonacci {
	int ans = 144;
	int input = 35;
	
	
	/*
	 * nice comment here
	 * */
	
	@Test
	public final void testFibonacci(){
		 Fibonacci.compute(0 + 1, 0, input );
		
		//assertEquals(ans, Fibonacci.compute(0 + 1, 0, 12 ));
	}
	
	@Test
	public final void testFibonacci2(){
		Fibonacci.F(input);
		
		//assertEquals(ans, Fibonacci.F(12));
	}
}
