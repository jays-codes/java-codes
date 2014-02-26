package ph.zai.util;

public class EuclidsGCD {
	public static int of(int x, int y){
		if (y==0) return x;
		else if (y==1) return -1; 
		else {
			return of(y, x%y);
		}
	}

	public static int of(int[] ints){
		int gcd = ints[0];
		for (int i=0;i<ints.length-1;i++){
			gcd = EuclidsGCD.of(gcd, ints[i+1]);
			if (gcd<0) return -1;
		}
		return gcd;
	}
}
