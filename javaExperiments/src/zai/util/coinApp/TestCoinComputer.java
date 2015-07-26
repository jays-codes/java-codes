package zai.util.coinApp;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestCoinComputer {

	public Coin[] coinArr = null;
	public ArrayList<Coin> coinArrList = new ArrayList<Coin>();
	public double inputVal;
	
	@Before
	public void setUp() throws Exception {
		coinArr = new Coin[10]; //.01, .10, .25, .5, 1, 5, 10, 20, 50, 100
		coinArr[0] = new Coin(.01, "penny");
		coinArr[5] = new Coin(.05, "nickle");
		coinArr[7] = new Coin(.1, "dime");
		coinArr[9] = new Coin(.25, "quarter");
		coinArr[4] = new Coin(.5, "half-dollar");
		coinArr[1] = new Coin(1, "1-dollar");
		coinArr[6] = new Coin(10, "tens");
		coinArr[2] = new Coin(20, "twenties");
		coinArr[8] = new Coin(50, "fifties");
		coinArr[3] = new Coin(100, "benjamins");

		for (Coin coin : coinArr){
			coinArrList.add(coin);
		}
		
		inputVal = 598.97;
	}

	@Test
	public final void testProcessInputValue() {
		
		int[] expected = {5,1,2,0,8,1,1,2,0,2};
		int[] actual = CoinComputer.processInputValue(coinArr, inputVal);
		
		assertArrayEquals("breaking up 598.97", expected, actual );
	}

	@Test
	public final void testProcessInputValueArraylist(){
		//int[] expected = {5,1,2,0,8,1,1,2,0,2};
		List<Integer> expected = Arrays.asList(5,1,2,0,8,1,1,2,0,2);
		
		List<Integer> actual = CoinComputer.processInputValue(coinArrList, inputVal);
		assertEquals("[ArrayList version] breaking up 598.97", expected, actual );
	}
}
