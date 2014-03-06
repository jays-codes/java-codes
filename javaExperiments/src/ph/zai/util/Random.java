package ph.zai.util;

public class Random {
	public static int getRandom(int fromRange, int toRange) {
		return (int) (fromRange + Math.random() 
				* ((toRange - fromRange) + 1));
	}
}
