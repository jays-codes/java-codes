package ph.zai.util;

import java.util.Arrays;

public class RecursiveBinarySearch {

	public static int rank(int[] intArr, int key) {
		Arrays.toString(intArr);
		Arrays.sort(intArr);
		Arrays.toString(intArr);

		return rank(intArr, key, 0, intArr.length - 1);
	}

	public static int rank(int[] arr, int key, int lo, int hi) {
		int mid = 0;

		mid = (hi + lo) / 2;
		if (arr[mid] == key)
			return mid;
		else if (key > arr[mid])
			return rank(arr, key, mid + 1, hi);
		else if (key < arr[mid])
			return rank(arr, key, lo, mid - 1);
		return -1;

	}

}
