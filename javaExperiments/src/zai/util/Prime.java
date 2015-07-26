package zai.util;

/*
 * process() is the iterative solution...
 * somehow it works better than gotRemainder (recursive) - 
 * specially for larger prime numbers
 * */
public class Prime {
	public static boolean is(long x){
		return process(x);
		//return gotRemainder(x, 2);
	}
	
	public static boolean gotRemainder(long orig, long i){
		if (i==orig) return true;
		else if (orig%i==0) return false;
		else return gotRemainder(orig, i+1);
	}

	public static boolean process(long x){
		for (int i=2;i*i<=x;i++){
			if (x%i==0) return false;
		}
		return true;
	}
	
}
