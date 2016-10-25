import org.junit.*; 
import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertTrue; 
import java.util.NoSuchElementException;

/**
 * A JUnit test class for class IteratorTest.
 *
 * @author	Ernest Carter
 * @revised 16 October 2016
 */ 
public class IteratorTest {
	LinkedList<String> stringList;
	String fido;
	String cerberus;
	String krypto;
	String seven;
	String akamaru;
	Iterator<String> iterator;
	 
	 /**
	  * Sets up the test for iterator
	  */
	@Before
	public void setup() {
		stringList = new LinkedList<String>();
		
		fido = new String("Fido");
		cerberus = new String("Cerberus");
		krypto = new String("krypto");
		seven = new String("Seven");
		akamaru = new String("Akamaru");
	 
		stringList.add(fido);
		stringList.add(cerberus);
		stringList.add(krypto);
		stringList.add(seven, 2);
		stringList.add(akamaru, 8);
		
		iterator = stringList.getIterator();
	
	System.out.println(stringList);
	} // end method setup
	
	/**
	 * Tests to see if there's a next node
	 * and move to next node if there is
	 */
	@Test
	public void testHasNextAndNext() {
		assertTrue(iterator.hasNext() == true);
		assertTrue((iterator.next()).equals(fido));
		assertTrue(iterator.hasNext() == true);
		assertTrue((iterator.next()).equals(cerberus));
		assertTrue(iterator.hasNext() == true);
		assertTrue((iterator.next()).equals(seven));
		assertTrue(iterator.hasNext() == true);
		assertTrue((iterator.next()).equals(krypto));
		assertTrue(iterator.hasNext() == false);
		
	} // end method testHasNextAndNext
	
	/**
	 * Tests to see if there's a prior node
	 * and move to prior node if there is
	 */
	public void testHasPriorAndPrior() {
		iterator.setToEnd();
		assertEquals(iterator.hasPrior(), true);
		assertEquals(iterator.prior(), krypto);
		assertEquals(iterator.hasPrior(), true);
		assertEquals(iterator.prior(), seven);
		assertEquals(iterator.hasPrior(), true);
		assertEquals(iterator.prior(), cerberus);
		assertEquals(iterator.hasPrior(), false);
		assertEquals(iterator.prior(), null);
	} // end method testHasPriorAndPrior
} // end class IteratorTest