package ph.zai.util.arrays;

public class JaysIntArrayImpl {

	public static void main(String[] args) {

//		JaysIntArray arr = new JaysIntArray(20);
//		arr.printArray();
//	
//		System.out.print("\nvalue at 20 = " + 
//		arr.valueAt(19));
//	
//		int x = arr.valueAt(18);
//		System.out.print("\n\nindexOf " + x + ": ");
//	
//		int[] idx = arr.indexesOf(x);
//		for (int i=0;i<idx.length;i++){
//			System.out.println(idx[i]);
//		}
		
		JaysIntArray arr = new JaysIntArray(10);
		arr.randomFill(10, 20);
		arr.printArray();
		
		arr.pop(12);
		arr.pop(15);
		arr.pop(13);
		arr.printArray();
		
		arr.insertAt(77, 1);
		arr.printArray();
		
		arr.addValue(78);
		arr.printArray();
		
		arr.pop();
		arr.printArray();
		
	}

}
