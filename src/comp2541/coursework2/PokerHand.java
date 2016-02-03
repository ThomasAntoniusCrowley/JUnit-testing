package comp2541.coursework2;

import java.util.ArrayList;
import java.util.List;


public class PokerHand extends CardCollection
{
	//create poker hand array
	protected List<Card> pokerHand = new ArrayList<Card>();

	 public void add(Card card)
	  {
	    if (contains(card)) {
	      throw new IllegalArgumentException("card already present");
	    }
	    if (pokerHand.size()<5)
	    {
	    	cards.add(card);
	    }
	    else
	    {
	    	throw new IllegalArgumentException("Hand is full");
	    }
	  }

  
}
  
