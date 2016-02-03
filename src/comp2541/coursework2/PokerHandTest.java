package comp2541.coursework2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PokerHandTest {

private PokerHand testHand;

private Card aceClubs;
private Card twoClubs;
private Card twoDiamonds;
private Card jackHearts;
private Card kingSpades;
private Card tenHearts;

@Before public void setUp()
{
	testHand = new PokerHand();
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
		testHand.pokerAdd(aceClubs);
		testHand.pokerAdd(twoClubs);
		testHand.pokerAdd(twoDiamonds);
		testHand.pokerAdd(jackHearts);
		testHand.pokerAdd(tenHearts);
		testHand.pokerAdd(kingSpades);
		
		
	}
	
	@Test
	public void emptyStringTest()
	{
		//System.out.println(testHand.toString());
		assertEquals("EmptyHand:", "<empty>", testHand.toString());	
	} 
	
	@Test
	public void stringTest()
	{
		testHand.pokerAdd(aceClubs);
		testHand.pokerAdd(twoClubs);
		testHand.pokerAdd(twoDiamonds);
		System.out.println(testHand.toString());
		assertEquals("three cards:", "AC, 2C, 2D", testHand.toString());
	}
	@Test
	public void flushTest()
	{
		//check the isFlush method works
	
	}
	
	@Test
	public void threeOfKindTest()
	{
		
	}
	
	
}
