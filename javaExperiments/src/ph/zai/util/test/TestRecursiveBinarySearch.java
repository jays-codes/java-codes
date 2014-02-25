package ph.zai.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.util.RecursiveBinarySearch;

public class TestRecursiveBinarySearch {

	@Test
	public final void test() {
		int[] intArr = {12,34,54,23,11,87,4,5,79,123,2,1,13};
		int key = 87;
		System.out.print("index=" + RecursiveBinarySearch.rank(intArr, key));
		assertEquals(11, RecursiveBinarySearch.rank(intArr, key));
	}

}
