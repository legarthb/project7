/**
 * Home cell in a game of Free Cell.
 * @author Brian Legarth
 * @author Tommy Thetford
 * @author Chris Randall
 * @author Mark Donohue
 */

public class HomeCell extends AbstractCell implements Cell{

    /**
     * Checks to see if it can move the card and moves it if possible
     * @param card card that will be moved
     * @return true/false if card was added
     */
    public boolean canAddCard(Card card){
    		Card topCard = this.peek();
        if (this.isEmpty() && (card.getRank()==1)){
            return true;
        }
        else if (!this.isEmpty() && (card.getSuit().getOrder() == topCard.getSuit().getOrder()  && (card.getRank()==topCard.getRank()+1))){
            return true;
        }
        else {
            System.out.println("That is an improper move");
            return false;
        }
    }
}



