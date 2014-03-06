package ph.zai.util;

public class ArrayShuffler {

	public static String[] shuffle(String[] arr) {

		int arrLen = arr.length-1;
		int newIdx = 0;
		String temp = "";
		for (int i=0;i<arrLen;i++){
			newIdx = Random.getRandom(0, arrLen);
			temp = arr[i];
			arr[i] = arr[newIdx];
			arr[newIdx] = temp;
		}
		
		return arr;
	}

}
