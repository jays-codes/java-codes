package ph.zai.util.coinApp;

import java.util.Arrays;

public class CoinComputer {
		
	public static void processInputValue(Coin[] coinArr, 
			double inputVal){
		String strResult="";
		double denomVal=0;
		double amt2Change = inputVal;
		int denomCount = coinArr.length-1;
		int[] resultsArr = new int[denomCount+1];
		
		for (int i=0;i<denomCount;i++) resultsArr[i]=0;
		
		Arrays.sort(coinArr);
		System.out.print(Arrays.toString(coinArr));
		
		for (int i=denomCount, i2=0;i>=0;i--, i2++){
			denomVal = coinArr[i].getValue();
			
			if (amt2Change>=denomVal) {
				resultsArr[i2] = (int) (amt2Change/denomVal);
				amt2Change = amt2Change%denomVal;
				
				if (amt2Change==0) break;
			}
		}
		
		System.out.print("\n\nAmount to change: " + inputVal + "\n");
		for (int i=denomCount, i2=0;i>=0;i--, i2++) {
			strResult = "\n" + coinArr[i].getName() + "\t->\t" + 
					resultsArr[i2];
			System.out.print(strResult);
		}
	}
	
}
