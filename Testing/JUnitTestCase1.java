package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTestCase1 {

	@Test
	public void whenNickleIsInsertedMachineStoresCoin() {
		Coin coin1 = new Coin ();
		assertEquals("5", coin1.insertCoinIntoVending(.84, 5.00));
		
	
	}

	
	@Test
	public void whenDimeIsInsertedMachineStoresCoin() {
		Coin coin1 = new Coin ();
		assertEquals("10", coin1.insertCoinIntoVending(.71, 2.27));
		
	}
	
	@Test
	public void whenQuarterIsInsertedMachineStoresCoin() {
		Coin coin1 = new Coin ();
		assertEquals("25", coin1.insertCoinIntoVending(.96, 5.67));
		
	}
	
	@Test
	public void whenInValidCoinInsertedMachineRejectsCoin() {
		Coin coin1 = new Coin ();
		assertEquals("We do not accept pennies or coins other than dimes, nickles, and quarters", coin1.insertCoinIntoVending(.75, 2.50));
		
	
	}
	
	@Test
	public void cokeIsSelectedWithExactChange() {
		ProductSelection productSelection1 = new ProductSelection ();
		assertEquals("Here's your ice cold coke", productSelection1.iWantACoke(1.00));
		
	
	}
	@Test
	public void cokeIsSelectedWithExcess() {
		ProductSelection productSelection1 = new ProductSelection ();
		assertEquals("Here's your ice cold coke", productSelection1.iWantACoke(1.15));
		
	
	}
	
	@Test
	public void cokeIsSelectedWithNotEnoughChange() {
		ProductSelection productSelection1 = new ProductSelection ();
		assertEquals("Please enter additional change", productSelection1.iWantACoke(.90));
		
	
	}
	
	@Test
	public void candyIsSelectedWithExactChange() {
		ProductSelection productSelection1 = new ProductSelection ();
		assertEquals("Here's your candy", productSelection1.iWantCandy(.65));
		
	
	}
	@Test
	public void candyIsSelectedWithExcess() {
		ProductSelection productSelection1 = new ProductSelection ();
		assertEquals("Here's your candy", productSelection1.iWantCandy(1.15));
		
	
	}
	
	@Test
	public void candyIsSelectedWithNotEnoughChange() {
		ProductSelection productSelection1 = new ProductSelection ();
		assertEquals("Please enter additional change", productSelection1.iWantCandy(.25));
		
	
	}
	
	
		
	}


