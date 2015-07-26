package zai.temp;

public class TryRecursionProb1 {

	public static void main(String[] args) {
		String ans = TryRecursionProb1.exR1(6);
		System.out.println("answer=" + ans);
		
		int modu = 1 % 2;
		int x=0;
	}

	public static String exR1(int n) {
		String retStr="";
		if (n <= 0)
			return "";
		retStr = exR1(n - 3) + n + exR1(n - 2) + n;
		return retStr;
	}
}
