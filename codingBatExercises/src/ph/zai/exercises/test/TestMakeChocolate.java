package ph.zai.exercises.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.exercises.MakeChocolate;

public class TestMakeChocolate {

	MakeChocolate choco = new MakeChocolate();
	
	@Test
	public final void test() {
		assertEquals(4, choco.makeChocolate(4,1,9));
		assertEquals(-1, choco.makeChocolate(4,1,10));
		assertEquals(2, choco.makeChocolate(4,1,7));
	}

}
