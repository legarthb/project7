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
	}
}
