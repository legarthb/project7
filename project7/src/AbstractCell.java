
import java.util.*;

public abstract class AbstractCell implements Cell{
	private ArrayList<Card> cardStack = new ArrayList<Card>();
	private Card topCard;
	
	public AbstractCell() {;
		topCard = null;
	}
	
	/**
	 * returns an iterator that will iterate through the array list
	 * @return iterator that is made
	 */
	public Iterator<Card> iterator(){
		return new Iterator<Card>(){
			private int position;
			private List<Card> items = cardStack;
			public boolean hasNext() {
				return position != items.size();
			}
			public Card next() {
				if (! hasNext()) throw new NoSuchElementException();
				return items.get(position++);
			}
		};
	}
	/**
	 * This will be implemented in each class
	 * @param c card that is being added
	 * @return if the card can be added
	 */
	public abstract boolean canAddCard(Card c);
	
	/**
	 * removes the top card from the free cell
	 */
	public void remove() {
		if (! this.isEmpty()) {
			topCard = null;
			cardStack.remove(cardStack.size() - 1);
		}
	}
	
	/**
	 * Adds the card to the stack
	 * @param c card added
	 */
	public void add(Card c) {
		cardStack.add(c);
		topCard = c;
	}
	
	/**
	 * checks to see if the card stack is empty
	 * @return if the card stack is empty
	 */
	public boolean isEmpty() {
		return (cardStack.size() == 0);
	}
	
	/**
	 * Returns the card in the free cell
	 * @return top card of free cell
	 */
	public Card peek() {
		return topCard;
	}
	
	/**
	 * Returns a string representation of the free cell
	 * @return string representation
	 */
	public String toString() {
		String cards = "";
		if (! this.isEmpty()){
			for (Card c : cardStack) {
				cards += c.toString() + "\n";
			}
		}
		return cards;
	}
}
