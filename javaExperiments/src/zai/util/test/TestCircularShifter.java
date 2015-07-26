package zai.util.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import zai.util.CircularShifter;

public class TestCircularShifter {

	String[] fruits = { "apple", "banana", "grape", "orange", "cherry" };
	String[] shiftedFruits1 = { "orange", "cherry", "apple", "banana", 
			"grape"};

//	@Test
//	public final void testIsShift() {
//		fail("Not yet implemented"); // TODO
//	}

	@Test
	public final void testShift() {
		System.out.println("unshifted:\n"+ Arrays.toString(fruits));
		fruits = CircularShifter.shift(fruits, 63);
		System.out.println("\nshifted:\n"+ Arrays.toString(fruits));
		assertEquals(shiftedFruits1, fruits);
		
		
	}

	@Test
	public final void testShiftCount() {
		int expected = 2;
		int actual = CircularShifter.shiftCount(fruits, shiftedFruits1);
		System.out.println("actual:\n"+ actual);
		assertEquals(expected, actual);

	}

}
