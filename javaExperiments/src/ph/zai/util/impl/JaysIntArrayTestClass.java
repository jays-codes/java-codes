package ph.zai.util.impl;

import java.util.Arrays;

import ph.zai.util.arrays.JaysIntArray;

public class JaysIntArrayTestClass {

	public static void main(String[] args) {

		/*
		 * Testing various JayIntArray methods
		 * */
		// JaysIntArray arr = new JaysIntArray(20);
		// arr.printArray();
		//
		// System.out.print("\nvalue at 20 = " +
		// arr.valueAt(19));
		//
		// int x = arr.valueAt(18);
		// System.out.print("\n\nindexOf " + x + ": ");
		//
		// int[] idx = arr.indexesOf(x);
		// for (int i=0;i<idx.length;i++){
		// System.out.println(idx[i]);
		// }
		// JaysIntArray arr = new JaysIntArray(15);
		// arr.randomFill(1010, 1030);
		// arr.printArrayHorizontally();
		//
		// arr.pop(12);
		// arr.pop(15);
		// arr.pop(13);
		// arr.printArrayHorizontally();
		//
		// arr.insertAt(77, 1);
		// arr.printArrayHorizontally();
		//
		// arr.addValue(78);
		// arr.printArrayHorizontally();
		//
		// arr.pop();
		// arr.printArrayHorizontally();

		/*
		 * comparing dereks bubble sort and my own version of bubblesort
		 */
		 JaysIntArray arr = new JaysIntArray(10);
		 arr.randomFill(1, 50);
		 int[] intArr2 = Arrays.copyOf(arr.getArr(), arr.getArr().length);
		 JaysIntArray arr2 = new JaysIntArray(intArr2);
		
		 arr2.printArrayHorizontally();
		 arr2.dereksBubbleSort(false);
		 arr2.printArrayHorizontally();
		 System.out.println();
		 arr.printArrayHorizontally();
		 arr.bubbleSort(false);
		 arr.printArrayHorizontally();
		
		/*
		 * testing binary search method
		 * */
//		 JaysIntArray arr = new JaysIntArray(10);
//		 arr.randomFill(1, 50);
//		 int[] intArr2 = Arrays.copyOf(arr.getArr(), arr.getArr().length);
//		 JaysIntArray arr2 = new JaysIntArray(intArr2);
//
//		 arr.printArrayHorizontally();
		 
	}

}
