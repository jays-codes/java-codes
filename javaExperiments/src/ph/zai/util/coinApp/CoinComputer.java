package ph.zai.util.coinApp;

import java.util.Arrays;

public class CoinComputer {
		
	public static String processInputValue(Coin[] coinArr, double inputVal){
		String strResult="";
		
		Arrays.sort(coinArr);
		System.out.print(Arrays.toString(coinArr));
		
//		double[] doubleArr = new double[coinArr.length];
//		for (int i=0;i<coinArr.length;i++){
//			doubleArr[i] = coinArr[i].getValue()
//		}
		
		double val = inputVal;
		
		return strResult;
	}
	
}
