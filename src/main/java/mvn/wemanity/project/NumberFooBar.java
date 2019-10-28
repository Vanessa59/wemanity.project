package mvn.wemanity.project;
/**
 * Class translating a number into a FooBar String.
 * @author Vanessa M.
 *
 */
public class NumberFooBar {
	/**
	 * number to translate into FooBar
	 */
	public String nb;

	public NumberFooBar() {}
	
	public NumberFooBar(String nb) {
		this.nb = nb;
	}
	
	/**
	 * Method that translate the number into the FooBar String
	 * @return translation into FooBar
	 */
	public String printFooBar() {
		// regles métier

//	    If the number is divisible by 3, write “Foo” instead of the number
//	    If the number is divisible by 5, add “Bar”
//	    If the number is divisible by 7, add “Qix”
//	    For each digit 3, 5, 7, add “Foo”, “Bar”, “Qix” in the digits order.
		return nb;
	}
	

}
