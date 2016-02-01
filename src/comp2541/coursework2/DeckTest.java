package comp2541.coursework2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeckTest {
	
	@Test public void testCreation()
	{
		//check that a 52 card deck is created
		Deck testDeck = new Deck();
		int deckSize = testDeck.size();
		
		assertEquals("Cards:", 52, deckSize);
		
	}
	  
	@Test public  void testContains()
	{
		// check that the contains method works
	}
	
	@Test public void testDeal()
	{
		//check deal removes the expected card and reduces the size of the deck
	}
	
	@Test public void testAdd()
	{
		//Check that adding a card succeeds when the card is not already present in the deck
	}
	
	@Test public void testFailedAdd()
	{
		//to check that dding a card fails by throwing IllegalArgumentException
		//when the cards already in the deck
	}

}
