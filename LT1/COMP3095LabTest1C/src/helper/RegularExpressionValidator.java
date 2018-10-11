package helper;

import java.util.Random;

//COMP3095

//Neel Patel - 101093829

public class RegularExpressionValidator {

	public static boolean isValidPostalCode(String str) {
		String p = "^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$";
		return (str.matches(p));
	}

	public static boolean isEmail(String str) {
		String p = "^[A-Za-z0-9+_.-]+@(.+)$";
		return (str.matches(p));
	}

	public static String getRandomNumberString() {
		// It will generate 6 digit random Number.
		// from 0 to 999999
		Random rnd = new Random();
		int number = rnd.nextInt(999999);

		// this will convert any number sequence into 6 character.
		return String.format("%06d", number);
	}
}
