package comp2541.coursework2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PokerHandTest {

private List<Card> testHand;

private Card aceClubs;
private Card twoClubs;
private Card twoDiamonds;
private Card jackHearts;
private Card kingSpades;
private Card tenHearts;

@Before public void setUp()
{
	testHand = new ArrayList<Card>();
  aceClubs = new Card("AC");
  twoClubs = new Card("2C");
  twoDiamonds = new Card("2D");
  jackHearts = new Card("JH");
  kingSpades = new Card("KS");
  tenHearts = new Card("TH");
}

	@Test(expected=IllegalArgumentException.class)
	public void sizeTest()
	{
		//check that only 5 cards can be held in a hand 
		// at any time
		testHand.add(aceClubs);
		testHand.add(twoClubs);
		testHand.add(twoDiamonds);
		testHand.add(jackHearts);
		testHand.add(tenHearts);
		testHand.add(kingSpades);
		
		
	}
	
	@Test
	public void toStringTest()
	{
		//check the to string method works
		
		assertEquals("Empty hand:", "<Empty>", testHand.toString());
		System.out.println("Empty hand?: ");
		System.out.println(testHand.toString());
		testHand.add(aceClubs);
		testHand.add(twoClubs);
		testHand.add(twoDiamonds);
		
		assertEquals("Empty hand:", "AC 2C 2D", testHand.toString());
		System.out.println("full card");
		System.out.println(testHand.toString());
	}
	
	@Test
	public void flushTest()
	{
		//check the isFkush method works
	
	}
	
	
}
