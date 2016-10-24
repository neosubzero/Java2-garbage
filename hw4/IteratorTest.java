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
	LinkedList<String> stringList = new LinkedList<String>();
	String fido;
	String cerberus;
	String krypto;
	String seven;
	String akamaru;
	Iterator<String> iterator = new Iterator(stringList);
	 
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
	
	System.out.println(stringList);
	System.out.println();
	} // end method setup
	
	@Test
	public void testHasNextAndNext() {
		assertEquals(iterator.hasNext(), true);
		assertEquals(iterator.next(), fido);
		assertEquals(iterator.hasNext(), true);
		assertEquals(iterator.next(), cerberus);
		assertEquals(iterator.hasNext(), true);
		assertEquals(iterator.next(), seven);
		assertEquals(iterator.hasNext(), true);
		assertEquals(iterator.next(), krypto);
		assertEquals(iterator.hasNext(), false);
		
	}
	
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
	}
}