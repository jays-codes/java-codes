package zai.util;

public class RecursivePalindrome {
	public static boolean isPalindrome(String xStr){
		if (xStr.length()>1)
			return endsMatches(xStr);
		else
			return true;
		
	}
	
	private static boolean endsMatches(String xStr){
		int strLen = xStr.length();
		
		if (strLen<=1) return true;
		else if (xStr.charAt(0)==xStr.charAt(xStr.length()-1))
			return endsMatches(xStr.substring(1, strLen-1));
		else
			return false;
			
	}
	
	public static String palindromize(String str){
		
		int strLen = str.length();
		String a = "";
		String b = "";
		int mid = strLen/2;
		if (strLen==1) return str;
		else{
			a = str.substring(0, mid);
			b = str.substring(mid, strLen);
			return palindromize(b) + palindromize(a);
		}
		
	}
}
