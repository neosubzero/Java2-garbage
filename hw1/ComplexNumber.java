public class ComplexNumber
{
	
	private float a;
	private float b;
	
	public ComplexNumber(float a, float b) {
		this.a = a;
		this.b = b;
	}
	
	public String add(ComplexNumber otherNumber) {
		ComplexNumber newComplexNumber;
		float newA = this.a + otherNumber.getA();
		float newB = this.b + otherNumber.getB();
		newComplexNumber = new ComplexNumber(newA, newB);
		return toString(newComplexNumber);
	}
	
	public String subtract(ComplexNumber otherNumber) {
		ComplexNumber newComplexNumber;
		float newA = this.a - otherNumber.getA();
		float newB = this.b - otherNumber.getB();
		newComplexNumber = new ComplexNumber(newA, newB);
		return toString(newComplexNumber);
	}
	
	public String multiply(ComplexNumber otherNumber) {
		ComplexNumber newComplexNumber;
		float newA = (this.a * otherNumber.getA()) - (this.b * otherNumber.getB());
		float newB = (this.b * otherNumber.getA()) + (this.a * otherNumber.getB());
		newComplexNumber = new ComplexNumber(newA, newB);
		return toString(newComplexNumber);
	}
	
	public String divide(ComplexNumber otherNumber) {
		ComplexNumber newComplexNumber;
		float newA = ((this.a * otherNumber.getA()) + (this.b * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
		float newB = ((this.b * otherNumber.getA()) - (this.a * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
		newComplexNumber = new ComplexNumber(newA, newB);
		return toString(newComplexNumber);
	}
	
	public float getA() {
		return this.a;
	}
	public float getB() {
		return this.b;
	}
	
	public String toString(ComplexNumber stringNumber) {
		if (stringNumber.getB() < 0) {
		return stringNumber.getA() + " - " + stringNumber.getB() + "i";
		}
		else {
			return stringNumber.getA() + " + " + stringNumber.getB() + "i";
		}
	}
}