package ph.zai.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.util.EuclidsGCD;

public class TestEuclidsGCD {

	@Test
	public final void testGCD() {
		assertEquals(6, EuclidsGCD.of(18, 48));

		System.out.println("gcd(18,48) : " 
		+ EuclidsGCD.of(18, 48));
	}

}
