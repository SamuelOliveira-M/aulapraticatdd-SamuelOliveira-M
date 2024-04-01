import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {
	@Test
	public void testMultiplication() {
		Mony five = Mony.dollar(5);
		assertEquals(Mony.dollar(10), five.times(2));
		assertEquals(Mony.dollar(15), five.times(3));
		assertTrue(Mony.franc(5).equals(Mony.franc(5)));
		assertFalse(Mony.franc(5).equals(Mony.franc(6)));
		assertFalse(Mony.franc(5).equals(Mony.dollar(5)));
	}

	@Test
	public void testEquality() {
		assertTrue(Mony.dollar(5).equals(Mony.dollar(5))); 
		assertFalse(Mony.dollar(5).equals(Mony.dollar(6)));
		assertFalse(Mony.franc(5).equals(Mony.dollar(5)));
  	}

	@Test
	public void testCurrency() {
		assertEquals("USD", Mony.dollar(1).currency());
		assertEquals("CHF", Mony.franc(1).currency());
	}
}