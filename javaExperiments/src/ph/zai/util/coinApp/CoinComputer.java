package ph.zai.util.coinApp;

public class CoinComputer {
	String x = null;
	String y = null;
	
	public CoinComputer(String x, String y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		String str = "x = " + this.x + "\ny = " + this.y;
		return str;
	}
}
