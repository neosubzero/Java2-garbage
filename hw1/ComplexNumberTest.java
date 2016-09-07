import org.junit.Before; 
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexNumberTest
{
	private ComplexNumber complexNumber;
	private ComplexNumber complexNumberTwoZeros;
	private ComplexNumber complexNumberDecimal;
	private ComplexNumber complexNumberOneZero;
	private ComplexNumber complexNumberNegative;
	
	@Before
	public void setUp() {
		complexNumber = new ComplexNumber(3, 17);
		complexNumberTwoZeros = new ComplexNumber(0, 0);
		complexNumberDecimal = new ComplexNumber(1.75f, 4.09f);
		complexNumberOneZero = new ComplexNumber(5.99f, 0);
		complexNumberNegative = new ComplexNumber(-6.66f, -17.77f);
		
	}
	
	@Test
	public void add() {
		assertTrue( complexNumber.add(complexNumberTwoZeros) == "3 + 17i");
		assertTrue( complexNumber.add(complexNumberDecimal) == "4.75 + 21.09");
		assertTrue( complexNumber.add(complexNumberOneZero) == "8.99 + 17i");
		assertTrue( complexNumber.add(complexNumberNegative) == "-3.66 - 0.77i");
	}
	
	public void subtract() {
		assertTrue( complexNumber.subtract(complexNumberTwoZeros) == "3 + 17i");
		assertTrue( complexNumber.subtract(complexNumberDecimal) == "1.25 + 12.91i");
		assertTrue( complexNumber.subtract(complexNumberOneZero) == "-2.99 + 17i");
		assertTrue( complexNumber.subtract(complexNumberNegative) == "9.66 - 34.77i");
	}
	
	public void multiply() {
		assertTrue( complexNumber.multiply(complexNumberTwoZeros) == "0 + 0i");
		assertTrue( complexNumber.multiply(complexNumberDecimal) == "-64.28 + 42.02");
		assertTrue( complexNumber.multiply(complexNumberOneZero) == "17.97 + 101.83");
		assertTrue( complexNumber.multiply(complexNumberNegative) == "282.11 - 166.53i");
	}
	
	public void divide() {
		assertTrue( complexNumber.add(complexNumberTwoZeros) == "3 + 17i");
		assertTrue( complexNumber.add(complexNumberDecimal) == "3.77856 + 0.883248");
		assertTrue( complexNumber.add(complexNumberOneZero) == "0.500835 + 2.83806i");
		assertTrue( complexNumber.add(complexNumberNegative) == "-0.894320 - 0.166357i");
	}
	

}