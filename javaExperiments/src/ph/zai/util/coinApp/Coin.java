package ph.zai.util.coinApp;

public class Coin {
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private double value;
	private String name;
	
	public Coin(double value, String name){
		this.value = value;
		this.name = name;
	}
}
