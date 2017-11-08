import java.util.ArrayList;

/**
 * Tableau cell in a game of free cell
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
public class Tableau implements Cell {

    private ArrayList<Card> cardStack = new ArrayList<Card>();
    private Card topCard;
    
    /**
     * used to add the initial cards
     * @param card card that is being added to the initial card stack
     */
    public void addCardStart(Card card){
    		this.cardStack.add(card);
    		this.topCard = card;
    		
    }    
    /**
     * Checks to see if a card can be added and does it if possible
     * @param card card being checked
     * @return if the card was added
     */
    public boolean addCard(Card card){
    		int cardOrder = card.getSuit().getOrder();
    		
    		if ((this.isEmpty())&&(card.getRank()==13)) {
    			this.cardStack.add(card);
    			this.topCard = card;  	
    			return true;
    		}
    		else if ((this.topCard.getRank()==card.getRank()+1)&&!(this.isEmpty())) {
    			int topCardOrder = topCard.getSuit().getOrder();
    			if (((topCardOrder==1)||(topCardOrder==4)) && ((cardOrder==2)||(cardOrder==3))) {
    				this.cardStack.add(card);
    				this.topCard = card;
    				return true;
    			}
    			else if (((topCardOrder==2)||(topCardOrder==3)) && ((cardOrder==1)||(cardOrder==4))) {
    				this.cardStack.add(card);
    				this.topCard = card;
    				return true;
    			}
    			else
    			{
    				System.out.println("This is an improper move something");
    				return false;
    			}
    		}
    		else {
    			System.out.println("This is an improper move");
    			return false;
    		}   	
    }
    
    /**
     * Return if the card stack is empty
     * @return if the card stack is empty
     */
    public boolean isEmpty(){
        if (this.size() == 0)
            return true;
        else
            return false;
    }
    
    /**
     * Return the size of the card stack
     * @return size of the card stack
     */
    public int size(){
        return cardStack.size();
    }
    
    /**
     * Returns the string representation of the stack
     * @return string representation
     */
    public String toString(){
    		String result = "";
        for (Card element:cardStack) {
        		result += element.toString()+"\n";
        }
    		return result;
        	
    }
    /**
     * Removes the last card in the array
     */
    public void remove() {
    		if (cardStack.size() > 1) {
    			topCard = cardStack.get(cardStack.size()-1);
    			cardStack.remove(cardStack.size()-1);
    		}
    		else {
    			topCard = null;
    			cardStack.remove(cardStack.size()-1);
    		}
    		
    		
    }
    /**
     * Checks to see what the top card is
     * @return top card of the stack
     */
    public Card peek() {
    		return topCard;
    }
}
