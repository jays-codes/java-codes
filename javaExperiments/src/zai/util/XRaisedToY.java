package zai.util;

public class XRaisedToY {
	public static int of(int x, int y){
		if (y==0) return 1;
		else {
			return x * of(x, y-1);
		}
	}
}
