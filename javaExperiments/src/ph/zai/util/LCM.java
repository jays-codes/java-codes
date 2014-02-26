package ph.zai.util;

import java.util.Arrays;

/*
 * 3,5 = 15
 * 3,6 = 6
 * 3,4 = 12
 * 
 * */

public class LCM{
	public static int of(int x, int y){
		if ((x%y==0) || (y%x==0)){
			return y>x ? y : x;
		} else {
			return x*y;
		}
	}
	
	/*
	 * 3,4,6 = 12
	 * 3,7,9 = 63
	 * */
	public static int of(int[] ints){
		Arrays.sort(ints);
		int maxIdx = ints.length-1;
		int lcm = ints[maxIdx];
		for (int i=0;i<=maxIdx;i++){
			lcm = LCM.of(lcm, ints[i]);
		}
		return lcm;
	}
	
	public static int recurse(int[] ints){
		Arrays.sort(ints);
		int maxIdx = ints.length-1;
		return lcm(ints[maxIdx], 0, ints);
	}
	
	public static int lcm(int lcmVal, int idx, int[] ints){
		if (idx==ints.length) return lcmVal;
		else {
			return lcm(
					LCM.of(lcmVal, ints[idx]),
					idx+1, ints);
		}
	}
}
