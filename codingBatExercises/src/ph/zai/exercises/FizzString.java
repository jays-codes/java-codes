package ph.zai.exercises;

public class FizzString {

	/*
	 * Given a string str, if the string starts with "f" return "Fizz". If the
	 * string ends with "b" return "Buzz". If both the "f" and "b" conditions
	 * are true, return "FizzBuzz". In all other cases, return the string
	 * unchanged.
	 */

	public String fizzString(String string) {
		String result = "";
		char begin = string.charAt(0);
		char end = string.charAt(string.length()-1);
		
		if (begin!='f' && end!='b') return string; 
		
		if (string.charAt(0)=='f')
			result = "Fizz";
		if (string.charAt(string.length()-1)=='b') 
			result = result + "Buzz";
		
		return result;
	}

}
