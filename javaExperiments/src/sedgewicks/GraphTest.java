package sedgewicks;

import sedgewicks.stdlib.StdDraw;
import sedgewicks.stdlib.StdRandom;

public class GraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 50;
		double[] a = new double[N];
		for (int i = 0; i < N; i++)
		   a[i] = StdRandom.random();
		for (int i = 0; i < N; i++)
		{
		   double x = 1.0*i/N;
		   double y = a[i]/2.0;
		   double rw = 0.5/N;
		   double rh = a[i]/2.0;
		   StdDraw.filledRectangle(x, y, rw, rh);
	
		}
	}
}