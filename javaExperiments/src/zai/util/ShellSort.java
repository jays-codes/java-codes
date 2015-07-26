package zai.util;

import sedgewicks.stdlib.In;

public class ShellSort extends SortTemplate {

	@Override
	public void sort(Comparable[] a) {

		int N = a.length;
        int h = 1;
        while (h < N/3) h = 3*h + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
        
        while (h >= 1)
        {  // h-sort the array.
           for (int i = h; i < N; i++)
           {  // Insert a[i] among a[i-h], a[i-2*h], a[i-3*h]... .
              for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
                 exch(a, j, j-h);
           }
           h = h/3; 
        }
	}

	
	public static void main(String[] args){
		
        try {
            In in = new In(args[0]);

            ShellSort shell = new ShellSort();
            
    		String[] a = in.readAllStrings();
    		shell.sort(a);
    		assert isSorted(a);
    		shell.show(a);

            

        }
        catch (Exception e) { System.out.println(e); }
		
		
	}
}
