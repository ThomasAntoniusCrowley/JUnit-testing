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
	 
	 public String toString()
	 {
		 String handString = null;
		
		 if (pokerHand.size()==0)
		 {
			 handString = "<empty>";
		 }
		 else
		 {
			 for (Card c : pokerHand)
			 {
				char cardChar = (char) (c.getRank() + c.getSuit());
				String cardString = String.valueOf(cardChar); 
			     handString += (cardString + " ");
			 }
			 
			 handString = pokerHand.toString();
		 }
		 
		 return handString;
	 }
	 
	 public boolean isFlush()
	 {
		 Card firstCard = pokerHand.get(0);
		 char suit = firstCard.getSuit();
		 int count =0 ;
		 for (Card c : pokerHand)
		 {
			if (suit == c.getSuit())
			{
				count += 1;
			}
			
			
		 }
		 if (count == 5)
		 {
			 return true;
		 }
		 
		 else 
		 {
			 return false;
		 }
	 }

	 public boolean hasThreeOfAKind()
	 {
		 Card firstCard = pokerHand.get(0);
		 char value = firstCard.getRank();
		 int count =0 ;
		 for (Card c : pokerHand)
		 {
			if (value == c.getRank())
			{
				count += 1;
			}
			
			
		 }
		 if (count == 3)
		 {
			 return true;
		 }
		 
		 else 
		 {
			 return false;
		 }
	 }
	 
	 public boolean hasFourOfAKind()
	 {
		 Card firstCard = pokerHand.get(0);
		 char value = firstCard.getRank();
		 int count =0 ;
		 for (Card c : pokerHand)
		 {
			if (value == c.getRank())
			{
				count += 1;
			}
			
			
		 }
		 if (count == 4)
		 {
			 return true;
		 }
		 
		 else 
		 {
			 return false;
		 }
	 }
	 
	 
	 public boolean hasFiveOfAKind()
	 {
		 Card firstCard = pokerHand.get(0);
		 char value = firstCard.getRank();
		 int count =0 ;
		 for (Card c : pokerHand)
		 {
			if (value == c.getRank())
			{
				count += 1;
			}
			
			
		 }
		 if (count == 5)
		 {
			 return true;
		 }
		 
		 else 
		 {
			 return false;
		 }
	 }
	 
	 
	 
}
  
