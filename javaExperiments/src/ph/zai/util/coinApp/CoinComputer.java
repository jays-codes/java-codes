package ph.zai.util.coinApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoinComputer {
		
	public static int[] processInputValue(Coin[] coinArr, 
			double inputVal){
		double denomVal=0;
		double amt2Change = inputVal;
		int denomCount = coinArr.length-1;
		int[] resultsArr = new int[denomCount+1];
		
		Arrays.fill(resultsArr, 0);
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

	public static List<Integer> processInputValue(ArrayList<Coin> coinList,
			double inputVal) {		
		
		List<Integer> resultsList = new ArrayList<Integer>();
		Collections.sort(coinList);
		Collections.reverse(coinList);
		
		double amt2Change=inputVal;
		double coinVal = 0;
		
		for (Coin coin : coinList){
			coinVal = coin.getValue();
			
			if (amt2Change>=coinVal){
				
				resultsList.add((int) (amt2Change/coinVal));
				amt2Change = amt2Change%coinVal;
				
				if (amt2Change==0) break;
			} else {
				resultsList.add(new Integer(0));
			}
		}
		
		return resultsList;
	}
}
