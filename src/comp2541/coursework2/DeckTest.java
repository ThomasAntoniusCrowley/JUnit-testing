package comp2541.coursework2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class DeckTest 
{
	
private Deck testDeck;	
private int deckSize;

	@Test public void testCreation()
	{
		//check that a 52 card deck is created
		testDeck = new Deck();
		deckSize = testDeck.size();
		
		assertEquals("Cards:", 52, deckSize);
		
	}
	  
	@Test public  void testContains()
	{
		// check that the contains method works
		List<Card> cards = new ArrayList<Card>();
		Card aceClubs = new Card("AC");
		Card twoClubs = new Card("2C");
		cards.add(aceClubs);
		
	//	boolean T = contains(aceClubs);
	}
	
	@Test public void testDeal()
	{
		//check deal removes the expected card and reduces the size of the deck
		testDeck = new Deck();
		deckSize = testDeck.size();
		testDeck.deal();
		int newSize = testDeck.size();
		int diff = deckSize - newSize;
		
		assertEquals("Difference:", 1, diff);
		
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
