package ph.zai.util.coinApp;

public class TestCoinComputer {

	public static void main(String[] args) {
		if (args.length<2){
			System.out.print("Invalid number. Program Exiting.");
			System.exit(1);
		}
		
		String x = args[0];
		String y = args[1];
		
		CoinComputer ccApp = new CoinComputer(x, y);
		System.out.print(ccApp);
	}

}
