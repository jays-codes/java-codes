package ph.zai.util;

import sedgewicks.stdlib.In;

public class SelectionSort extends SortTemplate {

	public void sort(Comparable[] a) {
		int N = a.length;
		int min;
		for (int i=0; i<N;i++){
			min = i;
			for (int j=i+1;j<N;j++){
				if (less(a[j], a[min])) min = j;
			}
			exch(a, i, min);
		}
	}

	public static void main(String[] args){
		
        try {
            In in = new In(args[0]);

            SelectionSort selectionSort = new SelectionSort();
            
    		String[] a = in.readAllStrings();
    		selectionSort.sort(a);
    		assert isSorted(a);
    		selectionSort.show(a);

            

        }
        catch (Exception e) { System.out.println(e); }
		
		
	}
}
