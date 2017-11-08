import java.util.*;

/**
 * Home cell in a free cell game
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
public class HomeCell implements Cell{
    
    private ArrayList<Card> cardStack = new ArrayList<Card>();
    private Card topCard;
    
    public void remove() {}
    public Card peek() {
    		return topCard;
    }
    /**
     * Checks to see if it can move the card and moves it if possible
     * @param card card that will be moved
     * @return true/false if card was added
     */
    public boolean addCard(Card card){
        if (this.isEmpty() && (card.getRank()==1)){
            cardStack.add(card);
            this.topCard = card;
            return true;
        }
        else if (!this.isEmpty() && (card.getSuit().getOrder() == this.topCard.getSuit().getOrder()  && (card.getRank()==this.topCard.getRank()+1))){
            cardStack.add(card);
            this.topCard = card;
            return true;
        }
        else {
            System.out.println("That is an improper move");
            return false;
        }
    }
    /**
     * Checks to see if the array is empty
     * @return if array is empty
     */
    public boolean isEmpty(){
        return cardStack.size() == 0;
    }
    /**
     * Gets the size of the stack
     * @return size of the stack
     */
    public int size(){
        return cardStack.size();
    }
    /**
     * Make the string representation of HomeCell
     * @return string representation
     */
    public String toString(){
    		String result = "";
        for (Card element:cardStack) {
        		result += element.toString()+"\n";
        }
        return result;
    }
}

