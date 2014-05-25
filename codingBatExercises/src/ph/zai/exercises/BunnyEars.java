package ph.zai.exercises;

public class BunnyEars {
	public static int countEars(int bunnies){
		if (bunnies==0) return 0;
		return 2 + countEars(bunnies -1);
	}
}
