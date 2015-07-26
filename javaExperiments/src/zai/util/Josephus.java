package zai.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;


public class Josephus {
	
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        String[] intsStr = line.split(" ");

        if (!(intsStr.length==2)){
        	System.exit(0);
        }

        int n = Integer.parseInt(intsStr[0]);
        int interval = Integer.parseInt(intsStr[1]);
        		
        LinkedList<Integer> q = new LinkedList<Integer>();
        
        for (int i=0;i<n;i++){
        	q.addLast(i);
        }
        
        Iterator<Integer> iter = q.iterator();
        n--;
        Integer kill = null;
        while(n>=0){
        	for (int i=0;i<interval;i++){
        		if (!(iter.hasNext()))
        			iter = q.iterator();
        		kill = iter.next();
        	}
    		System.out.println(kill.intValue());
    		iter.remove();
    		n--;
        }
    }
    


}
