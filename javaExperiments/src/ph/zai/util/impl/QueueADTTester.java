package ph.zai.util.impl;

import ph.zai.util.FIFOQueue;

public class QueueADTTester {

	public static void main(String[] args) {

		FIFOQueue<String> fcs = new FIFOQueue<String>();
		System.out.println("stack empty? : " + fcs.isEmpty());
		
		fcs.enqueue("apple");
		fcs.enqueue("banana");
		fcs.enqueue("grapes");
		fcs.enqueue("orange");
		
		System.out.println(fcs);
		
		fcs.enqueue("melon");
		System.out.println(fcs);

		fcs.enqueue("chestnut");
		System.out.println(fcs);
		
		fcs.dequeue();
		fcs.dequeue();
		fcs.dequeue();
		System.out.println(fcs);
		
		fcs.enqueue("chestnut");
		System.out.println(fcs);
		
		fcs.dequeue();
		fcs.dequeue();
		fcs.dequeue();
		System.out.println(fcs);
		
		
	}

}
