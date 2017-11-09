import java.util.*;

/**
 * Home cell in a free cell game
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
public class HomeCell extends AbstractCell implements Cell{
    
    private ArrayList<Card> cardStack = new ArrayList<Card>();
    private Card topCard;
    

	

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
     * Gets the size of the stack
     * @return size of the stack
     */
    public int size(){
        return cardStack.size();
    }
    
    //These three methods need to be completed
	public boolean canAddFromCell(Cell cell);
	public boolean inOrder();
	public Iterator<Card> iterator();

}

