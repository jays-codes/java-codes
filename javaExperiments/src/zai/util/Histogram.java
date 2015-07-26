package zai.util;

public class Histogram {

	public static int[] process(int[] ints, int lenB) {
		int[] histo = new int[lenB];
		int count=0;
		for (int i=0; i<lenB-1; i++){
			count=0;
			for (int j=0; j<ints.length;j++) {
				if (ints[j]==i){
					count++;
				}
			}
			histo[i]=count;
		}
		
		return histo;
	}

}
