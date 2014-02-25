package ph.zai.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.util.BSearchRecursive;

public class TestBSearchRecursive {

	@Test
	public final void test() {
		int[] ints = { 5, 12, 34, 21, 56, 78, 98, 11, 10, 9, 3, 2, 1, 98, 14,
				45 };
		assertEquals("negative test", -1, BSearchRecursive.rank(ints, 4));
		assertEquals("false test", false, BSearchRecursive.rank(ints, 21)==11);
		assertEquals("positive retrieval test", 9, BSearchRecursive.rank(ints, 21));

	}

}
