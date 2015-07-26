package zai.util;

import java.util.Arrays;

public class CircularShifter {

	public static String[] shift(String[] arr, int places) {
		if (places==0) return arr;
		for (int i=0;i<places;i++){
			CircularShifter.shiftRight(arr);
		}
		
		return arr;
	}
	
	public static String[] shiftRight(String[] arr){
		int arrLen = arr.length-1;
		String temp = arr[arrLen];
		
		for(int i=arrLen;i>=1;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		
		return arr;
	}
	
	
	/*
	 * Is array A a shift of array B
	 * */
	public static int shiftCount(String[] arrA, String[] arrB){
		
		if (!(arrA.length==arrB.length)){
			return -1;
		}
		
		int shiftCombiCount = arrA.length-1;
		
		
		for(int i=0;i<=shiftCombiCount;i++){
			if(
				Arrays.equals(arrA, CircularShifter.shift(arrB, i))
					) return i; 
		}
		
		return -1;
		
	}
	
//	public static String[] shiftLeft(String[] arr){}

}
