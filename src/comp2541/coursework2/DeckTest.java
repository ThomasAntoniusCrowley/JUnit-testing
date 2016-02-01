package comp2541.coursework2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class DeckTest 
{
	
private Deck testDeck;	
private int deckSize;
private Card aceClubs;
private	Card twoClubs;
private List<Card> testCards;

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
		testCards = new ArrayList<Card>();
		aceClubs = new Card("AC");
		twoClubs = new Card("2C");
		testCards.add(aceClubs);
		assertTrue(testCards.contains(aceClubs));
		assertFalse(testCards.contains(twoClubs));
		
		
	
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
		testCards = new ArrayList<Card>();
		testCards.add(aceClubs);
		
		assertTrue(testCards.contains(aceClubs));
		
		
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFailedAdd()
	{
		//to check that adding a card fails by throwing IllegalArgumentException
		//when the cards already in the deck
		testDeck = new Deck();
		testDeck.add(twoClubs);
	
	}

}
