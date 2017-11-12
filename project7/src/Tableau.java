<<<<<<< HEAD
=======
import java.util.ArrayList;
import java.util.Iterator;
>>>>>>> branch 'master' of https://github.com/legarthb/project7.git

/**
 * Tableau cell in a game of free cell
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */
<<<<<<< HEAD
public class Tableau extends AbstractCell implements Cell<Card> {
=======
public class Tableau extends AbstractCell implements Cell {
>>>>>>> branch 'master' of https://github.com/legarthb/project7.git

<<<<<<< HEAD
    public Tableau() {
    		super();
    }
  
=======
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
>>>>>>> branch 'master' of https://github.com/legarthb/project7.git
    /**
     * Checks to see if a card can be added and does it if possible
     * @param card card being checked
     * @return if the card was added
     */
    public boolean canAddCard(Card card){
    		int cardOrder = card.getSuit().getOrder();
    		Card topCard = this.peek();
    		
    		if ((this.isEmpty())&&(card.getRank()==13)) {	
    			return true;
    		}
    		else if ((topCard.getRank()==card.getRank()+1)&&!(this.isEmpty())) {
    			int topCardOrder = topCard.getSuit().getOrder();
    			if (((topCardOrder==1)||(topCardOrder==4)) && ((cardOrder==2)||(cardOrder==3))) {
    				return true;
    			}
    			else if (((topCardOrder==2)||(topCardOrder==3)) && ((cardOrder==1)||(cardOrder==4))) {
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
    
<<<<<<< HEAD

=======
    /**
     * Return the size of the card stack
     * @return size of the card stack
     */
    public int size(){
        return cardStack.size();
    }
    
    //These three methods need to be completed
	public boolean canAddFromCell(Cell cell);
	public boolean inOrder();
	public Iterator<Card> iterator();
>>>>>>> branch 'master' of https://github.com/legarthb/project7.git
}
    

