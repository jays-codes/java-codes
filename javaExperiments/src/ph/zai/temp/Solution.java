package ph.zai.temp;

import java.io.*;
import java.util.Arrays;


public class Solution {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        
        line = br.readLine();
        String[] intsStr = line.split(" ");

        if (intsStr.length<3 || intsStr.length>=2500){
            System.exit(0);
        }

        int[] ints = new int[intsStr.length];
        
        
        for (int i=0;i<=ints.length-1;i++){
        	ints[i] = Integer.parseInt(intsStr[i]);
        }
        
        Arrays.sort(ints);
        
        int aveDiff = ints[ints.length-1]-ints[ints.length-2];
        int missing = 0;
        
        for (int i=ints.length-2;i>=0;i--){
        	if (aveDiff!=(ints[i]-ints[i-1])) {
        		missing = ints[i-1]+aveDiff;
                System.out.print(missing);
        		System.exit(0);
        	} 
        }
        
    }
}