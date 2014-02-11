package ph.zai.util.arrays;

public class JaysIntArray {
	int[] arr = null;
	int zeroSize=0;
	
	public JaysIntArray(int size){
		this.arr = new int[size];
		this.zeroSize = size-1;
		this.randomFill(1, 100);
	}
	
	public void randomFill(int x, int y){
		
		for (int i=0;i<=zeroSize;i++){
			arr[i] = (int) (x + Math.random()*(y-x));
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
		System.out.print("\n\n");
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
