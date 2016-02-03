package comp2541.coursework2;

import java.util.ArrayList;
import java.util.List;


public class PokerHand extends CardCollection
{
	//create poker hand array
	private List<Card> pokerHand; 

	public PokerHand()
	{
		//constructor to create hand of 5 cards
		pokerHand = new ArrayList<Card>();

	}
	
	 public void pokerAdd(Card card)
	  {
	    if (pokerHand.contains(card)) {
	      throw new IllegalArgumentException("card already present");
	    }
	    if (pokerHand.size()<5)
	    {
	    	pokerHand.add(card);
	    }
	    if (pokerHand.size()==5)
	    {
	    	throw new IllegalArgumentException("Hand is full");
	    }
	  }
	 
	 public String HandToString()
	 {
		 String handString = null;
		 handString += "lool";
		 if (pokerHand.size()==0)
		 {
			 handString = "<empty>";
		 }
		 else
		 {
//			 for (Card s : pokerHand)
//			 {
//				char cardChar = (char) (s.getRank() + s.getSuit());
//				String cardString = String.valueOf(cardChar); 
//			     handString += (cardString + " ");
//			 }
			 
			 handString = pokerHand.toString();
		 }
		 
		 return handString;
	 }

  
}
  
