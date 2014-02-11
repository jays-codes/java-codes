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
		
		JaysIntArray arr = new JaysIntArray(15);
		arr.randomFill(1000, 2000);
		arr.printArrayHorizontally();
		
		arr.pop(12);
		arr.pop(15);
		arr.pop(13);
		arr.printArrayHorizontally();
		
		arr.insertAt(77, 1);
		arr.printArrayHorizontally();
		
		arr.addValue(78);
		arr.printArrayHorizontally();
		
		arr.pop();
		arr.printArrayHorizontally();
		
	}

}
