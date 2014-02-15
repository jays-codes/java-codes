package ph.zai.util.impl;

import java.util.Arrays;

import ph.zai.util.arrays.JaysIntArray;

public class JaysIntArrayTestClass {

	public static void main(String[] args) {

		/*
		 * Testing various JayIntArray methods
		 */
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
		// JaysIntArray arr = new JaysIntArray(10);
		// arr.randomFill(1, 50);
		// int[] intArr2 = Arrays.copyOf(arr.getArr(), arr.getArr().length);
		// JaysIntArray arr2 = new JaysIntArray(intArr2);
		//
		// arr2.printArrayHorizontally();
		// arr2.dereksBubbleSort(true);
		// arr2.printArrayHorizontally();
		// System.out.println();
		// arr.printArrayHorizontally();
		// arr.bubbleSort(true);
		// arr.printArrayHorizontally();

		// /*
		// * testing binary search method
		// */
		// JaysIntArray arr = new JaysIntArray(10);
		// arr.randomFill(10, 13);
		// int[] intArr2 = Arrays.copyOf(arr.getArr(), arr.getArr().length);
		// JaysIntArray arr2 = new JaysIntArray(intArr2);
		//
		// arr.printArrayHorizontally();
		// int x = 12;
		// int result = arr.binarySearchForValue(x);
		// arr.printArrayHorizontally();
		// if (result >= 0)
		// System.out.println("value : " + x + " found at index [" + result
		// + "]");
		// else
		// System.out.println("value " + x + " not present in current array");

		/*
		 * testing binary search method - static version
		 */
		// int[] intArr = { 15, 15, 15, 15, 17, 11, 11, 12,
		// 12, 12, 12, 16,16,16,16,16,16 };
		// JaysIntArray.printArrayHorizontally(intArr);
		// int x = 16;
		// int results[] = JaysIntArray.binarySearchForValue(intArr, x);
		// JaysIntArray.printArrayHorizontally(intArr);
		// if (results[0]<0){
		// System.out.println("value " + x + " not present in current array");
		//
		// } else {
		// System.out.println("value: " + x + " found at index(es): ");
		// for (int i=0;i<results.length;i++){
		// System.out.print(" " + results[i]);
		// }
		// }

		// /*
		// * comparing initial selection sort with actual selection sort
		// */
		// JaysIntArray arr = new JaysIntArray(50000);
		// arr.randomFill(1, 5000);
		// int[] intArr2 = Arrays.copyOf(arr.getArr(), arr.getArr().length);
		// JaysIntArray arr2 = new JaysIntArray(intArr2);
		//
		// //arr2.printArrayHorizontally();
		// arr2.jaysSelectionSort(false);
		// //arr2.printArrayHorizontally();
		// System.out.println();
		// //arr.printArrayHorizontally();
		// arr.selectionSort(false);
		// //arr.printArrayHorizontally();

		/*
		 * comparing selection sort with insert sort
		 */
		JaysIntArray arr = new JaysIntArray(10);
		arr.randomFill(10, 20);
		int[] intArr2 = Arrays.copyOf(arr.getArr(), arr.getArr().length);
		JaysIntArray arr2 = new JaysIntArray(intArr2);

		arr2.printArrayHorizontally();
		arr2.selectionSort(false);
		arr2.printArrayHorizontally();
		System.out.println();
		arr.printArrayHorizontally();
		arr.insertionSort(false);
		arr.printArrayHorizontally();

	}

}
