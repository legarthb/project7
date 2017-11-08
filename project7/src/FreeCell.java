

import java.util.*;
/**
 * Free cell in a free cell game
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
public class FreeCell implements Cell{
 
	private ArrayList<Card> cardStack = new ArrayList<Card>();
	private Card topCard;
 
	/**
	 * checks to see if a card can be added to the free cell
	 * @param card being added
	 * @return if it was added
	 */
	public boolean addCard(Card card) {
		if (this.isEmpty() == true) {
			cardStack.add(card);
			this.topCard = card;
			return true;
		}
		else
			System.out.println("Only one card in a free cell");
			return false;
	}
	/**
	 * removes the top card from the freecell
	 */
	public void remove() {
		if (this.isEmpty() == false) {
			cardStack.remove(this.cardStack.size() - 1);
			topCard = null;
		}
	}
	
	/**
	 * checks to see if the cardstack is empty
	 * @return if the card stack is empty
	 */
	public boolean isEmpty() {
		return (this.cardStack.size() == 0);
	}
	/**
	 * Returns the card in the free cell
	 * @return top card of free cell
	 */
	public Card peek() {
		return topCard;
	}
	/**
	 * Returns a string rep of the free cell
	 * @return string representation
	 */
	public String toString() {
		if (this.isEmpty())
			return "";
		else
			return this.topCard.toString();
	}
}