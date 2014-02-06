package ph.zai.util.coinApp;

import java.util.Arrays;

public class CoinComputer {
		
	public static int[] processInputValue(Coin[] coinArr, 
			double inputVal){
		double denomVal=0;
		double amt2Change = inputVal;
		int denomCount = coinArr.length-1;
		int[] resultsArr = new int[denomCount+1];
		
		for (int i=0;i<denomCount;i++) resultsArr[i]=0;
		
		Arrays.sort(coinArr);
		
		for (int i=denomCount, i2=0;i>=0;i--, i2++){
			denomVal = coinArr[i].getValue();
			
			if (amt2Change>=denomVal) {
				resultsArr[i2] = (int) (amt2Change/denomVal);
				amt2Change = amt2Change%denomVal;
				
				if (amt2Change==0) break;
			}
		}
		
		return resultsArr;
		

	}
	
}
