package ph.zai.util.coinApp;

public class Coin implements Comparable<Coin>{
	
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
	
	@Override
	public boolean equals(Object o){
		return Double.doubleToLongBits(value) == Double.doubleToLongBits(
				((Coin)o).value);
	}

	@Override
	public int compareTo(Coin o) {
		//Coin otherCoin = (Coin)o;
		
		return Double.compare(this.value, o.value);
		
//		return (this.value < o.value)  ? -1
//				: (this.value > o.value) ? 1
//				: 0 ;
	}

	@Override 
	public String toString(){
		return "\nname : " + this.name + "\t\t -> \tvalue : " + this.value;
	}
}
