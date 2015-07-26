package zai.util;

import java.util.Stack;

public class Parenthesis {

	public static boolean isValidSet(String xStr) {

		char[] chars = xStr.toCharArray();
		Stack<Character> charStack = new Stack<Character>();
		
		for (int i=0;i<chars.length;i++){
			char c = chars[i];
			if (c=='(' || c=='[' || c=='{') charStack.push(c);
			else {
				if (
						charStack.isEmpty() ||
						(c==')' && charStack.pop()!='(') ||
						(c==']' && charStack.pop()!='[') ||
						(c=='}' && charStack.pop()!='{') 
				)
					return false;
			}
		}
		
		return true;
	}
}
