package ph.zai.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.util.IntegerToBinary;

public class TestIntegerToBinary {

	@Test
	public final void test() {
		assertEquals("110010", IntegerToBinary.convert(50));
		System.out.println("50 is : " + IntegerToBinary.convert(50));
	}

}
