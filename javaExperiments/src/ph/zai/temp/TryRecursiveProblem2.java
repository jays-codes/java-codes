package ph.zai.temp;

public class TryRecursiveProblem2 {

	public static void main(String[] args) {
		int val = TryRecursiveProblem2.mystery(25, 2);
		System.out.println(val);
		
		val = TryRecursiveProblem2.mystery(3, 11);
		System.out.println(val);

		val = TryRecursiveProblem2.mystery(3, 11);
		System.out.println(val);

		val = TryRecursiveProblem2.mystery(6, 9);
		System.out.println(val);

		val = TryRecursiveProblem2.mystery2(3, 11);
		System.out.println(val);

	}

	public static int mystery(int a, int b) {
		if (b == 0)
			return 0;
		if (b % 2 == 0)
			return mystery(a + a, b / 2);
		return mystery(a + a, b / 2) + a;
	}
	
	public static int mystery2(int a, int b) {
		if (b == 0)
			return 1;
		if (b % 2 == 0)
			return mystery2(a * a, b / 2);
		return mystery2(a * a, b / 2) * a;
	}
}
