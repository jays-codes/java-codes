package ph.zai.util.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ph.zai.util.Histogram;

public class TestHistogram {

	@Test
	public final void test() {
		int[] ints = {1,3,7,2,4,8,9,11,12,4,1,2,5,7,23,10};
		int lenB = 25;
		int[] retArr = Histogram.process(ints, lenB);
		int retArrSum = 0;
		
		
		for (int i=0; i<retArr.length;i++){
			retArrSum += retArr[i];
		}
		assertEquals("length of ints = sum of resulsArr",ints.length, retArrSum);
	}

}
