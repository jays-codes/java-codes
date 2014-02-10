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
			arr[i] = (int) ((Math.random()*x)+(y-x));
		}
	}
	
	public void printArray(){
		System.out.println();
		for (int i=0;i<=zeroSize;i++){
			System.out.print("\n| " + i + " | " + this.arr[i] + " |");
			System.out.print("\n----------");
		}
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
	
	public void addValue(int x){
		if (zeroSize<arr.length){
			zeroSize++;
			this.arr[zeroSize] = x;
		}
	}
	
	public void insertAt(int x,int i){
		if (zeroSize<arr.length){
			zeroSize++;
			for (int j=zeroSize;j>i;j--){
				this.arr[j] = this.arr[j-1];
			}
			
			this.arr[i] = x;
		}
	}
}
