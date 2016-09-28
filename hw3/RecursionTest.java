import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/* *
 * A class that tests methods for class <code>Recursion</code>.
 *
 * @author Ernest Carter
 * @version 28 September 2016
 */
public class RecursionTest
{
	//Strings to test
	private String letters;
	private String numbers;
	private String symbols;
	private String mixture;
	private String capital;
	private String space;
	private String empty;
	
	//Class to test
	Recursion recursion;
	
	//ArrayList to test
	ArrayList<String> stringList;
	
	/**
	 * Initializes test fixtures before each test is run
	 */
	 @Before
	 public void setUp() 
	 [
		String letters = new String("flyingpenguin");
		String numbers = new String("9000");
		String symbols = new String("#@$&");
		String mixture = new String("Tr!gg3r3d");
		String capital = new String("OVERNINETHOUSANDDDDDDDDDDDD");
		String space = new String("     ");
		String empty = new String("");
		stringList = new ArrayList<String>(letters, numbers, symbols, mixture, capital, space, empty);
	 ] // end setUp method
	 
	 /**
	  * Tests the <code>compareTo</code> method of <code>Recursion</code>.
	  */
	  @Test
	  public void test_compareTo() 
	  {
		assertTrue(recursion.compareTo(letters, numbers) > 0);
		assertTrue(recursion.compareTo(letters, symbols) > 0);
		assertTrue(recursion.compareTo(letters, mixture) > 0);
		assertTrue(recursion.compareTo(letters, capital) > 0);
		assertTrue(recursion.compareTo(letters, space) > 0);
		assertTrue(recursion.compareTo(letters, empty) > 0);
		assertTrue(recursion.compareTo(letters, letters) == 0);
		assertTrue(recursion.compareTo(numbers, symbols) > 0);
		assertTrue(recursion.compareTo(numbers, mixture) < 0);
		assertTrue(recursion.compareTo(numbers, capital) < 0);
		assertTrue(recursion.compareTo(numbers, space) < 0);
		assertTrue(recursion.compareTo(numbers, empty) > 0);
		assertTrue(recursion.compareTo(numbers, numbers) == 0);
		assertTrue(recursion.compareTo(symbols, mixture) < 0);
		assertTrue(recursion.compareTo(symbols, capital) < 0);
		assertTrue(recursion.compareTo(symbols, space) > 0);
		assertTrue(recursion.compareTo(symbols, empty) > 0);
		assertTrue(recursion.compareTo(symbols, symbols) == 0);
		assertTrue(recursion.compareTo(mixture, capital) > 0);
		assertTrue(recursion.compareTo(mixture, space) > 0);
		assertTrue(recursion.compareTo(mixture, empty) > 0);
		assertTrue(recursion.compareTo(mixture, mixture) == 0);
		assertTrue(recursion.compareTo(capital, space) > 0);
		assertTrue(recursion.compareTo(capital, empty) > 0);
		assertTrue(recursion.compareTo(capital, capital) == 0);
		assertTrue(recursion.compareTo(space, empty) > 0);
		assertTrue(recursion.compareTo(space, space) == 0);
		assertTrue(recursion.compareTo(empty, empty) == 0);
	  } // end method test_compareTo
	  
	  /**
	   * Tests the <code>findMinimum</code> method of <code>Recursion</code>.
	   */
	   @Test
	   public void test_findMinimum()
	   {
		   assertTrue(recursion.findMinimum(stringList).equals(empty));
	   } // end method test_findMinimum
}