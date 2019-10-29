package mvn.wemanity.project;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for TranslationFooBar.
 */
public class TranslationFooBarTest extends TestCase {
	
	/**
	 * Test de PrintFooBar
	 * Regroupe les méthodes isNumber, Divisible et ContainsNumber.
	 * Affiche la traduction du nombre.
	 */
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
		
		assertEquals("1", TranslationFooBar.printFooBar("1"));
		assertEquals("2", TranslationFooBar.printFooBar("2"));
		assertEquals("FooFoo", TranslationFooBar.printFooBar("3"));
		assertEquals("4", TranslationFooBar.printFooBar("4"));
		assertEquals("BarBar", TranslationFooBar.printFooBar("5"));
		assertEquals("Foo", TranslationFooBar.printFooBar("6"));
		assertEquals("QixQix", TranslationFooBar.printFooBar("7"));
		assertEquals("8", TranslationFooBar.printFooBar("8"));
		assertEquals("Foo", TranslationFooBar.printFooBar("9"));
		assertEquals("Bar*", TranslationFooBar.printFooBar("10"));
		assertEquals("Foo", TranslationFooBar.printFooBar("13"));
		assertEquals("FooBarBar", TranslationFooBar.printFooBar("15"));
		assertEquals("FooQix", TranslationFooBar.printFooBar("21"));
		assertEquals("FooFooFoo", TranslationFooBar.printFooBar("33"));
		assertEquals("FooBar", TranslationFooBar.printFooBar("51"));
		assertEquals("BarFoo", TranslationFooBar.printFooBar("53"));
		assertEquals("1*1", TranslationFooBar.printFooBar("101"));
		assertEquals("FooFoo*Foo", TranslationFooBar.printFooBar("303"));
		assertEquals("FooBarQix*Bar", TranslationFooBar.printFooBar("105"));
		assertEquals("FooQix**", TranslationFooBar.printFooBar("10101"));
	}
	
	
	
	/**
	 * Test de isNumber. 
	 * Comme la méthode est privée, le code est commenté car ne peut pas être exécuté.
	 * Il sert seulement lors du développement.
	 */
//	public void testIsNumber() {
//		assertTrue(TranslationFooBar.isNumber("1"));
//		assertTrue(TranslationFooBar.isNumber("35"));
//		assertFalse(TranslationFooBar.isNumber("3,5"));
//		assertFalse(TranslationFooBar.isNumber("3.5"));
//		assertFalse(TranslationFooBar.isNumber("azerty"));
//		assertFalse(TranslationFooBar.isNumber(""));
//	}
	
	/**
	 * Test de isDivisible. 
	 * Comme la méthode est privée, le code est commenté car ne peut pas être exécuté.
	 * Il sert seulement lors du développement.
	 */
//	public void testIsDivisible() {
//		assertTrue(TranslationFooBar.isDivisible("3"));
//		assertTrue(TranslationFooBar.isDivisible("35"));
//		assertFalse(TranslationFooBar.isDivisible("4"));
//		assertFalse(TranslationFooBar.isDivisible("52"));
//	}

	/**
	 * Test de containsNumber. 
	 * Comme la méthode est privée, le code est commenté car ne peut pas être exécuté.
	 * Il sert seulement lors du développement.
	 */
//	public void testContainsNumber() {
//		assertTrue(TranslationFooBar.isDivisible("3"));
//		assertTrue(TranslationFooBar.isDivisible("35"));
//		assertFalse(TranslationFooBar.isDivisible("4"));
//		assertFalse(TranslationFooBar.isDivisible("52"));
//	}
	
	
	
	
	/**
	 * Test de translateNumbers. 
	 * Comme la méthode est privée, le code est commenté car ne peut pas être exécuté.
	 * Il sert seulement lors du développement.
	 */
//	public void testTranslateNumbers() {
//		assertEquals("", TranslationFooBar.translateNumbers("1"));
//		assertEquals("Foo", TranslationFooBar.translateNumbers("3"));
//		assertEquals("Bar", TranslationFooBar.translateNumbers("5"));
//		assertEquals("Qix", TranslationFooBar.translateNumbers("7"));
//		assertEquals("Bar", TranslationFooBar.translateNumbers("15"));
//		assertEquals("", TranslationFooBar.translateNumbers("21"));
//		assertEquals("FooFoo", TranslationFooBar.translateNumbers("33"));
//		assertEquals("BarFoo", TranslationFooBar.translateNumbers("53"));
//	}
	
	/**
	 * Test de divisible. 
	 * Comme la méthode est privée, le code est commenté car ne peut pas être exécuté.
	 * Il sert seulement lors du développement.
	 */
//	public void testDivisible() {
//		assertEquals("", TranslationFooBar.divisible("1"));
//		assertEquals("Foo", TranslationFooBar.divisible("3"));
//		assertEquals("Bar", TranslationFooBar.divisible("5"));
//		assertEquals("Qix", TranslationFooBar.divisible("7"));
//		assertEquals("FooBar", TranslationFooBar.divisible("15"));
//		assertEquals("FooQix", TranslationFooBar.divisible("21"));
//		assertEquals("Foo", TranslationFooBar.divisible("33"));
//	}
	
	/**
	 * Test de replaceZero. 
	 * Comme la méthode est privée, le code est commenté car ne peut pas être exécuté.
	 * Il sert seulement lors du développement.
	 */
//	public void testReplaceZero() {
//		assertEquals("1", TranslationFooBar.replaceZero("1"));
//		assertEquals("1*", TranslationFooBar.replaceZero("10"));
//		assertEquals("1**1", TranslationFooBar.replaceZero("1001"));
//	}
	
}
