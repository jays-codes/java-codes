package zai.util;

import java.util.Arrays;

public class RecursiveCoinChanger {
	private static int[] breakdown = null;
	private static int[] coins = null;
	
	public static int[] change(int val, int[] denoms){
		int coinLen = denoms.length;
		breakdown = new int[coinLen];
		Arrays.sort(denoms);
		coins = denoms;
		Arrays.fill(breakdown, 0);
		
		return change(val, coinLen-1);
	}
	
	private static int[] change(int val, int i){
		if (val==0 && i>=0) return breakdown;
		else {
			if (val>=coins[i]){
				breakdown[i]=val/coins[i];
				return change(
						val-(breakdown[i]*coins[i]),i--);
			} else {
				return change(val, i-1);
			}
		}
		
	}
}
