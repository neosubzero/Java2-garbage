/**
 * Class that takes two floats as part of a complex number.
 * another instaance of the class with it's own floats. 
 * and adds, subtracts, multiplies, or divides the sets.
 *
 * @author Ernest Carter
 */
public class ComplexNumber
{
	// first float of the complex number
	private float a;
	// second float of the complex number
	private float b;
	
	/**
	 * Assign the intance variable's of ComplexNumber
	 * @param a first float of the complex number
	 * @param b second float of the complex number
	 */
	public ComplexNumber(float a, float b) {
		this.a = a;
		this.b = b;
	} // end constructor
	
	/**
	 * Adds two complex numbers
	 *
	 * @param otherNumber second complex number
	 * @return sum as a String
	 */
	public String add(ComplexNumber otherNumber) {
		ComplexNumber newComplexNumber;
		float newA = this.a + otherNumber.getA();
		float newB = this.b + otherNumber.getB();
		newComplexNumber = new ComplexNumber(newA, newB);
		return toString(newComplexNumber);
	} // end add method
	
	/**
	 * Subtracts two complex numbers
	 *
	 * @param otherNumber second complex number
	 * @return difference as a String
	 */
	public String subtract(ComplexNumber otherNumber) {
		ComplexNumber newComplexNumber;
		float newA = this.a - otherNumber.getA();
		float newB = this.b - otherNumber.getB();
		newComplexNumber = new ComplexNumber(newA, newB);
		return toString(newComplexNumber);
	} // end subtract method
	
	/**
	 * Multplies two complex numbers
	 *
	 * @param otherNumber second complex number
	 * @return product as a String
	 */
	public String multiply(ComplexNumber otherNumber) {
		ComplexNumber newComplexNumber;
		float newA = (this.a * otherNumber.getA()) - (this.b * otherNumber.getB());
		float newB = (this.b * otherNumber.getA()) + (this.a * otherNumber.getB());
		newComplexNumber = new ComplexNumber(newA, newB);
		return toString(newComplexNumber);
	} // end multiply method
	
	/**
	 * Divides using two complex numbers.
	 *
	 * @param otherNumber second complex number
	 * @return quotient as a String
	 * @return "Cannot divide by zero" if otherNumber contains a zero
	 */
	public String divide(ComplexNumber otherNumber) {
		ComplexNumber newComplexNumber;
		if ((otherNumber.getA() != 0) && (otherNumber.getB() != 0)) {
			float newA = ((this.a * otherNumber.getA()) + (this.b * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
			float newB = ((this.b * otherNumber.getA()) - (this.a * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
			newComplexNumber = new ComplexNumber(newA, newB);
			return toString(newComplexNumber);
		}
			return "Cannot divide by zero";
	} // end method divide
	
	/**
	 * Query's the first float of ComplexNumber
	 * @return first float of ComplexNumber
	 */
	public float getA() {
		return this.a;
	} // end method getA
	
	/**
	 * Query's the second float of ComplexNumber
	 * @return second float of ComplexNumber
	 */
	public float getB() {
		return this.b;
	} // end method getB
	
	/**
	* @Override
	*/
	public String toString(ComplexNumber stringNumber) {
		String string;
		if (stringNumber.getB() < 0) {
			string = stringNumber.getA() + " - " + (-1 * stringNumber.getB()) + "i";
			return string;
		}
		else {
			string = stringNumber.getA() + " + " + stringNumber.getB() + "i";
			return string;
		}
	} // end toString method
} // end class ComplexNumber