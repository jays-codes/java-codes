package zai.util.test;
import static org.junit.Assert.*;

import org.junit.Test;

import zai.util.JaysArithmeticInterpreter1;


public class TestJArithmeticInterpreter1 {
	JaysArithmeticInterpreter1 jai1 = new JaysArithmeticInterpreter1();
	String stmt = "(1+((2+3)*(4*5)))";
	String stmt2 = "((1+sqrt(5.0))/2.0)";

	
	@Test
	public final void test1() {
		Double expected = new Double(101.0);
		assertEquals(expected, Double.valueOf(jai1.interpret(stmt)));
		System.out.println(jai1.interpret(stmt));
	}
	
	@Test
	public final void test2() {
		Double expected = new Double(1.618033988749895);
		assertEquals(expected, Double.valueOf(jai1.interpret(stmt2)));
		System.out.println(jai1.interpret(stmt2));
	}
	

}
