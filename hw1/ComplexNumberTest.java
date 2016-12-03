import org.junit.Before; 
import org.junit.Test;
import static org.junit.Assert.*;

/**
* Class that tests the class ComplexNumber
*/
public class ComplexNumberTest
{
	private ComplexNumber complexNumber;
	private ComplexNumber complexNumberTwoZeros;
	private ComplexNumber complexNumberDecimal;
	private ComplexNumber complexNumberOneZero;
	private ComplexNumber complexNumberNegative;
	
	/*
	 * Sets up five instances of class ComplexNumber,
	 * with complexNumber as the constant complex number.
	 */
	@Before
	public void setUp() {
		complexNumber = new ComplexNumber(3, 17);
		complexNumberTwoZeros = new ComplexNumber(0, 0);
		complexNumberDecimal = new ComplexNumber(1.75f, 4.09f);
		complexNumberOneZero = new ComplexNumber(5.99f, 0);
		complexNumberNegative = new ComplexNumber(-6.66f, -17.77f);
	} // end method setup
	
	/**
	 * Tests the add method of class ComplexNumber
	 *
	 * @author Ernest Carter
	 */
	@Test
	public void testAdd() {
		assertEquals( complexNumber.add(complexNumberTwoZeros), "3.0 + 17.0i");
		assertEquals( complexNumber.add(complexNumberDecimal), "4.75 + 21.09i");
		assertEquals( complexNumber.add(complexNumberOneZero), "8.99 + 17.0i");
		assertEquals( complexNumber.add(complexNumberNegative), "-3.6599998 - 0.77000046i");
	} // end method testAdd
	
	/**
	 * Tests the subtract method of class ComplexNumber
	 */
	public void testSubtract() {
		assertEquals( complexNumber.subtract(complexNumberTwoZeros), "3.0 + 17.0i");
		assertEquals( complexNumber.subtract(complexNumberDecimal), "1.25 + 12.91i");
		assertEquals( complexNumber.subtract(complexNumberOneZero), "-2.9899998 + 17.0i");
		assertEquals( complexNumber.subtract(complexNumberNegative), "9.66 - 34.77i");
	} // end method testSubtract
	
	/**
	 * Tests the multiply method of class ComplexNumber
	 */
	public void testMultiply() {
		assertEquals( complexNumber.multiply(complexNumberTwoZeros), "0.0 + 0.0i");
		assertEquals( complexNumber.multiply(complexNumberDecimal), "-64.28 + 42.02");
		assertEquals( complexNumber.multiply(complexNumberOneZero), "17.97 + 101.829994i");
		assertEquals( complexNumber.multiply(complexNumberNegative), "282.11 - 166.53i");
	} // end method testMultiply
	
	/**
	 * Tests the divide method of class ComplexNumber
	 */
	public void testDivide() {
		assertEquals( complexNumber.divide(complexNumberTwoZeros), "Cannot divide by zero");
		assertEquals( complexNumber.divide(complexNumberDecimal), "3.778561 + 0.8832475i");
		assertEquals( complexNumber.divide(complexNumberOneZero), "Cannot divide by zero");
		assertEquals( complexNumber.divide(complexNumberNegative), "-0.89432965 - 0.16635728i");
	} // end method testDivide
} // end class ComplexNumberTest