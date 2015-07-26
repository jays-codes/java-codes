package zai.util;

import java.util.Arrays;

public class BSearchRecursive {

	
	public static int rank(int[] ints, int val){
		
		Arrays.sort(ints);
		int hi = ints.length-1;
		
		return rank(ints, val, 0, hi);
	}
	
	public static int rank(int[] ints, int val, int lo, int hi){
		
		int mid = (hi+lo)/2;
		if (lo>hi) {
			return -1;
		} else if (ints[mid]==val){
			return mid;
		} else if (val>ints[mid]){
			return rank(ints, val, mid+1, hi);
		} else if (val<ints[mid]){
			return rank(ints, val, lo, mid-1);
		} 
		return -1;
	}
}
