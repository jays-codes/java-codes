package ph.zai.exercises;

public class Fibonacci {
	
	public static void main(String[] args){
		int seed = 0;
		int N = 40;
		System.out.println("Initial Seed Value = " + seed);
		
		//seed = Fibonacci.compute(seed + 1,0,N);
		long start = System.currentTimeMillis();
		System.out.println("Speed Test 1:");
		seed = Fibonacci.F(N);
		System.out.println("Seed Value at N[" + N + "]: " + seed);
		long end = System.currentTimeMillis();
		System.out.println("run time: " + (end - start));
	}
	
	public static int compute(int seed, int prev, int n){
		if (n==0) return prev;
		
		return compute(seed + prev, seed, n-1);
	}
	
	public static int F(int n){
		if (n==0) return 0;
		if (n==1) return 1;
		return F(n-1) + F(n-2);
	}
}
