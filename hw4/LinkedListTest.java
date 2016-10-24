import org.junit.*; 
import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertTrue; 
import java.util.NoSuchElementException;

/**
 * A JUnit test class for class LinkedList.
 *
 * @author	Ernest Carter
 * @revised 16 October 2016
 */ 
public class LinkedListTest {
	LinkedList<String> stringList = new LinkedList<String>();
	String fido;
	String cerberus;
	String krypto;
	String seven;
	String akamaru;
	 
	/**
	 * Sets up the test LinkedList
	 */
	@Before
	public void setup() {
	fido = new String("fido");
	cerberus = new String("Cerberus");
	krypto = new String("krypto");
	seven = new String("Seven");
	akamaru = new String("akamaru");
	 
	stringList.add(fido);
	stringList.add(cerberus);
	stringList.add(krypto);
	stringList.add(seven, 2);
	stringList.add(akamaru, 8);
	} // end method setup
	 
	/**
     * Test to make sure that the correct element is returned
	 */
	@Test
	public void testGet() {
		assertTrue((stringList.get(0)).equals(fido));
		assertTrue((stringList.get(1)).equals(cerberus));
		assertTrue((stringList.get(3)).equals(krypto));
		assertTrue((stringList.get(2)).equals(seven));
	} // end method testGet
	
	/**
	 * Tests to make sure each element is the list
	 */
	@Test
	public void testContains() {
		assertTrue(stringList.contains(fido) == true);
		assertTrue(stringList.contains(cerberus) == true);
		assertTrue(stringList.contains(krypto) == true);
		assertTrue(stringList.contains(seven) == true);
		assertTrue(stringList.contains(akamaru) == false);
	} // end method testContains
	
	/**
	 * Tests to make sure the correct index is returned
	 */
	@Test
	public void testIndexOf() {
		assertTrue(stringList.indexOf(fido) == 0);
		assertTrue(stringList.indexOf(cerberus) == 1);
		assertTrue(stringList.indexOf(seven) == 2);
		assertTrue(stringList.indexOf(krypto) == 3);
		assertTrue(stringList.indexOf(akamaru) == -1);
	} // end method testIndexOf
	 
	 
 }