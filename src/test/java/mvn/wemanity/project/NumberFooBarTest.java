package mvn.wemanity.project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for NumberFooBarTest.
 */
public class NumberFooBarTest extends TestCase {
	
	public void testPrintFooBar() {
//		1  => 1
//		2  => 2
//		3  => FooFoo (divisible by 3, contains 3)
//		4  => 4
//		5  => BarBar (divisible by 5, contains 5)
//		6  => Foo (divisible by 3)
//		7  => QixQix (divisible by 7, contains 7)
//		8  => 8
//		9  => Foo
//		10 => Bar
//		13 => Foo
//		15 => FooBarBar (divisible by 3, divisible by 5, contains 5)
//		21 => FooQix
//		33 => FooFooFoo (divisible by 3, contains two 3)
//		51 => FooBar
//		53 => BarFoo
		
		assertEquals("1", new NumberFooBar("1").printFooBar());
		assertEquals("2", new NumberFooBar("2").printFooBar());
		assertEquals("FooFoo", new NumberFooBar("3").printFooBar());
		assertEquals("4", new NumberFooBar("4").printFooBar());
		assertEquals("BarBar", new NumberFooBar("5").printFooBar());
		assertEquals("Foo", new NumberFooBar("6").printFooBar());
		assertEquals("QixQix", new NumberFooBar("7").printFooBar());
		assertEquals("8", new NumberFooBar("8").printFooBar());
		assertEquals("Foo", new NumberFooBar("9").printFooBar());
		assertEquals("Bar", new NumberFooBar("10").printFooBar());
		assertEquals("Foo", new NumberFooBar("13").printFooBar());
		assertEquals("FooBarBar", new NumberFooBar("15").printFooBar());
		assertEquals("FooQix", new NumberFooBar("21").printFooBar());
		assertEquals("FooFooFoo", new NumberFooBar("33").printFooBar());
		assertEquals("FooBar", new NumberFooBar("51").printFooBar());
		assertEquals("BarFoo", new NumberFooBar("53").printFooBar());
	}
	
}
