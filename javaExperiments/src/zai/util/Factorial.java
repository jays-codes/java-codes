package zai.util;

public class Factorial {
		
	public static int of(int x){
		if (x==1) return x;
		else {
			return x * of(x-1);
		}
	}
}
