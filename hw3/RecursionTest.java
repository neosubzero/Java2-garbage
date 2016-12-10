import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.*;

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
	
	private String lettersAdd;
	private String numbersAdd;
	private String symbolsAdd;
	private String mixtureAdd;
	private String capitalAdd;
	private String spaceAdd;
	private String emptyAdd;
	//Class to test
	Recursion Recursion;
	
	//ArrayList to test
	ArrayList<String> stringList;
	
	/**
	 * Initializes test fixtures before each test is run
	 */
	@Before
	public void setUp() {
		letters = "flyingpenguin";
		numbers = "9000";
		symbols = new String("#@$&");
		mixture = new String("Tr!gg3r3d");
		capital = new String("OVERNINETHOUSANDDDDDDDDDDDD");
		space = new String("     ");
		empty = new String("");
		
		lettersAdd = new String("dungeon");
		numbersAdd = new String("9001");
		symbolsAdd = new String("&$@#");
		mixtureAdd = new String("R$E4%F%4");
		capitalAdd = new String("OOOOOVVVVVAAAALLllLL");
		spaceAdd = new String("  ");
		stringList = new ArrayList<String>();
		stringList.add(letters);
		stringList.add(numbers);
		stringList.add(symbols);
		stringList.add(mixture);
		stringList.add(capital);
		stringList.add(space);
		stringList.add(empty);
	} // end setUp method
	 
	 /**
	  * Tests the <code>compareTo</code> method of <code>Recursion</code>.
	  */
	  @Test
	  public void test_compareTo() 
	  {
		assertTrue(Recursion.compareTo(letters, numbers) > 0);
		assertTrue(Recursion.compareTo(letters, symbols) > 0);
		assertTrue(Recursion.compareTo(letters, mixture) > 0);
		assertTrue(Recursion.compareTo(letters, capital) < 0);
		assertTrue(Recursion.compareTo(letters, space) > 0);
		assertTrue(Recursion.compareTo(letters, empty) > 0);
		assertTrue(Recursion.compareTo(letters, letters) == 0);
		assertTrue(Recursion.compareTo(numbers, symbols) > 0);
		assertTrue(Recursion.compareTo(numbers, mixture) < 0);
		assertTrue(Recursion.compareTo(numbers, capital) < 0);
		assertTrue(Recursion.compareTo(numbers, space) > 0);
		assertTrue(Recursion.compareTo(numbers, empty) < 0);
		assertTrue(Recursion.compareTo(numbers, numbers) == 0);
		assertTrue(Recursion.compareTo(symbols, mixture) < 0);
		assertTrue(Recursion.compareTo(symbols, capital) < 0);
		assertTrue(Recursion.compareTo(symbols, space) > 0);
		assertTrue(Recursion.compareTo(symbols, empty) > 0);
		assertTrue(Recursion.compareTo(symbols, symbols) == 0);
		assertTrue(Recursion.compareTo(mixture, capital) > 0);
		assertTrue(Recursion.compareTo(mixture, space) > 0);
		assertTrue(Recursion.compareTo(mixture, empty) > 0);
		assertTrue(Recursion.compareTo(mixture, mixture) == 0);
		assertTrue(Recursion.compareTo(capital, space) > 0);
		assertTrue(Recursion.compareTo(capital, empty) > 0);
		assertTrue(Recursion.compareTo(capital, capital) == 0);
		assertTrue(Recursion.compareTo(space, empty) > 0);
		assertTrue(Recursion.compareTo(space, space) == 0);
		assertTrue(Recursion.compareTo(empty, empty) == 0);
	  } // end method test_compareTo
	  
	  /**
	   * Tests the <code>findMinimum</code> method of <code>Recursion</code>.
	   */
	   @Test
	   public void test_findMinimum()
	   {
		   assertTrue(Recursion.findMinimum(stringList).equals(empty));
	   } // end method test_findMinimum
} // end class RecursionTest