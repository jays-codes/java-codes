package zai.util;

import sedgewicks.stdlib.In;

public class InsertionSort extends SortTemplate {

	@Override
	public void sort(Comparable[] a) {

		int N = a.length;
		
		for (int i=1;i<N;i++){
			for (int j=i; j>0 && less(a[j], a[j-1]);j--){
				exch(a, j, j-1);
			}
		}
	}

	
	public static void main(String[] args){
		
        try {
            In in = new In(args[0]);

            InsertionSort insertion = new InsertionSort();
            
    		String[] a = in.readAllStrings();
    		insertion.sort(a);
    		assert isSorted(a);
    		insertion.show(a);

            

        }
        catch (Exception e) { System.out.println(e); }
		
		
	}
}
