package ph.zai.util.arrays;

public class JaysIntArray {
	int[] arr = null;
	int zeroSize=0;
	
	public int[] getArr(){
		return this.arr;
	}
	
	public JaysIntArray(int size){
		this.arr = new int[size];
		this.zeroSize = size-1;
		this.randomFill(1, 100);
	}
	
	public JaysIntArray(int[] arr){
		this.arr = arr;
		this.zeroSize = arr.length-1;
	}
	
	public JaysIntArray(JaysIntArray jarr){
		this.arr = jarr.arr;
		this.zeroSize = jarr.zeroSize;
	}
	
	public void randomFill(int x, int y){
		
		for (int i=0;i<=zeroSize;i++){
			arr[i] = (int) (x + Math.random()*((y-x)+1));
		}
	}
	
	public void printArray(){
		System.out.println();
		for (int i=0;i<=zeroSize;i++){
			System.out.print("\n| " + i + " | " + this.arr[i] + " |");
			System.out.print("\n----------");
		}
	}

	public void printArrayHorizontally(){
		System.out.print("\n");
		for (int i=0;i<=zeroSize;i++){
			System.out.print(padInteger(i, arr[i], true) + " | ");
		}
		System.out.print("\n");

		for (int i=0;i<=zeroSize;i++){
			System.out.print(padInteger(i, arr[i], false) + " | ");
		}
		System.out.print("\n");
	}

	private String padInteger(int idx, int val, boolean isIdx){
		int idxDigits = getNumOfDigits(idx);
		int valDigits = getNumOfDigits(val);
		int diff = Math.abs(idxDigits-valDigits);
		if (diff>0){
			int biggerDigit = Math.max(idxDigits, valDigits);
			String str = isIdx ? String.valueOf(idx) : String.valueOf(val);
			return String.format(
					"%-" + biggerDigit + "s", str);
		} 
		return isIdx ? String.valueOf(idx) : String.valueOf(val);
	}

	private String padIntegerForMarkers(int idx, int val, boolean mustPrint){
		
		int idxDigits = getNumOfDigits(idx);
		int valDigits = getNumOfDigits(val);
		int diff = Math.abs(idxDigits-valDigits);
		if (diff>0){
			int biggerDigit = Math.max(idxDigits, valDigits);
			String str = mustPrint ? String.valueOf(idx) : " ";
			return String.format(
					"%-" + biggerDigit + "s", str);
		} 
		return mustPrint ? String.valueOf(idx) : " ";
	}	
	
	private int getNumOfDigits(int x){
		return String.valueOf(x).length();
	}
	
	public int valueAt(int i){
		if (i<=zeroSize) return this.arr[i];
		return 0;
	}
	
	public boolean hasValue(int x){
		for (int i=0;i<=zeroSize;i++){
			if (arr[i]==x) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * find smallest element in the array put it in i
	 * */
	public void selectionSort(){
		int temp=0;
		for (int i=0;i<=zeroSize;i++){
			for (int j=i;j<=zeroSize;j++){
				temp = arr[j];
				if (temp>arr[j]){
					temp = arr[j];
				}
			}
			arr[i]=temp;
		}
	}
	
	public void dereksBubbleSort(boolean verbose){
		System.out.println("Running dereks Bubblesort");
		long timeStr = System.currentTimeMillis();
		
		for (int i=zeroSize;i>1;i--){
			for(int j=0; j<i;j++){
				if (arr[j]>arr[j+1]) {
					swap(j,j+1);
					if (verbose){
						System.out.print("\ni: " + i + "\tj: " + j + "\tj+1: " + (j+1));
						printIndexMarkers(j, j+1);

					}
				}
			}
			if (verbose)
			System.out.print("\ni new value: " + (i+1));
		}
		long timeEnd = System.currentTimeMillis();
		int runTime = (int) (timeEnd-timeStr);
		
		System.out.println("duration: " + (int)timeStr +" to "+ (int)timeEnd);
		System.out.println("runtime: " + runTime + " milliseconds");
	}
	
	public void bubbleSort(boolean verbose){
		System.out.println("Running Bubblesort");
		long timeStr = System.currentTimeMillis();
		
		for (int i=0;i<=zeroSize;i++){
			for(int j=i+1; j<=zeroSize;j++){
				if (arr[i]>arr[j]) {
					swap(i,j);
					
					if (verbose)
					{
						System.out.print("\ni: " + i + "\tj: " + j);
						printIndexMarkers(i, j);
					}
				}
			}
			if (verbose)
			System.out.print("\ni new value: " + (i+1));
		}
		long timeEnd = System.currentTimeMillis();
		int runTime = (int) (timeEnd-timeStr);
		
		System.out.println("duration: " + (int)timeStr +" to "+ (int)timeEnd);
		System.out.println("runtime: " + runTime + " milliseconds");
	}
	
	public int binarySearchForValue(int x){
		int lowIdx = 0;
		int highIdx = zeroSize;
		int currSearchIdx = 0;
		
		this.bubbleSort(false);
		
		while (lowIdx <= highIdx){
			currSearchIdx = (lowIdx + highIdx)/2;

			if (x>arr[currSearchIdx]){
				lowIdx = currSearchIdx + 1;
			} else if (x<arr[currSearchIdx]) {
				highIdx = currSearchIdx-1;
			} else {
				return currSearchIdx;
			}
			printIndexMarkers(currSearchIdx, currSearchIdx);
			this.printArrayHorizontally();
		}
		
		return -1;
	}
	
	private void printIndexMarkers(int iIdx, int jIdx) {
		System.out.print("\n");
		for (int i=0;i<=zeroSize;i++){
			if(i==iIdx || i==jIdx) { 
				System.out.print(padIntegerForMarkers(i, arr[i], true) 
						+ "   ");
			} else {
				System.out.print(padIntegerForMarkers(i, arr[i], false) 
						+ "   ");
			}
		}

//		for (int i=0;i<=zeroSize;i++){
//			System.out.print(padInteger(i, arr[i], false) + " | ");
//		}
//		System.out.print("\n");
		this.printArrayHorizontally();
	}

	private void swap(int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	public int[] indexesOf(int x){
		int[] indexes;
		int count=0;
		
		for (int i=0;i<=zeroSize;i++){
			if (arr[i]==x) {
				count++;
			}
		}
		
		indexes = new int[count];
		for (int i=0, j=0;i<=zeroSize;i++) {
			if (arr[i]==x) {
				indexes[j] = i;
				j++;
			}
		}
		
		return indexes;
	}
	
	public void popAt(int i){
		if (i>zeroSize) return;
		
		for (int j=i;j<zeroSize;j++){
			this.arr[j]=this.arr[j+1];
		}
		zeroSize--;
	}
	
	public int firstInstanceOf(int x){
		if (this.hasValue(x)){
			for (int i=0;i<=zeroSize;i++){
				if (this.arr[i]==x) return i;
			}
		}
		return -1;
	}
	
	public void pop(int x){		
		while (this.hasValue(x)) {
			this.popAt(this.firstInstanceOf(x));
		}
	}
	
	public void pop(){
		if (zeroSize>0){
			this.popAt(zeroSize);
		}
	}
			
	public void addValue(int x){
		if (zeroSize<arr.length-1){
			zeroSize++;
			this.arr[zeroSize] = x;
		}
	}
	
	public void insertAt(int x,int i){
		if (zeroSize<arr.length-1){
			zeroSize++;
			for (int j=zeroSize;j>i;j--){
				this.arr[j] = this.arr[j-1];
			}
			
			this.arr[i] = x;
		}
	}
}
