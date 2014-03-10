package ph.zai.util;

import java.util.Stack;

public class IntegerToBinary {
	public static String convert(int num){
		
		Stack<Integer> ints = new Stack<Integer>();
		int bit = 0;
		
		while (num>0){
			bit = num%2;
			ints.push(bit);
			num = num/2;
		}
		
		String str = "";
		int size = ints.size();
		for (int i=0;i<size;i++){
			str = str + ints.pop();
		}
		return str;
	
		
	}
}
