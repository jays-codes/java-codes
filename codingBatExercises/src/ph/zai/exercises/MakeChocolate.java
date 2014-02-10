package ph.zai.exercises;

public class MakeChocolate {
	/*
	 * We want make a package of goal kilos of chocolate. We have small bars (1
	 * kilo each) and big bars (5 kilos each). Return the number of small bars
	 * to use, assuming we always use big bars before small bars. Return -1 if
	 * it can't be done.
	 */
	public int makeChocolate(int small, int big, int goal) {
		int bigKgs = big * 5;
		int smlKgs = -1;
		
		if (bigKgs==goal) return 0;
		
		if (goal<big) {
			return small >= goal ? goal : -1;
		}
		
		if (bigKgs<goal) {
			smlKgs = goal-bigKgs; 
		} else {
			smlKgs = goal%5;
		} 
		
		return small >= smlKgs ? smlKgs : -1;		
	}

}
