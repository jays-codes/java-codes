package zai.util.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import zai.util.RecursiveCoinChanger;

public class TestRecursiveCoinChanger {

	@Test
	public final void test() {

		int toChange = 678998;
		int coins[] = {500, 300, 50, 20, 10, 5, 1};
//		int coins[] = {1, 5, 10, 20, 50, 300, 500};

		int expected[] = {4,1,0,0,1,0,9};
		int actual[] = RecursiveCoinChanger.change(toChange, coins);
		System.out.println("results for 678998: \n" + Arrays.toString(actual));
		
		assertArrayEquals(expected, RecursiveCoinChanger.change(toChange, coins));
	}

}
