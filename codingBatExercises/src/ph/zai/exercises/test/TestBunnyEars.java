package ph.zai.exercises.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.exercises.BunnyEars;


public class TestBunnyEars {
	
	@Test
	public final void test(){
	   assertEquals(8, BunnyEars.countEars(4));
   }
}
