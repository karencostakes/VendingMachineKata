package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestCase1 {

	@Test
	public void whenValidCoinInsertedMachineStoresCoin() {
		Coin coin1 = new Coin ();
		assertEquals("5", coin1.insertCoinIntoVending(.84, 5.00));
		
	
	}

	@Test
	public void whenInValidCoinInsertedMachineRejectsCoin() {
		Coin coin1 = new Coin ();
		assertEquals("We do not accept pennies or coins other than dimes, nickles, and quarters", coin1.insertCoinIntoVending(.75, 2.50));
		
	
	}
	
		
	}


