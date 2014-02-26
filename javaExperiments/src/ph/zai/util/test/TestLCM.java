package ph.zai.util.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import ph.zai.util.LCM;

public class TestLCM {

	@Test
	public final void testLCM() {
		int[] ints = {3,7,9,8,4,5,2};
		//int[] ints = {3,7,9};

		assertEquals(63, LCM.of(new int[]{3,7,9}));
		
		System.out.println(Arrays.toString(ints));
		System.out.println("lcm is: " + LCM.recurse(ints));

	}

}
