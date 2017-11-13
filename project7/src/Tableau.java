/**
 * Tableau cell in a game of free cell.
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */

public class Tableau extends AbstractCell implements Cell {

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
}
    

