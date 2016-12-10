import java.util.*;

/**
* A class that uses recursion.
*
* @author Ernest Carter
* @version 28 September 2016
*/
public class Recursion
{
	/**
	 * Compares two strings by unicode value and
	 * returns and integer. Returns an integer less than zero
	 * if first string comes before second.
	 * Returns zero if they're the same.
	 * Returns an integer greater than zero if
	 * first string comes after second.
	 */
	public static int compareTo(String s1, String s2) {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-----------------");
	
		s1.toLowerCase();
		s2.toLowerCase();
		if (s1.charAt(0) - s2.charAt(0) == 0) {
			s1.substring(1);
			s2.substring(1);
			return compareTo(s1, s2);
		} 
		return s1.charAt(0) - s2.charAt(0);
	} // end method compareTo
	
	/**
	 * Compares an ArrayList of strings using compareTo method.
	 * @Returns string that's first when ordered alphabetically.
	 */
	public static String findMinimum(ArrayList<String> stringArray) {
		ArrayList<String> arrayCopy = stringArray;
		arrayCopy.trimToSize();
		if (arrayCopy.size() == 1) {
			return arrayCopy.get(0);
		}
		
		int result = compareTo(arrayCopy.get(0), arrayCopy.get(1));
		if (result <= 0) {
			arrayCopy.remove(1);
		}
		else {
			arrayCopy.remove(0);
		}
		
		return findMinimum(arrayCopy);
	} // end findMinimum method
	
}