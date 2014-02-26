package ph.zai.util;

public class EuclidsGCD {
	public static int of(int x, int y){
		if (x%y==0) return y;
		else {
			return of(y, x%y);
		}
	}
}
