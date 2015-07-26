package zai.util;

public class Palindrome {

	public static boolean isPalindrome(String xStr) {
		int strLen = xStr.length();
		
		for (int i=0;i<strLen/2;i++){
			if (xStr.charAt(i)!=xStr.charAt(strLen-1-i)){
				return false;
			}
		}
		
		return true;
	}

	public static boolean isPalindrome(int[] xInts) {
		int arrLen = xInts.length;
		
		for (int i=0;i<arrLen/2;i++){
			if (xInts[i] != xInts[arrLen-1-i]){
				return false;
			}
		}
		
		return true;
	}
	
}
