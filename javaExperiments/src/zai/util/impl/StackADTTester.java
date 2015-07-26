package zai.util.impl;

import zai.util.LinkedListStack;

public class StackADTTester {

	public static void main(String[] args) {

		LinkedListStack<String> fcs = new LinkedListStack<String>();
		System.out.println("stack empty? : " + fcs.isEmpty());
		
		fcs.push("apple");
		fcs.push("banana");
		fcs.push("grapes");
		fcs.push("orange");
		
		System.out.println(fcs);
		
		fcs.push("melon");
		System.out.println(fcs);

		fcs.push("chestnut");
		System.out.println(fcs);
		
		fcs.pop();
		fcs.pop();
		fcs.pop();
		System.out.println(fcs);
		
		fcs.push("chestnut");
		System.out.println(fcs);
		
		fcs.pop();
		fcs.pop();
		fcs.pop();
		System.out.println(fcs);
		
		
	}

}
