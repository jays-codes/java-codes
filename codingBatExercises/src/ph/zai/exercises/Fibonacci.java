package ph.zai.exercises;

public class Fibonacci {
	
	public static void main(String[] args){
		int seed = 0;
		int N = 45;
		
		long start, end;
		
		seed = 0;
		start = System.currentTimeMillis();
		System.out.println("\nSpeed Test 2:");
		seed = Fibonacci.compute(seed + 1,0,N);
		System.out.println("Seed Value at N[" + N + "]: " + seed);
		end = System.currentTimeMillis();
		System.out.println("run time: " + (end - start));
		
		//seed = Fibonacci.compute(seed + 1,0,N);
		start = System.currentTimeMillis();
		System.out.println("\nSpeed Test 1:");
		seed = Fibonacci.F(N);
		System.out.println("Seed Value at N[" + N + "]: " + seed);
		end = System.currentTimeMillis();
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
