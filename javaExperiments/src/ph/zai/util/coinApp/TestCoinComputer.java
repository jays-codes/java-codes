package ph.zai.util.coinApp;

public class TestCoinComputer {

	public static void main(String[] args) {
		if (args.length<2){
			System.out.print("Invalid number. Program Exiting.");
			System.exit(1);
		}
		
		Coin[] coinArr = new Coin[10]; //.01, .10, .25, .5, 1, 5, 10, 20, 50, 100
		
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

		double inputVal = 598.97;
		
		CoinComputer.processInputValue(coinArr, inputVal);
		//System.out.print(ans);
	}

}
