package ph.zai.util.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Test;

import ph.zai.util.ArrayShuffler;

public class TestArrayShuffler {

	@Test
	public final void testShuffle() {
		
		String[] origArr = { "apple", "banana", "melon",
				"grape", "orange", "cherry", "lemon", };
		
		System.out.println("orig Arr : " + Arrays.toString(origArr));
		System.out.println("shuffled Arr : " + 
				Arrays.toString(ArrayShuffler.shuffle(origArr)));
				
		assertNotSame(origArr, ArrayShuffler.shuffle(origArr));
	}

}
