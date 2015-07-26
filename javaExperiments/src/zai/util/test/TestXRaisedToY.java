package zai.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import zai.util.XRaisedToY;

public class TestXRaisedToY {

	@Test
	public final void test() {
		int power = 33554432;
		assertEquals(power, XRaisedToY.of(2, 25));
	
		System.out.println("2^25= " + XRaisedToY.of(2, 25));
	}

}
