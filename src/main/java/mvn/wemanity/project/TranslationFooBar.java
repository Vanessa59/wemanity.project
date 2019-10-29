package mvn.wemanity.project;

import java.util.regex.Pattern;

/**
 * Class translating a number into a FooBar String. If the number is divisible
 * by 3, write “Foo” instead of the number If the number is divisible by 5, add
 * “Bar” If the number is divisible by 7, add “Qix” For each digit 3, 5, 7, add
 * “Foo”, “Bar”, “Qix” in the digits order.
 * 
 * @author Vanessa M.
 *
 */
public class TranslationFooBar {

	public TranslationFooBar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method that translate the number into the FooBar String
	 * 
	 * @return translation into FooBar
	 */
	public static String printFooBar(String nb) {

		if (isNumber(nb)) {
			String result = divisible(nb) + containsNumber(nb);		
			return result.equals("") ? nb : result;
		} else {
			return "La saisie n'est pas un nombre.";
		}

	}

	/**
	 * Method that verify if the value is a number or not
	 * @param nb
	 * @return true if nb is an integer
	 */
	private static boolean isNumber(String nb) {
		Pattern pattern = Pattern.compile("[0-9]+");
		return pattern.matcher(nb).matches();
	}

	/**
	 * Method that print Foo, Bar or Qix if the number if divisible by 3, 5, or 7.
	 * 
	 * @param nb
	 * @return translation into FooBar
	 */
	private static String divisible(String nb) {
		String res = "";
		Integer nbInt = Integer.parseInt(nb);
		if (nbInt % 3 == 0) {
			res += "Foo";
		}
		if (nbInt % 5 == 0) {
			res += "Bar";
		}
		if (nbInt % 7 == 0) {
			res += "Qix";
		}
		return res;
	}

	/**
	 * Method that print Foo, Bar or Qix if the number if contains by 3, 5, or 7, in
	 * the digits order.
	 * 
	 * @param nb
	 * @return translation into FooBar
	 */
	private static String containsNumber(String nb) {
		String res = "";

		for (int i = 0; i < nb.length(); i++) {
			if (nb.charAt(i) == '3') {
				res += "Foo";
			}
			if (nb.charAt(i) == '5') {
				res += "Bar";
			}
			if (nb.charAt(i) == '7') {
				res += "Qix";
			}
		}

		return res;
	}

}
