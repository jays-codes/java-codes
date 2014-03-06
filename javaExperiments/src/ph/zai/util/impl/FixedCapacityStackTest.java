package ph.zai.util.impl;

import ph.zai.util.ResizableArrayStack;

public class FixedCapacityStackTest {

	public static void main(String[] args) {

		ResizableArrayStack<String> fcs = new ResizableArrayStack<String>();
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
