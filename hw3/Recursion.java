/**
* A class that uses recursion.
*
* @author Ernest Carter
* @version 28 September 2016
*/

public class Recursion implements Comparable
{
	/**
	 * Compares two strings by unicode value and
	 * returns and integer. Returns an integer less than zero
	 * if first string comes before second.
	 * Returns zero if they're the same.
	 * Returns an integer less than zero if
	 * first string comes after second.
	 */
	public static int compareTo(String s1, String s2) 
	{
		result = s1.compareTo(s2);
		index = 1;
		
		if (result == 0) {
			compareTo(s1.substring(index), s2.substring(index));
			index++;
		}
		else {
			return result;
		}
	} // end method compareTo
	
	/**
	 * Compares an ArrayList of strings using compareTo method.
	 * Returns string that's first when ordered.
	 */
	public static String findMinimum(ArrayList<String> stringArray)
	{
		
		result = compareTo(stringArray[0], stringArray[1]);
		
		if (result <= 0) {
			if (stringArray.length() == 2) {
			return stringArray[0];
			}
			else {
			stringArray.remove(1);
			findMinimum(stringArray);
			}
			
		}
		if (result > 0) {
			if (stringArray.length() == 2) {
				return stringArray[1];
			}
			else {
			stringArray.remove(0);
			findMinimum(stringArray);
			}
		}
	} // end findMinimum method
}