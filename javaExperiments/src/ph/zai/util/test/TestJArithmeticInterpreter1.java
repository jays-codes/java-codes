package ph.zai.util.test;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ph.zai.util.JaysArithmeticInterpreter1;


public class TestJArithmeticInterpreter1 {
	JaysArithmeticInterpreter1 jai1 = new JaysArithmeticInterpreter1();
	String stmt = "(1+((2+3)*(4*5)))";

	
	@Test
	public final void test1() {
		Double expected = new Double(101.0);
		assertEquals(expected, Double.valueOf(jai1.interpret(stmt)));
	}
	

}
