<<<<<<< HEAD
import java.util.*;

public abstract class AbstractCell implements Cell<Card>{
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
			cardStack.remove(cardStack.size() - 1);
			topCard = null;
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
=======
import java.util.ArrayList;
import java.util.Iterator;

public abstract class AbstractCell implements Cell {
	
	private ArrayList<Card> cardStack = new ArrayList<Card>();
	private Card topCard;

	abstract public boolean addCard(Card c);
	
	public Card remove() {
	    
    		if (cardStack.size() > 1) {
    			topCard = cardStack.get(cardStack.size()-2);
    			return cardStack.remove(cardStack.size()-1);
    		}
    		else {
    			topCard = null;
    			return cardStack.remove(cardStack.size()-1);
    		}
	}
	
	public boolean isEmpty() {
		return cardStack.size() == 0;
	}

	abstract public boolean canAddFromCell(Cell cell);
	
	public void AddFromCell(Cell cell) {
		if (this.canAddFromCell(cell)){
			this.addCard(cell.remove());
		}
	}

	public Card peek() {
		return topCard;
	}
	
	public int size() {
		return cardStack.size();
	}
	
	public Card get(int i) {
		if ((i>cardStack.size()-1) ||(i<0)) 
			throw new ArrayIndexOutOfBoundsException("There is no card at the specified position");
		else
			return cardStack.get(i);
				
	}
	

	public Card remove(int i) {
		if ((i>cardStack.size()-1) ||(i<0)) 
			throw new ArrayIndexOutOfBoundsException("There is no card at the specified position");
		
		else
			return cardStack.remove(i);
	}
	
	abstract public boolean inOrder();
	abstract public Iterator<Card> iterator();
	

	public String toString() {
		String result = "";
        for (Card element:cardStack) {
        		result += element.toString()+"\n";
        }
        return result;
>>>>>>> branch 'master' of https://github.com/legarthb/project7.git
	}
}
